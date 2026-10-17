package d27;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements cli.n {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f110762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv6.a f110763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.j f110764c;

    public p0(w80.b amountFormatter, xv6.a cardBannerFactory, zjh.j legalEntityDisclaimerMapper, u80.o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(cardBannerFactory, "cardBannerFactory");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f110762a = amountFormatter;
        this.f110763b = cardBannerFactory;
        this.f110764c = legalEntityDisclaimerMapper;
    }

    public static mf a() {
        return new mf(new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true);
    }

    public static a0 b(u uVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_setup_common_action_create, null, null, 14);
        n nVar = uVar.f110773b;
        t tVar = uVar.f110777j;
        boolean z = false;
        if (nVar.f110756a.getContent() != null && !kotlin.text.d0.W(uVar.k) && ((uVar.f110773b.f110757b > 0 || uVar.f) && (tVar.a() || !tVar.f110769a))) {
            q qVar = uVar.e;
            if (!qVar.f110766b || !kotlin.text.d0.W(qVar.f110765a)) {
                z = true;
            }
        }
        return new a0(textLocalisedClause, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b0 d(boolean z) {
        List listK;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_payment_link_setup_header_title, null, null, 14);
        if (z) {
            Float f = null;
            Parcelable parcelable = null;
            String str = "LIST_ID_ACTION_PRODUCTS";
            mx0.d dVar = null;
            boolean z3 = false;
            e4 e4Var = null;
            Clause clause = null;
            String str2 = "LIST_ID_ACTION_BRANDING";
            mx0.d dVar2 = null;
            boolean z4 = false;
            Clause clause2 = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            listK = zhm.v.k(new ActionsView.Item(str, dVar, z3, e4Var, clause, new TextLocalisedClause(R$string.freelancer_sale_setup_common_action_items, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_avatar_grid, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, f, parcelable, 32670), new ActionsView.Item(str2, dVar2, z4, objArr3, clause2, new TextLocalisedClause(R$string.freelancer_sale_setup_common_action_branding, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, objArr, null, false, objArr2, f, parcelable, null, 32670));
        } else {
            listK = zhm.f0.f322471a;
        }
        return new b0(textLocalisedClause, listK);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        u domainState = (u) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c0) iii.c.f(domainState.f110773b.f110756a, new cul.n0(this, domainState), new cwj.h(this, domainState), new cab.m(this, domainState, 14));
    }
}
