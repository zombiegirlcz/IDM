package lw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f200401b;

    public k(Clause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200400a = id10;
        this.f200401b = title;
    }

    @Override // lw0.l
    public final String a() {
        return this.f200400a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f200400a, kVar.f200400a) && Intrinsics.f(this.f200401b, kVar.f200401b);
    }

    public final int hashCode() {
        return this.f200401b.hashCode() + (this.f200400a.hashCode() * 31);
    }
}
