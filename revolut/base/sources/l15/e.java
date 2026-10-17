package l15;

import kotlin.jvm.internal.Intrinsics;
import l15.f;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f191460b;

    public e(String actionDeeplink, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f191459a = actionDeeplink;
        this.f191460b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f191459a, eVar.f191459a) && Intrinsics.f(this.f191460b, eVar.f191460b);
    }

    public final int hashCode() {
        return this.f191460b.f297794a.hashCode() + (this.f191459a.hashCode() * 31);
    }
}
