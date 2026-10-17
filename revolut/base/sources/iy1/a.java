package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169583c;
    public final String d;
    public final ApmContact.SimpleState e;
    public final boolean f;

    public a(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169581a = str;
        this.f169582b = descriptor;
        this.f169583c = str2;
        this.d = str3;
        this.e = state;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f169581a, aVar.f169581a) && Intrinsics.f(this.f169582b, aVar.f169582b) && Intrinsics.f(this.f169583c, aVar.f169583c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        String str = this.f169581a;
        int iHashCode = (this.f169582b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169583c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
