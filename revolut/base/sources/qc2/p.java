package qc2;

import com.revolut.feature.apm.core.api.ApmToggles$QvikAreaSend;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import q97.q2;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f244535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.e f244536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.o f244537c;
    public final a12.h d;
    public final gte.a e;

    public p(a12.j apmAreaMapper, a12.e contactsMapper, a12.o transactionsMapper, a12.h draftsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(draftsMapper, "draftsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f244535a = apmAreaMapper;
        this.f244536b = contactsMapper;
        this.f244537c = transactionsMapper;
        this.d = draftsMapper;
        this.e = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        a aVar = a.Send;
        if (!((jte.d) this.e).c(ApmToggles$QvikAreaSend.f61803c)) {
            aVar = null;
        }
        a[] elements = {aVar, a.Request, a.Pay};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.add(a12.j.a(this.f244535a, kotlin.collections.d.L(elements)));
        eVarB.addAll((List) iii.c.f(domainState.f244516a, new qb5.a(this), new q2(27), new z(domainState, this, 3)));
        return new d(u.a(eVarB));
    }
}
