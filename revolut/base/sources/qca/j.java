package qca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f244675a;

    public j(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f244675a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f244675a, ((j) obj2).f244675a);
    }

    public final int hashCode() {
        return this.f244675a.hashCode();
    }
}
