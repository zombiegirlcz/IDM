package kej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183089c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f183090g;

    public a(String name, String apn, String type, String mmsc, String mmsPort, String mvnoType, String mvnoData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(apn, "apn");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mmsc, "mmsc");
        Intrinsics.checkNotNullParameter(mmsPort, "mmsPort");
        Intrinsics.checkNotNullParameter(mvnoType, "mvnoType");
        Intrinsics.checkNotNullParameter(mvnoData, "mvnoData");
        this.f183087a = name;
        this.f183088b = apn;
        this.f183089c = type;
        this.d = mmsc;
        this.e = mmsPort;
        this.f = mvnoType;
        this.f183090g = mvnoData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f183087a, aVar.f183087a) && Intrinsics.f(this.f183088b, aVar.f183088b) && Intrinsics.f(this.f183089c, aVar.f183089c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f183090g, aVar.f183090g);
    }

    public final int hashCode() {
        return this.f183090g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f183087a.hashCode() * 31, 31, this.f183088b), 31, this.f183089c), 31, this.d), 31, this.e), 31, this.f);
    }
}
