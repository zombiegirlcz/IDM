package brf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f18007b;

    public e(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18006a = items;
        this.f18007b = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f18006a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f18006a, eVar.f18006a) && this.f18007b.equals(eVar.f18007b);
    }

    public final int hashCode() {
        return this.f18007b.hashCode() + (this.f18006a.hashCode() * 31);
    }
}
