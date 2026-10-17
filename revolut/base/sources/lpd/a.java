package lpd;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import com.revolut.retail.common.ui.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.e0;
import nii.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ EditCycleScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditCycleScreen editCycleScreen, Continuation continuation) {
        super(2, continuation);
        this.u = editCycleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lzi.d dVar;
        lzi.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = (r) this.u.T2();
        lzi.h eVar = null;
        if (rVar.f198987q.b()) {
            k kVar = ((l) rVar.t2()).f198977a;
            if (kVar instanceof j) {
                lzi.f fVar = ((j) kVar).f198976b;
                if (fVar != null) {
                    eVar = new lzi.g(fVar);
                }
            } else if (kVar instanceof e) {
                e eVar2 = (e) kVar;
                if (eVar2.d) {
                    int i = eVar2.f198971c;
                    int i2 = q.f198984b[eVar2.e.ordinal()];
                    if (i2 == 1) {
                        bVar = lzi.b.EXACT;
                    } else if (i2 == 2) {
                        bVar = lzi.b.BEFORE_WEEKEND;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = lzi.b.AFTER_WEEKEND;
                    }
                    eVar = new lzi.c(i, bVar);
                } else {
                    rVar.x2(new p(kVar, 2));
                }
            } else {
                if (!(kVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                h hVar = ((i) kVar).f198973b;
                lzi.f fVarA = hVar.a();
                if (hVar instanceof f) {
                    dVar = lzi.d.FIRST;
                } else {
                    if (!(hVar instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = lzi.d.LAST;
                }
                eVar = new lzi.e(fVarA, dVar);
            }
            if (eVar != null) {
                rVar.v2(new m(eVar));
            }
        } else {
            rVar.X1(new y0("SUCCESS_CYCLE_UPDATE_DIALOG_ID", new e0((Clause) new TextLocalisedClause(R$string.offline_widget_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.offline_widget_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020), false, 4));
        }
        return Unit.f186387a;
    }
}
