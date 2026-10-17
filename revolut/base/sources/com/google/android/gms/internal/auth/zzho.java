package com.google.android.gms.internal.auth;

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
public final class zzho {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzho f39138zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzho f39139zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzho f39140zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzho f39141zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzho f39142zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzho f39143zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzho f39144zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzho f39145zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzho f39146zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzho f39147zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public static final zzho f39148zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public static final zzho f39149zzl;
    public static final zzho zzm;
    public static final zzho zzn;
    public static final zzho zzo;
    public static final zzho zzp;
    public static final zzho zzq;
    public static final zzho zzr;
    private static final /* synthetic */ zzho[] zzs;
    private final zzhp zzt;

    static {
        zzho zzhoVar = new zzho("DOUBLE", 0, zzhp.DOUBLE, 1);
        f39138zza = zzhoVar;
        zzho zzhoVar2 = new zzho("FLOAT", 1, zzhp.FLOAT, 5);
        f39139zzb = zzhoVar2;
        zzhp zzhpVar = zzhp.LONG;
        zzho zzhoVar3 = new zzho("INT64", 2, zzhpVar, 0);
        f39140zzc = zzhoVar3;
        zzho zzhoVar4 = new zzho("UINT64", 3, zzhpVar, 0);
        f39141zzd = zzhoVar4;
        zzhp zzhpVar2 = zzhp.INT;
        zzho zzhoVar5 = new zzho("INT32", 4, zzhpVar2, 0);
        f39142zze = zzhoVar5;
        zzho zzhoVar6 = new zzho("FIXED64", 5, zzhpVar, 1);
        f39143zzf = zzhoVar6;
        zzho zzhoVar7 = new zzho("FIXED32", 6, zzhpVar2, 5);
        f39144zzg = zzhoVar7;
        zzho zzhoVar8 = new zzho("BOOL", 7, zzhp.BOOLEAN, 0);
        f39145zzh = zzhoVar8;
        zzho zzhoVar9 = new zzho("STRING", 8, zzhp.STRING, 2);
        f39146zzi = zzhoVar9;
        zzhp zzhpVar3 = zzhp.MESSAGE;
        zzho zzhoVar10 = new zzho("GROUP", 9, zzhpVar3, 3);
        f39147zzj = zzhoVar10;
        zzho zzhoVar11 = new zzho("MESSAGE", 10, zzhpVar3, 2);
        f39148zzk = zzhoVar11;
        zzho zzhoVar12 = new zzho("BYTES", 11, zzhp.BYTE_STRING, 2);
        f39149zzl = zzhoVar12;
        zzho zzhoVar13 = new zzho("UINT32", 12, zzhpVar2, 0);
        zzm = zzhoVar13;
        zzho zzhoVar14 = new zzho("ENUM", 13, zzhp.ENUM, 0);
        zzn = zzhoVar14;
        zzho zzhoVar15 = new zzho("SFIXED32", 14, zzhpVar2, 5);
        zzo = zzhoVar15;
        zzho zzhoVar16 = new zzho("SFIXED64", 15, zzhpVar, 1);
        zzp = zzhoVar16;
        zzho zzhoVar17 = new zzho("SINT32", 16, zzhpVar2, 0);
        zzq = zzhoVar17;
        zzho zzhoVar18 = new zzho("SINT64", 17, zzhpVar, 0);
        zzr = zzhoVar18;
        zzs = new zzho[]{zzhoVar, zzhoVar2, zzhoVar3, zzhoVar4, zzhoVar5, zzhoVar6, zzhoVar7, zzhoVar8, zzhoVar9, zzhoVar10, zzhoVar11, zzhoVar12, zzhoVar13, zzhoVar14, zzhoVar15, zzhoVar16, zzhoVar17, zzhoVar18};
    }

    private zzho(String str, int i, zzhp zzhpVar, int i2) {
        this.zzt = zzhpVar;
    }

    public static zzho[] values() {
        return (zzho[]) zzs.clone();
    }

    public final zzhp zza() {
        return this.zzt;
    }
}
