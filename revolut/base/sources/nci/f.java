package nci;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n8i.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReadTermsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ReadTermsController readTermsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = readTermsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            case 3:
                return new f(this.v, continuation, 3);
            default:
                return new f(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReadTermsController readTermsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = ReadTermsController.T;
                readTermsController.d3().f204043b.setExpanded(false);
                PdfView readTermsPdfView = readTermsController.d3().f204044c;
                Intrinsics.checkNotNullExpressionValue(readTermsPdfView, "readTermsPdfView");
                if (readTermsPdfView.getVisibility() == 0) {
                    PdfView readTermsPdfView2 = readTermsController.d3().f204044c;
                    Intrinsics.checkNotNullExpressionValue(readTermsPdfView2, "readTermsPdfView");
                    oyl.f fVar = readTermsController.S;
                    if (fVar != null) {
                        nyl.b bVar = fVar.d;
                        float f = bVar.f;
                        bVar.c(1.0f / f, f > 1.0f ? bVar.f220921c.x : 0.0f, BitmapDescriptorFactory.HUE_RED);
                        bVar.invalidate();
                    }
                    View viewI = kotlin.jvm.internal.s.i(readTermsPdfView2, new Class[]{RecyclerView.class}, null);
                    RecyclerView recyclerView = viewI instanceof RecyclerView ? (RecyclerView) viewI : null;
                    if (recyclerView != null) {
                        ReadTermsController.h3(recyclerView, true);
                    }
                } else {
                    ScreenContentRecyclerView readTermsRecyclerView = readTermsController.d3().d;
                    Intrinsics.checkNotNullExpressionValue(readTermsRecyclerView, "readTermsRecyclerView");
                    ReadTermsController.h3(readTermsRecyclerView, false);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) readTermsController.R2()).C2(n.f214208a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) readTermsController.R2()).C2(m.f214207a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) readTermsController.R2();
                rVar.H2(rVar.f214217s, new q0(18));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = readTermsController.R2();
                IllegalStateException error = new IllegalStateException("An error occurred while loading content into WebView");
                r rVar2 = (r) lVarE3;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                rVar2.H2(rVar2.f214217s, new ab4.q(error, 29));
                break;
        }
        return Unit.f186387a;
    }
}
