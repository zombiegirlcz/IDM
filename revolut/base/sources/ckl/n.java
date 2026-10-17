package ckl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24887b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f24885a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24886a = str;
        this.f24887b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f24886a, nVar.f24886a) && Intrinsics.f(this.f24887b, nVar.f24887b);
    }

    public final int hashCode() {
        return this.f24887b.hashCode() + (this.f24886a.hashCode() * 31);
    }

    public n(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f24886a = id10;
        this.f24887b = name;
    }
}
