package tml;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a f272246b;

    public /* synthetic */ d(com.revolut.sso.impl.ui.email.change_flow.a aVar, int i) {
        this.f272245a = i;
        this.f272246b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f272245a;
        vml.h hVar = vml.h.f290622a;
        int i2 = 26;
        com.revolut.sso.impl.ui.email.change_flow.a aVar = this.f272246b;
        switch (i) {
            case 0:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
            case 1:
                n1 it9 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
            case 2:
                n1 it10 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
            case 3:
                n1 it11 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
            case 4:
                vml.i result = (vml.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof vml.g) {
                    aVar.l2(new m(aVar, result, null), new yi5.b(i2));
                } else {
                    if (!Intrinsics.f(result, hVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected email verification result " + result);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    aVar.P2(new tlf.n(3));
                }
                return Unit.f186387a;
            case 5:
                vml.i result2 = (vml.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof vml.g) {
                    aVar.l2(new j(aVar, result2, null), new yi5.b(i2));
                } else {
                    if (!Intrinsics.f(result2, hVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.O2(zil.b.f322582a);
                }
                return Unit.f186387a;
            case 6:
                n1 it12 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
            default:
                oki.h.D2(aVar.f106526x);
                return Unit.f186387a;
        }
    }
}
