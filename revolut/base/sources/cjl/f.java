package cjl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lcjl/f;", "Lcjl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    public f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.value, ((f) obj2).value);
    }

    @Override // cjl.g
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }
}
