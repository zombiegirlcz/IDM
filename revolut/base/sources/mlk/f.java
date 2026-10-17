package mlk;

import android.content.Context;
import ggk.b1;
import ggk.d1;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.k f207003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.a f207004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dnk.m f207005c;
    public final c90.c d;

    public f(dnk.k highlightedBenefitsMapper, dnk.a benefitCategoriesMapper, dnk.m perksMapper, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(highlightedBenefitsMapper, "highlightedBenefitsMapper");
        Intrinsics.checkNotNullParameter(benefitCategoriesMapper, "benefitCategoriesMapper");
        Intrinsics.checkNotNullParameter(perksMapper, "perksMapper");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f207003a = highlightedBenefitsMapper;
        this.f207004b = benefitCategoriesMapper;
        this.f207005c = perksMapper;
        this.d = uiResources;
    }

    public static List b() {
        nb0 nb0Var = pb0.Companion;
        List listK = zhm.v.k(nb0.a(nb0Var, "benefit_1", false, 6), nb0.a(nb0Var, "benefit_2", false, 6), nb0.a(nb0Var, "benefit_3", false, 6), nb0.a(nb0Var, "benefit_4", false, 6));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final ArrayList a(ggk.z zVar) {
        List listA;
        d1 d1Var;
        List list;
        b1 b1Var;
        List listA2 = null;
        if (zVar == null || (b1Var = zVar.f143804a) == null) {
            listA = null;
        } else {
            Context context = this.d.f22265a;
            float fZ = kli.a.z(context.getResources().getDisplayMetrics().heightPixels, context);
            listA = this.f207003a.a(b1Var, Integer.valueOf(fZ < 700.0f ? 3 : fZ < 900.0f ? 4 : 5));
            yp0.b.k(listA, 0, 0, 0, 0, 31);
        }
        if (listA == null) {
            listA = zhm.f0.f322471a;
        }
        List list2 = listA;
        Iterable iterableA = (zVar == null || (list = zVar.f143805b) == null) ? null : this.f207004b.a(list);
        if (iterableA == null) {
            iterableA = zhm.f0.f322471a;
        }
        ArrayList arrayListE0 = zhm.d0.E0(iterableA, list2);
        if (zVar != null && (d1Var = zVar.f143806c) != null) {
            listA2 = this.f207005c.a(d1Var);
        }
        if (listA2 == null) {
            listA2 = zhm.f0.f322471a;
        }
        return zhm.d0.E0(listA2, arrayListE0);
    }
}
