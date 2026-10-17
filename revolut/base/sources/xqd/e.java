package xqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308160a;

    static {
        int[] iArr = new int[ScoreCardType.values().length];
        try {
            iArr[ScoreCardType.SPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScoreCardType.SAVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScoreCardType.GROW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScoreCardType.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f308160a = iArr;
    }
}
