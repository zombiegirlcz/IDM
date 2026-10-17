package xqd;

import a0j.b0;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends oki.h implements dli.b {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzi.a f308161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f308162q;

    public f(b inputData, zzi.a revIQInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revIQInteractor, "revIQInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f308161p = revIQInteractor;
        this.f308162q = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        b0 scoreType;
        int i = e.f308160a[this.o.f308156a.ordinal()];
        if (i == 1) {
            scoreType = b0.SPEND;
        } else if (i == 2) {
            scoreType = b0.SAVE;
        } else if (i == 3) {
            scoreType = b0.GROW;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            scoreType = b0.CREDIT;
        }
        ((ktj.a) this.f308161p).getClass();
        Intrinsics.checkNotNullParameter(scoreType, "scoreType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, zi0.c.i(r0.h(scoreType, ktj.a.f189560a)), null, null, new xjl.g(this, (Continuation) null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f308162q;
    }
}
