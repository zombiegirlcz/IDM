package jdl;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173157c;
    public final String d;
    public final xi0.b e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f173158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f173159h;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, xi0.b bVar, wi0.b bVar2, Double d, Double d5) {
        if (3 != (i & 3)) {
            j1.f(a.f173154a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173155a = str;
        this.f173156b = str2;
        if ((i & 4) == 0) {
            this.f173157c = null;
        } else {
            this.f173157c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bVar2;
        }
        if ((i & 64) == 0) {
            this.f173158g = null;
        } else {
            this.f173158g = d;
        }
        if ((i & 128) == 0) {
            this.f173159h = null;
        } else {
            this.f173159h = d5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f173155a, cVar.f173155a) && Intrinsics.f(this.f173156b, cVar.f173156b) && Intrinsics.f(this.f173157c, cVar.f173157c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f173158g, cVar.f173158g) && Intrinsics.f(this.f173159h, cVar.f173159h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173155a.hashCode() * 31, 31, this.f173156b);
        String str = this.f173157c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        xi0.b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31;
        Double d = this.f173158g;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f173159h;
        return iHashCode5 + (d5 != null ? d5.hashCode() : 0);
    }

    public c(String symbol, String ref2, String str, String str2, xi0.b bVar, wi0.b bVar2, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f173155a = symbol;
        this.f173156b = ref2;
        this.f173157c = str;
        this.d = str2;
        this.e = bVar;
        this.f = bVar2;
        this.f173158g = d;
        this.f173159h = d5;
    }
}
