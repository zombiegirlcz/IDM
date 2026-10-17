package w86;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qee.s;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements f {
    public final kdh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f295597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f295598q;

    public k(s mapper, kdh.b deviceManagementInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        this.o = deviceManagementInteractor;
        this.f295597p = new vii.b();
        this.f295598q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f295597p, new w2a.q(continuation, this, 8)), null, new w50.g(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295598q;
    }
}
