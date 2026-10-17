package rtc;

import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityDelayType f257220a;

    public a(SecurityDelayType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f257220a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f257220a, ((a) obj2).f257220a);
    }

    public final int hashCode() {
        return this.f257220a.hashCode();
    }
}
