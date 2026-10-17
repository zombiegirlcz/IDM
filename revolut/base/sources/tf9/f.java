package tf9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jg9.l;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rch.o;
import s6e.v;
import sqd.h0;
import vkm.j2;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p56.a f270273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jg9.g f270274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wo1.b f270275n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PayBillsAndTaxesNavigation$InputData f270276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f270277q;

    public f(p56.a mapper, jg9.g formExtension, wo1.b billsInteractor, gte.a featureToggleInteractor, PayBillsAndTaxesNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f270273l = mapper;
        this.f270274m = formExtension;
        this.f270275n = billsInteractor;
        this.o = featureToggleInteractor;
        this.f270276p = inputData;
        this.f270277q = q.c(new g(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o3(tf9.f r5, java.util.List r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof tf9.e
            if (r0 == 0) goto L13
            r0 = r7
            tf9.e r0 = (tf9.e) r0
            int r1 = r0.f270272w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270272w = r1
            goto L18
        L13:
            tf9.e r0 = new tf9.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270272w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L68
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r6.next()
            r2 = r7
            com.revolut.feature.apm.bills.core.api.model.BillFormField r2 = (com.revolut.feature.apm.bills.core.api.model.BillFormField) r2
            java.lang.String r2 = r2.i
            if (r2 != 0) goto L38
            goto L4b
        L4a:
            r7 = 0
        L4b:
            com.revolut.feature.apm.bills.core.api.model.BillFormField r7 = (com.revolut.feature.apm.bills.core.api.model.BillFormField) r7
            if (r7 != 0) goto L52
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L52:
            kotlinx.coroutines.flow.Flow r6 = r5.e3()
            s6e.v r2 = new s6e.v
            s6e.v r6 = (s6e.v) r6
            r4 = 21
            r2.<init>(r6, r7, r4)
            r0.f270272w = r3
            java.lang.Object r7 = vkm.q.x(r2, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            com.revolut.core.ui_kit.delegates.InputTextDelegate$Model r7 = (com.revolut.core.ui_kit.delegates.InputTextDelegate.Model) r7
            r5.k1(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tf9.f.o3(tf9.f, java.util.List, gim.c):java.lang.Object");
    }

    public static LinkedHashMap p3(List list) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BillFormField billFormField = (BillFormField) it8.next();
            String str = billFormField.i;
            if (str != null) {
                linkedHashMap.put(billFormField.f61274a, str);
            }
            List list2 = billFormField.f61279j;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((BillFormField.Choice) next).f61286a, billFormField.i)) {
                        break;
                    }
                }
                BillFormField.Choice choice = (BillFormField.Choice) next;
                if (choice != null) {
                    linkedHashMap.putAll(p3(choice.d));
                }
            }
            linkedHashMap.putAll(p3(billFormField.f61280l));
        }
        return linkedHashMap;
    }

    @Override // xf9.a
    public final boolean Z2(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.l2);
    }

    @Override // xf9.a
    public final Flow e3() {
        return new v(this.f270277q, this.f270273l, 20);
    }

    @Override // xf9.a
    public final Unit f3() {
        j2 j2Var = this.f270277q;
        T2(new c(((g) j2Var.getValue()).f270278a, this, edl.a.v(((g) j2Var.getValue()).f270280c), null), new yi5.b(27));
        return Unit.f186387a;
    }

    @Override // xf9.a
    public final void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        i2b.a.P(listId, extractedValue, str, new o(2, this, f.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/String;)V", 0, 11));
    }

    @Override // xf9.a
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.P;
        if (obj2 instanceof BillFormField) {
            BillFormField formField = (BillFormField) obj2;
            xo1.c cVar = formField.f61276c;
            int i = a.f270267a[cVar.ordinal()];
            jg9.g gVar = this.f270274m;
            if (i != 1) {
                ((l) gVar).d3(formField, new td1.f(this, 12));
                return;
            }
            xo1.g paymentMethod = xo1.g.NZ_BILLS;
            t8e.c onResult = new t8e.c(this, formField, 16);
            l lVar = (l) gVar;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(formField, "formField");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            if (cVar != xo1.c.SEARCH) {
                return;
            }
            jeg.g gVar2 = new jeg.g(onResult, 8);
            lVar.N2(lVar.o2(new dm1.a(new BillerSearchNavigation$InputData(paymentMethod, null))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new jeg.g(gVar2, 7));
        }
    }

    @Override // xf9.a
    public final void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        T2(new h0(this, null, 22), new yi5.b(27));
    }

    public final void q3(String str, String str2) {
        j2 j2Var;
        Object value;
        g gVar;
        do {
            j2Var = this.f270277q;
            value = j2Var.getValue();
            gVar = (g) value;
        } while (!j2Var.h(value, g.a(gVar, null, null, r0.q(gVar.f270280c, new Pair(str, str2)), null, 23)));
    }
}
