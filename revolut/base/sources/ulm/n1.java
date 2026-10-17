package ulm;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FileDescriptor f281118j;

    public n1(FileDescriptor fileDescriptor, b1 b1Var) {
        this.i = b1Var;
        this.f281118j = fileDescriptor;
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        FileInputStream fileInputStream = new FileInputStream(this.f281118j);
        try {
            sink.getBuffer().R8(le.u1.r(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
