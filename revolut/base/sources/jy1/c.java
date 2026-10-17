package jy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f179303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179304c;
    public final String d;
    public final ApmContact.State e;

    public c(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.State state) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f179302a = str;
        this.f179303b = descriptor;
        this.f179304c = str2;
        this.d = str3;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f179302a, cVar.f179302a) && Intrinsics.f(this.f179303b, cVar.f179303b) && Intrinsics.f(this.f179304c, cVar.f179304c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        String str = this.f179302a;
        int iHashCode = (this.f179303b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f179304c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
