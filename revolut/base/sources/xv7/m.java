package xv7;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.insurance_embedded.impl.data.model.LegalNotice;
import ip0.ak0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextDelegate.Model a(LegalNotice legalNotice) {
        Intrinsics.checkNotNullParameter(legalNotice, "legalNotice");
        yj0 yj0Var = yj0.START;
        String str = legalNotice.f75950a;
        return new TextDelegate.Model("LIST_ID_LEGAL_NOTICE", new HtmlClause(1, 28, (Integer) null, (Object) null, legalNotice.f75951b), false, new ak0(yj0Var, str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, 32, null, false, false, 491518) : null), null, null, 0, 0, 0, 0, 2036);
    }
}
