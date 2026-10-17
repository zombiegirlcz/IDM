package jv;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178704a;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f178704a = iArr;
    }
}
