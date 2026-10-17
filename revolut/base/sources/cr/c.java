package cr;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f108157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108158b;

    public c(Map properties, String json) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f108157a = properties;
        this.f108158b = json;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f108157a, cVar.f108157a) && Intrinsics.f(this.f108158b, cVar.f108158b);
    }

    public final int hashCode() {
        return this.f108158b.hashCode() + (this.f108157a.hashCode() * 31);
    }
}
