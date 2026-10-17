package xkg;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f306811a;

    public b(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f306811a = json;
    }

    @Override // xkg.e
    public final JSONObject a() {
        return this.f306811a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f306811a, ((b) obj2).f306811a);
    }

    public final int hashCode() {
        return this.f306811a.hashCode();
    }
}
