package uxe;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f283996b;

    public m(Data consentDetailsData, Set unfoldedSections) {
        Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
        Intrinsics.checkNotNullParameter(unfoldedSections, "unfoldedSections");
        this.f283995a = consentDetailsData;
        this.f283996b = unfoldedSections;
    }

    public static m a(m mVar, Data consentDetailsData, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            consentDetailsData = mVar.f283995a;
        }
        Set unfoldedSections = linkedHashSet;
        if ((i & 2) != 0) {
            unfoldedSections = mVar.f283996b;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
        Intrinsics.checkNotNullParameter(unfoldedSections, "unfoldedSections");
        return new m(consentDetailsData, unfoldedSections);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f283995a, mVar.f283995a) && Intrinsics.f(this.f283996b, mVar.f283996b);
    }

    public final int hashCode() {
        return this.f283996b.hashCode() + (this.f283995a.hashCode() * 31);
    }
}
