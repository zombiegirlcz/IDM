package fkj;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import dfj.q1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends oki.h implements dli.b {
    public final EsimMobilePlanGetPortOutCredentialsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f135850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q1 f135851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f135852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f135853s;

    public f(n stateMapper, EsimMobilePlanGetPortOutCredentialsScreenContract$InputData inputData, c70.a clipboard, q1 phoneNumberPortingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        this.o = inputData;
        this.f135850p = clipboard;
        this.f135851q = phoneNumberPortingInteractor;
        this.f135852r = new vii.b();
        this.f135853s = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f135852r, new f5h.b(continuation, this, 7)), null, null, new f9d.c(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135853s;
    }
}
