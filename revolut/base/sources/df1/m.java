package df1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreenContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a;
import com.revolut.kompot.common.ModalDestination;
import dcf.v0;
import gd1.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c f113758b;

    public /* synthetic */ m(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar, int i) {
        this.f113757a = i;
        this.f113758b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f113757a) {
            case 0:
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.f) {
                    com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar = this.f113758b;
                    cVar.n2(new v0(cVar, null, 3), new whi.b(6));
                }
                return Unit.f186387a;
            case 1:
                oki.h.v2(this.f113758b.f60841t, new LitePosShoppingCartScreenContract$ModalStep.AmountExceedsLimit((dj0.d) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            default:
                gd1.b bVar = (gd1.b) obj2;
                boolean zF = Intrinsics.f(bVar, b.a.f143030a);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c cVar2 = this.f113758b;
                if (zF) {
                    cVar2.o.b();
                    cVar2.C2(a.C0453a.f60835a);
                } else if (Intrinsics.f(bVar, b.C0826b.f143031a)) {
                    cVar2.C2(a.b.f60836a);
                } else {
                    if (!(bVar instanceof gd1.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.g2(cVar2, new ReceiptScreen(new ReceiptScreenContract$InputData(((gd1.c) bVar).f143032a)), null, null, 3);
                }
                return Unit.f186387a;
        }
    }
}
