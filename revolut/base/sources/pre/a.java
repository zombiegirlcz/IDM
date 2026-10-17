package pre;

import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import po9.w;
import pof.e;
import sre.h;
import ufm.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f238995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f238996c;

    public /* synthetic */ a(List list, c cVar, int i) {
        this.f238994a = i;
        this.f238995b = list;
        this.f238996c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        lre.b bVar;
        Object next;
        List<lre.a> allTermsList = (List) obj2;
        switch (this.f238994a) {
            case 0:
                Intrinsics.checkNotNullParameter(allTermsList, "allTermsList");
                for (TermsScope termsScope : this.f238995b) {
                    List list = allTermsList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f(((Terms) it8.next()).f, termsScope)) {
                            }
                            break;
                        }
                    }
                    throw new NoSuchElementException(j6.a.q("No terms matching scope:", termsScope.f90390a));
                }
                c cVar = this.f238996c;
                h hVar = (h) cVar.f238999a;
                hVar.getClass();
                lre.c termsSignatory = lre.c.f199507a;
                Intrinsics.checkNotNullParameter(termsSignatory, "termsSignatory");
                d0 d0VarFirstOrError = m70.a.g(zi0.c.J(hVar.f265200g.f(termsSignatory, true)), new e(cVar, 19), null, 2).firstOrError();
                w wVar = new w(17, new njf.e(cVar, allTermsList));
                d0VarFirstOrError.getClass();
                return new i(d0VarFirstOrError, wVar, 0);
            default:
                Intrinsics.checkNotNullParameter(allTermsList, "acceptedTermsList");
                ArrayList arrayList = new ArrayList();
                for (lre.a aVar : allTermsList) {
                    Iterator it9 = this.f238995b.iterator();
                    while (true) {
                        bVar = null;
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((Terms) next).f, aVar.f199502b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Terms terms = (Terms) next;
                    if (terms != null) {
                        this.f238996c.getClass();
                        bVar = new lre.b(terms.f90355a, terms.f90356b, terms.f90357c, terms.d, aVar.f199501a, terms.f, terms.f90359h);
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
        }
    }
}
