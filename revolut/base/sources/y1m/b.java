package y1m;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310420c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f310421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f310422h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f310423j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f310424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f310425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f310426n;

    public b(List issuingAuthorities, List commonNames, List externalCharactersInCommonNames, List kanas, List previousNames, List externalCharactersInPreviousNames, List addresses, List externalCharactersInAddresses, List conditions, List externalCharactersInConditions, List cancelConditions, List externalCharactersInCancelConditions, List remarks, List spares) {
        Intrinsics.checkNotNullParameter(issuingAuthorities, "issuingAuthorities");
        Intrinsics.checkNotNullParameter(commonNames, "commonNames");
        Intrinsics.checkNotNullParameter(externalCharactersInCommonNames, "externalCharactersInCommonNames");
        Intrinsics.checkNotNullParameter(kanas, "kanas");
        Intrinsics.checkNotNullParameter(previousNames, "previousNames");
        Intrinsics.checkNotNullParameter(externalCharactersInPreviousNames, "externalCharactersInPreviousNames");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(externalCharactersInAddresses, "externalCharactersInAddresses");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(externalCharactersInConditions, "externalCharactersInConditions");
        Intrinsics.checkNotNullParameter(cancelConditions, "cancelConditions");
        Intrinsics.checkNotNullParameter(externalCharactersInCancelConditions, "externalCharactersInCancelConditions");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(spares, "spares");
        this.f310418a = issuingAuthorities;
        this.f310419b = commonNames;
        this.f310420c = externalCharactersInCommonNames;
        this.d = kanas;
        this.e = previousNames;
        this.f = externalCharactersInPreviousNames;
        this.f310421g = addresses;
        this.f310422h = externalCharactersInAddresses;
        this.i = conditions;
        this.f310423j = externalCharactersInConditions;
        this.k = cancelConditions;
        this.f310424l = externalCharactersInCancelConditions;
        this.f310425m = remarks;
        this.f310426n = spares;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310418a, bVar.f310418a) && Intrinsics.f(this.f310419b, bVar.f310419b) && Intrinsics.f(this.f310420c, bVar.f310420c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f310421g, bVar.f310421g) && Intrinsics.f(this.f310422h, bVar.f310422h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f310423j, bVar.f310423j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f310424l, bVar.f310424l) && Intrinsics.f(this.f310425m, bVar.f310425m) && Intrinsics.f(this.f310426n, bVar.f310426n);
    }

    public final int hashCode() {
        return this.f310426n.hashCode() + e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(e0.a(this.f310418a.hashCode() * 31, this.f310419b), this.f310420c), this.d), this.e), this.f), this.f310421g), this.f310422h), this.i), this.f310423j), this.k), this.f310424l), this.f310425m);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanDriversLicenseRawChangedEntries(issuingAuthorities=");
        sb6.append(this.f310418a);
        sb6.append(", commonNames=");
        sb6.append(this.f310419b);
        sb6.append(", externalCharactersInCommonNames=");
        sb6.append(this.f310420c);
        sb6.append(", kanas=");
        sb6.append(this.d);
        sb6.append(", previousNames=");
        sb6.append(this.e);
        sb6.append(", externalCharactersInPreviousNames=");
        sb6.append(this.f);
        sb6.append(", addresses=");
        sb6.append(this.f310421g);
        sb6.append(", externalCharactersInAddresses=");
        sb6.append(this.f310422h);
        sb6.append(", conditions=");
        sb6.append(this.i);
        sb6.append(", externalCharactersInConditions=");
        sb6.append(this.f310423j);
        sb6.append(", cancelConditions=");
        sb6.append(this.k);
        sb6.append(", externalCharactersInCancelConditions=");
        sb6.append(this.f310424l);
        sb6.append(", remarks=");
        sb6.append(this.f310425m);
        sb6.append(", spares=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f310426n, sb6);
    }
}
