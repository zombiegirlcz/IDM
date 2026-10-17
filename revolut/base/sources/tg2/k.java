package tg2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f271049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f271050c;
    public final boolean d;

    public k(List items, Clause title, aw0.i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f271048a = items;
        this.f271049b = title;
        this.f271050c = iVar;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f271048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f271048a, kVar.f271048a) && Intrinsics.f(this.f271049b, kVar.f271049b) && Intrinsics.f(this.f271050c, kVar.f271050c) && this.d == kVar.d;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f271048a.hashCode() * 31, 31, this.f271049b);
        aw0.i iVar = this.f271050c;
        return Boolean.hashCode(this.d) + ((iA + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
