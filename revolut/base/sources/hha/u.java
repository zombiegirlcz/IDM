package hha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Serializable {
    public static final u A;
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u E;
    public static final u F;
    public static final u G;
    public static final u H;
    public static final u I;
    public static final u J;
    public static final u K;
    public static final u L;
    public static final u M;
    public static final u N;
    public static final u O;
    public static final u P;
    public static final u Q;
    public static final u R;
    public static final u S;
    public static final u T;
    public static final u U;
    public static final u V;
    public static final u W;
    public static final u X;
    public static final u Y;
    public static final u Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final u f152342a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final u f152344b0;
    public static final u c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final u f152346d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final u f152347e0;
    public static final u f0;
    public static final u g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final u f152350h0;
    public static final u i0;
    public static final u j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final u f152352k0;
    public static final u l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f152354m;
    public static final u m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f152355n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final u f152356n0;
    public static final u o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final u f152357o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f152358p;
    public static final u p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f152359q;
    public static final u q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f152360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f152361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f152362t;
    public static final u u;
    public static final u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f152363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f152364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u f152365y;
    public static final u z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152366a;

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f152343b = new u("free_fx");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f152345c = new u("free_transfers");
    public static final u d = new u("free_turbo_transfers");
    public static final u e = new u("free_atm");
    public static final u f = new u("unlimited_fx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f152348g = new u("free_delayed_flight_insurance");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f152349h = new u("free_delayed_baggage_insurance");
    public static final u i = new u("luggage_and_flight_insurance");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f152351j = new u("free_express_delivery");
    public static final u k = new u("free_spare_card");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f152353l = new u("roundclock_support");

    static {
        new u("discount_etf");
        f152354m = new u("crypto");
        f152355n = new u("crypto_withdrawals");
        o = new u("stocks");
        f152358p = new u("free_standard_delivery");
        f152359q = new u("private_ui");
        f152360r = new u("ultra_ui");
        f152361s = new u("metal_ui");
        f152362t = new u("premium_ui");
        u = new u("plus_ui");
        v = new u("cashback");
        f152363w = new u("airport_lounges");
        f152364x = new u("scheme_lounges");
        f152365y = new u("airport_lounges_unlimited");
        new u("family_cards");
        z = new u("youth_wallets");
        new u("perks_plus");
        A = new u("smart_delay");
        new u("smart_delay_with_multiple_companions");
        B = new u("deposits");
        C = new u("gold");
        D = new u("gifting");
        E = new u("branded_gifting");
        F = new u("unknown");
        G = new u("free_insurance");
        H = new u("winter_sports_cover");
        I = new u("car_hire_excess");
        J = new u("personal_liability");
        K = new u("purchase_protection");
        L = new u("purchase_protection_variant_1");
        M = new u("purchase_protection_variant_2");
        N = new u("purchase_protection_variant_3");
        new u("discount_device_insurance");
        O = new u("device_insurance");
        P = new u("global_money_transfers");
        Q = new u("refund_protection");
        R = new u("ticket_cancellation");
        S = new u("free_cross_border_transfers");
        T = new u("unlimited_cross_border_transfers");
        U = new u("stays_instant_cashback");
        V = new u("color_theme_stub");
        W = new u("cashback_boost_campaign");
        X = new u("interest_tier_x");
        Y = new u("phone_support");
        Z = new u("merch_cashback");
        f152342a0 = new u("cancellation_any_cause");
        f152344b0 = new u("event_cancellation");
        c0 = new u("free_plastic_card");
        f152346d0 = new u("free_premium_cards");
        f152347e0 = new u("free_metallic_card");
        f0 = new u("free_ultra_card");
        g0 = new u("disposable_virtual_card");
        f152350h0 = new u("personalised_card");
        i0 = new u("personalised_plus_card");
        j0 = new u("personalised_premium_card");
        f152352k0 = new u("personalised_metal_card");
        l0 = new u("free_card_personalisation");
        m0 = new u("revolut_pro");
        f152356n0 = new u("rev_points");
        f152357o0 = new u("rev_points_reward");
        p0 = new u("free_esim_data_plan");
        q0 = new u("fixed_term");
    }

    public u(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f152366a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f152366a, ((u) obj2).f152366a);
    }

    public final int hashCode() {
        return this.f152366a.hashCode();
    }
}
