package fnk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f136698b;

    public f(Data user, Data previews) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.f136697a = user;
        this.f136698b = previews;
    }

    public static f a(f fVar, Data user, Data previews, int i) {
        if ((i & 1) != 0) {
            user = fVar.f136697a;
        }
        if ((i & 2) != 0) {
            previews = fVar.f136698b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(previews, "previews");
        return new f(user, previews);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136697a, fVar.f136697a) && Intrinsics.f(this.f136698b, fVar.f136698b);
    }

    public final int hashCode() {
        return this.f136698b.hashCode() + (this.f136697a.hashCode() * 31);
    }
}
