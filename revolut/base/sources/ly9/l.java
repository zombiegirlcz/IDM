package ly9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.R$string;
import fy1.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3j.n;
import o97.m0;
import org.jetbrains.annotations.NotNull;
import x5k.s;
import zhm.w;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f200764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aqa.c f200765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3.f f200766c;
    public final nq9.b d;
    public final lx1.i e;
    public final tn9.a f;

    public l(n beneficiaryMapper, aqa.c cardsMapper, dl3.f contactsMapper, nq9.b groupsMapper, lx1.i apmRecipientMapper, tn9.a paymentCounterpartyMapper, z5k.a actionsMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f200764a = beneficiaryMapper;
        this.f200765b = cardsMapper;
        this.f200766c = contactsMapper;
        this.d = groupsMapper;
        this.e = apmRecipientMapper;
        this.f = paymentCounterpartyMapper;
    }

    public final ArrayList a(List items, m0 sourceIdentifier, Function1 parcel) {
        RowDelegate.Model modelD;
        RowDelegate.Model model;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        List<j> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (j jVar : list) {
            boolean z = jVar instanceof d;
            dl3.f fVar = this.f200766c;
            if (z) {
                zm3.a aVar = ((d) jVar).f200758a;
                modelD = ((xl3.d) fVar).m(aVar);
                if (aVar instanceof p) {
                    modelD = RowDelegate.Model.x(modelD, null, null, null, new TextLocalisedClause(R$string.ephemeral_contact_pay_or_request_subtitle, null, null, 14), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
                }
            } else if (jVar instanceof i) {
                modelD = ((xl3.d) fVar).m(((i) jVar).f200763a);
            } else {
                if (jVar instanceof h) {
                    zm3.l lVar = ((h) jVar).f200762a.f200763a;
                    model = new RowDelegate.Model(a0.d.s("username_hidden_", lVar.getCode(), "_", lVar.N0()), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_eye_show, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(16.0f), null, 32), null, null, new TextLocalisedClause(R$string.global_search_widgets_revtag_item_title, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
                } else if (jVar instanceof b) {
                    modelD = this.f200764a.c(((b) jVar).f200756a, true);
                } else if (jVar instanceof c) {
                    modelD = ((mra.i) this.f200765b).c(((c) jVar).f200757a);
                } else if (jVar instanceof f) {
                    modelD = ((tr9.c) this.d).d(((f) jVar).f200760a);
                } else if (jVar instanceof g) {
                    s action = ((g) jVar).f200761a;
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
                    String strN = a0.d.n("ID_QUICK_ACTION_", action.hashCode());
                    TextLocalisedClause textLocalisedClause = action.f303000a;
                    Clause clause = action.f303001b;
                    LayeredImage layeredImage = action.f303002c;
                    String str = action.e;
                    model = new RowDelegate.Model(strN, layeredImage, null, null, textLocalisedClause, clause, null, null, 0, null, false, false, null, null, null, null, null, action, str != null ? new AnalyticsContext(o97.h.a(sourceIdentifier, str)) : null, 0, 0, 0, 0, 1023410028);
                } else if (jVar instanceof a) {
                    modelD = ((q) this.e).g(((a) jVar).f200755a);
                } else {
                    if (!(jVar instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modelD = ((do9.d) this.f).d(((e) jVar).f200759a);
                }
                arrayList.add(RowDelegate.Model.x(model, null, null, null, null, null, 0, null, false, null, parcel.invoke(jVar), 0, 0, 0, 0, null, -4194305, 15));
            }
            model = modelD;
            arrayList.add(RowDelegate.Model.x(model, null, null, null, null, null, 0, null, false, null, parcel.invoke(jVar), 0, 0, 0, 0, null, -4194305, 15));
        }
        return arrayList;
    }
}
