package aw;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10139b;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f10138a = iArr;
        int[] iArr2 = new int[yw.b.values().length];
        try {
            iArr2[yw.b.PICTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[yw.b.COMBINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f10139b = iArr2;
    }
}
