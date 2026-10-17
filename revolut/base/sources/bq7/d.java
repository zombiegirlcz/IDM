package bq7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f17774a;

    public d(CompositeClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f17774a = title;
    }

    @Override // bq7.e
    public final boolean a() {
        return true;
    }

    @Override // bq7.e
    public final Image b() {
        return null;
    }

    @Override // bq7.e
    public final Clause c() {
        return this.f17774a;
    }

    @Override // bq7.e
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f17774a.equals(((d) obj2).f17774a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j6.a.c(this.f17774a.hashCode() * 961, 31, true);
    }
}
