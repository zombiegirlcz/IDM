package xzk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.j;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends iri.a implements c {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f310049c;
    public final j d;
    public final j e;

    static {
        h0 h0Var = new h0(i.class, "currentDocumentPosition", "getCurrentDocumentPosition()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(i.class, "didGoNext", "getDidGoNext()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(i.class, "requiredDocuments", "getRequiredDocuments()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(i.class, "documentValuesByPosition", "getDocumentValuesByPosition()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public i() {
        Intrinsics.checkNotNullParameter(0, "default");
        this.f310048b = new j(0);
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f310049c = new j(bool);
        this.d = new j();
        Map mapG = r0.g();
        Intrinsics.checkNotNullParameter(mapG, "default");
        this.e = new j(mapG);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {w0(), this.f310049c.getValue(this, f[1]), x0(), y0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f310048b.getValue(this, f[0]);
    }

    public final te0.e x0() {
        return this.e.getValue(this, f[3]);
    }

    public final te0.e y0() {
        return this.d.getValue(this, f[2]);
    }
}
