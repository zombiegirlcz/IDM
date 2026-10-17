package vg7;

import aw0.ka;
import aw0.la;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kad.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f288793a;

    public k(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f288793a = uiKitResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Pair pair;
        Pair pair2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f288783a.f74851a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LotteryDrawDetails$ShareInfo lotteryDrawDetails$ShareInfo = domainState.f288783a;
        UrlImage urlImage = new UrlImage(lotteryDrawDetails$ShareInfo.f74853c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new RoundedRectTransformation(24.0f, 1.0f, R$attr.uikit_colorGreyTone10), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        TextClause textClause2 = new TextClause(lotteryDrawDetails$ShareInfo.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TimeClause timeClause = new TimeClause(lotteryDrawDetails$ShareInfo.e, new TimeClause.Format.MonthAndYear(ka.SHORT, la.FULL), null, null, 12);
        ResourceImage resourceImage = new ResourceImage(this.f288793a.a(lotteryDrawDetails$ShareInfo.f), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_revolut_logo, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        UrlImage urlImage2 = new UrlImage(lotteryDrawDetails$ShareInfo.f74852b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902);
        ArrayList arrayList = domainState.f288784b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            kad.a aVar = (kad.a) next;
            if (Intrinsics.f(aVar, kad.b.f182460c)) {
                pair2 = new Pair(Integer.valueOf(R$string.lottery_share_action_instagram), Integer.valueOf(R$drawable.uikit_icn_24_logo_instagram));
            } else {
                if (Intrinsics.f(aVar, kad.d.f182462c)) {
                    pair = new Pair(Integer.valueOf(R$string.lottery_share_action_x), Integer.valueOf(R$drawable.uikit_icn_24_logo_twitter));
                } else if (Intrinsics.f(aVar, kad.c.f182461c)) {
                    pair = new Pair(Integer.valueOf(R$string.lottery_share_action_whatsapp), Integer.valueOf(R$drawable.uikit_icn_24_logo_whatsapp));
                } else {
                    if (!Intrinsics.f(aVar, a.C1040a.f182459a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(R$string.lottery_share_action_more), Integer.valueOf(R$drawable.uikit_icn_24_more));
                }
                pair2 = pair;
            }
            int iIntValue = ((Number) pair2.f186385a).intValue();
            int iIntValue2 = ((Number) pair2.f186386b).intValue();
            arrayList2.add(new ActionsView.Item(a0.d.n("share_action_", i), mx0.d.INVERTED_PRIMARY, false, null, null, new TextLocalisedClause(iIntValue, null, null, 14), new ResourceImage(iIntValue2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, aVar, null, 24476));
            i = i2;
        }
        return new f(textClause, urlImage, textClause2, timeClause, resourceImage, resourceImage2, urlImage2, arrayList2);
    }
}
