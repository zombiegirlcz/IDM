package c0c;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nyb.i0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20204b;

    public a(i0 revPointsProductEligibilityInteractor, ImmutableMap sources) {
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.f20203a = revPointsProductEligibilityInteractor;
        this.f20204b = sources;
    }
}
