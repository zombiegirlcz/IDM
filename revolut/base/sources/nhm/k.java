package nhm;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f215599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f215600c;

    public k(int i, Object obj2, Object obj3) {
        this.f215598a = i;
        this.f215599b = obj2;
        this.f215600c = obj3;
    }

    @Override // nhm.b
    public final ohm.c b(int i, int i2, Object obj2) {
        return i2 == this.f215598a && Objects.equals(obj2, this.f215599b) ? new ohm.b(this.f215600c) : ohm.a.f225407a;
    }

    @Override // nhm.b
    public final b c(int i, int i2, Object obj2, Object obj3, c cVar) {
        int i3 = this.f215598a;
        return (i2 == i3 && Objects.equals(obj2, this.f215599b)) ? cVar == c.REMOVE ? e.f215587a : new k(i3, obj2, obj3) : cVar == c.REMOVE ? this : i.h(i, this, new k(i2, obj2, obj3));
    }

    @Override // nhm.b
    public final p d() {
        return new m(this);
    }

    @Override // nhm.i
    public final int e() {
        return this.f215598a;
    }

    @Override // nhm.i
    public final Object f() {
        return this.f215599b;
    }

    @Override // nhm.i
    public final Object i() {
        return this.f215600c;
    }

    @Override // nhm.b
    public final int size() {
        return 1;
    }
}
