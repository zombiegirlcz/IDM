package py2;

import com.google.firebase.messaging.t;
import efm.d0;
import ha3.s;
import ha3.x;
import jy2.k;
import jy2.n;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pth.m;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends jy2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f240647c;
    public final l93.f d;
    public final tm.g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l93.f cardInteractor, k state, sf0.h serverErrorParser, v60.e serverErrorsProvider, t actionDelegateFactory, int i) {
        super(state, serverErrorParser, serverErrorsProvider);
        this.f240647c = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
                super(state, serverErrorParser, serverErrorsProvider);
                this.d = cardInteractor;
                rxe.b single = new rxe.b(state, this, 1);
                Intrinsics.checkNotNullParameter(single, "single");
                this.e = actionDelegateFactory.g(new ac1.b(18, single));
                break;
            default:
                Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
                this.d = cardInteractor;
                this.e = actionDelegateFactory.g(new m(state, this, 8));
                break;
        }
    }

    @Override // jy2.h
    public final pfm.h a() {
        switch (this.f240647c) {
            case 0:
                return this.e.a(new h((String) ((i) ((n) this.f179307a).w0().get()).c()));
            default:
                return this.e.a(null);
        }
    }

    @Override // jy2.h
    public d0 b(String cardId) {
        switch (this.f240647c) {
            case 1:
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                x xVar = (x) this.d;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return w.o0(p0.f264003c, new s(xVar, cardId, null, 9));
            default:
                return super.b(cardId);
        }
    }

    @Override // jy2.h
    public d0 c() {
        switch (this.f240647c) {
            case 1:
                d0 d0VarFirstOrError = ((n) this.f179307a).x0().c(te0.s.f270018a).firstOrError();
                rxb.f fVar = new rxb.f(16, new ry2.c(this, 1));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, fVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                return super.c();
        }
    }

    @Override // jy2.b
    public final tm.g d() {
        switch (this.f240647c) {
        }
        return this.e;
    }
}
