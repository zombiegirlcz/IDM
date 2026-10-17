package ulm;

import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes14.dex */
public final class k1 extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ File f281101j;

    public k1(File file, b1 b1Var) {
        this.i = b1Var;
        this.f281101j = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f281101j.length();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        File file = this.f281101j;
        Intrinsics.checkNotNullParameter(file, "<this>");
        mmm.e eVar = new mmm.e(new FileInputStream(file), mmm.v0.d);
        try {
            sink.R8(eVar);
            eVar.close();
        } finally {
        }
    }
}
