package ps9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f239437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f239438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f239439c;

    public p(PaymentGroup group, Data contentData, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f239437a = group;
        this.f239438b = contentData;
        this.f239439c = z;
    }

    public static p a(p pVar, PaymentGroup group, Data contentData, boolean z, int i) {
        if ((i & 1) != 0) {
            group = pVar.f239437a;
        }
        if ((i & 2) != 0) {
            contentData = pVar.f239438b;
        }
        if ((i & 4) != 0) {
            z = pVar.f239439c;
        }
        pVar.getClass();
        pVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new p(group, contentData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f239437a, pVar.f239437a) && Intrinsics.f(this.f239438b, pVar.f239438b) && this.f239439c == pVar.f239439c;
    }

    public final int hashCode() {
        return j6.a.c(kii.e.c(this.f239438b, this.f239437a.hashCode() * 31, 31), 31, this.f239439c);
    }
}
