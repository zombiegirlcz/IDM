package myg;

import aw0.b5;
import aw0.c5;
import aw0.e5;
import aw0.f5;
import aw0.i5;
import aw0.j5;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vxg.b f210497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f210498b;

    public c(vxg.b complexAnalyticsPortfolioAllocationMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsPortfolioAllocationMapper, "complexAnalyticsPortfolioAllocationMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210497a = complexAnalyticsPortfolioAllocationMapper;
        this.f210498b = featureToggleInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CompositeClause a(ArrayList arrayList) {
        Iterator it8 = arrayList.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            float f = ((vxg.a) next).f293085c;
            do {
                Object next2 = it8.next();
                float f4 = ((vxg.a) next2).f293085c;
                if (Float.compare(f, f4) < 0) {
                    next = next2;
                    f = f4;
                }
            } while (it8.hasNext());
        }
        vxg.a aVar = (vxg.a) next;
        List listK = v.k(aVar.f293083a, new PercentageClause(((double) aVar.f293085c) * 100.0d, (PercentageClause.Format) null, (Custom) null, 6));
        m70.a.a(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static ArrayList b(ArrayList arrayList) {
        List listP0 = d0.P0(arrayList, new b());
        int i = 0;
        if (listP0.size() <= 5) {
            List list = listP0;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList2.add(c((vxg.a) obj2, i));
                i = i2;
            }
            return arrayList2;
        }
        List list2 = listP0;
        List listV0 = d0.V0(list2, 4);
        ArrayList arrayList3 = new ArrayList(w.t(listV0, 10));
        for (Object obj3 : listV0) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList3.add(c((vxg.a) obj3, i));
            i = i3;
        }
        Iterator it8 = d0.V(list2, 4).iterator();
        double d = 0.0d;
        while (it8.hasNext()) {
            d += (double) ((vxg.a) it8.next()).f293085c;
        }
        float f = (float) d;
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_more_dots, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 2.0f, Float.valueOf(16.0f), null, 32);
        j5.Companion.getClass();
        j5 j5Var = new j5(layeredImageB);
        b5 b5Var = c5.Companion;
        List listC = u.c(new f5(f, R$attr.uikit_colorAccentNeutral));
        b5Var.getClass();
        return d0.F0(new e5("ALLOCATIONS_ALL_BAR_LIST_ID", j5Var, u.c(b5.a(listC)), true, null, 104), arrayList3);
    }

    public static e5 c(vxg.a aVar, int i) {
        String strN = a0.d.n("ALLOCATIONS_ASSET_LIST_ID_", i);
        i5 i5Var = j5.Companion;
        Image image = aVar.f293084b;
        i5Var.getClass();
        j5 j5Var = new j5(image);
        b5 b5Var = c5.Companion;
        float f = aVar.f293085c;
        if (f < Float.MIN_VALUE) {
            f = Float.MIN_VALUE;
        }
        List listC = u.c(new f5(f, R$attr.uikit_colorAccentNeutral));
        b5Var.getClass();
        return new e5(strN, j5Var, u.c(b5.a(listC)), true, null, 104);
    }
}
