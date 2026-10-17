package oc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224022b;

    public b(String formId, String itemId) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f224021a = formId;
        this.f224022b = itemId;
    }

    public final String a() {
        return j6.a.s("CardsParams(formId=", this.f224021a, ", itemId=", this.f224022b, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f224021a, bVar.f224021a) && Intrinsics.f(this.f224022b, bVar.f224022b);
    }

    public final int hashCode() {
        return this.f224022b.hashCode() + (this.f224021a.hashCode() * 31);
    }
}
