package e3k;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Custom f122339a = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Custom f122340b = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a() {
        IllegalStateException illegalStateException = new IllegalStateException("UNKNOWN route selected in Amount Screen");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return new TextLocalisedClause(R$string.remittance_error_no_routes_title, null, null, 14);
    }
}
