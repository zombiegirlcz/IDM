package xkg;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f306812a;

    public c(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f306812a = json;
    }

    @Override // xkg.e
    public final JSONObject a() {
        return this.f306812a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f306812a, ((c) obj2).f306812a);
    }

    public final int hashCode() {
        return this.f306812a.hashCode();
    }
}
