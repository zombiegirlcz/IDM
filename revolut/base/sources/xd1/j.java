package xd1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a;
import com.revolut.kompot.common.ModalDestination;
import gd1.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g f304222b;

    public /* synthetic */ j(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar, int i) {
        this.f304221a = i;
        this.f304222b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f304221a) {
            case 0:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a result = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF = Intrinsics.f(result, a.C0452a.f60775a);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar = this.f304222b;
                if (zF) {
                    gVar.C2(b.a.f60736a);
                } else if (result instanceof a.b) {
                    gVar.C2(new e(((a.b) result).f60776a));
                } else {
                    if (!(result instanceof ge1.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ge1.g gVar2 = (ge1.g) result;
                    gVar.n2(new wih.c(gVar, gVar2.f143211a, gVar2.f143212b, null, 27), new whi.b(6));
                }
                return Unit.f186387a;
            case 1:
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.e) {
                    com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar3 = this.f304222b;
                    gVar3.l2(new m(gVar3, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
            case 2:
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof dii.e) {
                    com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar4 = this.f304222b;
                    gVar4.l2(new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.c(gVar4, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 3:
                oki.h.v2(this.f304222b.C, new LitePosFlowContract$ModalStep.AmountExceedsLimit((dj0.d) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            default:
                gd1.b bVar = (gd1.b) obj2;
                boolean zF2 = Intrinsics.f(bVar, b.a.f143030a);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar5 = this.f304222b;
                if (zF2) {
                    gVar5.o.b();
                    gVar5.f60745y.k(Unit.f186387a);
                } else if (Intrinsics.f(bVar, b.C0826b.f143031a)) {
                    gVar5.B2();
                } else {
                    if (!(bVar instanceof gd1.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(gVar5.C, new LitePosFlowContract$ModalStep.Receipt(((gd1.c) bVar).f143032a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }
}
