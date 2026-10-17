package et6;

import com.revolut.feature.freelancer.api.terms.FreelancerTerms;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l71.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y3 f129346b;

    public /* synthetic */ u3(y3 y3Var, int i) {
        this.f129345a = i;
        this.f129346b = y3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.b bVarM;
        ufm.b bVarM2;
        switch (this.f129345a) {
            case 0:
                l71.d company = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(company, "company");
                final y3 y3Var = this.f129346b;
                pre.c cVar = y3Var.f129386a;
                TermsScope.INSTANCE.getClass();
                efm.d0 d0VarF = cVar.f(TermsScope.L, null);
                final int i = 1;
                efm.d0 d0VarB = y3.b(company, (l71.a[]) Arrays.copyOf(y3.f129385c, 1), new Function0() { // from class: et6.v3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                pre.c cVar2 = y3Var.f129386a;
                                TermsScope.INSTANCE.getClass();
                                return cVar2.j(TermsScope.B);
                            default:
                                pre.c cVar3 = y3Var.f129386a;
                                TermsScope.INSTANCE.getClass();
                                return cVar3.f(TermsScope.B, null);
                        }
                    }
                });
                a.m[] mVarArr = y3.d;
                boolean zI = kotlin.collections.d.I((l71.a[]) Arrays.copyOf(mVarArr, 1), company.b());
                od0.i iVar = od0.i.f224256b;
                if (zI) {
                    od0.h hVar = od0.i.Companion;
                    FreelancerTerms.Template template = new FreelancerTerms.Template("information_sheet_revolut_pro-14d");
                    hVar.getClass();
                    bVarM = efm.d0.m(od0.h.a(template));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                } else {
                    od0.i.Companion.getClass();
                    bVarM = efm.d0.m(iVar);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                }
                if (kotlin.collections.d.I((l71.a[]) Arrays.copyOf(mVarArr, 1), company.b())) {
                    od0.h hVar2 = od0.i.Companion;
                    FreelancerTerms.Template template2 = new FreelancerTerms.Template("fee_information_document_revolut_pro");
                    hVar2.getClass();
                    bVarM2 = efm.d0.m(od0.h.a(template2));
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                } else {
                    od0.i.Companion.getClass();
                    bVarM2 = efm.d0.m(iVar);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                }
                return te0.w.J0(d0VarF, d0VarB, bVarM, bVarM2);
            case 1:
                l71.d company2 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(company2, "company");
                final y3 y3Var2 = this.f129346b;
                pre.c cVar2 = y3Var2.f129386a;
                TermsScope.INSTANCE.getClass();
                final int i2 = 0;
                return te0.w.H0(cVar2.j(TermsScope.L), y3.b(company2, (l71.a[]) Arrays.copyOf(y3.f129385c, 1), new Function0() { // from class: et6.v3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                pre.c cVar22 = y3Var2.f129386a;
                                TermsScope.INSTANCE.getClass();
                                return cVar22.j(TermsScope.B);
                            default:
                                pre.c cVar3 = y3Var2.f129386a;
                                TermsScope.INSTANCE.getClass();
                                return cVar3.f(TermsScope.B, null);
                        }
                    }
                }));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                od0.i iVar3 = (od0.i) pair.f186386b;
                Terms terms = (Terms) iVar2.f224257a;
                String str = terms != null ? terms.f90355a : null;
                Terms terms2 = (Terms) iVar3.f224257a;
                String[] elements = {str, terms2 != null ? terms2.f90355a : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                if (((ArrayList) listL).isEmpty()) {
                    return pfm.m.f235744a;
                }
                ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
                Iterator it8 = listL.iterator();
                while (it8.hasNext()) {
                    arrayList.add(pre.c.b(this.f129346b.f129386a, (String) it8.next()));
                }
                efm.b[] bVarArr = (efm.b[]) arrayList.toArray(new efm.b[0]);
                return efm.b.p((efm.f[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
    }
}
