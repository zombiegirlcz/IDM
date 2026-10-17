package u7l;

import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import efm.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qza.q;
import v7l.e;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7l.b f277980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f277981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final moj.b f277982c;
    public final LinkedHashMap d;
    public final EventAppearance e;

    public c(Set appearanceProviders, q7l.b defaultAppearanceProvider, e repository, moj.b userProvider) {
        Intrinsics.checkNotNullParameter(appearanceProviders, "appearanceProviders");
        Intrinsics.checkNotNullParameter(defaultAppearanceProvider, "defaultAppearanceProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userProvider, "userProvider");
        this.f277980a = defaultAppearanceProvider;
        this.f277981b = repository;
        this.f277982c = userProvider;
        ArrayList arrayListE0 = d0.E0(appearanceProviders, u.c(defaultAppearanceProvider));
        int iB = q0.b(w.t(arrayListE0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : arrayListE0) {
            linkedHashMap.put(((q7l.b) obj2).b(), obj2);
        }
        this.d = linkedHashMap;
        this.e = new EventAppearance(this.f277980a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.shared.feature.event_appearance.api.models.EventAppearance r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u7l.b
            if (r0 == 0) goto L13
            r0 = r7
            u7l.b r0 = (u7l.b) r0
            int r1 = r0.f277979x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277979x = r1
            goto L18
        L13:
            u7l.b r0 = new u7l.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f277979x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.shared.feature.event_appearance.api.models.EventAppearance r6 = r0.u
            yhm.o.b(r7)
            goto L52
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            efm.r r7 = r5.b()
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f277979x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            com.revolut.shared.feature.event_appearance.api.models.EventAppearance r7 = (com.revolut.shared.feature.event_appearance.api.models.EventAppearance) r7
            java.lang.String r7 = r7.f104713a
            java.lang.String r6 = r6.f104713a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u7l.c.a(com.revolut.shared.feature.event_appearance.api.models.EventAppearance, gim.c):java.lang.Object");
    }

    public final r b() {
        r map = nim.a.w(this.f277981b.f286685c.f(Unit.f186387a, false), new q(19)).map(new pv9.b(new a(this, 0), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
