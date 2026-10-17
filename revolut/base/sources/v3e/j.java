package v3e;

import com.revolut.feature.stories.models.StickerPosition;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f285900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f285901c;

    static {
        int[] iArr = new int[StickerPosition.values().length];
        try {
            iArr[StickerPosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StickerPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f285899a = iArr;
        int[] iArr2 = new int[a4e.a.values().length];
        try {
            iArr2[a4e.a.WHITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a4e.a.BLACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a4e.a.ACCENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f285900b = iArr2;
        int[] iArr3 = new int[a4e.b.values().length];
        try {
            iArr3[a4e.b.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[a4e.b.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f285901c = iArr3;
    }
}
