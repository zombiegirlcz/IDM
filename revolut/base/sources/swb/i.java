package swb;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f266175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f266176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f266177c;
    public final boolean d;
    public final List e;

    public i(Clause title, Clause subtitle, Clause button, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266175a = title;
        this.f266176b = subtitle;
        this.f266177c = button;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f266175a, iVar.f266175a) && Intrinsics.f(this.f266176b, iVar.f266176b) && Intrinsics.f(this.f266177c, iVar.f266177c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.a(p.a.a(this.f266175a.hashCode() * 31, 31, this.f266176b), 31, this.f266177c), 31, this.d);
    }
}
