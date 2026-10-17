package b9;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class k0 extends r1 implements m0, o1 {
    public HashSet i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13380j = null;
    public HashSet k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f13381l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f13382m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Matrix f13383n;

    @Override // b9.o1
    public final String a() {
        return this.f13380j;
    }

    @Override // b9.o1
    public final void d(HashSet hashSet) {
        this.f13381l = hashSet;
    }

    @Override // b9.o1
    public final Set e() {
        return this.f13381l;
    }

    @Override // b9.o1
    public final Set f() {
        return this.k;
    }

    @Override // b9.o1
    public final void g(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // b9.o1
    public final Set getRequiredFeatures() {
        return this.i;
    }

    @Override // b9.o1
    public final void h(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // b9.o1
    public final void i(HashSet hashSet) {
        this.f13382m = hashSet;
    }

    @Override // b9.o1
    public final void j(String str) {
        this.f13380j = str;
    }

    @Override // b9.m0
    public final void k(Matrix matrix) {
        this.f13383n = matrix;
    }

    @Override // b9.o1
    public final Set l() {
        return this.f13382m;
    }
}
