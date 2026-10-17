package com.revolut.core.error.data.model;

import d0m.b;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ulm.j1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/error/data/model/AmbiguousAuthTokenException;", "Ljava/io/IOException;", "Companion", "a", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmbiguousAuthTokenException extends IOException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.core.error.data.model.AmbiguousAuthTokenException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AmbiguousAuthTokenException(j1 request, String session) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(session, "session");
        INSTANCE.getClass();
        String upperCase = request.f281096b.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Regex regex = b.f110450a;
        StringBuilder sbT = p.a.t(upperCase, " ", b.a(request.f281095a.i), " in ", session);
        sbT.append(" session");
        super(sbT.toString());
    }
}
