package eob;

import akg.n;
import c9k.k;
import cxe.u;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lcd.m;
import n38.q;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slb.a f127884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ijb.a f127885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f127886c;
    public final elb.b d;
    public final ang.f e;

    public b(slb.a savingsCreationAvailabilityInteractor, ijb.a savingsProductInteractor, r0 jointAccountsInteractor, j savingsProductDataEntryPointTypeMapping, elb.b savingsFeatureConfigInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductDataEntryPointTypeMapping, "savingsProductDataEntryPointTypeMapping");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f127884a = savingsCreationAvailabilityInteractor;
        this.f127885b = savingsProductInteractor;
        this.f127886c = jointAccountsInteractor;
        this.d = savingsFeatureConfigInteractor;
        this.e = userInteractor;
    }

    @Override // mf1.a
    public final Flow a() {
        slb.a aVar = this.f127884a;
        m mVar = m.f193864a;
        w4l.h hVar = w4l.h.f294642c;
        u uVarC = aVar.c(mVar, hVar);
        n nVarA = ijb.a.a(this.f127885b, ncd.h.PERSONAL_JOINT, null, null, hVar, 6);
        q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u uVarE = this.f127886c.e(kotlin.collections.d.y0(elements), hVar);
        elb.b bVar = this.d;
        w4l.j jVar = w4l.j.f294644c;
        return rd0.e.e(new a87.b(mo3.a.g(nim.a.u(new enb.f(null, this), u0.m(u0.i(uVarC, nVarA, uVarE), u0.m(bVar.a(jVar), vkm.q.q(nim.a.v(this.e.j(jVar), new elb.a(15)))))), null, new en6.a(3), 1), 14), h0.f322473a, new k(3, 29, null));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
