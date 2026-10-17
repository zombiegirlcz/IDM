package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f165624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f165625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165626c;

    public o50(Clause title, Clause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f165624a = title;
        this.f165625b = subtitle;
        this.f165626c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o50)) {
            return false;
        }
        o50 o50Var = (o50) obj2;
        return Intrinsics.f(this.f165624a, o50Var.f165624a) && Intrinsics.f(this.f165625b, o50Var.f165625b) && this.f165626c == o50Var.f165626c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165626c) + p.a.a(this.f165624a.hashCode() * 31, 31, this.f165625b);
    }
}
