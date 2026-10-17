package bg;

import ag.e;
import ag.g;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import cc.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import gc.h;
import gc.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import v3e.s;
import wb.c;
import zb.i;
import zb.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, h, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15039c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f15037a = i;
        this.f15038b = obj2;
        this.f15039c = obj3;
        this.d = obj4;
    }

    @Override // gc.h, kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) throws Throwable {
        long jInsert;
        Cursor cursor;
        j jVar;
        switch (this.f15037a) {
            case 1:
                j jVar2 = (j) this.f15038b;
                i iVar = (i) this.f15039c;
                m mVar = iVar.f320776c;
                String str = iVar.f320774a;
                zb.j jVar3 = (zb.j) this.d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                long jSimpleQueryForLong = jVar2.d().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar2.d().compileStatement("PRAGMA page_count").simpleQueryForLong();
                gc.a aVar = jVar2.d;
                if (jSimpleQueryForLong >= aVar.f142276a) {
                    jVar2.i(1L, d.CACHE_FULL, str);
                    return -1L;
                }
                Long lF = j.f(sQLiteDatabase, jVar3);
                if (lF != null) {
                    jInsert = lF.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar3.f320780a);
                    contentValues.put("priority", Integer.valueOf(jc.a.a(jVar3.f320782c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar3.f320781b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i = aVar.e;
                byte[] bArr2 = mVar.f320787b;
                boolean z = bArr2.length <= i;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.e));
                contentValues2.put("payload_encoding", mVar.f320786a.f295988a);
                contentValues2.put("code", iVar.f320775b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar.f320777g);
                contentValues2.put("pseudonymous_id", iVar.f320778h);
                contentValues2.put("experiment_ids_clear_blob", iVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar.f320779j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i));
                    for (int i2 = 1; i2 <= iCeil; i2++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i2 - 1) * i, Math.min(i2 * i, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                j jVar4 = (j) this.f15038b;
                ArrayList arrayList = (ArrayList) this.f15039c;
                zb.j jVar5 = (zb.j) this.d;
                Cursor cursor2 = (Cursor) obj2;
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    boolean z3 = cursor2.getInt(7) != 0;
                    zb.h hVar = new zb.h();
                    hVar.f = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.f320768a = string;
                    hVar.d = Long.valueOf(cursor2.getLong(2));
                    hVar.e = Long.valueOf(cursor2.getLong(3));
                    if (z3) {
                        String string2 = cursor2.getString(4);
                        hVar.f320770c = new m(string2 == null ? j.f : new c(string2), cursor2.getBlob(5));
                        jVar = jVar4;
                    } else {
                        String string3 = cursor2.getString(4);
                        c cVar = string3 == null ? j.f : new c(string3);
                        Cursor cursorQuery = jVar4.d().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                break;
                            }
                            byte[] bArr3 = new byte[length];
                            int i3 = 0;
                            int length2 = 0;
                            while (i3 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i3);
                                j jVar6 = jVar4;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i3++;
                                    jVar4 = jVar6;
                                    cursorQuery = cursor;
                                } catch (Throwable th10) {
                                    th = th10;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            jVar = jVar4;
                            cursorQuery.close();
                            hVar.f320770c = new m(cVar, bArr3);
                        } catch (Throwable th11) {
                            th = th11;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.f320769b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        hVar.f320771g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        hVar.f320772h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        hVar.i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        hVar.f320773j = cursor2.getBlob(11);
                    }
                    arrayList.add(new gc.b(j2, jVar5, hVar.b()));
                    jVar4 = jVar;
                }
                return null;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.f15038b, (String) this.f15039c, (String) this.d, i, trackGroup, iArr);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((AnalyticsListener) obj2).onVideoInputFormatChanged((AnalyticsListener.EventTime) this.f15038b, (Format) this.f15039c, (DecoderReuseEvaluation) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        t tVar = (t) this.f15038b;
        Task task = (Task) this.f15039c;
        fe.b bVar = (fe.b) this.d;
        try {
            g gVar = (g) task.getResult();
            if (gVar != null) {
                ((Executor) tVar.d).execute(new b(bVar, ((ao.h) tVar.f49544c).g(gVar), 1));
            }
        } catch (FirebaseRemoteConfigException e) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        g gVar;
        zf.a aVar = (zf.a) this.f15038b;
        Task task2 = (Task) this.f15039c;
        Task task3 = (Task) this.d;
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        g gVar2 = (g) task2.getResult();
        if (task3.isSuccessful() && (gVar = (g) task3.getResult()) != null && gVar2.f4691c.equals(gVar.f4691c)) {
            return Tasks.forResult(Boolean.FALSE);
        }
        e eVar = aVar.d;
        Executor executor = eVar.f4682a;
        return Tasks.call(executor, new ag.d(eVar, gVar2, 0)).onSuccessTask(executor, new ae.a(eVar, gVar2, 1)).continueWith(aVar.f321807b, new s(aVar, 21));
    }
}
