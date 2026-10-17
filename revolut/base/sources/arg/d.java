package arg;

import amh.j;
import aoa.h;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import ue0.e;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements mpg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f8716a;

    public d(pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f8716a = termsInteractor;
    }

    public static ArrayList d(SavingsProduct savingsProduct) {
        ArrayList arrayList = savingsProduct.f86624m;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof SavingsDocument.Scope) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (Intrinsics.f(((SavingsDocument.Scope) obj3).f86612b, Boolean.TRUE)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList4.add(new TermsScope(((SavingsDocument.Scope) it8.next()).f86611a));
        }
        if (savingsProduct.f86619c == g.SAVINGS_DEPOSITS && arrayList4.isEmpty()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("product with id - ", savingsProduct.f86617a, " has no T&C to accept"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.shared.savings.models.product.SavingsProduct r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof arg.c
            if (r0 == 0) goto L13
            r0 = r6
            arg.c r0 = (arg.c) r0
            int r1 = r0.f8715y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8715y = r1
            goto L18
        L13:
            arg.c r0 = new arg.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8713w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8715y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.v
            java.util.Iterator r2 = r0.u
            yhm.o.b(r6)
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.revolut.feature.shared.savings.models.product.d r6 = com.revolut.feature.shared.savings.models.product.d.US_SUTTON
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.revolut.feature.shared.savings.models.product.SavingsProduct$Provider r2 = r5.e
            if (r2 == 0) goto L45
            java.lang.String r2 = r2.f86666a
            goto L46
        L45:
            r2 = 0
        L46:
            boolean r6 = zhm.d0.T(r6, r2)
            if (r6 != 0) goto L70
            java.util.ArrayList r5 = d(r5)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r2 = r5
            r5 = r6
        L57:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r2.next()
            com.revolut.feature.terms.api.model.TermsScope r6 = (com.revolut.feature.terms.api.model.TermsScope) r6
            r0.u = r2
            r0.v = r5
            r0.f8715y = r3
            java.lang.Object r6 = r4.c(r6, r0)
            if (r6 != r1) goto L57
            return r1
        L70:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: arg.d.a(com.revolut.feature.shared.savings.models.product.SavingsProduct, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.shared.savings.models.product.SavingsProductData r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof arg.b
            if (r0 == 0) goto L13
            r0 = r6
            arg.b r0 = (arg.b) r0
            int r1 = r0.f8712y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8712y = r1
            goto L18
        L13:
            arg.b r0 = new arg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8710w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8712y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.v
            java.util.Iterator r2 = r0.u
            yhm.o.b(r6)
            goto L65
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            if (r5 == 0) goto L51
            com.revolut.feature.shared.savings.models.product.SavingsProduct r6 = r5.f86683a
            if (r6 == 0) goto L51
            com.revolut.feature.shared.savings.models.product.SavingsProduct$Provider r6 = r6.e
            if (r6 == 0) goto L51
            com.revolut.feature.shared.savings.models.product.d r2 = com.revolut.feature.shared.savings.models.product.d.US_SUTTON
            java.util.List r2 = r2.a()
            java.lang.String r6 = r6.f86666a
            boolean r6 = r2.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L52
        L51:
            r6 = 0
        L52:
            boolean r6 = pd.b.j(r6)
            if (r6 != 0) goto L7e
            com.revolut.feature.shared.savings.models.product.SavingsProduct r5 = r5.f86683a
            java.util.ArrayList r5 = d(r5)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r2 = r5
            r5 = r6
        L65:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r2.next()
            com.revolut.feature.terms.api.model.TermsScope r6 = (com.revolut.feature.terms.api.model.TermsScope) r6
            r0.u = r2
            r0.v = r5
            r0.f8712y = r3
            java.lang.Object r6 = r4.c(r6, r0)
            if (r6 != r1) goto L65
            return r1
        L7e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: arg.d.b(com.revolut.feature.shared.savings.models.product.SavingsProductData, gim.c):java.lang.Object");
    }

    public final Object c(TermsScope termsScope, gim.c cVar) {
        pfm.a aVar = new pfm.a(e.D(pre.c.e(this.f8716a, termsScope), new a(termsScope, 0)), new h(new j(this, termsScope, 29), 24), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Object objA = nim.a.a(aVar, cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
