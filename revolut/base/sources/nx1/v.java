package nx1;

import com.revolut.feature.apm.core.api.ApmToggles$ApmDiscoveryV2;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final px1.i f220087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f220088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f220089c;

    public v(px1.i legacyRepository, u repository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(legacyRepository, "legacyRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f220087a = legacyRepository;
        this.f220088b = repository;
        this.f220089c = featureToggleInteractor;
    }

    @Override // nx1.i
    public final Object a(n02.b bVar, ApmDescriptor apmDescriptor, gim.c cVar) {
        return d().a(bVar, apmDescriptor, cVar);
    }

    @Override // nx1.i
    public final Object b(List list, ArrayList arrayList, Continuation continuation) {
        Object objB = d().b(list, arrayList, continuation);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    @Override // nx1.i
    public final Object c(String str, fy1.l lVar) {
        return d().c(str, lVar);
    }

    public final i d() {
        return ((jte.d) this.f220089c).c(ApmToggles$ApmDiscoveryV2.f61780c) ? this.f220088b : this.f220087a;
    }
}
