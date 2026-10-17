package xkg;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f306814b;

    public d(String interactionName, JSONObject json) {
        Intrinsics.checkNotNullParameter(interactionName, "interactionName");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f306813a = interactionName;
        this.f306814b = json;
    }

    @Override // xkg.e
    public final JSONObject a() {
        return this.f306814b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f306813a, dVar.f306813a) && Intrinsics.f(this.f306814b, dVar.f306814b);
    }

    public final int hashCode() {
        return this.f306814b.hashCode() + (this.f306813a.hashCode() * 31);
    }
}
