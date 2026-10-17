package u97;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f278407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f278408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t97.c productCellProvider, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f278407b = featureToggleInteractor;
        this.f278408c = t97.d.HELP;
    }

    @Override // r97.b
    public final p97.a e(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        return ((jte.d) this.f278407b).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? p97.a.a(productCell, 0, new TextLocalisedClause(R$string.search_block_help_centre_faq_title, null, null, 14), null, null, null, null, 123) : productCell;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f278408c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(SupportFeatureConfig.f89363a));
    }
}
