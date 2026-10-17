package com.revolut.feature.toggles.models;

import android.os.Parcelable;
import com.revolut.core.android.di.LocalizationToggles$ShowStringResourcesNames;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.LocalFeatureState;
import kotlin.Metadata;
import nte.b;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/toggles/models/FeatureDefinition;", "Landroid/os/Parcelable;", "Companion", "a", "feature_toggle_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public interface FeatureDefinition extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f90452a;

    /* JADX INFO: renamed from: com.revolut.feature.toggles.models.FeatureDefinition$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90452a = new Companion();

        private Companion() {
        }
    }

    default boolean T3() {
        return this instanceof LocalizationToggles$ShowStringResourcesNames;
    }

    default PublicExperimentDefinition V2() {
        return null;
    }

    /* JADX INFO: renamed from: h5 */
    default b getF90455b() {
        return b.ALL;
    }

    Experiment q8();

    default LocalFeatureState s5() {
        return new LocalFeatureState.Binary(false);
    }
}
