package joa;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f176896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f176897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f176898c;
    public final od0.i d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mn2.a f176899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f176900h;
    public final Data i;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data data, Data data2, Data data3, od0.i iVar, boolean z, boolean z3, mn2.a aVar, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = cVar.f176896a;
        }
        Data user = data;
        if ((i & 2) != 0) {
            data2 = cVar.f176897b;
        }
        Data kyc2 = data2;
        if ((i & 4) != 0) {
            data3 = cVar.f176898c;
        }
        Data profileType = data3;
        if ((i & 8) != 0) {
            iVar = cVar.d;
        }
        od0.i legalDisclaimerOptional = iVar;
        if ((i & 16) != 0) {
            z = cVar.e;
        }
        boolean z4 = z;
        boolean z6 = (i & 32) != 0 ? cVar.f : z3;
        mn2.a aVar2 = (i & 64) != 0 ? cVar.f176899g : aVar;
        Data periodicReviewState = (i & 128) != 0 ? cVar.f176900h : data4;
        Data permissionsSettings = (i & 256) != 0 ? cVar.i : data5;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        Intrinsics.checkNotNullParameter(legalDisclaimerOptional, "legalDisclaimerOptional");
        Intrinsics.checkNotNullParameter(periodicReviewState, "periodicReviewState");
        Intrinsics.checkNotNullParameter(permissionsSettings, "permissionsSettings");
        return new c(user, kyc2, profileType, legalDisclaimerOptional, z4, z6, aVar2, periodicReviewState, permissionsSettings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f176896a, cVar.f176896a) && Intrinsics.f(this.f176897b, cVar.f176897b) && Intrinsics.f(this.f176898c, cVar.f176898c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.f176899g == cVar.f176899g && Intrinsics.f(this.f176900h, cVar.f176900h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(r6.b.f(this.d, kii.e.c(this.f176898c, kii.e.c(this.f176897b, this.f176896a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
        mn2.a aVar = this.f176899g;
        return this.i.hashCode() + kii.e.c(this.f176900h, (iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    public c(Data user, Data kyc2, Data profileType, od0.i legalDisclaimerOptional, boolean z, boolean z3, mn2.a aVar, Data periodicReviewState, Data permissionsSettings) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(profileType, "profileType");
        Intrinsics.checkNotNullParameter(legalDisclaimerOptional, "legalDisclaimerOptional");
        Intrinsics.checkNotNullParameter(periodicReviewState, "periodicReviewState");
        Intrinsics.checkNotNullParameter(permissionsSettings, "permissionsSettings");
        this.f176896a = user;
        this.f176897b = kyc2;
        this.f176898c = profileType;
        this.d = legalDisclaimerOptional;
        this.e = z;
        this.f = z3;
        this.f176899g = aVar;
        this.f176900h = periodicReviewState;
        this.i = permissionsSettings;
    }

    public /* synthetic */ c(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this(data, data2, data3, od0.i.f224256b, false, false, null, new Data(qa.a.f243919a, null, false, 6, null), new Data(null, null, true, 3, null));
    }
}
