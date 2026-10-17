package tx7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import od0.i;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import te0.n;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends iri.a implements b {
    public static final i e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f275341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f275342c;
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(c.class, "petId", "getPetId()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    static {
        i.Companion.getClass();
        e = i.f224256b;
    }

    public c() {
        n nVar = new n();
        this.f275341b = nVar;
        this.f275342c = new r(nVar.getValue(this, d[0]), 1);
    }

    @Override // tx7.b
    public final v d() {
        return this.f275341b.getValue(this, d[0]);
    }

    @Override // nx7.b0
    public final efm.b reset() {
        h hVar = new h(new oma.r(this, 29), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f275342c;
    }
}
