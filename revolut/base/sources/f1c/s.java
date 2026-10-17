package f1c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f131251b;

    public s(List items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131250a = items;
        this.f131251b = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f131250a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f131250a, sVar.f131250a) && Intrinsics.f(this.f131251b, sVar.f131251b);
    }

    public final int hashCode() {
        int iHashCode = this.f131250a.hashCode() * 31;
        Integer num = this.f131251b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
