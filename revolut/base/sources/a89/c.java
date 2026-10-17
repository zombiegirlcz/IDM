package a89;

import a7b.r;
import akg.n;
import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsBereavement;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ne0.k;
import pfe.g;
import r38.l;
import rd0.e;
import skm.p0;
import vkm.q;
import w4l.h;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2139a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2141c;

    public c(x79.a onHoldAccountInteractor, b mapper) {
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f2140b = onHoldAccountInteractor;
        this.f2141c = mapper;
    }

    @Override // pfe.g
    public final Flow a() {
        switch (this.f2139a) {
            case 0:
                return new go.g(Boolean.TRUE, 2);
            default:
                return new go.g(Boolean.valueOf(((jte.d) ((gte.a) this.f2141c)).c(JointAccountsApi$Toggles$JointAccountsBereavement.f76457c)), 2);
        }
    }

    @Override // pfe.g
    public final boolean b() {
        switch (this.f2139a) {
        }
        return true;
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        switch (this.f2139a) {
            case 0:
                Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
                d89.g gVar = (d89.g) ((x79.a) this.f2140b);
                k kVar = gVar.e;
                h hVar = h.f294642c;
                n nVarV = nim.a.v(u0.m(e.b(kVar.a(hVar)), e.b(gVar.f.a(hVar))), new r(this, 8));
                Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
                return q.C(nVarV, oji.e.f225788b);
            default:
                Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
                return xam.a.h(new w38.q(this, dataLoadingMode, null), ((l) ((r38.b) this.f2140b)).f(c8g.c.C(dataLoadingMode)));
        }
    }

    public c(r38.b jointProductInteractor, gte.a featureToggleInteractor, u38.d mapper) {
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f2140b = jointProductInteractor;
        this.f2141c = featureToggleInteractor;
    }
}
