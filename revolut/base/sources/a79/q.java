package a79;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements t69.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1812a;

    public q(String data) {
        Intrinsics.checkNotNullParameter("unknown", "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1812a = data;
    }

    @Override // t69.c
    public final String getData() {
        return this.f1812a;
    }

    @Override // t69.c
    public final String getType() {
        return "unknown";
    }
}
