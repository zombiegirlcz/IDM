package yol;

import aii.r;
import bjl.u;
import bjl.v;
import bjl.w;
import bjl.x;
import bjl.y;
import cjl.s;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import defpackage.e1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import xjl.i;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f315704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkl.b f315705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f315706c;

    public d(i revolutSsoFlowConfigurationInteractor, nkl.b revolutSsoFlowsFactory, e reauthenticationWrapperFlowResultHandlerFactory) {
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(reauthenticationWrapperFlowResultHandlerFactory, "reauthenticationWrapperFlowResultHandlerFactory");
        this.f315704a = revolutSsoFlowConfigurationInteractor;
        this.f315705b = revolutSsoFlowsFactory;
        this.f315706c = reauthenticationWrapperFlowResultHandlerFactory;
    }

    public final WrapperFlowImpl a(final String url2, String state, List securityProfiles, s routingContext, final djl.c finishConfig) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Intrinsics.checkNotNullParameter(routingContext, "routingContext");
        Intrinsics.checkNotNullParameter(finishConfig, "finishConfig");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AuthenticationFlow authenticationFlowB = djl.a.b(this.f315705b, new RevolutSsoApi$InputData$OperationBoundAuthentication(routingContext, securityProfiles, state, 48), new e1(ref$ObjectRef, this, 14));
        final bm9.d codeVerifierProvider = new bm9.d(ref$ObjectRef, 2);
        final h hVar = (h) this.f315706c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(finishConfig, "finishConfig");
        Intrinsics.checkNotNullParameter(codeVerifierProvider, "codeVerifierProvider");
        return gc0.c.b(authenticationFlowB, new qii.a() { // from class: yol.f
            @Override // qii.a
            public final void a(r rVar, qii.b wrapperFlowModel) {
                y result = (y) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                boolean zF = Intrinsics.f(result, u.f16189a);
                h hVar2 = hVar;
                String str = url2;
                if (zF) {
                    hVar2.f315711a.a(str, pql.e.f238815a);
                } else {
                    boolean zF2 = Intrinsics.f(result, v.f16190a);
                    pql.f fVar = pql.f.f238816a;
                    if (zF2) {
                        hVar2.f315711a.a(str, fVar);
                    } else if (result instanceof x) {
                        RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Delegated success is not supported");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                        hVar2.f315711a.a(str, fVar);
                    } else {
                        if (!(result instanceof w)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar2.f315711a.a(str, new pql.g(((w) result).f16191a, (String) codeVerifierProvider.invoke()));
                    }
                }
                int i = g.f315710a[finishConfig.ordinal()];
                if (i == 1) {
                    wrapperFlowModel.J2();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrapperFlowModel.I2(result);
                }
            }
        });
    }
}
