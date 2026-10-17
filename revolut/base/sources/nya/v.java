package nya;

import au0.u0;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f220761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.k f220762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f220763c;
    public final u0 d;

    public v(TextClause title, aw0.k kVar, List list, u0 page) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f220761a = title;
        this.f220762b = kVar;
        this.f220763c = list;
        this.d = page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f220761a.equals(vVar.f220761a) && Intrinsics.f(this.f220762b, vVar.f220762b) && Intrinsics.f(this.f220763c, vVar.f220763c) && this.d.equals(vVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f220761a.hashCode() * 31;
        aw0.k kVar = this.f220762b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List list = this.f220763c;
        return this.d.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
