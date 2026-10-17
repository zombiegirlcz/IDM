package fhj;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import ip0.e8;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static e8 a(int i, EsimSubscriptionRefund refund, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(refund, "refund");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        double d = refund.f100502h;
        Double dValueOf = Double.valueOf(d);
        if (d <= 0.0d) {
            dValueOf = null;
        }
        nw0.a aVar = new nw0.a(dValueOf != null ? new BigDecimal(String.valueOf(dValueOf.doubleValue())) : null, new MoneyClause(refund.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4));
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i2 = R$attr.uikit_dp12;
        e8 e8Var = new e8("ID_REFUND_DUE", textLocalisedClause, resourceImage, aVar, parcelable, i2, i2, 384);
        yp0.b.l(e8Var, 0, 0, 0, 0, null, false, 63);
        return e8Var;
    }
}
