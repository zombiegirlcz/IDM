package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor.Phone f169585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169586c;
    public final String d;
    public final ApmContact.SimpleState e;

    public b(String str, ApmDescriptor.Phone descriptor, String str2, String str3, ApmContact.SimpleState state) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169584a = str;
        this.f169585b = descriptor;
        this.f169586c = str2;
        this.d = str3;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f169584a, bVar.f169584a) && Intrinsics.f(this.f169585b, bVar.f169585b) && Intrinsics.f(this.f169586c, bVar.f169586c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        String str = this.f169584a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f169585b.f62110b);
        String str2 = this.f169586c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
