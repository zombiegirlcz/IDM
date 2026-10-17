package gnb;

import a83.c0;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pre.c;
import rd0.e;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f144951b;

    public /* synthetic */ a(b bVar, int i) {
        this.f144950a = i;
        this.f144951b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f144950a) {
            case 0:
                SavingsProductData product = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(product, "product");
                ArrayList<SavingsDocument> arrayList = product.f86683a.f86624m;
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (true) {
                    TermsScope termsScope = null;
                    if (!it8.hasNext()) {
                        if (!arrayList2.isEmpty()) {
                            return e.b(nim.a.w(c.l(this.f144951b.d, null, null, arrayList2, 11), new c0(23, arrayList)));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (SavingsDocument savingsDocument : arrayList) {
                            SavingsDocument.Link link = savingsDocument instanceof SavingsDocument.Link ? (SavingsDocument.Link) savingsDocument : null;
                            bjb.a aVar = link != null ? new bjb.a(link.f86608a, link) : null;
                            if (aVar != null) {
                                arrayList3.add(aVar);
                            }
                        }
                        return zi0.c.i(arrayList3);
                    }
                    SavingsDocument savingsDocument2 = (SavingsDocument) it8.next();
                    SavingsDocument.Scope scope = savingsDocument2 instanceof SavingsDocument.Scope ? (SavingsDocument.Scope) savingsDocument2 : null;
                    if (scope != null && (str = scope.f86611a) != null) {
                        termsScope = new TermsScope(str);
                    }
                    if (termsScope != null) {
                        arrayList2.add(termsScope);
                    }
                }
                break;
            default:
                SavingsChallenge challenge = (SavingsChallenge) obj2;
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                ArrayList arrayList4 = challenge.f83091h;
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(new TermsScope(((SavingsChallenge.Document) it9.next()).f83095a));
                }
                return arrayList5.isEmpty() ? zi0.c.i(f0.f322471a) : e.b(nim.a.w(c.l(this.f144951b.d, null, null, arrayList5, 11), new gn.a(2)));
        }
    }
}
