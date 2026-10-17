package ux7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import te0.v;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends iri.a implements c {

    @NotNull
    private static final a Companion;
    public static final /* synthetic */ KProperty[] e;
    public static final z f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f283906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f283907c;
    public final Sequence d;

    public static final class a {
        private a() {
        }
    }

    static {
        h0 h0Var = new h0(o.class, "name", "getName()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(o.class, "gender", "getGender()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
        Companion = new a();
        f = z.UNKNOWN;
    }

    public o() {
        Intrinsics.checkNotNullParameter("", "default");
        te0.j jVar = new te0.j("");
        this.f283906b = jVar;
        te0.j jVar2 = new te0.j(f);
        this.f283907c = jVar2;
        KProperty[] kPropertyArr = e;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), jVar2.getValue(this, kPropertyArr[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.E(elements);
    }

    @Override // rz7.i
    public final v c0() {
        return this.f283907c.getValue(this, e[1]);
    }

    @Override // rz7.k
    public final v getName() {
        return this.f283906b.getValue(this, e[0]);
    }

    @Override // nx7.b0
    public final efm.b reset() {
        pfm.h hVar = new pfm.h(new ty7.b(this, 7), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }
}
