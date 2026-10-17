package ma2;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f203923b;

    public e(Data currentAlias, List aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(currentAlias, "currentAlias");
        this.f203922a = aliases;
        this.f203923b = currentAlias;
    }

    public static e a(e eVar, Data currentAlias) {
        List aliases = eVar.f203922a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(currentAlias, "currentAlias");
        return new e(currentAlias, aliases);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f203922a, eVar.f203922a) && Intrinsics.f(this.f203923b, eVar.f203923b);
    }

    public final int hashCode() {
        return this.f203923b.hashCode() + (this.f203922a.hashCode() * 31);
    }
}
