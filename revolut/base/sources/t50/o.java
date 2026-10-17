package t50;

import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.pr;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k50.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f268024a;

    public o(h inputData, v rateChatTagsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rateChatTagsMapper, "rateChatTagsMapper");
        this.f268024a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        y domainState = (y) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        z30.e eVar = domainState.f181290a;
        z30.j jVar2 = domainState.f181291b;
        arrayList.addAll(v.a(eVar, jVar2, domainState.f181292c));
        z30.e eVar2 = domainState.f181290a;
        aw0.i hVar = null;
        if (eVar2 != null) {
            InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INPUT", new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.chat_rate_input_hint_additional_information, null, null, 14), null, false, null, false, null, null, null, null, null, null, true, 500, null, false, false, false, false, null, 0, null, pr.f165860a, false, false, null, null, false, null, false, true, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -16826376, 65534);
            yp0.b.r(model, 0, R$attr.uikit_dp0, 0, 0, 13);
            arrayList.add(model);
        }
        List listA = jVar2.a();
        h hVar2 = this.f268024a;
        Integer num = hVar2.d;
        UUID uuid = hVar2.f268016a;
        z30.e eVar3 = (z30.e) listA.get(num != null ? num.intValue() : 0);
        Intrinsics.i(eVar3, "null cannot be cast to non-null type com.revolut.chat.domain.model.rate.ChatRatingOption.Default");
        z30.b bVar = (z30.b) eVar3;
        String str = bVar.e;
        if (str == null) {
            str = "";
        }
        lw0.a aVar = new lw0.a(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new lw0.b(new UrlImage(bVar.f319102b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorAccentNeutral)), null, null, 40, 40, 27), null, null, false, false, 507902), null), null, false, 26);
        if (eVar2 != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i = n.f268023a[domainState.e.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.chat_rate_footer_submit, null, null, 14);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.chat_send, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
            boolean z = !jVar2.a().isEmpty();
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            n6 n6Var = new n6(textLocalisedClause2, defaultFilledButton, null, null, z, new AnalyticsContext(z50.a.a(companion, uuid)), null, 920);
            TextLocalisedClause textLocalisedClause3 = (domainState.f && Intrinsics.f(d0.d0(jVar2.a()), eVar2)) ? new TextLocalisedClause(R$string.chat_rate_footer_live_agent, null, null, 14) : null;
            hVar = textLocalisedClause3 != null ? new aw0.h(false, n6Var, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.o, null, null, true, new AnalyticsContext(z50.a.a(companion, uuid)), null, 920), null, null, null, 121) : new aw0.e(false, null, null, n6Var, null, null, 55);
        }
        return new cii.b(hVar, arrayList, aVar);
    }
}
