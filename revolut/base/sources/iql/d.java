package iql;

import com.revolut.sso.impl.ui.signup.SignUpFlowContract$State;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignInMode;
import com.revolut.sso.impl.ui.signup.SignUpFlowContract$Step$Authentication$SignUpMode$ExistingAccount;
import gnl.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b f167896b;

    public /* synthetic */ d(com.revolut.sso.impl.ui.signup.b bVar, int i) {
        this.f167895a = i;
        this.f167896b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = null;
        switch (this.f167895a) {
            case 0:
                iml.h result = (iml.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof iml.f;
                com.revolut.sso.impl.ui.signup.b bVar = this.f167896b;
                if (z) {
                    oki.h.t2(bVar, bVar.A, SignUpFlowContract$Step$Authentication$SignInMode.f106759a, false, null, false, 12);
                } else if (result instanceof iml.g) {
                    oki.h.t2(bVar, bVar.A, SignUpFlowContract$Step.StartAccountCreation.f106767a, false, null, false, 12);
                } else {
                    if (!(result instanceof iml.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(bVar, bVar.A, new SignUpFlowContract$Step$Authentication$SignUpMode$ExistingAccount(((iml.e) result).f162563a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 1:
                gnl.i result2 = (gnl.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2 instanceof gnl.k;
                int i = 26;
                com.revolut.sso.impl.ui.signup.b bVar2 = this.f167896b;
                if (z3) {
                    bVar2.l2(new o(bVar2, result2, continuation, 0), new yi5.b(i));
                } else if (result2 instanceof gnl.l) {
                    bVar2.l2(new o(bVar2, result2, continuation, 1), new yi5.b(i));
                } else if (result2 instanceof i.a) {
                    oki.h.t2(bVar2, bVar2.A, SignUpFlowContract$Step$Authentication$SignInMode.f106759a, false, null, false, 12);
                } else if (result2 instanceof i.d) {
                    oki.h.t2(bVar2, bVar2.A, SignUpFlowContract$Step.ContinueWithExistingAccount.f106766a, false, null, false, 12);
                } else {
                    if (!(result2 instanceof i.e) && !(result2 instanceof gnl.j) && !(result2 instanceof i.b) && !(result2 instanceof i.c) && !(result2 instanceof i.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", result2.getClass().getName().concat(" is not expected"), null, h0Var);
                }
                return Unit.f186387a;
            default:
                SignUpFlowContract$State update = (SignUpFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String codeChallenge = this.f167896b.f106771s.generate();
                update.getClass();
                Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
                return new SignUpFlowContract$State(codeChallenge, null);
        }
    }
}
