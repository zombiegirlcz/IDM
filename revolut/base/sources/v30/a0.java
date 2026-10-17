package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {
    private a0() {
    }

    public static c0 a(String feedTypeName) {
        Intrinsics.checkNotNullParameter(feedTypeName, "feedTypeName");
        return (c0) c0.mapping.get(feedTypeName);
    }
}
