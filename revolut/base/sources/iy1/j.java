package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169613c;
    public final String d;
    public final ApmContact.SimpleState e;
    public final boolean f;

    public j(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169611a = str;
        this.f169612b = descriptor;
        this.f169613c = str2;
        this.d = str3;
        this.e = state;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f169611a, jVar.f169611a) && Intrinsics.f(this.f169612b, jVar.f169612b) && Intrinsics.f(this.f169613c, jVar.f169613c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f;
    }

    public final int hashCode() {
        String str = this.f169611a;
        int iHashCode = (this.f169612b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169613c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
