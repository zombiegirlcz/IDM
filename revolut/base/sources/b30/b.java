package b30;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f11973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11975c;

    public b(TextLocalisedClause title, String titleId, long j2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleId, "titleId");
        this.f11973a = title;
        this.f11974b = titleId;
        this.f11975c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f11973a.equals(bVar.f11973a) && this.f11974b.equals(bVar.f11974b) && this.f11975c == bVar.f11975c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11975c) + p.a.c(this.f11973a.hashCode() * 31, 31, this.f11974b);
    }
}
