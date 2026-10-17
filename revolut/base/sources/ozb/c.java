package ozb;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import kotlin.jvm.internal.Intrinsics;
import ozb.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTextWithLinks.Link f231255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231256b;

    public c(RevPointsTextWithLinks.Link value) {
        String text = value.f84049a;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231255a = value;
        this.f231256b = text;
    }

    @Override // ozb.e.a
    public final String a() {
        return this.f231256b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f231255a, cVar.f231255a) && Intrinsics.f(this.f231256b, cVar.f231256b);
    }

    public final int hashCode() {
        return this.f231256b.hashCode() + (this.f231255a.hashCode() * 31);
    }
}
