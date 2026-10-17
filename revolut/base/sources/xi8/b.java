package xi8;

import android.net.Uri;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f306313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f306314b;

    public b(f01.a uiKitResources, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f306313a = uiKitResources;
        this.f306314b = intentProvider;
    }

    public final String a(String baseLink, PaymentLinkCustomAmountBundle bundle) {
        Intrinsics.checkNotNullParameter(baseLink, "baseLink");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.a()) {
            bundle = null;
        }
        if (bundle != null) {
            String str = bundle.f77074b;
            d dVar = bundle.f77073a;
            Uri.Builder builderBuildUpon = Uri.parse(baseLink).buildUpon();
            builderBuildUpon.appendQueryParameter("currency", dVar.f115083b.f306286a);
            builderBuildUpon.appendQueryParameter("amount", String.valueOf(dVar.f115082a));
            if ((!d0.W(str) ? str : null) != null) {
                builderBuildUpon.appendQueryParameter("note", d0.W(str) ? null : str);
            }
            String string = builderBuildUpon.build().toString();
            if (string != null) {
                return string;
            }
        }
        return baseLink;
    }

    public final ExternalDestination.ByIntent b(String name, String link) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(link, "link");
        return new ExternalDestination.ByIntent(((s70.b) this.f306314b).f("", this.f306313a.b(new TextLocalisedClause(R$string.junior_payment_links_send_message_title, v.k(name, link), null, 12)).toString(), null), null);
    }
}
