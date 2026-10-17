package qu4;

import com.revolut.feature.credit.card.impl.ui.repay_with_review.AutoPayAction;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249236a;

    static {
        int[] iArr = new int[AutoPayAction.values().length];
        try {
            iArr[AutoPayAction.SETUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoPayAction.MANAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoPayAction.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f249236a = iArr;
    }
}
