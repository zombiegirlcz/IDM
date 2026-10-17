package l0c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kye.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsReadTermsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RevPointsReadTermsController revPointsReadTermsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsReadTermsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            case 3:
                return new g(this.v, continuation, 3);
            default:
                return new g(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsReadTermsController revPointsReadTermsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = RevPointsReadTermsController.T;
                revPointsReadTermsController.d3().f300829b.setExpanded(false);
                PdfView revPointsReadTermsPdfView = revPointsReadTermsController.d3().f300830c;
                Intrinsics.checkNotNullExpressionValue(revPointsReadTermsPdfView, "revPointsReadTermsPdfView");
                if (revPointsReadTermsPdfView.getVisibility() == 0) {
                    PdfView revPointsReadTermsPdfView2 = revPointsReadTermsController.d3().f300830c;
                    Intrinsics.checkNotNullExpressionValue(revPointsReadTermsPdfView2, "revPointsReadTermsPdfView");
                    oyl.f fVar = revPointsReadTermsController.S;
                    if (fVar != null) {
                        nyl.b bVar = fVar.d;
                        float f = bVar.f;
                        bVar.c(1.0f / f, f > 1.0f ? bVar.f220921c.x : 0.0f, BitmapDescriptorFactory.HUE_RED);
                        bVar.invalidate();
                    }
                    View viewI = kotlin.jvm.internal.s.i(revPointsReadTermsPdfView2, new Class[]{RecyclerView.class}, null);
                    RecyclerView recyclerView = viewI instanceof RecyclerView ? (RecyclerView) viewI : null;
                    if (recyclerView != null) {
                        RevPointsReadTermsController.h3(recyclerView, true);
                    }
                } else {
                    ScreenContentRecyclerView revPointsReadTermsRecyclerView = revPointsReadTermsController.d3().d;
                    Intrinsics.checkNotNullExpressionValue(revPointsReadTermsRecyclerView, "revPointsReadTermsRecyclerView");
                    RevPointsReadTermsController.h3(revPointsReadTermsRecyclerView, false);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) revPointsReadTermsController.d()).C2(m.f191216a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) revPointsReadTermsController.d()).C2(l.f191215a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) revPointsReadTermsController.d();
                uVar.H2(uVar.f191230t, new m0(25));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = revPointsReadTermsController.d();
                IllegalStateException error = new IllegalStateException("An error occurred while loading content into WebView");
                u uVar2 = (u) kVarE3;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                uVar2.H2(uVar2.f191230t, new ab4.q(error, 24));
                break;
        }
        return Unit.f186387a;
    }
}
