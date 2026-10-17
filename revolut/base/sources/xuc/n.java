package xuc;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$CardConnectionSection;
import h93.f0;
import h93.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.c f309019a;

    public n(xtc.c securityHubCardItemMapper, wuc.d linkedWalletsDeviceMapper, wuc.a linkedMerchantsMapper) {
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        Intrinsics.checkNotNullParameter(linkedWalletsDeviceMapper, "linkedWalletsDeviceMapper");
        Intrinsics.checkNotNullParameter(linkedMerchantsMapper, "linkedMerchantsMapper");
        this.f309019a = securityHubCardItemMapper;
    }

    public final ArrayList a(List list, qtc.d dVar) {
        ArrayList arrayList;
        String str;
        String str2;
        List list2;
        int i;
        TextClause textClause;
        TextClause textClause2;
        List<LinkedWalletsScreenContract$CardConnectionSection> list3 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        for (LinkedWalletsScreenContract$CardConnectionSection linkedWalletsScreenContract$CardConnectionSection : list3) {
            f0 card = linkedWalletsScreenContract$CardConnectionSection.f85601a;
            List digitizedCards = linkedWalletsScreenContract$CardConnectionSection.f85602b;
            RowDelegate.Model model = new RowDelegate.Model(card.f150110a, this.f309019a.b(card), v04.b.J(card, card.f150111b, null, null, 14), null, 0, new TextClause(j6.a.q("··", card.f150115j), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            int i2 = m.f309018b[dVar.ordinal()];
            RowDelegate.Model.b.c cVar = RowDelegate.Model.b.c.f53268a;
            RowDelegate.Model.b.a aVar = RowDelegate.Model.b.a.f53266a;
            if (i2 == 1) {
                Intrinsics.checkNotNullParameter(digitizedCards, "digitizedCards");
                Intrinsics.checkNotNullParameter(card, "card");
                List<DigitizedCard> list4 = digitizedCards;
                arrayList = new ArrayList(w.t(list4, 10));
                for (DigitizedCard digitizedCard : list4) {
                    DigitizedCard.Merchant merchant = digitizedCard.f85399h;
                    Image resourceImage = (merchant == null || (str2 = merchant.f85402a) == null) ? new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    if (merchant == null || (str = merchant.f85403b) == null) {
                        str = digitizedCard.k;
                    }
                    TextClause textClause3 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TimeClause timeClause = new TimeClause(digitizedCard.d, new TimeClause.Format.Pretty(0), null, null, 12);
                    boolean zE = h0.e(card);
                    arrayList.add(new RowDelegate.Model(digitizedCard.f85395a, resourceImage, null, null, textClause3, timeClause, null, null, 0, null, !zE, false, null, zE ? aVar : cVar, null, null, null, new vuc.e(card, digitizedCard), null, 0, 0, 0, 0, 1056911212));
                }
            } else if (i2 == 2) {
                Intrinsics.checkNotNullParameter(digitizedCards, "digitizedCards");
                Intrinsics.checkNotNullParameter(card, "card");
                List<DigitizedCard> list5 = digitizedCards;
                arrayList = new ArrayList(w.t(list5, 10));
                for (DigitizedCard digitizedCard2 : list5) {
                    qtc.b deviceType = digitizedCard2.f;
                    String str3 = digitizedCard2.f85398g;
                    Intrinsics.checkNotNullParameter(deviceType, "deviceType");
                    switch (wuc.b.f300102a[deviceType.ordinal()]) {
                        case 1:
                            i = R$drawable.uikit_icn_24_smartphone;
                            break;
                        case 2:
                            i = R$drawable.uikit_icn_24_tablet;
                            break;
                        case 3:
                            i = R$drawable.uikit_icn_24_smartphone;
                            break;
                        case 4:
                            i = R$drawable.uikit_icn_24_laptop;
                            break;
                        case 5:
                            i = R$drawable.uikit_icn_24_watch;
                            break;
                        case 6:
                        case 7:
                        case 8:
                            i = R$drawable.uikit_icn_24_smartphone;
                            break;
                        case 9:
                            i = str3 == null ? R$drawable.uikit_icn_24_wallet : R$drawable.uikit_icn_24_smartphone;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    GlyphImage glyphImage = new GlyphImage(i, null, null, 6);
                    if (str3 != null) {
                        textClause = null;
                        textClause2 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        textClause = null;
                        textClause2 = new TextClause(digitizedCard2.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    TextClause textClause4 = (str3 == null || str3.length() == 0) ? textClause : new TextClause(digitizedCard2.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    boolean zE2 = h0.e(card);
                    arrayList.add(new RowDelegate.Model(digitizedCard2.f85395a, glyphImage, null, null, textClause2, textClause4, null, null, 0, null, !zE2, false, null, zE2 ? aVar : cVar, null, null, null, new vuc.e(card, digitizedCard2), null, 0, 0, 0, 0, 1056911212));
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                list2 = zhm.f0.f322471a;
                aim.e eVarE = i26.l.e(model, list2);
                yp0.b.k(eVarE, 0, 0, 0, 0, 31);
                arrayList2.add(eVarE);
            }
            list2 = arrayList;
            aim.e eVarE2 = i26.l.e(model, list2);
            yp0.b.k(eVarE2, 0, 0, 0, 0, 31);
            arrayList2.add(eVarE2);
        }
        return w.u(arrayList2);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f309013b, new xub.e(1), new xti.k(2), new wx6.k(domainState, this, 20)));
    }
}
