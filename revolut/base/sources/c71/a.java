package c71;

import com.revolut.domain.models.statement.StatementTemplateId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementTemplateId f21825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21826b;

    public a(StatementTemplateId id10, String content) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f21825a = id10;
        this.f21826b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f21825a == aVar.f21825a && Intrinsics.f(this.f21826b, aVar.f21826b);
    }

    public final int hashCode() {
        return this.f21826b.hashCode() + (this.f21825a.hashCode() * 31);
    }
}
