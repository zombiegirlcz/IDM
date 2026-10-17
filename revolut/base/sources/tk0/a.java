package tk0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f271823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f271824b;

    public a(f key, LinkedHashMap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f271823a = key;
        this.f271824b = value;
    }

    public final g a() {
        return this.f271823a;
    }

    public final Object b() {
        return this.f271824b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f271823a.equals(aVar.f271823a) && this.f271824b.equals(aVar.f271824b);
    }

    public final int hashCode() {
        return this.f271824b.hashCode() + (this.f271823a.f271829a.hashCode() * 31);
    }
}
