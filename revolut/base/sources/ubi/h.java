package ubi;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f278905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f278906c;
    public final Object d;

    public h(Clause title, Clause subtitle, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f278904a = items;
        this.f278905b = z;
        this.f278906c = title;
        this.d = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f278904a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f278904a, hVar.f278904a) && this.f278905b == hVar.f278905b && this.f278906c.equals(hVar.f278906c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(j6.a.c(this.f278904a.hashCode() * 31, 31, this.f278905b), 31, this.f278906c);
    }
}
