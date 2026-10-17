package ig0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161068c;

    public a(String entityId, String entitySubType, boolean z) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entitySubType, "entitySubType");
        this.f161066a = entityId;
        this.f161067b = entitySubType;
        this.f161068c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f161066a, aVar.f161066a) && Intrinsics.f(this.f161067b, aVar.f161067b) && this.f161068c == aVar.f161068c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161068c) + p.a.c(this.f161066a.hashCode() * 31, 31, this.f161067b);
    }
}
