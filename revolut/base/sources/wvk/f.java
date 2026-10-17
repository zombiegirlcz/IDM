package wvk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f300545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f300546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f300547c;
    public final List d;

    public f(TextLocalisedClause headerTitle, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f300545a = items;
        this.f300546b = headerTitle;
        this.f300547c = z;
        this.d = menuItems;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // cli.p
    public final List c() {
        return this.f300545a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f300545a.equals(fVar.f300545a) && this.f300546b.equals(fVar.f300546b) && this.f300547c == fVar.f300547c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f300545a.hashCode() * 31, 31, this.f300546b), 31, this.f300547c);
    }
}
