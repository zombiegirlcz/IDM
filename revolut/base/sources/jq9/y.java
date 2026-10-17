package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f177526a;

    public y(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f177526a = contact;
    }

    @Override // jq9.t
    public final String a() {
        return hx7.q.v(this.f177526a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f177526a, ((y) obj2).f177526a);
    }

    public final int hashCode() {
        return this.f177526a.hashCode();
    }
}
