package s39;

import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f259479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f259480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259481c;

    public e(LocalDate localDate, TextClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259479a = localDate;
        this.f259480b = title;
        this.f259481c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f259479a, eVar.f259479a) && this.f259480b.equals(eVar.f259480b) && this.f259481c == eVar.f259481c;
    }

    public final int hashCode() {
        LocalDate localDate = this.f259479a;
        return Boolean.hashCode(this.f259481c) + v7.b((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f259480b);
    }
}
