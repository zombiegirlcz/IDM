package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225063a;

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f225063a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f225063a, ((a) obj2).f225063a);
    }

    public final int hashCode() {
        return this.f225063a.hashCode();
    }
}
