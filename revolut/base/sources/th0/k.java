package th0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f271236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg0.c f271237b;

    public k(Context context, sg0.c mobileServicesConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileServicesConfiguration, "mobileServicesConfiguration");
        this.f271236a = context;
        this.f271237b = mobileServicesConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f271236a, kVar.f271236a) && Intrinsics.f(this.f271237b, kVar.f271237b);
    }

    public final int hashCode() {
        return this.f271237b.hashCode() + (this.f271236a.hashCode() * 31);
    }
}
