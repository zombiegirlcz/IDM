package fr8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137418c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f137419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f137420h;
    public final hrf.h i;

    public l(long j2, String comment, String gifUrl, Data juniorPocket, Data parentPocket, Data targetCurrency, Data juniorProfile, Data walletProfile, hrf.h errorState) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Intrinsics.checkNotNullParameter(juniorPocket, "juniorPocket");
        Intrinsics.checkNotNullParameter(parentPocket, "parentPocket");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        this.f137416a = j2;
        this.f137417b = comment;
        this.f137418c = gifUrl;
        this.d = juniorPocket;
        this.e = parentPocket;
        this.f = targetCurrency;
        this.f137419g = juniorProfile;
        this.f137420h = walletProfile;
        this.i = errorState;
    }

    public static l a(l lVar, long j2, String str, String str2, Data data, Data data2, Data data3, Data data4, Data data5, hrf.h hVar, int i) {
        if ((i & 1) != 0) {
            j2 = lVar.f137416a;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            str = lVar.f137417b;
        }
        String comment = str;
        if ((i & 4) != 0) {
            str2 = lVar.f137418c;
        }
        String gifUrl = str2;
        Data juniorPocket = (i & 8) != 0 ? lVar.d : data;
        Data parentPocket = (i & 16) != 0 ? lVar.e : data2;
        Data targetCurrency = (i & 32) != 0 ? lVar.f : data3;
        Data juniorProfile = (i & 64) != 0 ? lVar.f137419g : data4;
        Data walletProfile = (i & 128) != 0 ? lVar.f137420h : data5;
        hrf.h errorState = (i & 256) != 0 ? lVar.i : hVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Intrinsics.checkNotNullParameter(juniorPocket, "juniorPocket");
        Intrinsics.checkNotNullParameter(parentPocket, "parentPocket");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        return new l(j3, comment, gifUrl, juniorPocket, parentPocket, targetCurrency, juniorProfile, walletProfile, errorState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f137416a == lVar.f137416a && Intrinsics.f(this.f137417b, lVar.f137417b) && Intrinsics.f(this.f137418c, lVar.f137418c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f137419g, lVar.f137419g) && Intrinsics.f(this.f137420h, lVar.f137420h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + kii.e.c(this.f137420h, kii.e.c(this.f137419g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, p.a.c(p.a.c(Long.hashCode(this.f137416a) * 31, 31, this.f137417b), 31, this.f137418c), 31), 31), 31), 31), 31);
    }
}
