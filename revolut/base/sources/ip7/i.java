package ip7;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f167670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f167671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167672c;

    public i(Clause buttonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f167670a = items;
        this.f167671b = buttonText;
        this.f167672c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f167670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f167670a, iVar.f167670a) && this.f167671b.equals(iVar.f167671b) && this.f167672c == iVar.f167672c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167672c) + p.a.b(this.f167670a.hashCode() * 31, 31, this.f167671b);
    }
}
