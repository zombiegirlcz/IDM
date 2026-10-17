package ssl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import jsl.a0;
import jsl.h0;
import jsl.i0;
import kotlin.jvm.internal.Intrinsics;
import ndf.f;
import ss4.z;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f265428a;

    public c(msl.a badgeMapper, f investSecuritiesOrderDetailsMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        this.f265428a = investSecuritiesOrderDetailsMapper;
    }

    public final i0 a(a0 domainState) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f178197b;
        Data data2 = domainState.d;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        return (dataT == null || (i0Var = (i0) iii.c.f(dataT, new z(5), new ss4.a0(2), new si5.c(this, domainState, 4))) == null) ? h0.f178214a : i0Var;
    }
}
