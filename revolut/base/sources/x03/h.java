package x03;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f301465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f301466c;
    public final uz2.b d;
    public final yf.c e;

    public h(d state, l93.f cardsInteractor, uz2.b replaceCardInteractor, yf.c supportInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(replaceCardInteractor, "replaceCardInteractor");
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        this.f301465b = state;
        this.f301466c = cardsInteractor;
        this.d = replaceCardInteractor;
        this.e = supportInteractor;
    }

    public final d0 j3() {
        efm.r rVarFlatMap = ((r) this.f301465b).w0().c(s.f270018a).flatMap(new wx9.b(new g(this, 0), 11));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        d0 d0VarFirstOrError = m70.a.g(rVarFlatMap, null, new wyg.s(6), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i k3(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ufm.i iVar = new ufm.i(w.N(((r) this.f301465b).w0()), new wx9.b(new g(this, 1), 13), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
