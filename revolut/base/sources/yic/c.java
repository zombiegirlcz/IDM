package yic;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RentAndBillsHomeScreen rentAndBillsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RentAndBillsConfigurations.Configuration configuration;
        ArrayList arrayListB;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        String listId = model.f53228a;
        Object obj3 = model.u;
        x xVar = (x) rVarE3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        y yVar = xVar.v;
        RentAndBillsConfigurations rentAndBillsConfigurations = (RentAndBillsConfigurations) ((e) ((j2) yVar.f22677a).getValue()).f314279c.getContent();
        RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) ((e) ((j2) yVar.f22677a).getValue()).f314277a.getContent();
        if (rentAndBillsConfigurations == null) {
            hx7.e.n(new IllegalStateException(a0.d.m(obj3, "Configurations not loaded when category cell clicked: ")));
        } else {
            if (obj3 instanceof p) {
                RentAndBillsConfigurations.Configuration configuration2 = rentAndBillsConfigurations.f84777a;
                if (configuration2 != null) {
                    arrayListB = rentAndBillsLinkedPayments != null ? bkc.c.b(rentAndBillsLinkedPayments, egc.a.RENT) : null;
                    if (arrayListB != null && !arrayListB.isEmpty()) {
                        xVar.C2(new m(configuration2));
                    }
                }
            } else if ((obj3 instanceof o) && (configuration = rentAndBillsConfigurations.f84778b) != null) {
                arrayListB = rentAndBillsLinkedPayments != null ? bkc.c.b(rentAndBillsLinkedPayments, egc.a.BILLS) : null;
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    xVar.C2(new l(configuration));
                }
            }
        }
        return Unit.f186387a;
    }
}
