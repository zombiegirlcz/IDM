package noi;

import com.google.common.collect.ImmutableSet;
import com.revolut.tracking.v3.UserInfo;
import ho.b0;
import ho.n;
import ho.u;
import ho.v;
import ho.x;
import ho.y;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f218057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f218058b;

    public k(b0 delegate, ImmutableSet initables) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(initables, "initables");
        this.f218057a = delegate;
        this.f218058b = initables;
    }

    @Override // noi.h
    public final boolean a() {
        return true;
    }

    @Override // noi.h
    public final void b() {
        Iterator it8 = this.f218058b.iterator();
        while (it8.hasNext()) {
            ((e0m.d) it8.next()).init();
        }
    }

    @Override // noi.h
    public final boolean c(ho.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event instanceof n.a;
    }

    @Override // noi.h
    public final void d(y info) {
        Intrinsics.checkNotNullParameter(info, "info");
        b0 b0Var = this.f218057a;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        uo.h hVar = (uo.h) b0Var.f154145b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        if (info instanceof x) {
            hVar.k = null;
            hVar.f281481l = null;
            return;
        }
        if (info instanceof u) {
            UserInfo.a aVarNewBuilder = hVar.f281481l;
            if (aVarNewBuilder == null) {
                aVarNewBuilder = UserInfo.newBuilder();
            }
            u uVar = (u) info;
            String str = uVar.f154196a;
            aVarNewBuilder.c();
            ((UserInfo) aVarNewBuilder.f49761b).setIdentityId(str);
            hVar.f281481l = aVarNewBuilder;
            hVar.k = uVar.f154196a;
            return;
        }
        if (!(info instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        UserInfo.a aVarNewBuilder2 = hVar.f281481l;
        if (aVarNewBuilder2 == null) {
            aVarNewBuilder2 = UserInfo.newBuilder();
        }
        v vVar = (v) info;
        String str2 = vVar.f154197a;
        if (str2 != null) {
            aVarNewBuilder2.c();
            ((UserInfo) aVarNewBuilder2.f49761b).setIdentityId(str2);
        }
        String str3 = vVar.f154198b;
        aVarNewBuilder2.c();
        ((UserInfo) aVarNewBuilder2.f49761b).setRegisteredIdentityId(str3);
        hVar.f281481l = aVarNewBuilder2;
        hVar.k = vVar.f154198b;
    }

    @Override // noi.h
    public final void e(boolean z) {
    }

    @Override // noi.h
    public final void f(ho.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f218057a.e2(event);
    }
}
