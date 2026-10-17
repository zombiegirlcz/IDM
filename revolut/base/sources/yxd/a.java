package yxd;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317659b;

    public a(Clause label, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f317658a = id10;
        this.f317659b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f317658a, aVar.f317658a) && Intrinsics.f(this.f317659b, aVar.f317659b);
    }

    public final int hashCode() {
        return this.f317659b.hashCode() + (this.f317658a.hashCode() * 31);
    }
}
