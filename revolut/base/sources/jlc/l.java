package jlc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175691b;

    public l(String templateId, List disclaimerScopes) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(disclaimerScopes, "disclaimerScopes");
        this.f175690a = templateId;
        this.f175691b = disclaimerScopes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f175690a, lVar.f175690a) && Intrinsics.f(this.f175691b, lVar.f175691b);
    }

    public final int hashCode() {
        return this.f175691b.hashCode() + (this.f175690a.hashCode() * 31);
    }
}
