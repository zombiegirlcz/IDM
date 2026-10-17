package me1;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1.b f204598a;

    public h(rd1.b catalogueCommonItemsFactory) {
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        this.f204598a = catalogueCommonItemsFactory;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CartItem cartItem = domainState.f204593a;
        int i = domainState.f204594b;
        String str = cartItem.f60663a;
        rd1.d dVar = (rd1.d) this.f204598a;
        TextImage textImageE = dVar.e(cartItem);
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 1) {
            numValueOf = null;
        }
        RowDelegate.Model model = new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(textImageE, numValueOf != null ? com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorRed), Integer.valueOf(R$attr.uikit_colorWhite), 16) : null, null, false, 28), new TextClause(cartItem.f60665c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new MoneyClause(cartItem.d, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, cartItem, null, 0, 0, 0, 0, 532674520);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new f(v.k(model, dVar.a(i)), u.c(dVar.b()));
    }
}
