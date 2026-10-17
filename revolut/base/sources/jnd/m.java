package jnd;

import java.time.LocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f176716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f176717b;

    public m() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f176716a, mVar.f176716a) && Intrinsics.f(this.f176717b, mVar.f176717b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f176716a;
        return this.f176717b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }

    public m(LocalDate localDate, Map pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f176716a = localDate;
        this.f176717b = pages;
    }

    public /* synthetic */ m(int i) {
        this(null, r0.g());
    }
}
