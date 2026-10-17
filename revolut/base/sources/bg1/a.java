package bg1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qf1.c;
import qf1.f;
import qf1.j;
import qf1.k;
import ue0.e;
import yf1.d;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15046a;

    public a(Map itemMappers) {
        Intrinsics.checkNotNullParameter(itemMappers, "itemMappers");
        this.f15046a = itemMappers;
    }

    public static RowDelegate.Model.MainImage.Image40 c(c cVar, k kVar) {
        int i;
        int i2 = R$drawable.uikit_icn_rounded_background;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (d.f313117a[cVar.ordinal()]) {
            case 1:
                i = R$attr.uikit_colorColdBlue;
                break;
            case 2:
                i = R$attr.uikit_colorIndigo;
                break;
            case 3:
                i = R$attr.uikit_colorLightBlue;
                break;
            case 4:
                i = R$attr.uikit_colorTeal;
                break;
            case 5:
                i = R$attr.uikit_colorCyan;
                break;
            case 6:
                i = R$attr.uikit_colorDeepGrey;
                break;
            case 7:
                i = R$attr.uikit_colorDeepPurple;
                break;
            case 8:
                i = R$attr.uikit_colorPurple;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new RowDelegate.Model.MainImage.Image40(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(i2, Integer.valueOf(i), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(kVar.f245219a, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
    }

    public final zf1.a a(c categoryId, cg1.d categoryItem) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(categoryItem, "categoryItem");
        RowDelegate.Model modelB = b(categoryId, categoryItem, false);
        if (modelB == null) {
            return null;
        }
        return new zf1.a(modelB, e.J(modelB.f53230c, d(categoryItem.f23861a).b(categoryItem.f23862b)));
    }

    public final RowDelegate.Model b(c cVar, cg1.d dVar, boolean z) {
        Clause clause;
        f fVar = dVar.f23861a;
        qf1.d dVar2 = dVar.f23862b;
        pf1.a aVarD = d(fVar);
        try {
            k kVarA = aVarD.a(dVar2);
            Clause clause2 = kVarA.f245220b;
            j jVarC = aVarD.c(dVar2);
            Clause clause3 = (!z || (clause = kVarA.d) == null) ? clause2 : clause;
            String id10 = dVar.f23861a.getId();
            Clause clause4 = kVarA.f245221c;
            RowDelegate.Model.MainImage.Image40 image40C = c(cVar, kVarA);
            AnalyticsContext analyticsContext = kVarA.e;
            int i = R$attr.uikit_dp12;
            return new RowDelegate.Model(id10, image40C, clause3, null, 0, clause4, null, null, 0, null, false, null, false, null, kVarA.f, null, null, null, null, jVarC, analyticsContext, i, i, 0, 0, 473923544);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            return null;
        }
    }

    public final pf1.a d(f fVar) {
        Object obj2 = this.f15046a.get(fVar);
        if (obj2 != null) {
            return (pf1.a) obj2;
        }
        throw new IllegalArgumentException(j6.a.q("Item mapper was not found for the ", fVar.getId()).toString());
    }
}
