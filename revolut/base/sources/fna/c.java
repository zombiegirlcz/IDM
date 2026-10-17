package fna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xzg.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f136563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uib.a f136564c;
    public final List d;
    public final r0 e;
    public final od0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od0.i f136565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f136566h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f136567j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f136568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f136569m;

    public c(String str, List savingsDocumentTypes, uib.a savingsFeatureConfig, List statementAvailability, r0 wealthAccounts, od0.i userResidenceCountry, od0.i legalDisclaimer, boolean z, boolean z3, boolean z4, boolean z6, List teenProfiles, List insuranceDocumentItems) {
        Intrinsics.checkNotNullParameter(savingsDocumentTypes, "savingsDocumentTypes");
        Intrinsics.checkNotNullParameter(savingsFeatureConfig, "savingsFeatureConfig");
        Intrinsics.checkNotNullParameter(statementAvailability, "statementAvailability");
        Intrinsics.checkNotNullParameter(wealthAccounts, "wealthAccounts");
        Intrinsics.checkNotNullParameter(userResidenceCountry, "userResidenceCountry");
        Intrinsics.checkNotNullParameter(legalDisclaimer, "legalDisclaimer");
        Intrinsics.checkNotNullParameter(teenProfiles, "teenProfiles");
        Intrinsics.checkNotNullParameter(insuranceDocumentItems, "insuranceDocumentItems");
        this.f136562a = str;
        this.f136563b = savingsDocumentTypes;
        this.f136564c = savingsFeatureConfig;
        this.d = statementAvailability;
        this.e = wealthAccounts;
        this.f = userResidenceCountry;
        this.f136565g = legalDisclaimer;
        this.f136566h = z;
        this.i = z3;
        this.f136567j = z4;
        this.k = z6;
        this.f136568l = teenProfiles;
        this.f136569m = insuranceDocumentItems;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fna.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fna.c r5 = (fna.c) r5
            java.lang.String r1 = r5.f136562a
            java.lang.String r3 = r4.f136562a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f136563b
            java.util.List r3 = r5.f136563b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            uib.a r1 = r4.f136564c
            uib.a r3 = r5.f136564c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            xzg.r0 r1 = r4.e
            xzg.r0 r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            od0.i r1 = r4.f
            od0.i r3 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            od0.i r1 = r4.f136565g
            od0.i r3 = r5.f136565g
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            boolean r1 = r4.f136566h
            boolean r3 = r5.f136566h
            if (r1 == r3) goto L6b
            return r2
        L6b:
            boolean r1 = r4.i
            boolean r3 = r5.i
            if (r1 == r3) goto L72
            return r2
        L72:
            boolean r1 = r4.f136567j
            boolean r3 = r5.f136567j
            if (r1 == r3) goto L79
            return r2
        L79:
            boolean r1 = r4.k
            boolean r3 = r5.k
            if (r1 == r3) goto L80
            return r2
        L80:
            java.util.List r1 = r4.f136568l
            java.util.List r3 = r5.f136568l
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L8b
            return r2
        L8b:
            java.util.List r1 = r4.f136569m
            java.util.List r5 = r5.f136569m
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L96
            return r2
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fna.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f136562a;
        return this.f136569m.hashCode() + p.a.d(j6.a.c(j6.a.c(j6.a.c(j6.a.c(r6.b.f(this.f136565g, r6.b.f(this.f, (this.e.hashCode() + p.a.d((this.f136564c.hashCode() + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f136563b)) * 31, 31, this.d)) * 31, 31), 31), 31, this.f136566h), 31, this.i), 31, this.f136567j), 31, this.k), 31, this.f136568l);
    }
}
