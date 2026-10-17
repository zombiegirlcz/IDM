package c13;

import c93.j;
import e93.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f20362c;
    public final String d;
    public final f e;

    public a(ArrayList cardDesignGroups, String groupId, j customisationFee, String str, f cardDesign) {
        Intrinsics.checkNotNullParameter(cardDesignGroups, "cardDesignGroups");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(customisationFee, "customisationFee");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f20360a = cardDesignGroups;
        this.f20361b = groupId;
        this.f20362c = customisationFee;
        this.d = str;
        this.e = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f20360a.equals(aVar.f20360a) && Intrinsics.f(this.f20361b, aVar.f20361b) && Intrinsics.f(this.f20362c, aVar.f20362c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f20362c.hashCode() + p.a.c(this.f20360a.hashCode() * 31, 31, this.f20361b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
