package q97;

import com.revolut.feature.separate_favourites.api.converter.ConverterFeatureConfig;
import com.revolut.feature.separate_favourites.api.converter.widget.ConverterDelegatesApi$Toggles$HideConverter;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f243644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(t97.c productCellProvider, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243644b = featureToggleInteractor;
        this.f243645c = t97.d.CONVERTER;
    }

    @Override // r97.b
    public final Flow d() {
        return new go.g(Boolean.valueOf(this.f243644b.a(ConverterDelegatesApi$Toggles$HideConverter.f86017c)), 2);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243645c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey[] elements = {y1d.a.f310358b, y1d.a.f310359c, y1d.a.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new o97.l(new FeatureCommand(new ConverterFeatureConfig.ConverterScreen(14, kotlin.collections.d.y0(elements))));
    }
}
