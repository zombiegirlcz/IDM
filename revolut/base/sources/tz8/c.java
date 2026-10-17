package tz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, j.c(k.PUBLICATION, new ty.a(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f275893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f275894c;
    public final pz8.g d;
    public final String e;

    public /* synthetic */ c(int i, String str, String str2, int i2, pz8.g gVar, String str3) {
        if (31 != (i & 31)) {
            j1.f(a.f275891a.getDescriptor(), i, 31);
            throw null;
        }
        this.f275892a = str;
        this.f275893b = str2;
        this.f275894c = i2;
        this.d = gVar;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f275892a, cVar.f275892a) && Intrinsics.f(this.f275893b, cVar.f275893b) && this.f275894c == cVar.f275894c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f275894c, p.a.c(this.f275892a.hashCode() * 31, 31, this.f275893b), 31)) * 31);
    }
}
