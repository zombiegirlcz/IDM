package ulm;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes13.dex */
public final class r1 extends ResponseBody {
    public final /* synthetic */ b1 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f281130h;
    public final /* synthetic */ mmm.k k;

    public r1(mmm.k kVar, b1 b1Var, long j2) {
        this.f = b1Var;
        this.f281130h = j2;
        this.k = kVar;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f281130h;
    }

    @Override // okhttp3.ResponseBody
    public final b1 contentType() {
        return this.f;
    }

    @Override // okhttp3.ResponseBody
    public final mmm.k source() {
        return this.k;
    }
}
