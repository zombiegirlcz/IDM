package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgv extends zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String[] f46998zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzgt f46999zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f47000zzc;

    public zzgv(zzio zzioVar) {
        super(zzioVar);
        Context contextZzaT = this.zzu.zzaT();
        this.zzu.zzf();
        this.f46999zzb = new zzgt(this, contextZzaT, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009f, SQLiteFullException -> 0x00a3, all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzs(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgv.zzs(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zzf() {
        return false;
    }

    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.f47000zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f46999zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f47000zzc = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0328 A[Catch: all -> 0x0362, TRY_ENTER, TryCatch #26 {all -> 0x0362, blocks: (B:88:0x0187, B:89:0x018a, B:81:0x017b, B:202:0x0352, B:192:0x0328, B:194:0x032e, B:195:0x0331, B:212:0x036d, B:92:0x0190, B:96:0x01a6, B:110:0x01cd, B:111:0x01d6, B:112:0x01d9, B:108:0x01c7, B:115:0x01df, B:117:0x01f3, B:124:0x020e, B:125:0x0218, B:126:0x021b, B:122:0x0208, B:129:0x021f, B:133:0x0233, B:147:0x0258, B:149:0x0262, B:150:0x0265, B:145:0x0252, B:153:0x026a, B:154:0x027a, B:166:0x02c3, B:168:0x02df, B:169:0x02ee), top: B:239:0x0352 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035e A[PHI: r4 r6 r11 r13 r19 r21
      0x035e: PHI (r4v11 int) = (r4v5 int), (r4v7 int), (r4v12 int) binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r6v14 com.google.android.gms.measurement.internal.zzgv) = 
      (r6v8 com.google.android.gms.measurement.internal.zzgv)
      (r6v10 com.google.android.gms.measurement.internal.zzgv)
      (r6v15 com.google.android.gms.measurement.internal.zzgv)
     binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r13v10 ??) = (r13v5 ??), (r13v7 ??), (r13v11 ??) binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:198:0x0346, B:215:0x0382, B:206:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzam] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzi(int r28) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgv.zzi(int):java.util.List");
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaW().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzu.zzaW().zze().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzs(3, new byte[0]);
    }

    public final boolean zzl() {
        zzio zzioVar = this.zzu;
        Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return contextZzaT.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[PHI: r4
      0x0067: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:25:0x005e, B:32:0x007b, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzm() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzg()
            boolean r1 = r10.f47000zzc
            r2 = 0
            if (r1 == 0) goto Lc
            goto L8e
        Lc:
            boolean r1 = r10.zzl()
            if (r1 == 0) goto L8e
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L87
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzh()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            if (r5 != 0) goto L22
            r10.f47000zzc = r6     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            goto L8e
        L22:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5f android.database.sqlite.SQLiteFullException -> L6b
            r5.close()
            return r6
        L3f:
            r0 = move-exception
            goto L81
        L41:
            r7 = move-exception
            if (r5 == 0) goto L4d
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L3f
            if (r8 == 0) goto L4d
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f
        L4d:
            com.google.android.gms.measurement.internal.zzio r8 = r10.zzu     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L3f
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L3f
            r10.f47000zzc = r6     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7e
            goto L67
        L5f:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L3f
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L3f
            int r4 = r4 + 20
            if (r5 == 0) goto L7e
        L67:
            r5.close()
            goto L7e
        L6b:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzio r8 = r10.zzu     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L3f
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L3f
            r10.f47000zzc = r6     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7e
            goto L67
        L7e:
            int r3 = r3 + 1
            goto L15
        L81:
            if (r5 == 0) goto L86
            r5.close()
        L86:
            throw r0
        L87:
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            ch.qos.logback.core.util.a.C(r0, r1)
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgv.zzm():boolean");
    }

    public final boolean zzn(zzai zzaiVar) {
        zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzaiVar);
        if (bArrZzay.length <= 131072) {
            return zzs(2, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzbf zzbfVar) {
        zzio zzioVar = this.zzu;
        byte[] bArrZzay = zzioVar.zzw().zzay(zzbfVar);
        if (bArrZzay == null) {
            zzioVar.zzaW().zzh().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzay.length <= 131072) {
            return zzs(4, bArrZzay);
        }
        zzioVar.zzaW().zzh().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzp(zzbh zzbhVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbi.zza(zzbhVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzq(zzqb zzqbVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzqc.zza(zzqbVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaW().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
