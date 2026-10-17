package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169610c;
    public final String d;
    public final ApmContact.SimpleState e;

    public i(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169608a = str;
        this.f169609b = descriptor;
        this.f169610c = str2;
        this.d = str3;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f169608a, iVar.f169608a) && Intrinsics.f(this.f169609b, iVar.f169609b) && Intrinsics.f(this.f169610c, iVar.f169610c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        String str = this.f169608a;
        int iHashCode = (this.f169609b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169610c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
