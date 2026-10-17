package op0;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f227407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227408b;

    public s(CompositeClause title, boolean z) {
        Intrinsics.checkNotNullParameter("header", "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f227407a = title;
        this.f227408b = z;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55189b() {
        return "header";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f227407a.equals(sVar.f227407a) && this.f227408b == sVar.f227408b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227408b) + h30.l.c(this.f227407a, 795307795, 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof s)) {
            return null;
        }
        return new u(!r5.f227407a.equals(this.f227407a), ((s) oldItem).f227408b != this.f227408b);
    }
}
