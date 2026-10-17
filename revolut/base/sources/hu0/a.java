package hu0;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155476a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f155476a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f155476a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f155476a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f155476a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f155476a[ImageView.ScaleType.MATRIX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
