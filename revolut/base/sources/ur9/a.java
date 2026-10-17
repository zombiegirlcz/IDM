package ur9;

import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr9.a f282255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f282256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final st9.e f282257c;

    public a(hr9.a type, o member, st9.e debt) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f282255a = type;
        this.f282256b = member;
        this.f282257c = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f282255a == aVar.f282255a && Intrinsics.f(this.f282256b, aVar.f282256b) && Intrinsics.f(this.f282257c, aVar.f282257c);
    }

    public final int hashCode() {
        return this.f282257c.hashCode() + m.d(this.f282256b, this.f282255a.hashCode() * 31, 31);
    }
}
