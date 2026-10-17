package xeb;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f304568c;

    public a(List termsToAccept, String str, Map termsMapping) {
        Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
        Intrinsics.checkNotNullParameter(termsMapping, "termsMapping");
        this.f304566a = str;
        this.f304567b = termsToAccept;
        this.f304568c = termsMapping;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304566a, aVar.f304566a) && Intrinsics.f(this.f304567b, aVar.f304567b) && Intrinsics.f(this.f304568c, aVar.f304568c);
    }

    public final int hashCode() {
        String str = this.f304566a;
        return this.f304568c.hashCode() + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f304567b);
    }
}
