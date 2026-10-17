package bs9;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.n f18124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f18126c;
    public final String d;

    public p(do3.n user, List chatItems, Map reactionsMap, String inviteLink) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(chatItems, "chatItems");
        Intrinsics.checkNotNullParameter(reactionsMap, "reactionsMap");
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        this.f18124a = user;
        this.f18125b = chatItems;
        this.f18126c = reactionsMap;
        this.d = inviteLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f18124a, pVar.f18124a) && Intrinsics.f(this.f18125b, pVar.f18125b) && Intrinsics.f(this.f18126c, pVar.f18126c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.d(this.f18124a.hashCode() * 31, 31, this.f18125b), 31, this.f18126c);
    }
}
