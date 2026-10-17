package v4e;

import aw0.cb;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f286036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f286037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cb f286038c;
    public final Map d;

    public a(k id10, Clause name, cb colorScheme, Map dailyPerformance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(dailyPerformance, "dailyPerformance");
        this.f286036a = id10;
        this.f286037b = name;
        this.f286038c = colorScheme;
        this.d = dailyPerformance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f286036a, aVar.f286036a) && Intrinsics.f(this.f286037b, aVar.f286037b) && Intrinsics.f(this.f286038c, aVar.f286038c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f286038c.hashCode() + p.a.a(this.f286036a.hashCode() * 31, 31, this.f286037b)) * 31);
    }
}
