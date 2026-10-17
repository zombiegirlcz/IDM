package qh4;

import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreenContract$InputData;
import dw3.c1;
import dw3.v5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolleeScreen f246472b;

    public /* synthetic */ p(RolleeScreen rolleeScreen, int i) {
        this.f246471a = i;
        this.f246472b = rolleeScreen;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f246471a;
        Continuation continuation = null;
        RolleeScreen rolleeScreen = this.f246472b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = RolleeScreen.T;
                qji.b bVarU2 = rolleeScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.rollee.di.RolleeScreenInjector");
                v5 v5Var = (v5) bVarU2;
                c1 c1Var = v5Var.f120003c;
                v5 v5Var2 = v5Var.d;
                RolleeScreenContract$InputData rolleeScreenContract$InputData = rolleeScreen.L;
                rolleeScreenContract$InputData.getClass();
                break;
            case 1:
                KProperty[] kPropertyArr2 = RolleeScreen.T;
                break;
            case 2:
                KProperty[] kPropertyArr3 = RolleeScreen.T;
                break;
            case 3:
                rolleeScreen.g3("onClose", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, null, null);
                rolleeScreen.R2().C2(u.f246477a);
                break;
            case 4:
                rolleeScreen.g3("onSessionExpired", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, null, null);
                b0 b0VarR2 = rolleeScreen.R2();
                b0VarR2.getClass();
                b0VarR2.l2(new qc8.b(b0VarR2, continuation, 6), new yi5.b(26));
                break;
            default:
                rolleeScreen.g3("onBack", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, null, null);
                rolleeScreen.R2().B2();
                break;
        }
        return Unit.f186387a;
    }
}
