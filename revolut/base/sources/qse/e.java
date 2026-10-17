package qse;

import com.revolut.core.ui_kit_resources.R$drawable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kse.j;
import kse.k;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.b f248807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f248808b;

    public e(z9l.b badgeMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        this.f248807a = badgeMapper;
        this.f248808b = r0.k(new Pair("ACCOUNT_ACTIONS", Integer.valueOf(R$drawable.uikit_icn_24_account_actions)), new Pair("APPLE_PAY", Integer.valueOf(R$drawable.uikit_icn_24_apple_pay)), new Pair("ARCHIVE", Integer.valueOf(R$drawable.uikit_icn_24_archive)), new Pair("ARROW_EXCHANGE", Integer.valueOf(R$drawable.uikit_icn_24_arrow_exchange)), new Pair("ARROW_RATES", Integer.valueOf(R$drawable.uikit_icn_24_arrow_rates)), new Pair("ARROW_REPEAT", Integer.valueOf(R$drawable.uikit_icn_24_arrow_repeat)), new Pair("ARROW_REQUEST", Integer.valueOf(R$drawable.uikit_icn_24_arrow_request)), new Pair("ARROW_RIGHT_LEFT", Integer.valueOf(R$drawable.uikit_icn_24_arrow_right_left)), new Pair("ARROW_SEND", Integer.valueOf(R$drawable.uikit_icn_24_arrow_send)), new Pair("AUTO_TOPUP", Integer.valueOf(R$drawable.uikit_icn_24_auto_topup)), new Pair("BANK", Integer.valueOf(R$drawable.uikit_icn_24_bank)), new Pair("BACKPACK", Integer.valueOf(R$drawable.uikit_icn_24_backpack)), new Pair("BITCOIN", Integer.valueOf(R$drawable.uikit_icn_24_bitcoin)), new Pair("BUG", Integer.valueOf(R$drawable.uikit_icn_24_bug)), new Pair("CALENDAR", Integer.valueOf(R$drawable.uikit_icn_24_calendar)), new Pair("CAMERA", Integer.valueOf(R$drawable.uikit_icn_24_camera)), new Pair("CARD", Integer.valueOf(R$drawable.uikit_icn_24_card)), new Pair("CART", Integer.valueOf(R$drawable.uikit_icn_24_cart)), new Pair("CASH", Integer.valueOf(R$drawable.uikit_icn_24_cash)), new Pair("CASH_FLOW", Integer.valueOf(R$drawable.uikit_icn_24_cash_flow)), new Pair("CASH_INCOME", Integer.valueOf(R$drawable.uikit_icn_24_cash_income)), new Pair("CASHBACK", Integer.valueOf(R$drawable.uikit_icn_24_cashback)), new Pair("CHANGE_PASSCODE", Integer.valueOf(R$drawable.uikit_icn_24_change_passcode)), new Pair("CHAT", Integer.valueOf(R$drawable.uikit_icn_24_chat)), new Pair("CHECK", Integer.valueOf(R$drawable.uikit_icn_24_check)), new Pair("CHECK_SUCCESS", Integer.valueOf(R$drawable.uikit_icn_24_check_success)), new Pair("COINS", Integer.valueOf(R$drawable.uikit_icn_24_coins)), new Pair("COMMODITIES", Integer.valueOf(R$drawable.uikit_icn_24_commodities)), new Pair("COMPLETED", Integer.valueOf(R$drawable.uikit_icn_24_check_success)), new Pair("CREDIT", Integer.valueOf(R$drawable.uikit_icn_24_credit)), new Pair("CROSS", Integer.valueOf(R$drawable.uikit_icn_24_cross)), new Pair("DELETE", Integer.valueOf(R$drawable.uikit_icn_24_delete)), new Pair("DOCUMENT", Integer.valueOf(R$drawable.uikit_icn_24_document)), new Pair("DRIVING_LICENCE", Integer.valueOf(R$drawable.uikit_icn_24_driving_licence)), new Pair("ENVELOPE", Integer.valueOf(R$drawable.uikit_icn_24_envelope)), new Pair("EXCLAMATION_TRIANGLE", Integer.valueOf(R$drawable.uikit_icn_24_exclamation_triangle)), new Pair("EXCLAMATION_MARK", Integer.valueOf(R$drawable.uikit_icn_24_exclamation_mark)), new Pair("EYE_OUTLINE", Integer.valueOf(R$drawable.uikit_icn_24_eye_outline)), new Pair("FEES", Integer.valueOf(R$drawable.uikit_icn_24_fees)), new Pair("FINGERPRINT", Integer.valueOf(R$drawable.uikit_icn_24_fingerprint)), new Pair("FLAG", Integer.valueOf(R$drawable.uikit_icn_24_flag)), new Pair("FORM", Integer.valueOf(R$drawable.uikit_icn_24_form)), new Pair("GAME_CUBE", Integer.valueOf(R$drawable.uikit_icn_24_game_cube)), new Pair("GEAR", Integer.valueOf(R$drawable.uikit_icn_24_gear)), new Pair("GOOGLE_PAY", Integer.valueOf(R$drawable.uikit_icn_24_google_pay)), new Pair("HEART", Integer.valueOf(R$drawable.uikit_icn_24_heart)), new Pair("HOTEL", Integer.valueOf(R$drawable.uikit_icn_24_hotel)), new Pair("INBOX", Integer.valueOf(R$drawable.uikit_icn_24_inbox)), new Pair("INFO", Integer.valueOf(R$drawable.uikit_icn_24_info)), new Pair("KEY", Integer.valueOf(R$drawable.uikit_icn_24_key)), new Pair("LIGHTNING", Integer.valueOf(R$drawable.uikit_icn_24_lightning)), new Pair("LIMIT", Integer.valueOf(R$drawable.uikit_icn_24_limit)), new Pair("LINK", Integer.valueOf(R$drawable.uikit_icn_24_link)), new Pair("LOCK_CLOSED", Integer.valueOf(R$drawable.uikit_icn_24_lock_closed)), new Pair("LOCK_OPENED", Integer.valueOf(R$drawable.uikit_icn_24_lock_opened)), new Pair("MAP", Integer.valueOf(R$drawable.uikit_icn_24_map)), new Pair("MEDICAL_CROSS", Integer.valueOf(R$drawable.uikit_icn_24_medical_cross)), new Pair("MINUS", Integer.valueOf(R$drawable.uikit_icn_24_minus)), new Pair("MOON", Integer.valueOf(R$drawable.uikit_icn_24_moon)), new Pair("NATIONAL_ID", Integer.valueOf(R$drawable.uikit_icn_24_national_id)), new Pair("PASSPORT", Integer.valueOf(R$drawable.uikit_icn_24_passport)), new Pair("PENCIL", Integer.valueOf(R$drawable.uikit_icn_24_pencil)), new Pair("PEOPLE", Integer.valueOf(R$drawable.uikit_icn_24_people)), new Pair("PERCENT", Integer.valueOf(R$drawable.uikit_icn_24_percent)), new Pair("PLUS", Integer.valueOf(R$drawable.uikit_icn_24_plus)), new Pair("PREMIUM", Integer.valueOf(R$drawable.uikit_icn_24_premium)), new Pair("PRESENT", Integer.valueOf(R$drawable.uikit_icn_24_present)), new Pair("PRICE_TAG", Integer.valueOf(R$drawable.uikit_icn_24_price_tag)), new Pair("PROFILE", Integer.valueOf(R$drawable.uikit_icn_24_profile)), new Pair("QUESTION", Integer.valueOf(R$drawable.uikit_icn_24_question)), new Pair("RATES_CONVERTER", Integer.valueOf(R$drawable.uikit_icn_24_rates_converter)), new Pair("REVERTED", Integer.valueOf(R$drawable.uikit_icn_24_reverted)), new Pair("ROCKET", Integer.valueOf(R$drawable.uikit_icn_24_rocket)), new Pair("SHIELD", Integer.valueOf(R$drawable.uikit_icn_24_shield)), new Pair("SHOPPING", Integer.valueOf(R$drawable.uikit_icn_24_shopping)), new Pair("STATEMENT", Integer.valueOf(R$drawable.uikit_icn_24_statement)), new Pair("SUITCASE", Integer.valueOf(R$drawable.uikit_icn_24_suitcase)), new Pair("TIME", Integer.valueOf(R$drawable.uikit_icn_24_time)), new Pair("TRAVEL", Integer.valueOf(R$drawable.uikit_icn_24_travel)), new Pair("VAULT", Integer.valueOf(R$drawable.uikit_icn_24_vault)), new Pair("WALLET", Integer.valueOf(R$drawable.uikit_icn_24_wallet)), new Pair("WEALTH", Integer.valueOf(R$drawable.uikit_icn_24_wealth)));
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a(List dto) {
        kse.e eVar;
        av1.c gVar;
        av1.c cVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<a> list = dto;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a aVar : list) {
            String id10 = aVar.getId();
            String title = aVar.getTitle();
            String description = aVar.getDescription();
            String upperCase = aVar.getIcon().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num = (Integer) this.f248808b.get(upperCase);
            String badge = aVar.getBadge();
            aal.a aVarA = badge != null ? ((yxc.d) this.f248807a).a(badge) : null;
            List<b> originEntities = aVar.getOriginEntities();
            ArrayList arrayList2 = new ArrayList(w.t(originEntities, 10));
            for (b bVar : originEntities) {
                arrayList2.add(new kse.b(bVar.getId(), Intrinsics.f(bVar.getType(), "TRANSACTION") ? kse.d.f189444c : new kse.c(bVar.getType())));
            }
            int i = d.f248805a[aVar.getState().ordinal()];
            if (i == 1) {
                eVar = kse.e.ACTIVE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = kse.e.RESOLVED;
            }
            kse.e eVar2 = eVar;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(aVar.getUpdatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            String type = aVar.getType();
            if (Intrinsics.f(type, "CHARGEBACK")) {
                cVar = kse.f.f189445c;
            } else if (Intrinsics.f(type, "OUTBOUND_TRANSFER")) {
                cVar = kse.h.f189447c;
            } else if (Intrinsics.f(type, "OUTBOUND_TRANSFER_RECALL")) {
                cVar = kse.i.f189448c;
            } else if (Intrinsics.f(type, "P2C_LOCATE")) {
                cVar = j.f189449c;
            } else if (Intrinsics.f(type, "P2C_RECALL")) {
                cVar = k.f189450c;
            } else {
                gVar = new kse.g(aVar.getType());
                arrayList.add(new kse.a(id10, title, description, num, aVarA, arrayList2, eVar2, instantOfEpochMilli, gVar));
            }
            gVar = cVar;
            arrayList.add(new kse.a(id10, title, description, num, aVarA, arrayList2, eVar2, instantOfEpochMilli, gVar));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qse.e.b(java.util.List):java.util.ArrayList");
    }
}
