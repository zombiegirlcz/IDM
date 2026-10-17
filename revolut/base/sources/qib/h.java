package qib;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f246688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f246690c;
    public final LocalDateTime d;
    public final f e;

    public h(j type, String title, LocalDateTime startDate, LocalDateTime endDate, f eligibility) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f246688a = type;
        this.f246689b = title;
        this.f246690c = startDate;
        this.d = endDate;
        this.e = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f246688a == hVar.f246688a && Intrinsics.f(this.f246689b, hVar.f246689b) && Intrinsics.f(this.f246690c, hVar.f246690c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.i(this.d, v7.i(this.f246690c, p.a.c(this.f246688a.hashCode() * 31, 31, this.f246689b), 31), 31);
    }
}
