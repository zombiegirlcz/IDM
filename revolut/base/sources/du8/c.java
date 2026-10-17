package du8;

import com.revolut.feature.kyc.core.models.KycConfiguration;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import cu8.d1;
import cu8.j1;
import cu8.n1;
import dkk.a0;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mpd.p;
import my8.l;
import my8.r;
import pfm.t;
import vf0.y;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f117938b;

    public /* synthetic */ c(e eVar, int i) {
        this.f117937a = i;
        this.f117938b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f117937a) {
            case 0:
                y yVar = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                l lVar = (l) yVar.f288491a;
                SelectedKycDocs selectedKycDocs = (SelectedKycDocs) yVar.f288492b;
                od0.i iVar = (od0.i) yVar.f288493c;
                wi0.b bVar = (wi0.b) yVar.d;
                Set set = (Set) yVar.e;
                r rVar = (r) yVar.f;
                e eVar = this.f117938b;
                mt8.d dVar = eVar.f117940a;
                Intrinsics.h(rVar);
                String strA = eVar.d.a();
                List list = selectedKycDocs.f77598a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((l) it8.next()).f210383a);
                }
                yt8.a initKycInput = new yt8.a(lVar, rVar, bVar, set, strA, (String) iVar.f224257a, lVar.f210383a, arrayList);
                Intrinsics.checkNotNullParameter(initKycInput, "initKycInput");
                return te0.w.o0(kotlin.coroutines.g.f186406a, new p(dVar, initKycInput, null, 4));
            case 1:
                KycConfiguration config = (KycConfiguration) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                e eVar2 = this.f117938b;
                t tVarZ0 = te0.w.z0(((n1) eVar2.f117941b).D0(), config);
                com.revolut.feature.kyc.impl.b bVar2 = (com.revolut.feature.kyc.impl.b) eVar2.e;
                d0 d0VarK3 = bVar2.k3();
                d0 d0VarFirstOrError = bVar2.v3().firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                d0 d0VarFirstOrError2 = bVar2.s3().firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                pfm.a aVar = new pfm.a(te0.w.I0(d0VarK3, d0VarFirstOrError, d0VarFirstOrError2), new a0(new doe.c(config, eVar2, 12), 21), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return tVarZ0.e(aVar);
            default:
                d1 it9 = (d1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                e eVar3 = this.f117938b;
                j1 j1Var = eVar3.f117941b;
                d0 a7 = ((n1) j1Var).z0();
                n1 n1Var = (n1) j1Var;
                d0 b4 = te0.w.C(n1Var.H0());
                d0 c2 = te0.w.C(n1Var.J0());
                d0 d = te0.w.C(n1Var.G0());
                d0 e = te0.w.C(n1Var.w0());
                d0 f = ((com.revolut.feature.kyc.impl.b) eVar3.e).v3().firstOrError();
                Intrinsics.checkNotNullExpressionValue(f, "firstOrError(...)");
                Intrinsics.checkNotNullParameter(a7, "a");
                Intrinsics.checkNotNullParameter(b4, "b");
                Intrinsics.checkNotNullParameter(c2, "c");
                Intrinsics.checkNotNullParameter(d, "d");
                Intrinsics.checkNotNullParameter(e, "e");
                Intrinsics.checkNotNullParameter(f, "f");
                d0 d0VarZ = d0.z(a7, b4, c2, d, e, f, new uyd.y(19));
                Intrinsics.checkNotNullExpressionValue(d0VarZ, "zip(...)");
                d0 iVar2 = new ufm.i(d0VarZ, new a0(new c(eVar3, 0), 19), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                if (com.bumptech.glide.d.u((wi0.b) n1Var.y0().get())) {
                    iVar2 = iVar2.g(sjg.a.a(eVar3.i));
                    Intrinsics.checkNotNullExpressionValue(iVar2, "compose(...)");
                }
                pfm.a aVar2 = new pfm.a(iVar2, new a0(new c(eVar3, 1), 20), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
        }
    }
}
