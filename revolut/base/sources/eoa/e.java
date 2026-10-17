package eoa;

import aw0.o9;
import cli.j;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import dn8.k;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements coa.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f127877b = new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.d f127878a;

    public e(r10.d titleMapper, h subtitleMapper) {
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
        this.f127878a = titleMapper;
    }

    public static ArrayList a(int i, int i2) {
        IntRange intRangeO = kotlin.ranges.f.o(i2, i + i2);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(t61.a.o("LOADING_STATE_ID", it8.nextInt(), pb0.Companion, false, 6));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final RowDelegate.Model b(List list, soa.c cVar, boolean z, boolean z3) {
        Object next;
        int i;
        int i2;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((soa.b) next).f264801a == cVar) {
                break;
            }
        }
        soa.b setting = (soa.b) next;
        if (setting == null) {
            return null;
        }
        soa.c type = setting.f264801a;
        String string = type.toString();
        switch (d.f127876a[type.ordinal()]) {
            case 1:
            case 2:
                i = R$drawable.uikit_icn_24_revolut;
                break;
            case 3:
                i = R$drawable.uikit_icn_24_present;
                break;
            case 4:
                i = R$drawable.uikit_icn_24_wealth;
                break;
            case 5:
                i = R$drawable.uikit_icn_24_commodities;
                break;
            case 6:
                i = R$drawable.uikit_icn_24_bitcoin;
                break;
            case 7:
                i = R$drawable.uikit_icn_24_delivery_car;
                break;
            case 8:
                i = R$drawable.uikit_icn_24_travel;
                break;
            default:
                throw new IllegalArgumentException("Unsupported NotificationSetting type " + type);
        }
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        Intrinsics.checkNotNullParameter(setting, "setting");
        TextLocalisedClause textLocalisedClauseK0 = this.f127878a.k0(type);
        Intrinsics.checkNotNullParameter(setting, "setting");
        TextLocalisedClause textLocalisedClause = setting.f264803c ? new TextLocalisedClause(R$string.profile_notification_settings_state_push, null, null, 14) : null;
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(type, "type");
        int i3 = a.f127874a[type.ordinal()];
        TextLocalisedClause[] elements = {textLocalisedClause, ((i3 == 1 || i3 == 2 || i3 == 3) && setting.f264802b) ? new TextLocalisedClause(R$string.profile_notification_settings_state_email, null, null, 14) : null, (pd.b.j(setting.e) && !(((i2 = g.f127879a[type.ordinal()]) == 1 || i2 == 2) && z)) ? new TextLocalisedClause(R$string.profile_notification_settings_state_inapp, null, null, 14) : null, (pd.b.j(setting.f) && z3) ? new TextLocalisedClause(R$string.profile_notification_settings_category_proactive_insights, null, null, 14) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            listL = u.c(new TextLocalisedClause(R$string.profile_notification_settings_state_off, null, null, 14));
        }
        CompositeClause compositeClause = new CompositeClause(listL, h.f127880a, null, null, 12);
        Intrinsics.checkNotNullParameter(compositeClause, "<this>");
        return new RowDelegate.Model(string, image24, textLocalisedClauseK0, null, 0, new CapitalizedClause(compositeClause), null, null, 0, null, false, null, false, null, null, null, null, null, null, setting, null, 0, 0, 0, 0, 532676568);
    }

    @Override // cli.n
    public final o c(j jVar) {
        coa.a domainState = (coa.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new coa.e((List) iii.c.f(t1.u(domainState.f25500a, domainState.d, domainState.f25502c), new ei8.d(this, domainState, 23), new en6.a(2), new k(domainState, this, 18)));
    }
}
