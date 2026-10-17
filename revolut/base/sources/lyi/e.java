package lyi;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200836c;

    public e(aim.e items, TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200834a = items;
        this.f200835b = title;
        this.f200836c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f200834a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200834a, eVar.f200834a) && this.f200835b.equals(eVar.f200835b) && this.f200836c == eVar.f200836c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200836c) + t61.a.a(this.f200834a.hashCode() * 31, 31, this.f200835b);
    }
}
