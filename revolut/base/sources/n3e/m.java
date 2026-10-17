package n3e;

import a83.w0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.R$string;
import ip0.nb0;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import n33.l0;
import n33.v0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {
    public static FullScreenStateDelegate.Model a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("STORE_ORDERS_SEE_ALL_EMPTY_ID", new TextLocalisedClause(R$string.store_orders_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.store_orders_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_purchase_protection, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, zj.REGULAR, false, null, null, null, 1984);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static ArrayList b() {
        IntRange intRangeO = kotlin.ranges.f.o(0, 6);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("STORE_ORDERS_SEE_ALL_LOADING_ID", it8.nextInt()), false, 0, false, 30));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f211994b;
        if (data != null) {
            list = (List) iii.c.f(data, new v0(this, 14), new l0(8), new w0(this, domainState.f211995c, 10));
        } else {
            list = (List) iii.c.g(domainState.f211993a, new v0(this, 13), new l0(7), new mig.a(this, 22));
        }
        return new f(list);
    }
}
