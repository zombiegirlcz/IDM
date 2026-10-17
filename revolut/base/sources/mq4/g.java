package mq4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.credit.card.api.navigation.a f207857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f207858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207859c;
    public final dj0.d d;
    public final dj0.d e;

    public g(com.revolut.feature.credit.card.api.navigation.a screenMode, Data content, String amount, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f207857a = screenMode;
        this.f207858b = content;
        this.f207859c = amount;
        this.d = dVar;
        this.e = dVar2;
    }

    public static g a(g gVar, Data data, String amount, dj0.d dVar, dj0.d dVar2, int i) {
        Data content = data;
        com.revolut.feature.credit.card.api.navigation.a screenMode = gVar.f207857a;
        if ((i & 2) != 0) {
            content = gVar.f207858b;
        }
        if ((i & 4) != 0) {
            amount = gVar.f207859c;
        }
        if ((i & 8) != 0) {
            dVar = gVar.d;
        }
        if ((i & 16) != 0) {
            dVar2 = gVar.e;
        }
        dj0.d dVar3 = dVar2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(amount, "amount");
        dj0.d dVar4 = dVar;
        return new g(screenMode, content, amount, dVar4, dVar3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f207857a == gVar.f207857a && Intrinsics.f(this.f207858b, gVar.f207858b) && Intrinsics.f(this.f207859c, gVar.f207859c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(kii.e.c(this.f207858b, this.f207857a.hashCode() * 31, 31), 31, this.f207859c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
