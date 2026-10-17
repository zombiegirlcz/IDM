package lx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f200517a;

    public f(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f200517a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f200517a, ((f) obj2).f200517a);
    }

    public final int hashCode() {
        return this.f200517a.hashCode();
    }
}
