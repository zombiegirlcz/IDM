package vr9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vr9.b;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends b.AbstractC1618b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qq9.d f291518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f291519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f291520c;

    public c(qq9.d method, PaymentGroup group, List members) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f291518a = method;
        this.f291519b = group;
        this.f291520c = members;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f291518a == cVar.f291518a && Intrinsics.f(this.f291519b, cVar.f291519b) && Intrinsics.f(this.f291520c, cVar.f291520c);
    }

    public final int hashCode() {
        return this.f291520c.hashCode() + ((this.f291519b.hashCode() + (this.f291518a.hashCode() * 31)) * 31);
    }
}
