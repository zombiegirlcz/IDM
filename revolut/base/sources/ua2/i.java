package ua2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f278524a;

    public i(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f278524a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f278524a, ((i) obj2).f278524a);
    }

    public final int hashCode() {
        return this.f278524a.hashCode();
    }
}
