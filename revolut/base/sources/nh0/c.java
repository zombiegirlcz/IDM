package nh0;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements tg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f215267a;

    public c(AdvertisingIdClient.Info internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f215267a = internal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f215267a, ((c) obj2).f215267a);
    }

    public final int hashCode() {
        return this.f215267a.hashCode();
    }
}
