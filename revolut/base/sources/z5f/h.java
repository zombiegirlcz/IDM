package z5f;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f319625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319626c;
    public final a d;

    public h(String id10, LocalDate reportingDate, String templateId, a content) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(reportingDate, "reportingDate");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f319624a = id10;
        this.f319625b = reportingDate;
        this.f319626c = templateId;
        this.d = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f319624a, hVar.f319624a) && Intrinsics.f(this.f319625b, hVar.f319625b) && Intrinsics.f(this.f319626c, hVar.f319626c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.f319611a.hashCode() + p.a.c(y.a(this.f319624a.hashCode() * 31, 31, this.f319625b), 31, this.f319626c);
    }
}
