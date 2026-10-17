package a7j;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1921a;

    public g(ImmutableMap providers, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(providers, "providers");
                this.f1921a = providers;
                break;
            default:
                Intrinsics.checkNotNullParameter(providers, "exchangeProcessors");
                this.f1921a = providers;
                break;
        }
    }

    public e a(String str) {
        Object obj2 = this.f1921a.get(str);
        if (obj2 != null) {
            return (e) obj2;
        }
        throw new IllegalArgumentException(p.a.p("No exchange processor for key ", str, " "));
    }

    public g(Map screenToSections, rrk.e statsExtractors) {
        Intrinsics.checkNotNullParameter(screenToSections, "screenToSections");
        Intrinsics.checkNotNullParameter(statsExtractors, "statsExtractors");
        this.f1921a = screenToSections;
    }
}
