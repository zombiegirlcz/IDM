package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169592c;
    public final String d;
    public final ApmContact.SimpleState e;
    public final String f;

    public d(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state, String str4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169590a = str;
        this.f169591b = descriptor;
        this.f169592c = str2;
        this.d = str3;
        this.e = state;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f169590a, dVar.f169590a) && Intrinsics.f(this.f169591b, dVar.f169591b) && Intrinsics.f(this.f169592c, dVar.f169592c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        String str = this.f169590a;
        int iHashCode = (this.f169591b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169592c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
