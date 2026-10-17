package gjg;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends iri.a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f144290c = {o0.f186429a.j(new h0(l.class, "content", "getContent()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f144291b = new te0.j();

    @Override // iri.a
    public final Sequence v0() {
        return new r(this.f144291b.getValue(this, f144290c[0]), 1);
    }
}
