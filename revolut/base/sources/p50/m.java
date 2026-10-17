package p50;

import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p50.l;
import v30.c0;
import v30.h0;
import y20.b1;
import y20.f1;
import y20.g1;
import y20.h1;
import y20.i1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r30.a f232998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r30.a messagesInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(messagesInteractor, "messagesInteractor");
        this.f232998g = messagesInteractor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        i1 key = (i1) obj2;
        h0 h0Var = (h0) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return h0Var == null || h0Var.f285778b;
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        k kVar = (k) obj2;
        if (kVar instanceof j) {
            l.a aVar = l.Companion;
            c0 feedType = ((j) kVar).f232997a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(feedType, "feedType");
            return new h1(null, feedType);
        }
        if (!(kVar instanceof i)) {
            if (kVar == null) {
                throw new IllegalStateException("Payload must not be null!");
            }
            throw new NoWhenBranchMatchedException();
        }
        l.a aVar2 = l.Companion;
        UUID feedId = ((i) kVar).f232996a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        return new g1(null, feedId);
    }

    @Override // tzl.l
    public final Object d(LinkedHashSet existingKeys) {
        Object pageDescriptor = h.f232995a;
        Intrinsics.checkNotNullParameter(pageDescriptor, "pageDescriptor");
        Intrinsics.checkNotNullParameter(existingKeys, "existingKeys");
        if (pageDescriptor.equals(pageDescriptor)) {
            return (i1) d0.c0(existingKeys);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // tzl.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            y20.i1 r5 = (y20.i1) r5
            v30.h0 r6 = (v30.h0) r6
            java.lang.String r0 = "currentKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 == 0) goto L3b
            java.util.List r6 = r6.f285777a
            if (r6 == 0) goto L3b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            p4c.u r0 = new p4c.u
            r1 = 26
            r0.<init>(r1)
            p4c.u r1 = new p4c.u
            r2 = 27
            r1.<init>(r2)
            r2 = 2
            kotlin.jvm.functions.Function1[] r2 = new kotlin.jvm.functions.Function1[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            afa.a r0 = cim.b.a(r2)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = zhm.d0.z0(r6, r0)
            v20.n r6 = (v20.n) r6
            if (r6 == 0) goto L3b
            java.util.UUID r6 = r6.getServerId()
            goto L3c
        L3b:
            r6 = 0
        L3c:
            boolean r0 = r5 instanceof y20.g1
            if (r0 == 0) goto L4a
            y20.g1 r0 = new y20.g1
            y20.g1 r5 = (y20.g1) r5
            java.util.UUID r5 = r5.f310499b
            r0.<init>(r6, r5)
            return r0
        L4a:
            boolean r0 = r5 instanceof y20.h1
            if (r0 == 0) goto L58
            y20.h1 r0 = new y20.h1
            y20.h1 r5 = (y20.h1) r5
            v30.c0 r5 = r5.f310503b
            r0.<init>(r6, r5)
            return r0
        L58:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.m.e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        i1 params = (i1) obj2;
        Intrinsics.checkNotNullParameter(params, "key");
        r30.a aVar = this.f232998g;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b1 b1Var = (b1) aVar.f251138a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(b1Var.f310462n.a(b1Var.f310470y.b(new f1(params), loadingStrategy)), new qtb.c(params, 26));
    }
}
