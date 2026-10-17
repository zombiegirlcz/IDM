package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class zzmn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzmn f40467zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzmn f40468zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzmn f40469zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzmn f40470zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzmn f40471zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzmn f40472zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzmn f40473zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzmn f40474zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzmn f40475zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzmn f40476zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final /* synthetic */ zzmn[] f40477zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Class f40478zzl;

    static {
        zzmn zzmnVar = new zzmn("VOID", 0, Void.class, Void.class, null);
        f40467zza = zzmnVar;
        Class cls = Integer.TYPE;
        zzmn zzmnVar2 = new zzmn("INT", 1, cls, Integer.class, 0);
        f40468zzb = zzmnVar2;
        zzmn zzmnVar3 = new zzmn("LONG", 2, Long.TYPE, Long.class, 0L);
        f40469zzc = zzmnVar3;
        zzmn zzmnVar4 = new zzmn("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        f40470zzd = zzmnVar4;
        zzmn zzmnVar5 = new zzmn("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f40471zze = zzmnVar5;
        zzmn zzmnVar6 = new zzmn("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f40472zzf = zzmnVar6;
        zzmn zzmnVar7 = new zzmn("STRING", 6, String.class, String.class, "");
        f40473zzg = zzmnVar7;
        zzmn zzmnVar8 = new zzmn("BYTE_STRING", 7, zzld.class, zzld.class, zzld.f40408zzb);
        f40474zzh = zzmnVar8;
        zzmn zzmnVar9 = new zzmn("ENUM", 8, cls, Integer.class, null);
        f40475zzi = zzmnVar9;
        zzmn zzmnVar10 = new zzmn("MESSAGE", 9, Object.class, Object.class, null);
        f40476zzj = zzmnVar10;
        f40477zzk = new zzmn[]{zzmnVar, zzmnVar2, zzmnVar3, zzmnVar4, zzmnVar5, zzmnVar6, zzmnVar7, zzmnVar8, zzmnVar9, zzmnVar10};
    }

    private zzmn(String str, int i, Class cls, Class cls2, Object obj2) {
        this.f40478zzl = cls2;
    }

    public static zzmn[] values() {
        return (zzmn[]) f40477zzk.clone();
    }

    public final Class zza() {
        return this.f40478zzl;
    }
}
