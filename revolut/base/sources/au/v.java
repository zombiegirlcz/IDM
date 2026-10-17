package au;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f9131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9132c;
    public final boolean d;
    public final boolean e;

    public v(ArrayList items, TextLocalisedClause title, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9130a = items;
        this.f9131b = title;
        this.f9132c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // cli.p
    public final List c() {
        return this.f9130a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f9130a.equals(vVar.f9130a) && this.f9131b.equals(vVar.f9131b) && this.f9132c == vVar.f9132c && this.d == vVar.d && this.e == vVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(t61.a.a(this.f9130a.hashCode() * 31, 31, this.f9131b), 31, this.f9132c), 31, this.d);
    }
}
