package n9e;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f213643a;

    public k(o subscriptionList) {
        Intrinsics.checkNotNullParameter(subscriptionList, "subscriptionList");
        this.f213643a = subscriptionList;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        qua.p pVar = domainState.f213635a;
        aim.e eVarB = u.b();
        RowDelegate.Model modelC = a9e.h.c(this.f213643a, pVar);
        yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelC);
        eVarB.add(new ListSubheaderDelegate.Model("INFO_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.subscription_block_confirmation_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        RowDelegate.Model model = new RowDelegate.Model("BLOCK_MERCHANT_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.subscription_block_confirmation_declined_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.subscription_block_confirmation_declined_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        qua.g gVar = pVar.f249332w;
        String str = gVar != null ? gVar.f249293b : null;
        List listK = v.k(model, new RowDelegate.Model("CONTACT_MERCHANT_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_smartphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.subscription_block_confirmation_contact_title, null, null, 14), null, 0, str != null ? new TextLocalisedClause(R$string.subscription_block_confirmation_contact_description, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.subscription_block_confirmation_contact_description_no_name, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("BLOCK_LIMITS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.subscription_block_confirmation_block_limit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.subscription_block_confirmation_block_limit_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new f(u.a(eVarB));
    }
}
