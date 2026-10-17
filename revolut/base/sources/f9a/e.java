package f9a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationType.Inputtable f132880a;

    public e(AliasRegistrationType.Inputtable type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f132880a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f132880a, ((e) obj2).f132880a);
    }

    public final int hashCode() {
        return this.f132880a.hashCode();
    }
}
