package p50;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.Instant;
import p4c.u;
import p50.e;
import v20.n;
import v30.c0;
import v30.h0;
import y20.b1;
import y20.q;
import y20.r;
import y20.s;
import y20.t;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r30.a f232994g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r30.a messagesInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(messagesInteractor, "messagesInteractor");
        this.f232994g = messagesInteractor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        t key = (t) obj2;
        h0 h0Var = (h0) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return h0Var == null || h0Var.f285778b;
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        d dVar = (d) obj2;
        if (dVar instanceof c) {
            e.a aVar = e.Companion;
            c cVar = (c) dVar;
            c0 feedType = cVar.f232992a;
            UUID uuid = cVar.f232993b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(feedType, "feedType");
            return new s(uuid, feedType);
        }
        if (dVar instanceof a) {
            e.a aVar2 = e.Companion;
            a aVar3 = (a) dVar;
            UUID ticketId = aVar3.f232988a;
            Instant instant = aVar3.f232989b;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            return new q(ticketId, instant);
        }
        if (!(dVar instanceof b)) {
            if (dVar == null) {
                throw new IllegalStateException("Payload must not be null!");
            }
            throw new NoWhenBranchMatchedException();
        }
        e.a aVar4 = e.Companion;
        b bVar = (b) dVar;
        UUID feedId = bVar.f232990a;
        UUID uuid2 = bVar.f232991b;
        aVar4.getClass();
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        return new r(uuid2, feedId);
    }

    @Override // tzl.l
    public final Object d(LinkedHashSet existingKeys) {
        Object pageDescriptor = h.f232995a;
        Intrinsics.checkNotNullParameter(pageDescriptor, "pageDescriptor");
        Intrinsics.checkNotNullParameter(existingKeys, "existingKeys");
        if (pageDescriptor.equals(pageDescriptor)) {
            return (t) d0.c0(existingKeys);
        }
        return null;
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        List list;
        List list2;
        List list3;
        n nVar;
        t currentKey = (t) obj2;
        h0 h0Var = (h0) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        UUID serverId = null;
        time = null;
        time = null;
        Instant time = null;
        serverId = null;
        serverId = null;
        UUID serverId2 = null;
        serverId = null;
        serverId = null;
        if (currentKey instanceof q) {
            if (h0Var != null && (list3 = h0Var.f285777a) != null && (nVar = (n) d0.z0(list3, new f())) != null) {
                time = nVar.getTime();
            }
            return new q(((q) currentKey).f310535a, time);
        }
        if (currentKey instanceof s) {
            if (h0Var != null && (list2 = h0Var.f285777a) != null) {
                n nVar2 = (n) d0.z0(list2, cim.b.a(new u(22), new u(23)));
                if (nVar2 != null) {
                    serverId2 = nVar2.getServerId();
                }
            }
            return new s(serverId2, ((s) currentKey).f310545b);
        }
        if (!(currentKey instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        if (h0Var != null && (list = h0Var.f285777a) != null) {
            n nVar3 = (n) d0.z0(list, cim.b.a(new u(24), new u(25)));
            if (nVar3 != null) {
                serverId = nVar3.getServerId();
            }
        }
        return new r(serverId, ((r) currentKey).f310540b);
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        t key = (t) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = key instanceof q;
        w4l.i loadingStrategy = w4l.i.f294643c;
        r30.a aVar = this.f232994g;
        if (z) {
            q params = (q) key;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            b1 b1Var = (b1) aVar.f251138a;
            b1Var.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            return nim.a.v(b1Var.f310462n.a(b1Var.v.b(params, loadingStrategy)), new qtb.c(params, 28));
        }
        if (key instanceof s) {
            s params2 = (s) key;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(params2, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            b1 b1Var2 = (b1) aVar.f251138a;
            b1Var2.getClass();
            Intrinsics.checkNotNullParameter(params2, "params");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            return nim.a.v(b1Var2.f310462n.a(b1Var2.f310469x.b(params2, loadingStrategy)), new qtb.c(params2, 29));
        }
        if (!(key instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        r params3 = (r) key;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params3, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b1 b1Var3 = (b1) aVar.f251138a;
        b1Var3.getClass();
        Intrinsics.checkNotNullParameter(params3, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(b1Var3.f310462n.a(b1Var3.f310468w.b(params3, loadingStrategy)), new qtb.c(params3, 27));
    }
}
