package jk4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import ybh.v;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175086a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f175087b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 function1 = (Function1) obj3;
        switch (this.f175086a) {
            case 0:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
                h3 h3Var = h3.ERROR;
                boolean z = this.f175087b;
                return new f3(resourceImage, textLocalisedClause, null, z, h3Var, z);
            case 1:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return this.f175087b ? f0.f322471a : qcc.o.a();
            default:
                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                return new v(new TextLocalisedClause(this.f175087b ? com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_recurring_transfer_widget_title : com.revolut.retail.wealth.resources.R$string.wealth_robo_portfolio_add_money_header_title, null, null, 14), null, null);
        }
    }
}
