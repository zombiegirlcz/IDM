package f8d;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f132764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f132765b;

    public d(Clause clause, List faqs) {
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        this.f132764a = clause;
        this.f132765b = faqs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f132764a, dVar.f132764a) && Intrinsics.f(this.f132765b, dVar.f132765b);
    }

    public final int hashCode() {
        Clause clause = this.f132764a;
        return this.f132765b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
