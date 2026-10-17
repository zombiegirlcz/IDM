package pmd;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.destinations.RevIQDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f237549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f237550b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237549a = featureToggleInteractor;
        this.f237550b = y0.b("revolut-iq/{scoreCardType}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f237550b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String str;
        ScoreCardType scoreCardType;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f237549a.a(AnalyticsFeatureApi$Toggles.RevIQ.f87398c) && (str = (String) deeplink.f195040b.get("scoreCardType")) != null) {
            ScoreCardType[] scoreCardTypeArrValues = ScoreCardType.values();
            int length = scoreCardTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    scoreCardType = null;
                    break;
                }
                scoreCardType = scoreCardTypeArrValues[i];
                if (a0.z(scoreCardType.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (scoreCardType != null) {
                return new RevIQDestination(scoreCardType);
            }
        }
        return null;
    }
}
