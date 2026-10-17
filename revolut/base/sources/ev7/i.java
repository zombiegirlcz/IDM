package ev7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreenContract$InputData;
import et6.r1;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AllPolicyDocumentsScreenContract$InputData f129755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eu7.e f129756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f129757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f129758s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, AllPolicyDocumentsScreenContract$InputData inputData, eu7.e documentsInteractor, ang.f userInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f129755p = inputData;
        this.f129756q = documentsInteractor;
        this.f129757r = userInteractor;
        this.f129758s = new e(0);
    }

    @Override // yji.l
    public final void I1() {
        AllPolicyDocumentsScreenContract$InputData allPolicyDocumentsScreenContract$InputData = this.f129755p;
        String insuranceId = allPolicyDocumentsScreenContract$InputData.f76095a;
        dl7.a subtype = allPolicyDocumentsScreenContract$InputData.f76096b;
        eu7.e eVar = this.f129756q;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        hu7.j jVar = eVar.f129531a;
        l.a1(this, nim.a.v(jVar.b(insuranceId, subtype), new eu7.c(eVar, 0)), null, null, new h(this, null, 0), 3);
        String insuranceId2 = allPolicyDocumentsScreenContract$InputData.f76095a;
        Intrinsics.checkNotNullParameter(insuranceId2, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        l.a1(this, nim.a.v(jVar.b(insuranceId2, subtype), new r1(22)), null, null, new h(this, null, 1), 3);
        l.a1(this, nim.a.v(rd0.e.b(this.f129757r.k(false)), new eul.d(16)), null, null, new h(this, null, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f129758s;
    }
}
