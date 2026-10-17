package pkh;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f237186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f237187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f237188c;

    public h(Clause title, od0.i description, List disclosures) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(disclosures, "disclosures");
        this.f237186a = title;
        this.f237187b = description;
        this.f237188c = disclosures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f237186a, hVar.f237186a) && Intrinsics.f(this.f237187b, hVar.f237187b) && Intrinsics.f(this.f237188c, hVar.f237188c);
    }

    public final int hashCode() {
        return this.f237188c.hashCode() + r6.b.f(this.f237187b, this.f237186a.hashCode() * 31, 31);
    }
}
