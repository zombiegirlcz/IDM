package wdm;

import java.util.List;
import kem.r;
import kem.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends f {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vdm.b client, fem.b request, hem.c response, byte[] responseBody) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        b bVar = new b(this, request);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f296602b = bVar;
        hem.a aVar = new hem.a(this, responseBody, response);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f296603c = aVar;
        Intrinsics.checkNotNullParameter(response, "<this>");
        r headers = response.getHeaders();
        List list = u.f183239a;
        String str = headers.get("Content-Length");
        h.a(str != null ? Long.valueOf(Long.parseLong(str)) : null, responseBody.length, request.getMethod());
        this.f = true;
    }

    @Override // wdm.f
    public final boolean b() {
        return this.f;
    }
}
