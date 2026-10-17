package upe;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import unc.y;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.list.a f282001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f282001w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f282001w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f282001w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.r iVar;
        int i = this.u;
        com.revolut.feature.tax_residency.impl.v2.ui.list.a aVar = this.f282001w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f90273t, new y(data, 4));
                return Unit.f186387a;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(popupMenuItem);
                Object obj3 = ((PopupMenuItem.Cell) popupMenuItem).i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract.TaxResidencyPopupMenuParcel");
                TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel taxResidencyListScreenContract$TaxResidencyPopupMenuParcel = (TaxResidencyListScreenContract$TaxResidencyPopupMenuParcel) obj3;
                DeclaredTaxResidency declaredTaxResidency = taxResidencyListScreenContract$TaxResidencyPopupMenuParcel.f90267a;
                List list = (List) zi0.c.I(((g) ((j2) aVar.f90273t.f22677a).getValue()).f281991a);
                int i2 = p.f282000a[taxResidencyListScreenContract$TaxResidencyPopupMenuParcel.f90268b.ordinal()];
                if (i2 == 1) {
                    iVar = new i(declaredTaxResidency, list);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = new k(declaredTaxResidency, list);
                }
                aVar.C2(iVar);
                return Unit.f186387a;
        }
    }
}
