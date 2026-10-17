package ful;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.data.model.Data;
import cul.v;
import fnk.o;
import ft4.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdf.d f138288a;

    public e(vdf.d assetFormatter) {
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        this.f138288a = assetFormatter;
    }

    @Override // ful.h
    public final boolean a(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        n nVar = (n) domainState.H.getContent();
        return (nVar != null ? nVar.f214597c : null) == z.FUND;
    }

    @Override // ful.h
    public final Clause b(v domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = d.f138286a[domainState.f109175a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Data data = domainState.M;
            Data dataD0 = t1.d0(domainState.C, Boolean.FALSE);
            Data dataT = (data == null || dataD0 == null) ? null : t1.t(data, dataD0);
            if (dataT != null) {
                return (CompositeClause) iii.c.f(dataT, new w(22), new fq7.j(26), new o(this, 7));
            }
        }
        return null;
    }
}
