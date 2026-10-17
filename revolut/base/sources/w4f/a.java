package w4f;

import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import wel.i;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f294562b;

    static {
        int[] iArr = new int[TradingOnboardingStatus.values().length];
        try {
            iArr[TradingOnboardingStatus.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f294561a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[i.SUSPENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.OFFBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f294562b = iArr2;
    }
}
