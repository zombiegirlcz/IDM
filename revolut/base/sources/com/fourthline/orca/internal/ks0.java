package com.fourthline.orca.internal;

import kotlin.Pair;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ks0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ks0 f30375c = new ks0("INTRO", 0, "intro");
    public static final ks0 d = new ks0("LOCATION_INTRO", 1, "location_intro");
    public static final ks0 e = new ks0("LOCATION_SCANNER", 2, "location_scanner");
    public static final ks0 f = new ks0("SELFIE_INTRO", 3, "selfie_intro");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ks0 f30376g = new ks0("AGREEMENTS", 4, "agreements");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ks0 f30377h = new ks0("SIGN", 5, "sign");
    private static final /* synthetic */ ks0[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30378j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pair f30380b;

    static {
        ks0[] ks0VarArrA = a();
        i = ks0VarArrA;
        f30378j = vc.s.n(ks0VarArrA);
    }

    private ks0(String str, int i2, String str2) {
        this.f30379a = str2;
        this.f30380b = new Pair("source", str2);
    }

    private static final /* synthetic */ ks0[] a() {
        return new ks0[]{f30375c, d, e, f, f30376g, f30377h};
    }

    public static ks0 valueOf(String str) {
        return (ks0) Enum.valueOf(ks0.class, str);
    }

    public static ks0[] values() {
        return (ks0[]) i.clone();
    }

    public final Pair b() {
        return this.f30380b;
    }
}
