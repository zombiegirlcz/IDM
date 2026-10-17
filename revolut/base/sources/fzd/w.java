package fzd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzd.b f139167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mzd.d f139168b;

    public w(mzd.b productSectionMapper, mzd.d selectableOptionMapper) {
        Intrinsics.checkNotNullParameter(productSectionMapper, "productSectionMapper");
        Intrinsics.checkNotNullParameter(selectableOptionMapper, "selectableOptionMapper");
        this.f139167a = productSectionMapper;
        this.f139168b = selectableOptionMapper;
    }

    public static final boolean a(w wVar, Product product, ProductSelection productSelection) {
        return product.getElements().isEmpty() ? productSelection.getSelectedProducts().contains(product.getType()) : productSelection.getSelectedElements().containsKey(product.getType());
    }

    public static LargeActionButtonDelegate.Model b(String str) {
        return new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f139143a, new fwf.n(this), new fv0.c(this, 23), new fyg.b(this, domainState, 1));
    }
}
