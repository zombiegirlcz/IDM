package cjj;

import bw4.s;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_add_phone_number.EsimMobilePlanAddPhoneNumberScreenContract$InputData;
import dfj.i1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements g {
    public final EsimMobilePlanAddPhoneNumberScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i1 f24694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f24695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f24696r;

    public i(n stateMapper, EsimMobilePlanAddPhoneNumberScreenContract$InputData inputData, i1 esimPhoneNumberInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        this.o = inputData;
        this.f24694p = esimPhoneNumberInteractor;
        this.f24695q = new vii.b();
        this.f24696r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(rd0.e.n(q.Q(this.f24695q, new s(continuation, this, 16)), h0.f322473a), new cge.g(29)), null, null, new cbh.g(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24696r;
    }
}
