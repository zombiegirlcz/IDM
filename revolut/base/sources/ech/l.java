package ech;

import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f124745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124746c;

    public l(CompositeClause scheduleInformationClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scheduleInformationClause, "scheduleInformationClause");
        this.f124744a = items;
        this.f124745b = scheduleInformationClause;
        this.f124746c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f124744a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f124744a, lVar.f124744a) && this.f124745b.equals(lVar.f124745b) && this.f124746c == lVar.f124746c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124746c) + h30.l.c(this.f124745b, this.f124744a.hashCode() * 31, 31);
    }
}
