package qi9;

import com.revolut.feature.pay_later.api.models.PayLaterFaqKey;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246673a;

    static {
        int[] iArr = new int[PayLaterFaqKey.values().length];
        try {
            iArr[PayLaterFaqKey.GENERAL_TOPIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayLaterFaqKey.QUESTION_WHEN_AND_WHERE_CAN_I_USE_IT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f246673a = iArr;
    }
}
