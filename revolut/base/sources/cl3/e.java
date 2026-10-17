package cl3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24927a;

    public e(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f24927a = query;
    }

    @Override // cl3.b
    public final String a() {
        return this.f24927a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f24927a, ((e) obj2).f24927a);
    }

    public final int hashCode() {
        return this.f24927a.hashCode();
    }
}
