package b9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p1 extends r1 implements q1, o1 {
    public List i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f13438j = null;
    public String k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f13439l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f13440m = null;

    @Override // b9.o1
    public final String a() {
        return this.k;
    }

    public void c(u1 u1Var) {
        this.i.add(u1Var);
    }

    @Override // b9.o1
    public final void d(HashSet hashSet) {
        this.f13439l = hashSet;
    }

    @Override // b9.o1
    public final Set e() {
        return this.f13439l;
    }

    @Override // b9.o1
    public final Set f() {
        return null;
    }

    @Override // b9.o1
    public final void g(HashSet hashSet) {
        this.f13438j = hashSet;
    }

    @Override // b9.q1
    public final List getChildren() {
        return this.i;
    }

    @Override // b9.o1
    public final Set getRequiredFeatures() {
        return this.f13438j;
    }

    @Override // b9.o1
    public final void h(HashSet hashSet) {
    }

    @Override // b9.o1
    public final void i(HashSet hashSet) {
        this.f13440m = hashSet;
    }

    @Override // b9.o1
    public final void j(String str) {
        this.k = str;
    }

    @Override // b9.o1
    public final Set l() {
        return this.f13440m;
    }
}
