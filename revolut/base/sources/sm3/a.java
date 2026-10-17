package sm3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.R$string;
import java.util.List;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1476a Companion = new C1476a();

    /* JADX INFO: renamed from: sm3.a$a, reason: collision with other inner class name */
    public static final class C1476a {
        private C1476a() {
        }
    }

    public static j a(lm3.a domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_NAME", new TextClause(domainState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.contact_new_form_name_optional, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static j b(lm3.a domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ITEM_ID_SAVE_TO_PHONEBOOK", null, new TextLocalisedClause(R$string.contact_new_form_save_contact, null, null, 14), null, 0, null, null, null, 0, new vf(domainState.f196867g, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
