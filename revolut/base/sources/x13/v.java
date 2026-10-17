package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements m13.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.c f302204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardSubtypePickerControllerContract$InputData f302205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f302206c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302208h;

    public v(p pVar, agk.c cVar, CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData) {
        this.f302206c = pVar;
        this.f302204a = cVar;
        this.f302205b = cardSubtypePickerControllerContract$InputData;
        this.d = e4m.b.b(new whc.t(pVar, this, 2, 21));
        this.e = e4m.b.b(new whc.t(pVar, this, 1, 21));
        this.f = e4m.b.b(new whc.t(pVar, this, 0, 21));
        this.f302207g = e4m.b.b(new whc.t(pVar, this, 3, 21));
        this.f302208h = e4m.b.b(new whc.t(pVar, this, 4, 21));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f302206c.V.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f302207g.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
