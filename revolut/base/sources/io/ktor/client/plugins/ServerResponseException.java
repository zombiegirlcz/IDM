package io.ktor.client.plugins;

import ch.qos.logback.core.CoreConstants;
import hem.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zsc.p;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/ServerResponseException;", "Lio/ktor/client/plugins/ResponseException;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ServerResponseException extends ResponseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(c response, String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f163030a = "Server error(" + response.a().c().getMethod().f183243a + p.SPACE_CHAR + response.a().c().getUrl() + ": " + response.e() + ". Text: \"" + cachedResponseText + CoreConstants.DOUBLE_QUOTE_CHAR;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f163030a;
    }
}
