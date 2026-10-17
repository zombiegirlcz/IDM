package jrd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f177993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f177994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f177995c;
    public final Integer d;

    public c(TextLocalisedClause title, a mode, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f177993a = title;
        this.f177994b = mode;
        this.f177995c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f177993a.equals(cVar.f177993a) && this.f177994b == cVar.f177994b && Intrinsics.f(this.f177995c, cVar.f177995c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f177994b.hashCode() + (this.f177993a.hashCode() * 31)) * 31;
        Integer num = this.f177995c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
