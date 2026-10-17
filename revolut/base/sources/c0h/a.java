package c0h;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20271c;

    public a(b id10, String name, ArrayList instruments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f20269a = id10;
        this.f20270b = name;
        this.f20271c = instruments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f20269a == aVar.f20269a && Intrinsics.f(this.f20270b, aVar.f20270b) && this.f20271c.equals(aVar.f20271c);
    }

    public final int hashCode() {
        return this.f20271c.hashCode() + p.a.c(this.f20269a.hashCode() * 31, 31, this.f20270b);
    }
}
