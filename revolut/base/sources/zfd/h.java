package zfd;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce9.p f321929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f321930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321931c;
    public final String d;

    public h() {
        this(0);
    }

    public static h a(h hVar, ce9.p pagingState, Set selectedItemIds, List list, String query, int i) {
        if ((i & 1) != 0) {
            pagingState = hVar.f321929a;
        }
        if ((i & 2) != 0) {
            selectedItemIds = hVar.f321930b;
        }
        if ((i & 4) != 0) {
            list = hVar.f321931c;
        }
        if ((i & 8) != 0) {
            query = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        Intrinsics.checkNotNullParameter(selectedItemIds, "selectedItemIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return new h(pagingState, selectedItemIds, list, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f321929a, hVar.f321929a) && Intrinsics.f(this.f321930b, hVar.f321930b) && Intrinsics.f(this.f321931c, hVar.f321931c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f321929a.hashCode() * 31, 31, this.f321930b);
        List list = this.f321931c;
        return this.d.hashCode() + ((iF + (list == null ? 0 : list.hashCode())) * 31);
    }

    public h(ce9.p pagingState, Set selectedItemIds, List list, String query) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        Intrinsics.checkNotNullParameter(selectedItemIds, "selectedItemIds");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f321929a = pagingState;
        this.f321930b = selectedItemIds;
        this.f321931c = list;
        this.d = query;
    }

    public h(int i) {
        ce9.p pVar = new ce9.p(null, null, 63);
        h0 h0Var = h0.f322473a;
        m70.a.c(t0.f186434a);
        this(pVar, h0Var, null, "");
    }
}
