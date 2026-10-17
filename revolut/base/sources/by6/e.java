package by6;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreen;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoicePaymentMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoicePaymentMethodsScreen invoicePaymentMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoicePaymentMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        Object obj3 = model.u;
        y yVar = kVarE3.f19757q;
        if (obj3 instanceof sr6.i) {
            Set setH1 = d0.h1(((g) ((j2) yVar.f22677a).getValue()).f19747a);
            if (setH1.contains(obj3)) {
                setH1.remove(obj3);
                sr6.i iVar = (sr6.i) obj3;
                Object obj4 = n.f19759a;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                ?? r3 = n.f19759a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r3.entrySet()) {
                    if (((sr6.i) entry.getValue()) == iVar) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setH1.removeAll(linkedHashMap.keySet());
            } else {
                setH1.add(obj3);
                sr6.i iVar2 = (sr6.i) obj3;
                Object obj5 = n.f19759a;
                Intrinsics.checkNotNullParameter(iVar2, "<this>");
                sr6.i iVar3 = (sr6.i) n.f19759a.get(iVar2);
                if (iVar3 != null) {
                    setH1.add(iVar3);
                }
            }
            kVarE3.H2(yVar, new a83.d0(8, setH1));
        }
        return Unit.f186387a;
    }
}
