package t05;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements cli.n {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v05.j f266940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f266941b;

    public z(v05.j insightsItemsMapper, v05.c activeApplicationItemsMapper, v05.k preapprovedProductsItemsMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(insightsItemsMapper, "insightsItemsMapper");
        Intrinsics.checkNotNullParameter(activeApplicationItemsMapper, "activeApplicationItemsMapper");
        Intrinsics.checkNotNullParameter(preapprovedProductsItemsMapper, "preapprovedProductsItemsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f266940a = insightsItemsMapper;
        this.f266941b = dateProvider;
    }

    public static kw0.g a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_score_hub_header_brand, null, null, 14);
        return new kw0.g(new kw0.k((ResourceImage) null, textLocalisedClause, (TextLocalisedClause) null, 11), (kw0.f) null, textLocalisedClause, (kw0.h) null, (Clause) null, (kw0.c) null, 122);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(t1.u(domainState.f266923a, domainState.f266924b, domainState.f266925c), new szb.g(this, 8), new szb.f(this, 5), new si5.c(this, domainState, 6));
    }
}
