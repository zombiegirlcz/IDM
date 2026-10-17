package i79;

import ip0.yy;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159219a;

    static {
        int[] iArr = new int[yy.values().length];
        try {
            iArr[yy.ITEM_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yy.PRIMARY_ACTION_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yy.SECONDARY_ACTION_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f159219a = iArr;
    }
}
