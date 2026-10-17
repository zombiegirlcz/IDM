package vi1;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.api.flow.AddressFlowUseCase;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1.l f289504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f289505b;

    public i() {
        sh1.l lVar = new sh1.l(new sh1.j(new TextLocalisedClause(R$string.shared_address_flow_form_select_country, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_skip, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.shared_address_flow_form_continue, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_postcode_lookup, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_search_address, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_country, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_address_line1, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_address_line2, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_street_type, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_street_name, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_house_number, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_house_name, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_flat_number, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_postcode, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_neighbourhood, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_town_city, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_region, null, null, 14), null, new TextLocalisedClause(R$string.shared_address_flow_form_optional, null, null, 14)), new sh1.k(new TextLocalisedClause(R$string.shared_address_flow_search_search_hint, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_form_search_postcode, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_search_loading_message, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(R$string.shared_address_flow_search_no_results, null, null, 14), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.shared_address_flow_search_enter_manually, null, new Click(30, (Integer) null, (Object) null, "NO_RESULT_ITEM_CLICK_ID", false), 10)), null, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_search_address_not_here, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.shared_address_flow_search_error_generic, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_search_error_description, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_search_invalid_postcode, null, null, 14), new TextLocalisedClause(R$string.shared_address_flow_search_enter_valid_postcode, null, null, 14)));
        this.f289504a = lVar;
        wi0.b.Companion.getClass();
        Pair pair = new Pair(wi0.b.p0, sh1.l.c(sh1.l.b(lVar, Integer.valueOf(R$string.shared_address_flow_form_search_postcode), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435447), null, Integer.valueOf(R$string.shared_address_flow_form_search_postcode), null, 509));
        wi0.b bVar = wi0.b.Y1;
        int i = R$string.shared_address_flow_form_house_number_mx;
        int i2 = R$string.shared_address_flow_form_flat_number_mx;
        int i3 = R$string.shared_address_flow_form_city_mx;
        Pair pair2 = new Pair(bVar, sh1.l.c(sh1.l.b(lVar, null, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, Integer.valueOf(i2), null, Integer.valueOf(R$string.shared_address_flow_form_postcode), null, null, Integer.valueOf(i3), null, Integer.valueOf(R$string.shared_address_flow_form_region_state), null, 225828863), null, null, Integer.valueOf(R$string.shared_address_flow_search_no_results), 503));
        wi0.b bVar2 = wi0.b.f297756l;
        int i5 = R$string.address_form_flat_au_placeholder;
        Pair pair3 = new Pair(bVar2, sh1.l.b(lVar, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.address_form_house_number_au_placeholder), null, null, Integer.valueOf(i5), null, null, null, null, Integer.valueOf(R$string.address_form_city_au_placeholder), null, Integer.valueOf(R$string.common_address_region_state_territory), null, 226353151));
        Pair pair4 = new Pair(wi0.b.A, sh1.l.b(lVar, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.address_form_house_number_br_placeholder), null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_postcode), null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_region_state), null, 234348543));
        Pair pair5 = new Pair(wi0.b.f297770q3, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_zip_code), null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_region_state), null, 234356735));
        Pair pair6 = new Pair(wi0.b.J2, sh1.l.b(lVar, null, null, Integer.valueOf(R$string.address_form_address_line1_sg_placeholder), Integer.valueOf(R$string.shared_address_flow_form_address_line1_hint_sg), Integer.valueOf(R$string.address_form_address_line2_sg_placeholder), Integer.valueOf(R$string.shared_address_flow_form_address_line2_hint_sg), null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_postcode_hint_sg), null, null, null, null, null, 267385919));
        wi0.b bVar3 = wi0.b.X0;
        int i6 = R$string.shared_address_flow_form_search_postcode;
        int i21 = R$string.shared_address_flow_form_town;
        int i22 = R$string.shared_address_flow_form_street_name_hint_jp;
        int i32 = R$string.address_form_house_number_jp_placeholder;
        int i33 = R$string.shared_address_flow_form_house_number_hint_jp;
        int i43 = R$string.shared_address_flow_form_house_name_hint_jp;
        int i59 = R$string.shared_address_flow_form_flat_number_jp;
        int i66 = R$string.shared_address_flow_form_flat_number_hint_jp;
        int i74 = R$string.shared_address_flow_form_postal_code;
        int i92 = R$string.shared_address_flow_form_postcode_hint_jp;
        int i96 = R$string.address_form_city_jp_placeholder;
        int i99 = R$string.shared_address_flow_form_city_hint_jp;
        Pair pair7 = new Pair(bVar3, sh1.l.c(sh1.l.b(lVar, null, Integer.valueOf(i6), Integer.valueOf(i21), null, null, null, Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i32), Integer.valueOf(i33), Integer.valueOf(i43), Integer.valueOf(i59), Integer.valueOf(i66), Integer.valueOf(i74), Integer.valueOf(i92), Integer.valueOf(R$string.shared_address_flow_form_district), Integer.valueOf(i96), Integer.valueOf(i99), Integer.valueOf(R$string.common_address_region_prefecture), null, 205555631), Integer.valueOf(R$string.shared_address_flow_form_search_postcode), null, null, 510));
        Pair pair8 = new Pair(wi0.b.n3, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_town_city), null, Integer.valueOf(R$string.address_form_region_ua_placeholder), Integer.valueOf(R$string.shared_address_flow_form_region_hint_ua), 159383551));
        Pair pair9 = new Pair(wi0.b.M0, sh1.l.b(lVar, null, null, Integer.valueOf(R$string.shared_address_flow_form_street_name_and_building_number), null, Integer.valueOf(R$string.shared_address_flow_form_apt_number), null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_zipcode), null, null, Integer.valueOf(R$string.shared_address_flow_form_city), null, null, null, 259522239));
        Pair pair10 = new Pair(wi0.b.L0, sh1.l.c(sh1.l.b(lVar, null, Integer.valueOf(R$string.shared_address_flow_form_search_address_ie), null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.address_form_postal_code_ireland_placeholder), null, null, null, null, Integer.valueOf(R$string.common_address_region_county), null, 234356719), Integer.valueOf(R$string.shared_address_flow_form_search_address_ie), null, null, 510));
        Pair pair11 = new Pair(wi0.b.E, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.common_address_region_province_territory), null, 234881023));
        Pair pair12 = new Pair(wi0.b.W, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_region_state), null, 234881023));
        Pair pair13 = new Pair(wi0.b.k, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.common_address_region_federal_state), null, 234881023));
        Pair pair14 = new Pair(wi0.b.J, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.common_address_region_canton_district), null, 234881023));
        Pair pair15 = new Pair(wi0.b.f297764o1, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.common_address_region_municipalities), null, 234881023));
        Pair pair16 = new Pair(wi0.b.D2, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.common_address_region_county), null, 234881023));
        Pair pair17 = new Pair(wi0.b.T0, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_region_province), null, 234881023));
        Pair pair18 = new Pair(wi0.b.O, sh1.l.b(lVar, null, null, null, null, null, null, Integer.valueOf(R$string.address_form_street_co_placeholder), null, Integer.valueOf(R$string.address_form_house_number_co_placeholder), null, null, Integer.valueOf(R$string.address_form_flat_co_placeholder), null, null, null, null, Integer.valueOf(R$string.address_form_city_co_placeholder), null, Integer.valueOf(R$string.shared_address_flow_form_region_state), null, 226351103));
        wi0.b bVar4 = wi0.b.f297734c;
        int i100 = R$string.shared_address_flow_form_city;
        this.f289505b = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, new Pair(bVar4, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_neighbourhood_uae), Integer.valueOf(i100), null, Integer.valueOf(R$string.shared_address_flow_form_region_uae), null, 224395263)), new Pair(wi0.b.N, sh1.l.b(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(R$string.shared_address_flow_form_region_province), null, 234881023)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final sh1.l a(AddressFlowUseCase useCase, wi0.b bVar) {
        sh1.l lVar;
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        if ((useCase instanceof AddressFlowUseCase.Default) || (useCase instanceof AddressFlowUseCase.RetailExclusiveStoreCheckout)) {
            return (bVar == null || (lVar = (sh1.l) this.f289505b.get(bVar)) == null) ? this.f289504a : lVar;
        }
        if ((useCase instanceof AddressFlowUseCase.BusinessDefault) || (useCase instanceof AddressFlowUseCase.BusinessOperatingAddress) || (useCase instanceof AddressFlowUseCase.BusinessUsOperatingAddress) || (useCase instanceof AddressFlowUseCase.BusinessCounterparty)) {
            return sh1.l.b(this.f289504a, null, null, Integer.valueOf(R$string.shared_address_flow_form_address_line1_extended), null, Integer.valueOf(R$string.shared_address_flow_form_address_line2_extended), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435135);
        }
        throw new NoWhenBranchMatchedException();
    }
}
