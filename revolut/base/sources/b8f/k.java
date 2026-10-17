package b8f;

import com.google.crypto.tink.shaded.protobuf.t1;
import ip0.qh0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13237a;

    public k() {
        Intrinsics.checkNotNullParameter("portfolio_reveal_card", "listId");
        this.f13237a = zhm.u.c(new qh0());
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j(!domainState.f13233c ? this.f13237a : (List) iii.c.f(t1.t(domainState.f13231a, domainState.f13232b), new b4b.z(this, 26), new b6d.a(17), new b88.o(this, 1)));
    }
}
