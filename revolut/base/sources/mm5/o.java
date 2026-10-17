package mm5;

import cli.y;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import mlk.a0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements k {

    @NotNull
    public static final m Companion = new m();
    public final zm5.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActionRequiredScreenContract$InputData f207154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nm5.d f207155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nm5.f f207156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final asi.d f207157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f207158t;
    public final y u;

    public o(cli.n stateMapper, zm5.e meshInteractor, ActionRequiredScreenContract$InputData inputData, nm5.d getLinkTokenInteractor, nm5.f updateCounterpartyDataInteractor, asi.d userSessionInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(meshInteractor, "meshInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(getLinkTokenInteractor, "getLinkTokenInteractor");
        Intrinsics.checkNotNullParameter(updateCounterpartyDataInteractor, "updateCounterpartyDataInteractor");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.o = meshInteractor;
        this.f207154p = inputData;
        this.f207155q = getLinkTokenInteractor;
        this.f207156r = updateCounterpartyDataInteractor;
        this.f207157s = userSessionInteractor;
        this.u = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (jh.d.h(this.f207157s.a())) {
            y yVar = this.u;
            List list = ((e) ((j2) yVar.f22677a).getValue()).f207146a;
            if (list.isEmpty()) {
                return;
            }
            H2(yVar, new a0(10));
            n2(new p0(this, list, null, 13), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
