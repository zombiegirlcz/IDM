package com.fourthline.orca.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class wf0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wf0 f34671c = new wf0("Passport", 0, "nfc-video-passport-light.mp4");
    public static final wf0 d = new wf0("PassportDark", 1, "nfc-video-passport-dark.mp4");
    public static final wf0 e = new wf0("IdCard", 2, "nfc-video-id-card-light.mp4");
    public static final wf0 f = new wf0("IdCardDark", 3, "nfc-video-id-card-dark.mp4");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wf0 f34672g = new wf0("DriversLicence", 4, "nfc-video-drivers-license-light.mp4");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wf0 f34673h = new wf0("DriversLicenceDark", 5, "nfc-video-drivers-license-dark.mp4");
    public static final wf0 i = new wf0("ResidencePermit", 6, "nfc-video-residence-permit-light.mp4");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wf0 f34674j = new wf0("ResidencePermitDark", 7, "nfc-video-residence-permit-dark.mp4");
    private static final /* synthetic */ wf0[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f34675l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34677b;

    static {
        wf0[] wf0VarArrA = a();
        k = wf0VarArrA;
        f34675l = vc.s.n(wf0VarArrA);
    }

    private wf0(String str, int i2, String str2) {
        this.f34676a = str2;
        this.f34677b = str2;
    }

    private static final /* synthetic */ wf0[] a() {
        return new wf0[]{f34671c, d, e, f, f34672g, f34673h, i, f34674j};
    }

    public static EnumEntries c() {
        return f34675l;
    }

    public static wf0 valueOf(String str) {
        return (wf0) Enum.valueOf(wf0.class, str);
    }

    public static wf0[] values() {
        return (wf0[]) k.clone();
    }

    public final String b() {
        return this.f34676a;
    }

    public final String d() {
        return this.f34677b;
    }
}
