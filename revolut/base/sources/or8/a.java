package or8;

import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f228078a = new o();

    public final xr8.a a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object objC = this.f228078a.c(json, xr8.a.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        return (xr8.a) objC;
    }
}
