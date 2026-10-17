package bnj;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.j2;
import dej.k2;
import dej.l2;
import dej.n3;
import dej.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f17227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wnj.a f17228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xjj.h f17229c;

    public h(gej.a bytesFormatter, wnj.a descriptorApplier, xjj.h mobilePlanDetailsDataItemMapper) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsDataItemMapper, "mobilePlanDetailsDataItemMapper");
        this.f17227a = bytesFormatter;
        this.f17228b = descriptorApplier;
        this.f17229c = mobilePlanDetailsDataItemMapper;
    }

    public final CellDetailsStandaloneNoteDelegate.Model a(t1 subscription) {
        j2 j2Var;
        l2 l2Var;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        k2 k2Var = subscription.P;
        EsimHyperText esimHyperText = (k2Var == null || (j2Var = k2Var.f113581b) == null || (l2Var = j2Var.e) == null) ? null : l2Var.f113587a;
        if (esimHyperText != null) {
            return new CellDetailsStandaloneNoteDelegate.Model("ID_DATA_USAGE_DESCRIPTION", null, wnj.a.d(this.f17228b, esimHyperText.f100276a, esimHyperText.f100277b, Integer.valueOf(R$attr.uikit_colorGreyTone50), 8), null, null, false, null, 0, 0, 2042);
        }
        return null;
    }

    public final List b(t1 subscription) {
        CellDetailsDelegate.Model modelC;
        j2 j2Var;
        l2 l2Var;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        dej.m mVar = subscription.f113653g;
        n3 n3Var = subscription.E;
        boolean z = subscription.z;
        if (mVar == dej.m.MOBILE_PLAN) {
            CellDetailsDelegate.Model modelA = this.f17229c.a("ID_MOBILE_PLAN_DETAILS_DATA", z, n3Var != null ? n3Var.f113605b : null, subscription.f113666y);
            if (modelA == null) {
                return f0.f322471a;
            }
            qv0.i[] elements = {modelA, a(subscription)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        k2 k2Var = subscription.P;
        EsimHyperText esimHyperText = (k2Var == null || (j2Var = k2Var.f113581b) == null || (l2Var = j2Var.e) == null) ? null : l2Var.f113587a;
        if (gj7.b.x(subscription) || z) {
            modelC = c(R$string.esim_subscription_details_details_data_used_title, n3Var != null ? Long.valueOf(n3Var.f113604a) : null, "ID_USED_DATA_ITEM", esimHyperText != null);
        } else {
            modelC = c(R$string.esim_subscription_details_details_data_remaining_title, n3Var != null ? n3Var.f113605b : null, "ID_REMAINING_DATA_ITEM", esimHyperText != null);
        }
        if (modelC == null) {
            return f0.f322471a;
        }
        qv0.i[] elements2 = {modelC, a(subscription)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.d.L(elements2);
    }

    public final CellDetailsDelegate.Model c(int i, Long l2, String str, boolean z) {
        int i2 = z ? R$attr.uikit_dp8 : R$attr.uikit_dp12;
        t0 t0Var = new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30);
        if (l2 != null) {
            return new CellDetailsDelegate.Model(str, t0Var, gej.a.a(this.f17227a, l2.longValue(), null, 6), null, null, null, null, null, 0, null, false, false, null, null, null, null, i2, i2, 0, 0, 54525944);
        }
        return null;
    }
}
