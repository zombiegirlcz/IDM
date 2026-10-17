package com.revolut.feature.security_hub.impl.ui.flow;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f85553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f85554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f85555c;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.OPEN_WEALTH_PROTECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f85553a = iArr;
        int[] iArr2 = new int[vuc.g.values().length];
        try {
            iArr2[vuc.g.SECURITY_HUB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vuc.g.CARD_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f85554b = iArr2;
        int[] iArr3 = new int[yja.b.values().length];
        try {
            iArr3[yja.b.CLOSE_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[yja.b.NEXT_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f85555c = iArr3;
    }
}
