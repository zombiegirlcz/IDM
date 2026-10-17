package oc0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f224033c;
    public final long d;
    public final String e;
    public final String f;

    public h(String formId, String itemId, Map queries, long j2, String str, String str2) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(queries, "queries");
        this.f224031a = formId;
        this.f224032b = itemId;
        this.f224033c = queries;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final String a() {
        StringBuilder sbM = v0.a.m("Params(formId=", this.f224031a, ", itemId=", this.f224032b, ", queries=");
        sbM.append(this.f224033c);
        sbM.append(", createdBefore=");
        sbM.append(this.d);
        j6.a.D(sbM, ", searchQuery=", this.e, ", mode=", this.f);
        sbM.append(")");
        return sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f224031a, hVar.f224031a) && Intrinsics.f(this.f224032b, hVar.f224032b) && Intrinsics.f(this.f224033c, hVar.f224033c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.e(p.a.c(this.f224031a.hashCode() * 31, 31, this.f224032b), 31, this.f224033c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
