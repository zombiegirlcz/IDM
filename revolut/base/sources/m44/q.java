package m44;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements jki.p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj1.b f202662a;

    public q(hj1.b addressViewMapper) {
        Intrinsics.checkNotNullParameter(addressViewMapper, "addressViewMapper");
        this.f202662a = addressViewMapper;
    }

    public static boolean c(gv3.b bVar) {
        String str;
        return (d0.W(bVar.e) || d0.W(bVar.f147047c) || (str = bVar.f147046b) == null || d0.W(str) || d0.W(bVar.d)) ? false : true;
    }

    public static Address d(gv3.b bVar) {
        return new Address(bVar.e, bVar.f147047c, null, bVar.d, bVar.f147046b, "", null, null, null, null, null, null, null, null, null, 32708, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r32) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m44.q.a(jki.i):jki.m");
    }

    public final aim.e b(gv3.b bVar) {
        aim.e eVar;
        aim.e eVarB = zhm.u.b();
        Address address = d(bVar);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_address_plugin_hint_postal_code, null, null, 14);
        hj1.c cVar = (hj1.c) this.f202662a;
        eVarB.add(cVar.a(address, textLocalisedClause));
        gv3.b.Companion.getClass();
        if (bVar.equals(gv3.b.f)) {
            eVar = eVarB;
        } else {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_address_plugin_hint_address_line_1, null, null, 14);
            TextLocalisedClause floatingLabel = new TextLocalisedClause(R$string.credit_application_address_plugin_label_address_line_1, null, null, 14);
            cVar.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(floatingLabel, "floatingLabel");
            wi0.b bVarG = nz8.d.g(address);
            TextLocalisedClause textLocalisedClause3 = com.bumptech.glide.d.t(bVarG) ? new TextLocalisedClause(com.revolut.feature.address_picker.R$string.signup_registration_enter_address_hint_building_room_helper, null, null, 14) : com.bumptech.glide.d.v(bVarG) ? new TextLocalisedClause(com.revolut.feature.address_picker.R$string.address_form_address_line1_sg_footer, null, null, 14) : null;
            int i = (com.bumptech.glide.d.t(bVarG) || com.bumptech.glide.d.v(bVarG)) ? R$attr.uikit_dp16 : R$attr.uikit_dp0;
            cVar.f152645b.getClass();
            String streetLine1 = address.getStreetLine1();
            eVar = eVarB;
            InputTextDelegate.Model model = new InputTextDelegate.Model("ADDRESS_LINE_1_ID", new TextClause(streetLine1 == null ? "" : streetLine1, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), floatingLabel, textLocalisedClause2, false, textLocalisedClause3, null, null, null, null, null, true, 50, null, false, false, 540673, 0, null, false, false, "streetAddress", true, m72.b.u(50), false, false, false, null, null, 0, -1814478992, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, R$attr.uikit_dp0, i, 0, 0, null, false, 60);
            eVar.add(model);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_address_plugin_hint_address_line_2, null, null, 14);
            TextLocalisedClause floatingLabel2 = new TextLocalisedClause(R$string.credit_application_address_plugin_label_address_line_2, null, null, 14);
            cVar.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(floatingLabel2, "floatingLabel");
            TextLocalisedClause textLocalisedClause5 = com.bumptech.glide.d.v(nz8.d.g(address)) ? new TextLocalisedClause(com.revolut.feature.address_picker.R$string.address_form_address_line2_sg_footer, null, null, 14) : new TextLocalisedClause(com.revolut.feature.address_picker.R$string.sign_up_form_address2_footer, null, null, 14);
            cVar.f152645b.getClass();
            String streetLine2 = address.getStreetLine2();
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("ADDRESS_LINE_2_ID", new TextClause(streetLine2 == null ? "" : streetLine2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), floatingLabel2, textLocalisedClause4, false, textLocalisedClause5, null, null, null, null, null, true, 50, null, false, false, 540673, 0, null, false, false, "extendedAddress", true, m72.b.u(50), false, false, false, null, null, 0, -1814478992, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
            eVar.add(model2);
            TextLocalisedClause hint = new TextLocalisedClause(R$string.credit_application_address_plugin_hint_city, null, null, 14);
            cVar.getClass();
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(hint, "hint");
            TextLocalisedClause textLocalisedClause6 = com.bumptech.glide.d.t(nz8.d.g(address)) ? new TextLocalisedClause(com.revolut.feature.address_picker.R$string.address_form_city_jp_footer, null, null, 14) : null;
            String city = address.getCity();
            TextClause textClause = new TextClause(city == null ? "" : city, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            hj1.b.Companion.getClass();
            InputTextDelegate.Model model3 = new InputTextDelegate.Model("CITY_ID", textClause, hint, null, false, textLocalisedClause6, null, null, null, null, null, false, null, null, false, false, 540673, 0, null, false, false, "addressLocality", true, zhm.u.c(hj1.a.f152643b), false, false, false, null, null, 0, -1814298760, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model3, R$attr.uikit_dp0, com.bumptech.glide.d.w(nz8.d.g(address)) ? R$attr.uikit_dp16 : R$attr.uikit_dp24, 0, 0, null, false, 60);
            eVar.add(model3);
        }
        return zhm.u.a(eVar);
    }
}
