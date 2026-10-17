package qc0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import java.util.Stack;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q97.h2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244467b;

    public /* synthetic */ o(j0 j0Var, int i) {
        this.f244466a = i;
        this.f244467b = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244466a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xl2.h0 h0Var = (xl2.h0) pair.f186385a;
                ValidationResult validationResult = (ValidationResult) pair.f186386b;
                String f63423a = h0Var.getId();
                j0 j0Var = this.f244467b;
                return j0Var.m3(f63423a, new pza.d(h0Var, 10, j0Var, validationResult));
            case 1:
                Intrinsics.checkNotNullParameter((Stack) obj2, "it");
                j0 j0Var2 = this.f244467b;
                return j0Var2.R.a(j0Var2.o1(), new q5g.f0(j0Var2, 13), new q7b.j(j0Var2, (Continuation) null, 9));
            case 2:
                Intrinsics.checkNotNullParameter((e) obj2, "<unused var>");
                j0 j0Var3 = this.f244467b;
                efm.d0 d0VarK = j0Var3.f244441c.k();
                eli.j jVar = j0Var3.K;
                ca0.a aVar = j0Var3.L;
                jVar.getClass();
                pfm.a aVar2 = new pfm.a(d0VarK.g(new eli.a(jVar, aVar)), new h2(22, new o(j0Var3, 3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 3:
                BackendFlow it8 = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                te0.v vVarK = this.f244467b.f244440b.k();
                od0.i.Companion.getClass();
                return te0.w.z0(vVarK, od0.h.a(it8));
            case 4:
                rp0.y it9 = (rp0.y) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new pfm.h(new phc.d(this.f244467b, it9, 13), 2);
            case 5:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                return Boolean.valueOf(this.f244467b.f244446m.d(screen));
            case 6:
                Stack stack = (Stack) obj2;
                Intrinsics.checkNotNullParameter(stack, "stack");
                return new rfm.o(new nc0.a(this.f244467b, stack, 19));
            case 7:
                BackendScreen screen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                this.f244467b.f244446m.getClass();
                return Boolean.valueOf(aa0.b0.e(screen2));
            default:
                BackendScreen it10 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.h hVar = od0.i.Companion;
                ResourceImage resourceImageA = this.f244467b.N.a(it10);
                hVar.getClass();
                return od0.h.a(resourceImageA);
        }
    }
}
