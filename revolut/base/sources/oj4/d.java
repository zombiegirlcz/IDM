package oj4;

import au3.m;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225728a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.SUBSCRIBED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.UNSUBSCRIBED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f225728a = iArr;
    }
}
