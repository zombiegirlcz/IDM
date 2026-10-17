package arg;

import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailToOpenDocumentException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TermsFailToAcceptException;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TermsNotFoundException;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.d0;
import efm.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pfm.n;
import rfm.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TermsScope f8709b;

    public /* synthetic */ a(TermsScope termsScope, int i) {
        this.f8708a = i;
        this.f8709b = termsScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f8708a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ufm.c cVarL = d0.l(new SavingsErrorHandlingApi$TermsNotFoundException(j6.a.q("Not found terms for scope = ", this.f8709b.f90390a)));
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                n nVarN = efm.b.n(new SavingsErrorHandlingApi$TermsFailToAcceptException(j6.a.q("Fail to accept Terms and Conditions with scope = ", this.f8709b.f90390a)));
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
            case 2:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ufm.c cVarL2 = d0.l(new SavingsErrorHandlingApi$FailToOpenDocumentException(j6.a.q("Failed to open document with scope=", this.f8709b.f90390a)));
                Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
                return cVarL2;
            case 3:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                List list = terms;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        if (((lre.a) it11.next()).f199502b.equals(this.f8709b)) {
                            return k.g(Boolean.FALSE);
                        }
                    }
                }
                return h.f253943a;
            case 4:
                List termsToAcceptList = (List) obj2;
                Intrinsics.checkNotNullParameter(termsToAcceptList, "termsToAcceptList");
                List list2 = termsToAcceptList;
                boolean z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it12 = list2.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            if (Intrinsics.f(((Terms) it12.next()).f, this.f8709b)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                List termsToAcceptList2 = (List) obj2;
                Intrinsics.checkNotNullParameter(termsToAcceptList2, "termsToAcceptList");
                Iterator it13 = termsToAcceptList2.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next = it13.next();
                        if (Intrinsics.f(((Terms) next).f, this.f8709b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                i.Companion.getClass();
                return od0.h.a((Terms) next);
        }
    }
}
