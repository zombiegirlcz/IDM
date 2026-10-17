package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f303817c;

    public /* synthetic */ f(LoginFragment loginFragment, String str, int i) {
        this.f303815a = i;
        this.f303816b = loginFragment;
        this.f303817c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303815a) {
            case 0:
                Boolean deeplinkHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkHandled, "deeplinkHandled");
                if (deeplinkHandled.booleanValue()) {
                    ufm.b bVarM = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                q06.l lVarA = this.f303816b.L().F().a();
                lg0.a fallbackStrategy = lg0.a.IGNORE;
                s06.j jVar = (s06.j) lVarA;
                jVar.getClass();
                String url2 = this.f303817c;
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
                return jVar.c(url2, jVar.a(url2), fallbackStrategy);
            default:
                wli.b outcome = (wli.b) obj2;
                Intrinsics.checkNotNullParameter(outcome, "outcome");
                int i = k.f303830c[outcome.ordinal()];
                if (i == 1) {
                    ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                q06.l lVarA2 = this.f303816b.L().F().a();
                lg0.a fallbackStrategy2 = lg0.a.IGNORE;
                s06.j jVar2 = (s06.j) lVarA2;
                jVar2.getClass();
                String url3 = this.f303817c;
                Intrinsics.checkNotNullParameter(url3, "url");
                Intrinsics.checkNotNullParameter(fallbackStrategy2, "fallbackStrategy");
                return jVar2.c(url3, jVar2.a(url3), fallbackStrategy2);
        }
    }
}
