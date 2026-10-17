package h0f;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.api.R$string;
import ip0.nr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        yqi.d dVar = domainState.f148386a;
        yqi.d dVar2 = domainState.f148387b;
        String str = domainState.f148388c;
        yqi.b bVar = (yqi.b) d0.d0(dVar.f316033b);
        TextClause textClause = new TextClause((String) dVar.f316032a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = true;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INPUT_ACCOUNT_NUMBER", textClause, new TextLocalisedClause(R$string.india_topup_verify_bank_account_account_number_label, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.india_topup_verify_bank_account_account_number_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, (Intrinsics.f(str, "LIST_ID_INPUT_ACCOUNT_NUMBER") || bVar == null) ? false : true, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -537002000, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        String str2 = domainState.d;
        List list = dVar2.f316033b;
        Object obj2 = dVar2.f316032a;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_INPUT_IFSC_CODE", new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.india_topup_verify_bank_account_ifsc_code_label, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.india_topup_verify_bank_account_ifsc_code_placeholder, null, null, 14), false, null, false, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, false, null, null, (Intrinsics.f(str, "LIST_ID_INPUT_IFSC_CODE") || ((yqi.b) d0.d0(list)) == null) ? false : true, false, false, false, null, 0, null, null, false, false, null, null, true, new nr(new InputFilter.AllCaps()), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743952, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        aim.e eVarA = u.a(eVarB);
        yqi.d dVar3 = domainState.f148386a;
        if (!dVar3.f316033b.isEmpty() || ((CharSequence) dVar3.f316032a).length() <= 0 || !dVar2.f316033b.isEmpty() || ((CharSequence) obj2).length() <= 0) {
            z = false;
        }
        return new n(eVarA, z, IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "HEADER_MENU_ID_HELP", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
    }
}
