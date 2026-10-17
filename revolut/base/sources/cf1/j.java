package cf1;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectTaxRateScreenProvider$InputData f23530b;

    public j(a selectTaxRateListItemsFactory, SelectTaxRateScreenProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(selectTaxRateListItemsFactory, "selectTaxRateListItemsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f23529a = selectTaxRateListItemsFactory;
        this.f23530b = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f23522a, new ccg.c(20), new ccg.a(8), new h(this, 0)), new lw0.a(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_tax_rate_input_title, null, null, 14), null, null, domainState.f23523b ? new k(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_tax_rate_input_action, null, null, 14), "MANAGE_RATES_MENU_ID") : null, false, 22));
    }
}
