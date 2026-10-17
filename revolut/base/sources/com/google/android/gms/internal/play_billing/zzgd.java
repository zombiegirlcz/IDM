package com.google.android.gms.internal.play_billing;

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
public final class zzgd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzgd f46031zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzgd f46032zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final zzgd f46033zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final zzgd f46034zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final zzgd f46035zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzgd f46036zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzgd f46037zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzgd f46038zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzgd f46039zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzgd f46040zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final /* synthetic */ zzgd[] f46041zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Class f46042zzl;

    static {
        zzgd zzgdVar = new zzgd("VOID", 0, Void.class, Void.class, null);
        f46031zza = zzgdVar;
        Class cls = Integer.TYPE;
        zzgd zzgdVar2 = new zzgd("INT", 1, cls, Integer.class, 0);
        f46032zzb = zzgdVar2;
        zzgd zzgdVar3 = new zzgd("LONG", 2, Long.TYPE, Long.class, 0L);
        f46033zzc = zzgdVar3;
        zzgd zzgdVar4 = new zzgd("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        f46034zzd = zzgdVar4;
        zzgd zzgdVar5 = new zzgd("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f46035zze = zzgdVar5;
        zzgd zzgdVar6 = new zzgd("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f46036zzf = zzgdVar6;
        zzgd zzgdVar7 = new zzgd("STRING", 6, String.class, String.class, "");
        f46037zzg = zzgdVar7;
        zzgd zzgdVar8 = new zzgd("BYTE_STRING", 7, zzev.class, zzev.class, zzev.f45974zza);
        f46038zzh = zzgdVar8;
        zzgd zzgdVar9 = new zzgd("ENUM", 8, cls, Integer.class, null);
        f46039zzi = zzgdVar9;
        zzgd zzgdVar10 = new zzgd("MESSAGE", 9, Object.class, Object.class, null);
        f46040zzj = zzgdVar10;
        f46041zzk = new zzgd[]{zzgdVar, zzgdVar2, zzgdVar3, zzgdVar4, zzgdVar5, zzgdVar6, zzgdVar7, zzgdVar8, zzgdVar9, zzgdVar10};
    }

    private zzgd(String str, int i, Class cls, Class cls2, Object obj2) {
        this.f46042zzl = cls2;
    }

    public static zzgd[] values() {
        return (zzgd[]) f46041zzk.clone();
    }

    public final Class zza() {
        return this.f46042zzl;
    }
}
