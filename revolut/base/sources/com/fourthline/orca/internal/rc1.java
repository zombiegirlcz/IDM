package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rc1 f32689a = new rc1("Document", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rc1 f32690b = new rc1("DocumentVideo", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rc1 f32691c = new rc1("NfcPicture", 2);
    public static final rc1 d = new rc1("Person", 3);
    public static final rc1 e = new rc1("TinDocument", 4);
    public static final rc1 f = new rc1("TaxInfo", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rc1 f32692g = new rc1("Selfie", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rc1 f32693h = new rc1("Liveness", 7);
    public static final rc1 i = new rc1("ProofOfAddress", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final rc1 f32694j = new rc1("Geolocation", 9);
    public static final rc1 k = new rc1("Metadata", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final rc1 f32695l = new rc1("Address", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final rc1 f32696m = new rc1("Contacts", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ rc1[] f32697n;
    private static final /* synthetic */ EnumEntries o;

    static {
        rc1[] rc1VarArrA = a();
        f32697n = rc1VarArrA;
        o = vc.s.n(rc1VarArrA);
    }

    private rc1(String str, int i2) {
    }

    private static final /* synthetic */ rc1[] a() {
        return new rc1[]{f32689a, f32690b, f32691c, d, e, f, f32692g, f32693h, i, f32694j, k, f32695l, f32696m};
    }

    public static rc1 valueOf(String str) {
        return (rc1) Enum.valueOf(rc1.class, str);
    }

    public static rc1[] values() {
        return (rc1[]) f32697n.clone();
    }
}
