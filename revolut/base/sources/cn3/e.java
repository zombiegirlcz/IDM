package cn3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f25347a;

    public e(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f25347a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f25347a, ((e) obj2).f25347a);
    }

    public final int hashCode() {
        return this.f25347a.hashCode();
    }
}
