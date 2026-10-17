package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes14.dex */
public final class o1 extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f281119j;
    public final /* synthetic */ byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f281120l;

    public o1(b1 b1Var, byte[] bArr, int i, int i2) {
        this.i = b1Var;
        this.f281119j = i;
        this.k = bArr;
        this.f281120l = i2;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f281119j;
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.N9(this.f281120l, this.f281119j, this.k);
    }
}
