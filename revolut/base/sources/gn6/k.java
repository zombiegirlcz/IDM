package gn6;

import com.revolut.domain.models.openbanking.instructions.StepsStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144928a;

    static {
        int[] iArr = new int[StepsStyle.values().length];
        try {
            iArr[StepsStyle.NUMBERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StepsStyle.BULLETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f144928a = iArr;
    }
}
