package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f272797c;
    public final dj0.d d;
    public final j2 e;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f272798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f272799h;
    public final dj0.d i;

    public i2(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, j2 j2Var, j2 j2Var2, j2 j2Var3, dj0.d dVar5, dj0.d dVar6) {
        this.f272795a = dVar;
        this.f272796b = dVar2;
        this.f272797c = dVar3;
        this.d = dVar4;
        this.e = j2Var;
        this.f = j2Var2;
        this.f272798g = j2Var3;
        this.f272799h = dVar5;
        this.i = dVar6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.f272795a, i2Var.f272795a) && Intrinsics.f(this.f272796b, i2Var.f272796b) && Intrinsics.f(this.f272797c, i2Var.f272797c) && Intrinsics.f(this.d, i2Var.d) && Intrinsics.f(this.e, i2Var.e) && Intrinsics.f(this.f, i2Var.f) && Intrinsics.f(this.f272798g, i2Var.f272798g) && Intrinsics.f(this.f272799h, i2Var.f272799h) && Intrinsics.f(this.i, i2Var.i);
    }

    public final int hashCode() {
        dj0.d dVar = this.f272795a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f272796b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f272797c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        j2 j2Var = this.e;
        int iHashCode5 = (iHashCode4 + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        j2 j2Var2 = this.f;
        int iHashCode6 = (iHashCode5 + (j2Var2 == null ? 0 : j2Var2.hashCode())) * 31;
        j2 j2Var3 = this.f272798g;
        int iHashCode7 = (iHashCode6 + (j2Var3 == null ? 0 : j2Var3.hashCode())) * 31;
        dj0.d dVar5 = this.f272799h;
        int iHashCode8 = (iHashCode7 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        dj0.d dVar6 = this.i;
        return iHashCode8 + (dVar6 != null ? dVar6.hashCode() : 0);
    }
}
