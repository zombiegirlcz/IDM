package ulm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends ResponseBody {
    public final wlm.k f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f281083h;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mmm.l0 f281084l;

    public f(wlm.k snapshot, String str, String str2) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f = snapshot;
        this.f281083h = str;
        this.k = str2;
        this.f281084l = le.u1.c(new e((mmm.s0) snapshot.f298550c.get(1), this));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        String str = this.k;
        if (str != null) {
            return vlm.h.y(str);
        }
        return -1L;
    }

    @Override // okhttp3.ResponseBody
    public final b1 contentType() {
        String str = this.f281083h;
        if (str == null) {
            return null;
        }
        b1.Companion.getClass();
        return a1.b(str);
    }

    @Override // okhttp3.ResponseBody
    public final mmm.k source() {
        return this.f281084l;
    }
}
