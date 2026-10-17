package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes13.dex */
public final class m1 extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mmm.m f281106j;

    public m1(mmm.m mVar, b1 b1Var) {
        this.i = b1Var;
        this.f281106j = mVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f281106j.d();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.I8(this.f281106j);
    }
}
