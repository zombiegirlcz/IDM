package nol;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218076b;

    public /* synthetic */ e(com.revolut.sso.impl.ui.phone.change_flow.b bVar, int i) {
        this.f218075a = i;
        this.f218076b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f218075a;
        com.revolut.sso.impl.ui.phone.change_flow.b bVar = this.f218076b;
        switch (i) {
            case 0:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(bVar.f106661y);
                return Unit.f186387a;
            case 1:
                pol.k result = (pol.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof pol.h) {
                    bVar.l2(new j(result, bVar, null), new yi5.b(26));
                } else if (Intrinsics.f(result, pol.i.f238053a)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected sign-in request");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    bVar.O2(new nnf.h(21));
                } else {
                    if (!Intrinsics.f(result, pol.j.f238054a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(fjl.b.f135678a);
                }
                return Unit.f186387a;
            case 2:
                n1 it9 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.D2(bVar.f106661y);
                return Unit.f186387a;
            case 3:
                n1 it10 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                oki.h.D2(bVar.f106661y);
                return Unit.f186387a;
            default:
                oki.h.D2(bVar.f106661y);
                return Unit.f186387a;
        }
    }
}
