package wm3;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        InputTextDelegate.Model model;
        wm3.a domainState = (wm3.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_INPUT_CONTACT_NAME", new TextClause(domainState.f298598a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.contacts_add_contact_input_title_name, null, null, 14), null, null, null, null, false, null, false, false, 0, true, 0, false, true, true, null, false, false, 0, false, false, null, -1224736776, 131071);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        String str = domainState.f298599b;
        AddContactInputData.InputMode inputMode = domainState.d;
        if (inputMode instanceof AddContactInputData.InputMode.Phone) {
            model = new InputTextDelegate.Model("ID_INPUT_CONTACT_PHONE_OR_EMAIL", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.contacts_add_contact_input_title_phone, null, null, 14), null, null, null, null, false, null, false, false, 3, true, 0, false, false, true, null, false, false, 0, false, false, null, -1092616200, 131071);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            if (!(inputMode instanceof AddContactInputData.InputMode.Full)) {
                throw new NoWhenBranchMatchedException();
            }
            InputTextDelegate.Model model3 = new InputTextDelegate.Model("ID_INPUT_CONTACT_PHONE_OR_EMAIL", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.contacts_add_contact_input_title_phone_or_email, null, null, 14), null, null, null, null, false, null, false, false, 0, true, 0, false, false, true, null, false, false, 0, false, false, null, -1090519048, 131071);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        }
        return new c(v.k(model2, model), domainState.f298600c);
    }
}
