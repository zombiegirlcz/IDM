package a79;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements t69.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1809b;

    public o(String type, String data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1808a = type;
        this.f1809b = data;
    }

    @Override // t69.c
    public final String getData() {
        return this.f1809b;
    }

    @Override // t69.c
    public final String getType() {
        return this.f1808a;
    }
}
