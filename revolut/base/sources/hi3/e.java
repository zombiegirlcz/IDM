package hi3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f152477b;

    public /* synthetic */ e(String str) {
        this(str, null);
    }

    public final Boolean a() {
        return this.f152477b;
    }

    public final String b() {
        return this.f152476a;
    }

    public final String c(String defaultStorageKey) {
        Intrinsics.checkNotNullParameter(defaultStorageKey, "defaultStorageKey");
        String str = this.f152476a;
        return str == null ? defaultStorageKey : this.f152477b != null ? j6.a.r(defaultStorageKey, "_", str, "_campaign") : com.google.android.gms.internal.mlkit_vision_face.a.o(defaultStorageKey, "_", str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f152476a, eVar.f152476a) && Intrinsics.f(this.f152477b, eVar.f152477b);
    }

    public final int hashCode() {
        String str = this.f152476a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f152477b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public e(String str, Boolean bool) {
        this.f152476a = str;
        this.f152477b = bool;
    }
}
