package kn6;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        gz0.b bVar = gz0.b.Undefined;
        Integer numValueOf = Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST);
        eVarB.add(new we0("SIMPLE_MEDIA_PIS_CDN_IMAGE_ITEM_ID", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D297", new ImageTransformations(null, null, null, bVar, null, numValueOf, numValueOf, 23), UrlImageDrawable.Shimmering.INSTANCE, null, 24))));
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        yt ytVar = yt.TOP;
        j8 j8Var = new j8(resourceImage, ytVar);
        int i = R$string.external_institutions_penny_topup_payment_initiation_intro_transaction;
        dj0.d dVar = domainState.f186013a;
        ListCellDelegate.Model[] elements = {new ListCellDelegate.Model("TRANSACTION_LIST_CELL_ITEM_ID", j8Var, new TextLocalisedClause(i, u.c(new MoneyClause(new dj0.d(dVar.f115082a, dVar.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("NAME_COLLECTION_LIST_CELL_ITEM_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_intro_redirection, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), domainState.f186015c ? new ListCellDelegate.Model("TOP_UP_FEE_LIST_CELL_ITEM_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_intro_topup_fee, u.c(domainState.f186014b), null, 12), null, false, null, null, 0, 0, 0, 0, 4072) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, R$attr.uikit_dp0, 0, 0, 0, 30);
        eVarB.addAll(listL);
        return new l(u.a(eVarB));
    }
}
