package tjc;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rewards.ActivationNotice;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterDetailsItem;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterUrlActionButton;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import ox0.b0;
import ox0.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationNoticeContract$InputData f271632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb8.a f271633b;

    public h(ActivationNoticeContract$InputData inputData, kb8.a iconMapper, sic.a attributedTextClauseMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(attributedTextClauseMapper, "attributedTextClauseMapper");
        this.f271632a = inputData;
        this.f271633b = iconMapper;
    }

    public final RowDelegate.Model a(RewardFooterDetailsItem rewardFooterDetailsItem, String str) {
        TextClause textClause = new TextClause(rewardFooterDetailsItem.f84870a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        CompositeClause compositeClauseB = sic.a.b(2, rewardFooterDetailsItem.f84871b);
        return new RowDelegate.Model(str, null, textClause, null, 0, null, null, null, 0, compositeClauseB != null ? new RowDelegate.Model.c.b(compositeClauseB, null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834);
    }

    @Override // cli.n
    public final o c(j jVar) {
        String str;
        Integer numA;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ActivationNoticeContract$InputData activationNoticeContract$InputData = this.f271632a;
        ActivationNotice activationNotice = activationNoticeContract$InputData.f84991c;
        String str2 = activationNotice.f84802a;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = activationNotice.f84803b;
        aw0.e eVar = null;
        int i = 0;
        lw0.a aVar = new lw0.a(textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new lw0.b(new UrlImage(activationNoticeContract$InputData.f84990b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null), null, false, 24);
        aim.e eVarB = u.b();
        RewardFooterDetailsItem rewardFooterDetailsItem = activationNotice.f84804c;
        if (rewardFooterDetailsItem != null) {
            List listC = u.c(a(rewardFooterDetailsItem, "ACTIVATION_NOTICE_MAIN_ROW_ID"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB.addAll(listC);
        }
        ArrayList arrayList = activationNotice.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList2.add(a((RewardFooterDetailsItem) obj2, "ACTIVATION_NOTICE_DETAIL_ROW_ID_" + i));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        aim.e eVarA = u.a(eVarB);
        RewardFooterUrlActionButton rewardFooterUrlActionButton = activationNotice.e;
        if (rewardFooterUrlActionButton != null && (str = rewardFooterUrlActionButton.f84874b) != null) {
            m6 m6Var = n6.Companion;
            TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            String str4 = rewardFooterUrlActionButton.f84873a;
            n6 n6VarC = m6.c(m6Var, textClause2, defaultFilledButton, (str4 == null || (numA = this.f271633b.a(str4)) == null) ? null : new yy0.j(new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), "ACTIVATION_NOTICE_PRIMARY_BUTTON_LOADING_TAG", false, null, null, null, 1000);
            String str5 = activationNotice.f;
            eVar = new aw0.e(false, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, b0.BELOW_BUTTONS, n6VarC, null, d0.DISCLAIMER, 17);
        }
        return new cii.b(eVar, eVarA, aVar);
    }
}
