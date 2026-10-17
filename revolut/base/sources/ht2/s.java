package ht2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f155241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f155242c;

    public s(List items, r headerType, o button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f155240a = items;
        this.f155241b = headerType;
        this.f155242c = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f155240a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f155240a, sVar.f155240a) && Intrinsics.f(this.f155241b, sVar.f155241b) && Intrinsics.f(this.f155242c, sVar.f155242c);
    }

    public final int hashCode() {
        return this.f155242c.hashCode() + ((this.f155241b.hashCode() + (this.f155240a.hashCode() * 31)) * 31);
    }
}
