package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209951b;

    public q3(Clause name, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f209950a = id10;
        this.f209951b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f209950a, q3Var.f209950a) && Intrinsics.f(this.f209951b, q3Var.f209951b);
    }

    public final int hashCode() {
        return this.f209951b.hashCode() + (this.f209950a.hashCode() * 31);
    }
}
