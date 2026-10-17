package com.revolut.core.error.data.model;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/error/data/model/NoAuthTokenException;", "Ljava/io/IOException;", "Companion", "a", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoAuthTokenException extends IOException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.core.error.data.model.NoAuthTokenException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }
}
