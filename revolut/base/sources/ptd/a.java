package ptd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f239653a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i jointAccount = (i) obj2;
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        if (jointAccount.f224257a != null) {
            return new AnalyticsAccount.Joint.All(l38.a.c((n38.a) jointAccount.c()));
        }
        throw new IllegalStateException("No active joint account");
    }
}
