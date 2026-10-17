package anc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f6755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f6757c;

    public q(p header, List items, o buttons) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f6755a = header;
        this.f6756b = items;
        this.f6757c = buttons;
    }

    @Override // cli.p
    public final List c() {
        return this.f6756b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f6755a, qVar.f6755a) && Intrinsics.f(this.f6756b, qVar.f6756b) && Intrinsics.f(this.f6757c, qVar.f6757c);
    }

    public final int hashCode() {
        return this.f6757c.hashCode() + p.a.d(Boolean.hashCode(this.f6755a.f6754a) * 31, 31, this.f6756b);
    }
}
