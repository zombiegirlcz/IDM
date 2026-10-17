package pd5;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f235101a;

    public e(Map externalProviders) {
        Intrinsics.checkNotNullParameter(externalProviders, "externalProviders");
        this.f235101a = externalProviders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f235101a.equals(((e) obj2).f235101a);
    }

    public final int hashCode() {
        return this.f235101a.hashCode();
    }
}
