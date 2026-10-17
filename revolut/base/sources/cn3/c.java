package cn3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25345b;

    public c(List selectedContacts, boolean z) {
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        this.f25344a = selectedContacts;
        this.f25345b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f25344a, cVar.f25344a) && this.f25345b == cVar.f25345b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25345b) + (this.f25344a.hashCode() * 31);
    }
}
