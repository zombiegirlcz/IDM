package btf;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f18570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18572c;

    public c(Clause title, String str, List options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f18570a = title;
        this.f18571b = options;
        this.f18572c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18570a, cVar.f18570a) && Intrinsics.f(this.f18571b, cVar.f18571b) && Intrinsics.f(this.f18572c, cVar.f18572c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f18570a.hashCode() * 31, 31, this.f18571b);
        String str = this.f18572c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
