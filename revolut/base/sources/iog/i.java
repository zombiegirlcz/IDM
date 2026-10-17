package iog;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f163320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f163321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163322c;
    public final List d;

    public i(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f163320a = title;
        this.f163321b = subtitle;
        this.f163322c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f163320a.equals(iVar.f163320a) && this.f163321b.equals(iVar.f163321b) && this.f163322c == iVar.f163322c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f163320a.hashCode() * 31, 31, this.f163321b), 31, this.f163322c);
    }
}
