package hzl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f157258b;

    public f(Clause description, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f157257a = title;
        this.f157258b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f157257a.equals(fVar.f157257a) && this.f157258b.equals(fVar.f157258b);
    }

    @Override // hzl.j
    public final Clause getDescription() {
        return this.f157258b;
    }

    @Override // hzl.j
    public final Clause getTitle() {
        return this.f157257a;
    }

    public final int hashCode() {
        return this.f157258b.hashCode() + (this.f157257a.hashCode() * 31);
    }
}
