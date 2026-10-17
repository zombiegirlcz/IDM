package i47;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import ip0.qd0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = model.f53304a;
        final Object obj3 = model.k;
        final com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) jVarE3;
        y yVar = aVar2.f74381r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 instanceof qd0) {
            if (Intrinsics.f(listId, "LIST_ID_CATEGORY_SECTION_HEADER")) {
                final int i = 0;
                aVar2.H2(yVar, new Function1() { // from class: i47.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Set set;
                        Set set2;
                        h update = (h) obj4;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                int i2 = p.f158306a[((qd0) obj3).ordinal()];
                                if (i2 == 1 || i2 == 2) {
                                    set = ((h) ((j2) aVar2.f74381r.f22677a).getValue()).d;
                                } else {
                                    if (i2 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    set = h0.f322473a;
                                }
                                return h.a(update, null, set, null, 5);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                int i3 = p.f158306a[((qd0) obj3).ordinal()];
                                if (i3 == 1 || i3 == 2) {
                                    set2 = ((h) ((j2) aVar2.f74381r.f22677a).getValue()).e;
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    set2 = h0.f322473a;
                                }
                                return h.a(update, null, null, set2, 3);
                        }
                    }
                });
            } else if (Intrinsics.f(listId, "LIST_ID_CURRENCY_SECTION_HEADER")) {
                final int i2 = 1;
                aVar2.H2(yVar, new Function1() { // from class: i47.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Set set;
                        Set set2;
                        h update = (h) obj4;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                int i22 = p.f158306a[((qd0) obj3).ordinal()];
                                if (i22 == 1 || i22 == 2) {
                                    set = ((h) ((j2) aVar2.f74381r.f22677a).getValue()).d;
                                } else {
                                    if (i22 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    set = h0.f322473a;
                                }
                                return h.a(update, null, set, null, 5);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                int i3 = p.f158306a[((qd0) obj3).ordinal()];
                                if (i3 == 1 || i3 == 2) {
                                    set2 = ((h) ((j2) aVar2.f74381r.f22677a).getValue()).e;
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    set2 = h0.f322473a;
                                }
                                return h.a(update, null, null, set2, 3);
                        }
                    }
                });
            }
        }
        return Unit.f186387a;
    }
}
