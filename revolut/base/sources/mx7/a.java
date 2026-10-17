package mx7;

import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kx7.y0;
import mx0.bc;
import mx0.oc;
import qi3.p;
import te0.w;
import yhm.r;
import zhm.a0;
import zhm.f0;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f210220b;

    public /* synthetic */ a(c cVar, int i) {
        this.f210219a = i;
        this.f210220b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f210219a) {
            case 0:
                c cVar = this.f210220b;
                fx7.f fVar = cVar.f210223c;
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                c0 petType = (c0) rVar.f314201a;
                zw7.h breedType = (zw7.h) rVar.f314202b;
                String str = (String) rVar.f314203c;
                if (!d0.W(str)) {
                    efm.r map = m70.a.g(fx7.f.c(fVar, petType, breedType), null, new mv5.h(14), 1).map(new bc(new mll.h(str, 6), 7));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    efm.r map2 = ue0.e.E(map, f0.f322471a).map(new bc(new oc(cVar, 2), 8));
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    return map2;
                }
                Intrinsics.checkNotNullParameter(petType, "petType");
                Intrinsics.checkNotNullParameter(breedType, "breedType");
                efm.r rVarG = m70.a.g(nim.a.w(((y0) fVar.f138760a).b(petType, false), new fx7.c(breedType, 1)), null, new mv5.h(15), 1);
                f0 f0Var = f0.f322471a;
                efm.r map3 = w.l(ue0.e.E(rVarG, f0Var), ue0.e.E(m70.a.g(fx7.f.c(fVar, petType, breedType), null, new mv5.h(13), 1), f0Var)).map(new bc(new a(cVar, 1), 6));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                return map3;
            default:
                t70.g gVar = this.f210220b.d;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                if (!list.isEmpty()) {
                    arrayList.add(new ChooserScreenContract$Model("POPULAR_BREED_HEADER_LIST_ID", gVar.getString(R$string.pets_onboarding_pet_details_breed_popular_breeds_section_title), p.HEADER, null, null, null, false, null, 32756));
                    a0.x(c.b(list), arrayList);
                }
                if (!list2.isEmpty()) {
                    arrayList.add(new ChooserScreenContract$Model("ALL_BREED_HEADER_LIST_ID", gVar.getString(R$string.pets_onboarding_pet_details_breed_all_breeds_section_title), p.HEADER, null, null, null, false, null, 32756));
                    a0.x(c.b(list2), arrayList);
                }
                return arrayList;
        }
    }
}
