package ud2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279074a;

    public e(Data alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f279074a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f279074a, ((e) obj2).f279074a);
    }

    public final int hashCode() {
        return this.f279074a.hashCode();
    }
}
