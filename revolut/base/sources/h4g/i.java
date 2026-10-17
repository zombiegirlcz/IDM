package h4g;

import b4g.e0;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f149369a;

    public i(e0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f149369a = repository;
    }

    public final void a(FlightSearchQuery searchParams) {
        Intrinsics.checkNotNullParameter(searchParams, "searchParams");
        e0 e0Var = this.f149369a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(searchParams, "searchParams");
        e0Var.f12328a.setValue(searchParams);
    }
}
