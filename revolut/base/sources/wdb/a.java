package wdb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends IllegalStateException {
    public a() {
        this(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj2) {
        super("No selectable Revolut pocket is available");
        Intrinsics.checkNotNullParameter("No selectable Revolut pocket is available", "message");
    }
}
