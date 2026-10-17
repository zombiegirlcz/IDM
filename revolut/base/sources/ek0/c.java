package ek0;

import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.j;
import mmm.k0;
import okhttp3.RequestBody;
import ulm.b1;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RequestBody {
    public final RequestBody i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j21.c f126920j;

    public c(RequestBody requestBody, j21.c callback) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.i = requestBody;
        this.f126920j = callback;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.i.contentLength();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k0 k0VarB = u1.b(new b(this, sink));
        this.i.writeTo(k0VarB);
        k0VarB.flush();
    }
}
