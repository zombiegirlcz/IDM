package vlm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {
    public static final Response a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Response.a aVarG = response.g();
        ResponseBody responseBody = response.f226090g;
        d body = new d(responseBody.contentType(), responseBody.contentLength());
        Intrinsics.checkNotNullParameter(body, "body");
        aVarG.f226102g = body;
        return aVarG.a();
    }
}
