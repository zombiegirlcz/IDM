package b71;

import com.revolut.domain.models.security_settings.SecuritySettingType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecuritySettingType f12865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12866b;

    public a(SecuritySettingType type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f12865a = type;
        this.f12866b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f12865a == aVar.f12865a && this.f12866b == aVar.f12866b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12866b) + (this.f12865a.hashCode() * 31);
    }
}
