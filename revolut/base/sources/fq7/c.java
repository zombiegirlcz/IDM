package fq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f137199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f137200b;

    public c(Data policyNumber, Data contactGroups) {
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
        this.f137199a = policyNumber;
        this.f137200b = contactGroups;
    }

    public static c a(c cVar, Data policyNumber, Data contactGroups, int i) {
        if ((i & 1) != 0) {
            policyNumber = cVar.f137199a;
        }
        if ((i & 2) != 0) {
            contactGroups = cVar.f137200b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
        return new c(policyNumber, contactGroups);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f137199a, cVar.f137199a) && Intrinsics.f(this.f137200b, cVar.f137200b);
    }

    public final int hashCode() {
        return this.f137200b.hashCode() + (this.f137199a.hashCode() * 31);
    }
}
