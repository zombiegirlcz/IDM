package a9a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationType.Inputtable f2390a;

    public f(AliasRegistrationType.Inputtable aliasType) {
        Intrinsics.checkNotNullParameter(aliasType, "aliasType");
        this.f2390a = aliasType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f2390a, ((f) obj2).f2390a);
    }

    public final int hashCode() {
        return this.f2390a.hashCode();
    }
}
