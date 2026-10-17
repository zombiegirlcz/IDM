package psl;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.trading.orders.R$string;
import ip0.ak0;
import java.util.List;
import jsl.i0;
import jsl.j0;
import jsl.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kbb.c f239514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jsl.a0 f239515c;

    public /* synthetic */ a0(kbb.c cVar, jsl.a0 a0Var, int i) {
        this.f239513a = i;
        this.f239514b = cVar;
        this.f239515c = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f239513a;
        jsl.a0 a0Var = this.f239515c;
        kbb.c cVar = this.f239514b;
        switch (i) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i0 i0VarA = ((ssl.c) cVar.f182550c).a(a0Var);
                z0.Companion.getClass();
                return new j0(i0VarA, z0.f);
            default:
                List list = (List) obj2;
                jdf.g gVar = (jdf.g) cVar.d;
                Intrinsics.h(list);
                List items = ((hsl.o) gVar).a(list, a0Var.f178196a);
                Intrinsics.checkNotNullParameter(items, "items");
                return yp0.b.g(zhm.w.u(zhm.v.k(items, zhm.u.c(new TextDelegate.Model("trading_order_projections_footer", new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_short, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036)))), new ListSubheaderDelegate.Model("trading_order_projections_header_list_id", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, true, false, 4), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458), e0.OUTSIDE_BOX, 0, 0, 124);
        }
    }
}
