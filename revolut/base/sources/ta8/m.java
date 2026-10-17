package ta8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269166a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269166a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f269166a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f269166a, ((m) obj2).f269166a);
    }

    public final int hashCode() {
        return this.f269166a.hashCode();
    }
}
