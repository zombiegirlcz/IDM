package wgd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w2a.o;
import wf6.p;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f297312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f297313c;

    public g(Data watchlists, String str) {
        Intrinsics.checkNotNullParameter(watchlists, "watchlists");
        this.f297311a = str;
        this.f297312b = watchlists;
        this.f297313c = (List) iii.c.f(watchlists, new p(28), new wf0.b(8), new o(14));
    }

    public static g a(g gVar, String str, Data watchlists, int i) {
        if ((i & 1) != 0) {
            str = gVar.f297311a;
        }
        if ((i & 2) != 0) {
            watchlists = gVar.f297312b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(watchlists, "watchlists");
        return new g(watchlists, str);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF79628a() {
        return this.f297313c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f297311a, gVar.f297311a) && Intrinsics.f(this.f297312b, gVar.f297312b);
    }

    public final int hashCode() {
        String str = this.f297311a;
        return this.f297312b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getD() {
        return this.f297311a;
    }
}
