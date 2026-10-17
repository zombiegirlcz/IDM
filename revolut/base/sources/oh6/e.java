package oh6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f225317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f225319c;
    public final a d;

    public e(d type, boolean z, ArrayList permissions, a expiration) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.f225317a = type;
        this.f225318b = z;
        this.f225319c = permissions;
        this.d = expiration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f225317a == eVar.f225317a && this.f225318b == eVar.f225318b && this.f225319c.equals(eVar.f225319c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f225319c, j6.a.c(this.f225317a.hashCode() * 31, 31, this.f225318b), 31);
    }
}
