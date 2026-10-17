package sll;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.Identifier;
import java.io.Serializable;
import java.util.List;
import koi.j;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f264229a;

    public a(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f264229a = phoneToolsProvider;
    }

    public static j a(TextLocalisedClause text, String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(id10, LargeActionButton.ButtonStyle.f58725a, null, text, z, null, null, null, null, 968);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static j b(Identifier.Email identifierEmail) {
        Intrinsics.checkNotNullParameter(identifierEmail, "identifierEmail");
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_ENTER_EMAIL", new TextClause(identifierEmail.f106149a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_placeholder_email, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 32, 0, null, false, true, "emailAddress", true, null, false, false, false, null, null, 0, -1008730124, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static j d(TextLocalisedClause text, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(id10, LargeActionButton.ButtonStyle.o, null, text, false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp16, 0, 0, 13);
        return model;
    }

    public final j c(Identifier.Phone identifierPhone, boolean z) {
        Intrinsics.checkNotNullParameter(identifierPhone, "identifierPhone");
        fj0.a aVar = fj0.b.Companion;
        String strJ = this.f264229a.j(identifierPhone.f106152c);
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        o.b(serializableB);
        ka kaVar = new ka("LIST_ID_ENTER_PHONE", identifierPhone.f106150a, new Pair(new fj0.b(((fj0.b) serializableB).f135518a), identifierPhone.f106152c), null, null, new TextLocalisedClause(R$string.revolut_sso_consolidated_auth_placeholder_phone_number, null, null, 14), z, false, 7992);
        int i = R$attr.uikit_dp0;
        yp0.b.l(kaVar, 0, 0, i, i, null, false, 51);
        return kaVar;
    }
}
