package c71;

import com.revolut.domain.models.statement.StatementTemplateId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementTemplateId f21827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21829c;

    public b(StatementTemplateId id10, String url2, String checkSum) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        this.f21827a = id10;
        this.f21828b = url2;
        this.f21829c = checkSum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f21827a == bVar.f21827a && Intrinsics.f(this.f21828b, bVar.f21828b) && Intrinsics.f(this.f21829c, bVar.f21829c);
    }

    public final int hashCode() {
        return this.f21829c.hashCode() + p.a.c(this.f21827a.hashCode() * 31, 31, this.f21828b);
    }
}
