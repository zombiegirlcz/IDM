package com.revolut.feature.toggles.models;

import com.revolut.feature.abexperiments.models.Experiment;
import kotlin.Metadata;
import nte.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "Lcom/revolut/feature/toggles/models/FeatureDefinition;", "<init>", "()V", "Companion", "a", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DevelopmentOnlyFeatureDefinition implements FeatureDefinition {
    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final PublicExperimentDefinition V2() {
        return null;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final b h5() {
        return b.ALL;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final Experiment q8() {
        return null;
    }
}
