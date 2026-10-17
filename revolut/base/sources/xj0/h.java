package xj0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import ulm.b1;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends RequestBody {
    public final RequestBody i;

    public h(RequestBody requestBody) {
        this.i = requestBody;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        RequestBody requestBody = this.i;
        return requestBody != null ? requestBody.contentLength() : super.contentLength();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        RequestBody requestBody = this.i;
        if (requestBody != null) {
            return requestBody.contentType();
        }
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return false;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        RequestBody requestBody = this.i;
        if (requestBody != null) {
            requestBody.writeTo(sink);
        }
    }

    public h() {
        this(null);
    }
}
