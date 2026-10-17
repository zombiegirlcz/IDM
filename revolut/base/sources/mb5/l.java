package mb5;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f204147c;

    static {
        f0 f0Var = f0.f322471a;
        new l(f0Var, 0, f0Var);
    }

    public l(List paymentSources, int i, List paymentRequests) {
        Object obj2;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(paymentSources, "paymentSources");
        Intrinsics.checkNotNullParameter(paymentRequests, "paymentRequests");
        this.f204145a = i;
        this.f204146b = paymentSources;
        this.f204147c = paymentRequests;
        Iterator it8 = paymentSources.iterator();
        while (true) {
            obj2 = null;
            if (it8.hasNext()) {
                next = it8.next();
                if (((k) next).f204144c == j.PENDING) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (((k) next) == null) {
            Iterator it9 = this.f204146b.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                k kVar = (k) next2;
                if (kVar.f204144c == j.ACTIVE && kVar.f204143b) {
                    break;
                }
            }
            if (((k) next2) == null) {
                for (Object obj3 : this.f204146b) {
                    j jVar = ((k) obj3).f204144c;
                    if (jVar == j.CANCELED || jVar == j.FAILED) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f204145a == lVar.f204145a && Intrinsics.f(this.f204146b, lVar.f204146b) && Intrinsics.f(this.f204147c, lVar.f204147c);
    }

    public final int hashCode() {
        return this.f204147c.hashCode() + p.a.d(Integer.hashCode(this.f204145a) * 31, 31, this.f204146b);
    }
}
