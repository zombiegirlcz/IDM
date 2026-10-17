package j21;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.j;
import mmm.k0;
import okhttp3.RequestBody;
import ulm.b1;
import ulm.k1;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends RequestBody {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function1 f170654j;

    public b(k1 requestBody, Function1 bytesWritten) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(bytesWritten, "bytesWritten");
        this.i = requestBody;
        this.f170654j = bytesWritten;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.i.f281101j.length();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k0 k0VarB = u1.b(new a(this, sink));
        this.i.writeTo(k0VarB);
        k0VarB.flush();
    }
}
