package bt9;

import bn4.y;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.p {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.a f18459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq9.e f18460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18461c;

    public d(nq9.a billsMapper, nq9.e splitsMapper, a itemizationItemsMapper) {
        Intrinsics.checkNotNullParameter(billsMapper, "billsMapper");
        Intrinsics.checkNotNullParameter(splitsMapper, "splitsMapper");
        Intrinsics.checkNotNullParameter(itemizationItemsMapper, "itemizationItemsMapper");
        this.f18459a = billsMapper;
        this.f18460b = splitsMapper;
        this.f18461c = itemizationItemsMapper;
    }

    public static List b() {
        List listK = zhm.v.k(new pb0("1"), new pb0("2"), new pb0("3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return domainState.f18464b ? new n(b(), null) : (n) iii.c.f(domainState.f18463a, new bs9.e(this, 24), new y(this, 20), new b88.o(this, 17));
    }
}
