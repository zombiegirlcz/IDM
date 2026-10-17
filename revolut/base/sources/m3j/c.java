package m3j;

import com.revolut.domain.models.banktransfer.AccountFieldType;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202571a;

    static {
        int[] iArr = new int[AccountFieldType.values().length];
        try {
            iArr[AccountFieldType.COLOMBIA_DOCUMENT_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f202571a = iArr;
    }
}
