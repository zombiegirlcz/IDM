package oj8;

import ij8.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225746a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.EDITABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.NOT_EDITABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225746a = iArr;
    }
}
