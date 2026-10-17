package ful;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import cul.v;
import ft4.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f138290a;

    public g(o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f138290a = tradingOrderMapper;
    }

    @Override // ful.h
    public final boolean a(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        n nVar = (n) domainState.H.getContent();
        if (nVar != null) {
            return nVar.b();
        }
        return false;
    }

    @Override // ful.h
    public final Clause b(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = f.f138289a[domainState.f109176b.ordinal()];
        if (i == 1) {
            return (Clause) iii.c.f(t1.t(domainState.H, domainState.I), new w(24), new fq7.j(28), new f0e.i(this, domainState, 23));
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Data data = domainState.R;
        if (data != null) {
            return (Clause) iii.c.f(data, new w(23), new fq7.j(27), new fq7.k(1));
        }
        return null;
    }
}
