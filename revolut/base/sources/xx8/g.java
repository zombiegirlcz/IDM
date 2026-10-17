package xx8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f309410a = new g();

    private g() {
    }

    @Override // xx8.e
    public final boolean b(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.f(null, packageName);
    }
}
