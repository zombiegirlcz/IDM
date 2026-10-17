package gvi;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTermsAndConditions;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yp0.e0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTravellerDetailsScreenContract$InputData f147204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd7.d f147205b;

    public u(AsftTravellerDetailsScreenContract$InputData inputData, a inputFieldIdentifierMapper, nd7.d termsClauseMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputFieldIdentifierMapper, "inputFieldIdentifierMapper");
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        this.f147204a = inputData;
        this.f147205b = termsClauseMapper;
    }

    public static InputTextDelegate.Model b(String str, TextLocalisedClause textLocalisedClause, String str2, boolean z, boolean z3, String str3, boolean z4) {
        return new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, z, false, false, null, z3 ? 6 : 5, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, z4, str3, null, null, null, 0, 0, 0, 0, -541327368, 65215);
    }

    public static ArrayList d(u uVar, AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails, int i, boolean z, int i2) {
        String str;
        String str2;
        String str3;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) == 0;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        TextLocalisedClause textLocalisedClause = i == 0 ? new TextLocalisedClause(R$string.asft_traveller_details_traveller_form_title_you, null, custom, 10) : new TextLocalisedClause(R$string.asft_traveller_details_traveller_form_title_other, zhm.u.c(new TextClause(String.valueOf(i + 1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), custom, 8);
        String str4 = i + "_FIRST_NAME";
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.asft_traveller_details_traveller_form_first_name, null, null, 14);
        if (asftTravellerDetailsScreenContract$DomainState$TravellerDetails == null || (str = asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        boolean z6 = i != 0;
        Companion.getClass();
        int i3 = i + 1;
        InputTextDelegate.Model modelB = b(str4, textLocalisedClause2, str, z6, false, j6.a.l(i3, "traveller_", "_First name"), z4);
        String str5 = i + "_LAST_NAME";
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.asft_traveller_details_traveller_form_last_name, null, null, 14);
        if (asftTravellerDetailsScreenContract$DomainState$TravellerDetails == null || (str3 = asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b) == null) {
            m70.a.c(t0.f186434a);
            str2 = "";
        } else {
            str2 = str3;
        }
        return yp0.b.g(v.k(modelB, b(str5, textLocalisedClause3, str2, i != 0, z3, j6.a.l(i3, "traveller_", "_Last name"), z4)), new ListSubheaderDelegate.Model(a0.d.n("traveller_name_form_", i), (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
    }

    public final ArrayList a(h hVar) {
        List list = hVar.f147181b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(d(this, (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2, i2, i == v.j(hVar.f147181b), 8));
            i = i2;
        }
        return w.u(arrayList);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        AsftTermsAndConditions asftTermsAndConditions;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f147180a, new s(this, domainState, 0), new gug.c(5), new fyg.b(this, domainState, 23));
        if (!pyd.c.G(domainState.f147180a)) {
            z = false;
            break;
        }
        List<AsftTravellerDetailsScreenContract$DomainState$TravellerDetails> list2 = domainState.f147181b;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails : list2) {
                if (d0.W(asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a) || d0.W(asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        boolean z3 = z;
        AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = this.f147204a;
        Clause clauseA = null;
        TextLocalisedClause textLocalisedClause = asftTravellerDetailsScreenContract$InputData.d ? new TextLocalisedClause(R$string.asft_time_slot_picker_book_pass, null, null, 14) : new TextLocalisedClause(R.string.common_action_continue, null, null, 14);
        boolean z4 = domainState.f147182c;
        if (asftTravellerDetailsScreenContract$InputData.d && (asftTermsAndConditions = asftTravellerDetailsScreenContract$InputData.e) != null) {
            clauseA = nd7.d.a(this.f147205b, asftTermsAndConditions.f98746a);
        }
        return new m(clauseA, textLocalisedClause, list, z3, z4);
    }
}
