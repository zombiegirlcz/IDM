package pae;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends iri.a implements b {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f234548b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f234549c;
    public final j d;

    static {
        h0 h0Var = new h0(h.class, "currentSubscriptionId", "getCurrentSubscriptionId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(h.class, "searchQuery", "getSearchQuery()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(h.class, "selectedTransactions", "getSelectedTransactions()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public h() {
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f234549c = new j("");
        HashSet hashSet = new HashSet();
        Intrinsics.checkNotNullParameter(hashSet, "default");
        this.d = new j(hashSet);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {this.f234548b.getValue(this, e[0]), w0(), x0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f234549c.getValue(this, e[1]);
    }

    public final te0.e x0() {
        return this.d.getValue(this, e[2]);
    }
}
