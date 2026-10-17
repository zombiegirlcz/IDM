package zlm;

import kotlin.jvm.internal.Intrinsics;
import mmm.l0;
import okhttp3.ResponseBody;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends ResponseBody {
    public final String f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f323313h;
    public final l0 k;

    public i(String str, long j2, l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f = str;
        this.f323313h = j2;
        this.k = source;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f323313h;
    }

    @Override // okhttp3.ResponseBody
    public final b1 contentType() {
        String str = this.f;
        if (str == null) {
            return null;
        }
        b1.Companion.getClass();
        return a1.b(str);
    }

    @Override // okhttp3.ResponseBody
    public final mmm.k source() {
        return this.k;
    }
}
