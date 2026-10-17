package hw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f155991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155992b;

    public a(float f, Clause badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f155991a = badge;
        this.f155992b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f155991a.equals(aVar.f155991a) && Float.compare(this.f155992b, aVar.f155992b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155992b) + (this.f155991a.hashCode() * 31);
    }
}
