package mj6;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f205929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f205930b;

    public g(Data consentDetailsData, Set unfoldedSections) {
        Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
        Intrinsics.checkNotNullParameter(unfoldedSections, "unfoldedSections");
        this.f205929a = consentDetailsData;
        this.f205930b = unfoldedSections;
    }

    public static g a(g gVar, Data consentDetailsData, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            consentDetailsData = gVar.f205929a;
        }
        Set unfoldedSections = linkedHashSet;
        if ((i & 2) != 0) {
            unfoldedSections = gVar.f205930b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(consentDetailsData, "consentDetailsData");
        Intrinsics.checkNotNullParameter(unfoldedSections, "unfoldedSections");
        return new g(consentDetailsData, unfoldedSections);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205929a, gVar.f205929a) && Intrinsics.f(this.f205930b, gVar.f205930b);
    }

    public final int hashCode() {
        return this.f205930b.hashCode() + (this.f205929a.hashCode() * 31);
    }
}
