package gte;

import com.revolut.feature.toggles.models.FeatureDefinition;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    default boolean a(FeatureDefinition feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return !((d) this).c(feature);
    }
}
