package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class zzir {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzir f46137zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzir f46138zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzir f46139zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzir f46140zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzir f46141zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzir f46142zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzir f46143zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzir f46144zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzir f46145zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzir f46146zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public static final zzir f46147zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public static final zzir f46148zzl;
    public static final zzir zzm;
    public static final zzir zzn;
    public static final zzir zzo;
    public static final zzir zzp;
    public static final zzir zzq;
    public static final zzir zzr;
    private static final /* synthetic */ zzir[] zzs;
    private final zzis zzt;
    private final int zzu;

    static {
        zzir zzirVar = new zzir("DOUBLE", 0, zzis.DOUBLE, 1);
        f46137zza = zzirVar;
        zzir zzirVar2 = new zzir("FLOAT", 1, zzis.FLOAT, 5);
        f46138zzb = zzirVar2;
        zzis zzisVar = zzis.LONG;
        zzir zzirVar3 = new zzir("INT64", 2, zzisVar, 0);
        f46139zzc = zzirVar3;
        zzir zzirVar4 = new zzir("UINT64", 3, zzisVar, 0);
        f46140zzd = zzirVar4;
        zzis zzisVar2 = zzis.INT;
        zzir zzirVar5 = new zzir("INT32", 4, zzisVar2, 0);
        f46141zze = zzirVar5;
        zzir zzirVar6 = new zzir("FIXED64", 5, zzisVar, 1);
        f46142zzf = zzirVar6;
        zzir zzirVar7 = new zzir("FIXED32", 6, zzisVar2, 5);
        f46143zzg = zzirVar7;
        zzir zzirVar8 = new zzir("BOOL", 7, zzis.BOOLEAN, 0);
        f46144zzh = zzirVar8;
        zzir zzirVar9 = new zzir("STRING", 8, zzis.STRING, 2);
        f46145zzi = zzirVar9;
        zzis zzisVar3 = zzis.MESSAGE;
        zzir zzirVar10 = new zzir("GROUP", 9, zzisVar3, 3);
        f46146zzj = zzirVar10;
        zzir zzirVar11 = new zzir("MESSAGE", 10, zzisVar3, 2);
        f46147zzk = zzirVar11;
        zzir zzirVar12 = new zzir("BYTES", 11, zzis.BYTE_STRING, 2);
        f46148zzl = zzirVar12;
        zzir zzirVar13 = new zzir("UINT32", 12, zzisVar2, 0);
        zzm = zzirVar13;
        zzir zzirVar14 = new zzir("ENUM", 13, zzis.ENUM, 0);
        zzn = zzirVar14;
        zzir zzirVar15 = new zzir("SFIXED32", 14, zzisVar2, 5);
        zzo = zzirVar15;
        zzir zzirVar16 = new zzir("SFIXED64", 15, zzisVar, 1);
        zzp = zzirVar16;
        zzir zzirVar17 = new zzir("SINT32", 16, zzisVar2, 0);
        zzq = zzirVar17;
        zzir zzirVar18 = new zzir("SINT64", 17, zzisVar, 0);
        zzr = zzirVar18;
        zzs = new zzir[]{zzirVar, zzirVar2, zzirVar3, zzirVar4, zzirVar5, zzirVar6, zzirVar7, zzirVar8, zzirVar9, zzirVar10, zzirVar11, zzirVar12, zzirVar13, zzirVar14, zzirVar15, zzirVar16, zzirVar17, zzirVar18};
    }

    private zzir(String str, int i, zzis zzisVar, int i2) {
        this.zzt = zzisVar;
        this.zzu = i2;
    }

    public static zzir[] values() {
        return (zzir[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzis zzb() {
        return this.zzt;
    }
}
