package rx7;

import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import oma.r;
import org.jetbrains.annotations.NotNull;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends iri.a implements d {

    @NotNull
    private static final a Companion;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f258078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zw7.h f258079h;
    public static final PetBreedDetailsContract$BreedParam i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AmountData f258080j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f258081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f258082c;
    public final te0.j d;
    public final te0.j e;
    public final Sequence f;

    public static final class a {
        private a() {
        }
    }

    static {
        h0 h0Var = new h0(n.class, "breedType", "getBreedType()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f258078g = new KProperty[]{p0Var.j(h0Var), p.a.y(n.class, "breed", "getBreed()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n.class, "amount", "getAmount()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(n.class, "sterilized", "getSterilized()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
        Companion = new a();
        f258079h = zw7.h.UNKNOWN;
        i = new PetBreedDetailsContract$BreedParam((String) null, (String) null, 7);
        sz7.b.Companion.getClass();
        f258080j = sz7.b.f266770b;
    }

    public n() {
        te0.j jVar = new te0.j(f258079h);
        this.f258081b = jVar;
        te0.j jVar2 = new te0.j(i);
        this.f258082c = jVar2;
        te0.j jVar3 = new te0.j(f258080j);
        this.d = jVar3;
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        te0.j jVar4 = new te0.j(bool);
        this.e = jVar4;
        KProperty[] kPropertyArr = f258078g;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), jVar2.getValue(this, kPropertyArr[1]), jVar3.getValue(this, kPropertyArr[2]), jVar4.getValue(this, kPropertyArr[3])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = kotlin.collections.d.E(elements);
    }

    @Override // rz7.e
    public final v A() {
        return this.f258082c.getValue(this, f258078g[1]);
    }

    @Override // rz7.c
    public final v f() {
        return this.d.getValue(this, f258078g[2]);
    }

    @Override // rz7.e
    public final v q0() {
        return this.f258081b.getValue(this, f258078g[0]);
    }

    @Override // nx7.b0
    public final efm.b reset() {
        pfm.h hVar = new pfm.h(new r(this, 20), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f;
    }

    @Override // rz7.m
    public final v y() {
        return this.e.getValue(this, f258078g[3]);
    }
}
