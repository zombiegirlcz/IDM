package vdg;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f287925a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f287925a, ((d) obj2).f287925a);
    }

    public final int hashCode() {
        return this.f287925a.hashCode();
    }

    public d(Data propertyPolicies) {
        Intrinsics.checkNotNullParameter(propertyPolicies, "propertyPolicies");
        this.f287925a = propertyPolicies;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
