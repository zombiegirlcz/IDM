package rpb;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m f256331a = new m();

    private m() {
    }

    public static AnalyticsAccount.Savings a(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar instanceof l) {
            return AnalyticsAccount.Savings.PersonalAll.f99203a;
        }
        if (oVar instanceof n) {
            return new AnalyticsAccount.Savings.PersonalIndividual(((n) oVar).f256332a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
