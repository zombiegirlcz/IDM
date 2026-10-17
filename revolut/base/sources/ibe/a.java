package ibe;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import h93.f0;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import kr2.h;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f160156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f160157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f160158c;
    public final f0 d;
    public final q e;
    public final JuniorBankingProfile f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f160159g;

    public a(p subscription, Data transactionsResult, h hVar, f0 f0Var, q qVar, JuniorBankingProfile juniorBankingProfile, Data recurringPaymentSplitStatus) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatus, "recurringPaymentSplitStatus");
        this.f160156a = subscription;
        this.f160157b = transactionsResult;
        this.f160158c = hVar;
        this.d = f0Var;
        this.e = qVar;
        this.f = juniorBankingProfile;
        this.f160159g = recurringPaymentSplitStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160156a, aVar.f160156a) && Intrinsics.f(this.f160157b, aVar.f160157b) && Intrinsics.f(this.f160158c, aVar.f160158c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f160159g, aVar.f160159g);
    }

    public final int hashCode() {
        int iC = e.c(this.f160157b, this.f160156a.hashCode() * 31, 31);
        h hVar = this.f160158c;
        int iHashCode = (iC + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f0 f0Var = this.d;
        int iHashCode2 = (iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        q qVar = this.e;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        JuniorBankingProfile juniorBankingProfile = this.f;
        return this.f160159g.hashCode() + ((iHashCode3 + (juniorBankingProfile != null ? juniorBankingProfile.hashCode() : 0)) * 31);
    }
}
