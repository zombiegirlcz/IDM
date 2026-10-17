package m2i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f202007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f202008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f202009c;
    public final d d;

    public a(Image icon, Clause title, Clause clause, d pocket) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f202007a = icon;
        this.f202008b = title;
        this.f202009c = clause;
        this.d = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f202007a, aVar.f202007a) && Intrinsics.f(this.f202008b, aVar.f202008b) && Intrinsics.f(this.f202009c, aVar.f202009c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f202007a.hashCode() * 31, 31, this.f202008b);
        Clause clause = this.f202009c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
