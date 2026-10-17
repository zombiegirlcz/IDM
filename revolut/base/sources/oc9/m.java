package oc9;

import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public static boolean a(List requiredTerms, List loadedTerms) {
        Intrinsics.checkNotNullParameter(requiredTerms, "requiredTerms");
        Intrinsics.checkNotNullParameter(loadedTerms, "loadedTerms");
        List<TermsScope> list = requiredTerms;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (TermsScope termsScope : list) {
                List list2 = loadedTerms;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (kotlin.text.a0.z(((Terms) it8.next()).f.f90390a, termsScope.f90390a, true)) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
