package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor.Phone f169594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169595c;
    public final String d;
    public final ApmContact.SimpleState e;

    public e(String str, ApmDescriptor.Phone descriptor, String str2, String str3, ApmContact.SimpleState state) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169593a = str;
        this.f169594b = descriptor;
        this.f169595c = str2;
        this.d = str3;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f169593a, eVar.f169593a) && Intrinsics.f(this.f169594b, eVar.f169594b) && Intrinsics.f(this.f169595c, eVar.f169595c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        String str = this.f169593a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f169594b.f62110b);
        String str2 = this.f169595c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
