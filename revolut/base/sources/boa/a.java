package boa;

import s69.k;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17360a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.CHATS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17360a = iArr;
    }
}
