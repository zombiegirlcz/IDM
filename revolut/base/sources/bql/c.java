package bql;

import be7.s;
import com.revolut.sso.impl.ui.signin_sessions_flow.SignInSessionsFlowContract$Step;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheetContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signin_sessions_flow.a f17846b;

    public /* synthetic */ c(com.revolut.sso.impl.ui.signin_sessions_flow.a aVar, int i) {
        this.f17845a = i;
        this.f17846b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f17845a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SignInSessionsFlowContract$Step step = (SignInSessionsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof SignInSessionsFlowContract$Step.ShowSessions)) {
                    throw new NoWhenBranchMatchedException();
                }
                SignInSessionsBottomSheet signInSessionsBottomSheet = new SignInSessionsBottomSheet(new SignInSessionsBottomSheetContract$InputData(((SignInSessionsFlowContract$Step.ShowSessions) step).f106742a));
                com.revolut.sso.impl.ui.signin_sessions_flow.a aVar = this.f17846b;
                signInSessionsBottomSheet.l2(new bc1.b(aVar, 21));
                aVar.a(signInSessionsBottomSheet, new c(aVar, 1));
                return signInSessionsBottomSheet;
            default:
                oki.g onResult = (oki.g) obj2;
                cql.f result = (cql.f) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof cql.e;
                com.revolut.sso.impl.ui.signin_sessions_flow.a aVar2 = this.f17846b;
                Continuation continuation = null;
                if (z) {
                    aVar2.n2(new b96.d(aVar2, result, onResult, continuation, 22), new whi.b(6));
                } else {
                    if (!(result instanceof cql.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.n2(new s(aVar2, onResult, continuation, 20), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
