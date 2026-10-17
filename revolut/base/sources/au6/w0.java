package au6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f9649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9650c;

    public /* synthetic */ w0(k1 k1Var, String str, int i) {
        this.f9648a = i;
        this.f9649b = k1Var;
        this.f9650c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ResponseBody responseBody = (ResponseBody) obj2;
        switch (this.f9648a) {
            case 0:
                Intrinsics.checkNotNullParameter(responseBody, "responseBody");
                zk0.b bVar = this.f9649b.e;
                return ((a80.h) bVar).o(zk0.a.INTERNAL_CACHE, new y0(0, responseBody), p.a.p("invoice_preview_", this.f9650c, ".pdf"));
            default:
                Intrinsics.checkNotNullParameter(responseBody, "responseBody");
                k1 k1Var = this.f9649b;
                zk0.b bVar2 = k1Var.e;
                return new ufm.i(((a80.h) bVar2).p(zk0.a.INTERNAL_CACHE, responseBody.bytes(), p.a.p("invoice_preview_", this.f9650c, ".html")), new z0(new x0(k1Var, 4), 1), 1);
        }
    }
}
