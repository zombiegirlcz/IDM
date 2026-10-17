package l68;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior.account_activation.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f192363c;
        String str2 = domainState.d;
        boolean z = domainState.e;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_FIRST_NAME", new TextLocalisedClause(R$string.junior_account_activation_update_name_first_name_title, u.c(str), null, 12), null, new TextLocalisedClause(z ? R$string.junior_account_activation_update_name_first_names_placeholder : R$string.junior_account_activation_update_name_first_name_placeholder, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 532576, 0, null, false, true, null, true, v.k(new oe8.a(), new oe8.b()), false, false, false, null, null, 0, -1679818764, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, 0, 0, i, i, null, false, 51);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_LAST_NAME", new TextLocalisedClause(R$string.junior_account_activation_update_name_last_name_title, u.c(str2), null, 12), null, new TextLocalisedClause(z ? R$string.junior_account_activation_update_name_last_names_placeholder : R$string.junior_account_activation_update_name_last_name_placeholder, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 532576, 0, null, false, false, null, true, v.k(new oe8.a(), new oe8.b()), false, false, false, null, null, 0, -1612709900, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model2, 0, 0, i2, i2, null, false, 51);
        return new h(new TextLocalisedClause(R$string.junior_account_activation_update_name_title, null, null, 14), new TextLocalisedClause(R$string.junior_account_activation_update_name_action_update, null, null, 14), v.k(model, model2), (d0.W(str) || d0.W(str2) || (str.equals(domainState.f192361a) && str2.equals(domainState.f192362b))) ? false : true);
    }
}
