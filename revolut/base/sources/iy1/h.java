package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169606c;
    public final String d;
    public final ApmContact.SimpleState e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApmRecipientSettings f169607g;

    public h(String str, ApmDescriptor descriptor, String str2, String str3, ApmContact.SimpleState state, boolean z, ApmRecipientSettings apmRecipientSettings) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169604a = str;
        this.f169605b = descriptor;
        this.f169606c = str2;
        this.d = str3;
        this.e = state;
        this.f = z;
        this.f169607g = apmRecipientSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f169604a, hVar.f169604a) && Intrinsics.f(this.f169605b, hVar.f169605b) && Intrinsics.f(this.f169606c, hVar.f169606c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && Intrinsics.f(this.f169607g, hVar.f169607g);
    }

    public final int hashCode() {
        String str = this.f169604a;
        int iHashCode = (this.f169605b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169606c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iC = j6.a.c((this.e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f);
        ApmRecipientSettings apmRecipientSettings = this.f169607g;
        return iC + (apmRecipientSettings != null ? apmRecipientSettings.hashCode() : 0);
    }
}
