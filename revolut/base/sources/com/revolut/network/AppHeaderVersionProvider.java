package com.revolut.network;

import a0.d;
import com.revolut.feature.debug_tools.api.LocalFeature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/revolut/network/AppHeaderVersionProvider;", "", "Lkotlin/Function0;", "Lhf0/a;", "appDeclarationContextAccessor", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "version100ToggleEnabled", "()Z", "Lkotlin/jvm/functions/Function0;", "Lgte/a;", "getFeatureToggleInteractor", "()Lgte/a;", "featureToggleInteractor", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppHeaderVersionProvider {

    @NotNull
    private final Function0<hf0.a> appDeclarationContextAccessor;

    /* JADX WARN: Multi-variable type inference failed */
    public AppHeaderVersionProvider(@NotNull Function0<? extends hf0.a> appDeclarationContextAccessor) {
        Intrinsics.checkNotNullParameter(appDeclarationContextAccessor, "appDeclarationContextAccessor");
        this.appDeclarationContextAccessor = appDeclarationContextAccessor;
    }

    private final gte.a getFeatureToggleInteractor() {
        phm.a aVar = (phm.a) ((hf0.a) this.appDeclarationContextAccessor.invoke()).a().get(ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((ite.a) aVar2.b()).b();
        }
        throw new IllegalStateException(d.q("Api ", ite.a.class, " is not found"));
    }

    public final boolean version100ToggleEnabled() {
        return ((jte.d) getFeatureToggleInteractor()).c(LocalFeature.FutureVersionHeader.f71627c);
    }
}
