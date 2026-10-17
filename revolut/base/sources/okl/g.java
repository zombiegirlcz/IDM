package okl;

import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthResult.Success f226181c;

    public /* synthetic */ g(int i, AuthResult.Success success, com.revolut.sso.impl.ui.auth.n nVar) {
        this.f226179a = i;
        this.f226181c = success;
        this.f226180b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        bjl.c0 c0Var;
        int i = this.f226179a;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226180b;
        AuthResult.Success success = this.f226181c;
        switch (i) {
            case 0:
                qki.d dVar = nVar.m0;
                rol.e result = (rol.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof rol.c) {
                    c0Var = new bjl.c0(success.f106091b, com.revolut.sso.impl.ui.auth.n.x3((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()), null);
                } else {
                    if (!(result instanceof rol.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0Var = new bjl.c0(success.f106091b, com.revolut.sso.impl.ui.auth.n.x3((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()), ((rol.d) result).f256036a);
                }
                nVar.C2(c0Var);
                return Unit.f186387a;
            case 1:
                d67.u result2 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof d67.s) {
                    nVar.r3(success);
                }
                return Unit.f186387a;
            default:
                col.c cVar = nVar.M;
                d67.u result3 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof d67.s) {
                    UserInfo userInfo = success.d;
                    if (userInfo == null) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Enable passkey prompt shouldn't have been launched without user info", null, h0Var);
                        nVar.X1(((col.i) cVar).c3());
                        return Unit.f186387a;
                    }
                    nVar.l2(new c1(nVar, userInfo, new g0(nVar, success), null), new yi5.b(26));
                } else if ((result3 instanceof d67.q) || (result3 instanceof d67.t)) {
                    com.revolut.sso.impl.ui.auth.n.f3(nVar, success);
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", result3.getClass().getName().concat(" create challenge result is not expected"), null, h0Var2);
                    nVar.X1(((col.i) cVar).c3());
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g(com.revolut.sso.impl.ui.auth.n nVar, AuthResult.Success success) {
        this.f226179a = 1;
        this.f226180b = nVar;
        this.f226181c = success;
    }
}
