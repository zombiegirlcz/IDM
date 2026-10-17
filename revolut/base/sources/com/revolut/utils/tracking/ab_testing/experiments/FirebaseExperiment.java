package com.revolut.utils.tracking.ab_testing.experiments;

import b0m.b;
import b0m.c;
import com.revolut.feature.abexperiments.models.Experiment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "Lcom/revolut/feature/abexperiments/models/Experiment;", "<init>", "()V", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FirebaseExperiment implements Experiment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107370a = c.f11691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f107371b = b.EXPERIMENT_VALUE_B;

    @Override // com.revolut.feature.abexperiments.models.Experiment
    public final r81.c X1() {
        return this.f107371b;
    }

    @Override // com.revolut.feature.abexperiments.models.Experiment
    public r81.c getDefaultValue() {
        return this.f107370a;
    }
}
