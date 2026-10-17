package wj0;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90.b f297951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f297952b;

    public a(i90.b uuidGenerator, j idempotencyMap) {
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(idempotencyMap, "idempotencyMap");
        this.f297951a = uuidGenerator;
        this.f297952b = idempotencyMap;
    }

    public final void a(String idempotencyTag) {
        Intrinsics.checkNotNullParameter(idempotencyTag, "idempotencyTag");
        String string = this.f297951a.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f297952b.f(idempotencyTag, string);
    }

    public final String b(String idempotencyTag) {
        Intrinsics.checkNotNullParameter(idempotencyTag, "idempotencyTag");
        return (String) this.f297952b.get(idempotencyTag);
    }
}
