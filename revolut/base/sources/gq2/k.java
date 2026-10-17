package gq2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f145532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f145533c;
    public final Object d;
    public final File e;
    public final boolean f;

    public k(List items, TextClause title, TextClause textClause, Clause buttonText, File file, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f145531a = items;
        this.f145532b = title;
        this.f145533c = textClause;
        this.d = buttonText;
        this.e = file;
        this.f = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f145531a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f145531a, kVar.f145531a) && this.f145532b.equals(kVar.f145532b) && Intrinsics.f(this.f145533c, kVar.f145533c) && this.d.equals(kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f;
    }

    public final int hashCode() {
        int iB = v7.b(this.f145531a.hashCode() * 31, 31, this.f145532b);
        Clause clause = this.f145533c;
        int iB2 = p.a.b((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        File file = this.e;
        return Boolean.hashCode(this.f) + ((iB2 + (file != null ? file.hashCode() : 0)) * 31);
    }
}
