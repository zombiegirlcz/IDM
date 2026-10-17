package ulm;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes14.dex */
public final class l1 extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mmm.s f281105j;
    public final /* synthetic */ mmm.h0 k;

    public l1(mmm.h0 h0Var, mmm.s sVar, b1 b1Var) {
        this.i = b1Var;
        this.f281105j = sVar;
        this.k = h0Var;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l2 = (Long) this.f281105j.n(this.k).e;
        if (l2 != null) {
            return l2.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        mmm.s0 s0VarT = this.f281105j.t(this.k);
        try {
            sink.R8(s0VarT);
            s0VarT.close();
        } finally {
        }
    }
}
