package zz9;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f326620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f326621c;
    public final boolean d;
    public final boolean e;

    public o(List items, Map reactions, Map personalisationsMap, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(personalisationsMap, "personalisationsMap");
        this.f326619a = items;
        this.f326620b = reactions;
        this.f326621c = personalisationsMap;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f326619a, oVar.f326619a) && Intrinsics.f(this.f326620b, oVar.f326620b) && Intrinsics.f(this.f326621c, oVar.f326621c) && this.d == oVar.d && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.e(p.a.e(this.f326619a.hashCode() * 31, 31, this.f326620b), 31, this.f326621c), 31, this.d);
    }
}
