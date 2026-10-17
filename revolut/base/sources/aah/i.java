package aah;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0h.d f2831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0h.a f2832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2833c;
    public final Set d;
    public final Map e;
    public final x f;

    public i(z0h.d dataProvider, z0h.a clauseDestinationProvider, Set appDisclaimerFactories, ImmutableSet disclaimerFactories, ImmutableMap comparators, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        Intrinsics.checkNotNullParameter(appDisclaimerFactories, "appDisclaimerFactories");
        Intrinsics.checkNotNullParameter(disclaimerFactories, "disclaimerFactories");
        Intrinsics.checkNotNullParameter(comparators, "comparators");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f2831a = dataProvider;
        this.f2832b = clauseDestinationProvider;
        this.f2833c = appDisclaimerFactories;
        this.d = disclaimerFactories;
        this.e = comparators;
        this.f = deeplinkHandler;
    }

    public final h a() {
        return new h(this.f2831a, this.f2832b, this.f);
    }

    public final m b() {
        return new m(this.f2833c, this.d, this.e);
    }
}
