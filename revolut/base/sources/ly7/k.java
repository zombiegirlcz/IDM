package ly7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends iri.a implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f200739m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f200740b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f200741c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f200742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f200743h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f200744j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Sequence f200745l;

    static {
        h0 h0Var = new h0(k.class, "petId", "getPetId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f200739m = new KProperty[]{p0Var.j(h0Var), p.a.y(k.class, "petType", "getPetType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "name", "getName()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "gender", "getGender()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "dateOfBirth", "getDateOfBirth()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "amount", "getAmount()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "breedType", "getBreedType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "breed", "getBreed()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "sterilized", "getSterilized()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "selectedCoPaySelection", "getSelectedCoPaySelection()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public k() {
        te0.j jVar = new te0.j();
        this.f200741c = jVar;
        te0.j jVar2 = new te0.j();
        this.d = jVar2;
        te0.j jVar3 = new te0.j();
        this.e = jVar3;
        te0.j jVar4 = new te0.j();
        this.f = jVar4;
        te0.j jVar5 = new te0.j();
        this.f200742g = jVar5;
        te0.j jVar6 = new te0.j();
        this.f200743h = jVar6;
        te0.j jVar7 = new te0.j();
        this.i = jVar7;
        te0.j jVar8 = new te0.j();
        this.f200744j = jVar8;
        this.k = new te0.j();
        te0.e eVarW0 = w0();
        KProperty[] kPropertyArr = f200739m;
        te0.e[] elements = {eVarW0, jVar.getValue(this, kPropertyArr[1]), jVar2.getValue(this, kPropertyArr[2]), jVar3.getValue(this, kPropertyArr[3]), jVar4.getValue(this, kPropertyArr[4]), jVar5.getValue(this, kPropertyArr[5]), jVar6.getValue(this, kPropertyArr[6]), jVar7.getValue(this, kPropertyArr[7]), jVar8.getValue(this, kPropertyArr[8]), x0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f200745l = kotlin.collections.d.E(elements);
    }

    @Override // rz7.e
    public final v A() {
        return this.i.getValue(this, f200739m[7]);
    }

    @Override // rz7.i
    public final v c0() {
        return this.e.getValue(this, f200739m[3]);
    }

    @Override // rz7.c
    public final v f() {
        return this.f200742g.getValue(this, f200739m[5]);
    }

    @Override // rz7.g
    public final v getDateOfBirth() {
        return this.f.getValue(this, f200739m[4]);
    }

    @Override // rz7.k
    public final v getName() {
        return this.d.getValue(this, f200739m[2]);
    }

    @Override // rz7.o
    public final v h0() {
        return this.f200741c.getValue(this, f200739m[1]);
    }

    @Override // rz7.e
    public final v q0() {
        return this.f200743h.getValue(this, f200739m[6]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f200745l;
    }

    public final te0.e w0() {
        return this.f200740b.getValue(this, f200739m[0]);
    }

    public final te0.e x0() {
        return this.k.getValue(this, f200739m[9]);
    }

    @Override // rz7.m
    public final v y() {
        return this.f200744j.getValue(this, f200739m[8]);
    }
}
