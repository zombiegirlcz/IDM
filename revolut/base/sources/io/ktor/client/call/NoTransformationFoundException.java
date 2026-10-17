package io.ktor.client.call;

import hem.c;
import java.util.List;
import kem.r;
import kem.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.t;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoTransformationFoundException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163022a;

    public NoTransformationFoundException(c response, KClass from, KClass to6) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        StringBuilder sb6 = new StringBuilder("\n        Expected response body of the type '");
        sb6.append(to6);
        sb6.append("' but was '");
        sb6.append(from);
        sb6.append("'\n        In response from `");
        Intrinsics.checkNotNullParameter(response, "<this>");
        sb6.append(response.a().c().getUrl());
        sb6.append("`\n        Response status `");
        sb6.append(response.e());
        sb6.append("`\n        Response header `ContentType: ");
        r headers = response.getHeaders();
        List list = u.f183239a;
        sb6.append(headers.get("Content-Type"));
        sb6.append("` \n        Request header `Accept: ");
        Intrinsics.checkNotNullParameter(response, "<this>");
        sb6.append(response.a().c().getHeaders().get("Accept"));
        sb6.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f163022a = t.e(sb6.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f163022a;
    }
}
