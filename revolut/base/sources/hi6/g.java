package hi6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.tab.accounts.models.ProductId;
import ip0.vd0;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f152515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f152516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c91.a f152517c;

    public g(b itemsFactory, gte.a featureToggleInteractor, c91.a juniorAccountNameProvider) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        this.f152515a = itemsFactory;
        this.f152516b = featureToggleInteractor;
        this.f152517c = juniorAccountNameProvider;
    }

    public final SelectableDelegate.Model a(bs8.a pocket, Set enabledJuniorPockets, n9l.a aVar, bs8.b owner) {
        Pair pair;
        boolean zC = ((jte.d) this.f152516b).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c);
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(enabledJuniorPockets, "enabledJuniorPockets");
        Intrinsics.checkNotNullParameter(owner, "owner");
        c91.a juniorAccountNameProvider = this.f152517c;
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        bs8.e eVar = pocket.f18077b;
        String str = pocket.f18076a;
        dj0.d dVar = pocket.f18078c;
        xi0.b bVar = dVar.f115083b;
        if (eVar instanceof bs8.c) {
            if (zC) {
                pair = new Pair(new CurrencyClause(bVar, null, null, 6), new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14));
            } else {
                pair = new Pair(((d91.b) juniorAccountNameProvider).a(ProductId.CURRENCY), new ContactImage(owner.f18079a, (String) null, (String) null, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(owner.f18080b, " ", owner.f18081c), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550));
            }
        } else {
            if (!(eVar instanceof bs8.d)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(new TextClause(((bs8.d) eVar).f18083a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue));
        }
        Clause clause = (Clause) pair.f186385a;
        Image image = (Image) pair.f186386b;
        dj0.d dVarA = b.a(dVar, aVar);
        return new SelectableDelegate.Model(j6.a.q("junior_list_item_", str), new RowDelegate.Model(j6.a.q("junior_list_item_", str), new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60), clause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(b.h(dVar), b.h(dVarA), null, false, 124), false, null, false, null, null, null, null, null, null, pocket.f18076a, null, 0, 0, 0, 0, 532673528), b.i(str, enabledJuniorPockets), null, vd0.CHECKBOX, false, null, pocket.f18076a, null, false, 32488);
    }
}
