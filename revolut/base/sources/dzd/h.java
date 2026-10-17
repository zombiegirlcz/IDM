package dzd;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import dz7.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_ANNUAL_STATEMENTS", new TextLocalisedClause(R$string.statements_group_bank_id_screen_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.statements_group_bank_id_screen_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_document_pending, null, null, 6)), null, null, false, null, null, null, YearClass.CLASS_2016);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final o c(j jVar) {
        dzd.a domainState = (dzd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f121314a, new k(2), new dug.d(this, 27), new dob.a(this, 10)));
    }
}
