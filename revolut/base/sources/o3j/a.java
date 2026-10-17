package o3j;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f221825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221826b;

    public a(Clause title, List choices) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(choices, "choices");
        this.f221825a = title;
        this.f221826b = choices;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221825a, aVar.f221825a) && Intrinsics.f(this.f221826b, aVar.f221826b);
    }

    public final int hashCode() {
        return this.f221826b.hashCode() + (this.f221825a.hashCode() * 31);
    }
}
