package ce4;

import hs3.j0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23384b;

    static {
        int[] iArr = new int[ht3.d.values().length];
        try {
            iArr[ht3.d.ITEM_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ht3.d.SECONDARY_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ht3.d.PRIMARY_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f23383a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.WITH_IMAGE_HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j0.TOP_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j0.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f23384b = iArr2;
    }
}
