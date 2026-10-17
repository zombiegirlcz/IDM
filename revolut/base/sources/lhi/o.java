package lhi;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements hpa.a {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f195295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.c f195296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.c f195297c;

    public o(sh3.a checkoutInteractor, zm0.c sessionProvider, lfm.c appDisposable) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        this.f195295a = checkoutInteractor;
        this.f195296b = sessionProvider;
        this.f195297c = appDisposable;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (((cn0.g) this.f195296b).d() instanceof mm0.n) {
            String strN = ipa.k.n(message);
            if (Intrinsics.f(strN, "push.kyc.succeeded") || Intrinsics.f(strN, "push.kyc.failed.default") || Intrinsics.f(strN, "push.checklist.item.completed") || ipa.k.q(message)) {
                ei3.m mVar = (ei3.m) this.f195295a;
                AccountId.Personal accountId = AccountId.Personal.f51414a;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(ei3.m.l(mVar, accountId, null, 6), kotlin.coroutines.g.f186406a), null, new eed.a(17), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                pfm.a aVar = new pfm.a(ue0.e.t(d0VarFirstOrError, zhm.h0.f322473a), new ed7.e(new eed.j(mVar, accountId, 5), 18), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                pfm.a aVar2 = new pfm.a(aVar, mfm.f.f205044g, 1);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorComplete(...)");
                pfm.a aVar3 = new pfm.a(aVar2, new ks0.n(new lak.l(new BreadcrumbException(), 6)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar3.w(new a08.g0(26, n.f195294a), m.f195293a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(this.f195297c, hVarW);
                return false;
            }
        }
        return false;
    }
}
