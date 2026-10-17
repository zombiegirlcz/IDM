package af9;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.password.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, boolean z, boolean z3, boolean z4, boolean z6) {
        return new InputTextDelegate.Model(str, null, textLocalisedClause, null, false, clause, null, null, null, null, new ResourceImage(z ? R$drawable.uikit_icn_24_eye_show : R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, null, z6, false, (z ? BERTags.FLAGS : 0) | 1, 0, null, false, z4, "password", z3, null, false, false, false, null, null, 0, -1008869510, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause compositeClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f3967g;
        boolean z3 = domainState.f;
        String str = domainState.f3964a;
        List list = domainState.d;
        if (str.length() == 0) {
            compositeClause = new TextLocalisedClause(R$string.revolut_password_create_screen_password_hint, null, null, 14);
        } else if (list.isEmpty()) {
            compositeClause = null;
        } else {
            Clause[] elements = {new TextLocalisedClause(R$string.revolut_password_create_screen_error_requirements_title, null, null, 14), list.contains(ye9.d.f312823a) ? yoj.b.w(new TextClause(" • ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ye9.d.f312824b) : null, list.contains(ye9.f.f312827a) ? yoj.b.w(new TextClause(" • ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ye9.f.f312828b) : null, list.contains(ye9.e.f312825a) ? yoj.b.w(new TextClause(" • ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ye9.e.f312826b) : null, list.contains(ye9.g.f312829a) ? yoj.b.w(new TextClause(" • ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ye9.g.f312830b) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        InputTextDelegate.Model modelA = a("LIST_ID_ENTER_PASSWORD", new TextLocalisedClause(R$string.revolut_password_create_screen_password_placeholder, null, null, 14), compositeClause, domainState.f3966c, true, true, (str.length() == 0 || (list.isEmpty() && z3)) ? false : true);
        int i = R$attr.uikit_dp16;
        yp0.b.r(modelA, 0, 0, i, i, 3);
        InputTextDelegate.Model modelA2 = a("LIST_ID_CONFIRM_PASSWORD", new TextLocalisedClause(R$string.revolut_password_create_screen_confirm_password_placeholder, null, null, 14), !z3 ? new TextLocalisedClause(R$string.revolut_password_create_screen_error_passwords_dont_match, null, null, 14) : null, domainState.e, false, false, !z3);
        int i2 = R$attr.uikit_dp16;
        yp0.b.r(modelA2, 0, 0, i2, i2, 3);
        return new h(v.k(modelA, modelA2), z);
    }
}
