package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes16.dex */
final class zzgt extends com.google.android.gms.internal.measurement.zzca {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgv f46994zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgt(zzgv zzgvVar, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        this.f46994zza = zzgvVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            zzio zzioVar = this.f46994zza.zzu;
            zzioVar.zzaW().zze().zza("Opening the local database failed, dropping and recreating it");
            zzioVar.zzf();
            if (!zzioVar.zzaT().getDatabasePath("google_app_measurement_local.db").delete()) {
                zzioVar.zzaW().zze().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f46994zza.zzu.zzaW().zze().zzb("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzax.zzb(this.f46994zza.zzu.zzaW(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzax.zza(this.f46994zza.zzu.zzaW(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", zzgv.f46998zza);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
