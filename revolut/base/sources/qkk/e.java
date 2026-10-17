package qkk;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f247017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f247018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f247019c;

    public e(l contact, hha.d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f247017a = contact;
        this.f247018b = pricingPlan;
        this.f247019c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f247017a, eVar.f247017a) && Intrinsics.f(this.f247018b, eVar.f247018b) && this.f247019c == eVar.f247019c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247019c) + ((this.f247018b.hashCode() + (this.f247017a.hashCode() * 31)) * 31);
    }
}
