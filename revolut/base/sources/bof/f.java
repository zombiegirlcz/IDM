package bof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnf.m f17408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hof.a f17409b;

    public f(rnf.m transactionContent, hof.a cryptoCommodityContentData) {
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        Intrinsics.checkNotNullParameter(cryptoCommodityContentData, "cryptoCommodityContentData");
        this.f17408a = transactionContent;
        this.f17409b = cryptoCommodityContentData;
    }

    public static f a(f fVar, rnf.m transactionContent, hof.a cryptoCommodityContentData, int i) {
        if ((i & 1) != 0) {
            transactionContent = fVar.f17408a;
        }
        if ((i & 2) != 0) {
            cryptoCommodityContentData = fVar.f17409b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionContent, "transactionContent");
        Intrinsics.checkNotNullParameter(cryptoCommodityContentData, "cryptoCommodityContentData");
        return new f(transactionContent, cryptoCommodityContentData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f17408a, fVar.f17408a) && Intrinsics.f(this.f17409b, fVar.f17409b);
    }

    public final int hashCode() {
        return this.f17409b.hashCode() + (this.f17408a.hashCode() * 31);
    }
}
