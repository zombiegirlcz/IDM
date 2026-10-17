package sxe;

import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import yte.m;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f266462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f266463c;
    public final TopUpMethodsContext d;

    public c(String storedMethodAccountId, m mVar, l pocketType, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f266461a = storedMethodAccountId;
        this.f266462b = mVar;
        this.f266463c = pocketType;
        this.d = topUpMethodsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f266461a, cVar.f266461a) && this.f266462b == cVar.f266462b && this.f266463c == cVar.f266463c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f266461a.hashCode() * 31;
        m mVar = this.f266462b;
        int iC = t61.a.c(this.f266463c, (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, 31);
        TopUpMethodsContext topUpMethodsContext = this.d;
        return iC + (topUpMethodsContext != null ? topUpMethodsContext.hashCode() : 0);
    }
}
