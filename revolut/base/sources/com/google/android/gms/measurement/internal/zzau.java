package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzau {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzaw f46899zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f46900zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private long f46901zzc;

    public zzau(zzaw zzawVar, String str) {
        this.f46899zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.f46900zzb = str;
        this.f46901zzc = -1L;
    }

    public final List zza() {
        List list;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f46899zza.zzj().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f46900zzb, String.valueOf(this.f46901zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j2 > this.f46901zzc) {
                            this.f46901zzc = j2;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhlVar.zzi(string);
                            zzhlVar.zzm(cursorQuery.getLong(2));
                            arrayList.add(new zzat(j2, j3, z, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba()));
                        } catch (IOException e) {
                            this.f46899zza.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event. appId", zzhe.zzn(this.f46900zzb), e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                this.f46899zza.zzu.zzaW().zze().zzc("Data loss. Error querying raw events batch. appId", zzhe.zzn(this.f46900zzb), e2);
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzau(zzaw zzawVar, String str, long j2) {
        this.f46899zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.f46900zzb = str;
        this.f46901zzc = zzawVar.zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j2)}, -1L);
    }
}
