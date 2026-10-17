package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169589c;
    public final String d;
    public final ApmContact.SimpleState e;
    public final String f;

    public c(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state, String str4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169587a = str;
        this.f169588b = descriptor;
        this.f169589c = str2;
        this.d = str3;
        this.e = state;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f169587a, cVar.f169587a) && Intrinsics.f(this.f169588b, cVar.f169588b) && Intrinsics.f(this.f169589c, cVar.f169589c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        String str = this.f169587a;
        int iHashCode = (this.f169588b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169589c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
