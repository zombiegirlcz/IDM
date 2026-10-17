package ct;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ab;
import ip0.bb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements n {

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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_nfc_my_number_pin_title, null, null, 14);
        Clause clauseW = yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.vision_nfc_my_number_pin_subtitle, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.vision_nfc_my_number_pin_forgot_pin, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10));
        String str = domainState.f108552a;
        ab abVar = ab.DIGITS_4;
        bb bbVar = bb.CENTER_HORIZONTAL;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        return new j(clauseW, textLocalisedClause, u.c(new z3("MY_NUMBER_CARD_PIN", str, abVar, CodeEditorDelegate.a.b.f52102a, true, bbVar, true, false, i, i2, i3, i3, 128)));
    }
}
