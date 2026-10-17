package n1j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f211401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f211402c;
    public final u1j.b d;

    public s(List items, Integer num, n buttonState, u1j.b bVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f211400a = items;
        this.f211401b = num;
        this.f211402c = buttonState;
        this.d = bVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f211400a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f211400a, sVar.f211400a) && Intrinsics.f(this.f211401b, sVar.f211401b) && Intrinsics.f(this.f211402c, sVar.f211402c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f211400a.hashCode() * 31;
        Integer num = this.f211401b;
        int iHashCode2 = (this.f211402c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        u1j.b bVar = this.d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
