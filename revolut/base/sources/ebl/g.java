package ebl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Warning warning = domainState.f124385a;
        List listC = u.c(new CounterTextDelegate.Model("ID_WARNING_COUNTER", new TextClause(warning.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new t4(new TextClause(warning.f, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), new TextClause(warning.f104970g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 0, 0, 0, 0, 2032));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        tal.c cVar = new tal.c((Clause) new TextClause(warning.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(warning.f104971h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
        TextClause textClause = new TextClause(warning.f104968b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(warning.f104968b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(warning.d, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122);
        String str = warning.f104969c;
        return new e(listC, cVar, new tal.a(textClause, textClause2, textClause3, true, str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left)));
    }
}
