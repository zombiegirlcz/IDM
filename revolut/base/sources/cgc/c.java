package cgc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f23907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f23909c;
    public final j d;
    public final e e;
    public final List f;

    public c(o subscriberAccountType, boolean z, l merchant, j description, e action, List list) {
        Intrinsics.checkNotNullParameter(subscriberAccountType, "subscriberAccountType");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f23907a = subscriberAccountType;
        this.f23908b = z;
        this.f23909c = merchant;
        this.d = description;
        this.e = action;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f23907a == cVar.f23907a && this.f23908b == cVar.f23908b && Intrinsics.f(this.f23909c, cVar.f23909c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f23909c.hashCode() + j6.a.c(this.f23907a.hashCode() * 31, 31, this.f23908b)) * 31)) * 31)) * 31;
        List list = this.f;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
