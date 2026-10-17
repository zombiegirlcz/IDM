package com.revolut.feature.toggles.models;

import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.LocalFeatureState;
import kotlin.Metadata;
import nte.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "Lcom/revolut/feature/toggles/models/FeatureDefinition;", "<init>", "()V", "Companion", "a", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RemoteFeatureDefinition implements FeatureDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalFeatureState.Binary f90454a = new LocalFeatureState.Binary(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f90455b = b.PREFER_REMOTE;

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final boolean T3() {
        return false;
    }

    public abstract Experiment a();

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    /* JADX INFO: renamed from: h5, reason: from getter */
    public final b getF90455b() {
        return this.f90455b;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final Experiment q8() {
        return a();
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final LocalFeatureState s5() {
        return this.f90454a;
    }
}
