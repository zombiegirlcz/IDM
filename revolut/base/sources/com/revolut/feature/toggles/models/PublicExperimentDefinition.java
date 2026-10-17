package com.revolut.feature.toggles.models;

import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.LocalFeatureState;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/toggles/models/PublicExperimentDefinition;", "Lcom/revolut/feature/toggles/models/FeatureDefinition;", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PublicExperimentDefinition implements FeatureDefinition {
    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final PublicExperimentDefinition V2() {
        return null;
    }

    public final ReleaseFlagExperiment a() {
        return new ReleaseFlagExperiment("moneyAssistant");
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final Experiment q8() {
        return new ReleaseFlagExperiment("moneyAssistantExperiment");
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final LocalFeatureState s5() {
        return new LocalFeatureState.Binary(true);
    }
}
