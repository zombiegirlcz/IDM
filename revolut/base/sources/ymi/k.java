package ymi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315019b;

    public k(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f315018a = id10;
        this.f315019b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f315018a, kVar.f315018a) && Intrinsics.f(this.f315019b, kVar.f315019b);
    }

    public final int hashCode() {
        return this.f315019b.hashCode() + (this.f315018a.hashCode() * 31);
    }
}
