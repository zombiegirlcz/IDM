package u1m;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276509c;
    public final n2m.i d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.trustdockekyc.core.backend.domain.model.d f276510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x2m.f f276511h;
    public final e0 i;

    public x(Context context, String verificationId, String transactionToken, String projectId, n2m.i activityLauncher, String str, List optionsList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(transactionToken, "transactionToken");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        Intrinsics.checkNotNullParameter(optionsList, "optionsList");
        this.f276507a = verificationId;
        this.f276508b = transactionToken;
        this.f276509c = projectId;
        this.d = activityLauncher;
        this.e = str;
        this.f = optionsList;
        b0.Companion.getClass();
        this.i = new e0(context, new w1m.h(projectId), new w1m.l(transactionToken), str);
    }

    public final b0 a() {
        x2m.f fVar = this.f276511h;
        if (fVar == null) {
            Intrinsics.r("settings");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f) {
            if (obj2 instanceof i3m.a) {
                arrayList.add(obj2);
            }
        }
        q qVar = new q(this.f276508b, this.e, this.f276509c, fVar, arrayList);
        com.trustdockekyc.core.backend.domain.model.d dVar = this.f276510g;
        if (dVar == null) {
            Intrinsics.r("selectedPackage");
            throw null;
        }
        return new b0(this.f276507a, dVar, this.i, qVar, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u1m.v
            if (r0 == 0) goto L13
            r0 = r6
            u1m.v r0 = (u1m.v) r0
            int r1 = r0.f276504x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276504x = r1
            goto L18
        L13:
            u1m.v r0 = new u1m.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276504x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u1m.x r5 = r0.u
            yhm.o.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            u1m.e0 r6 = r4.i
            kotlin.Lazy r6 = r6.k
            java.lang.Object r6 = r6.getValue()
            a2m.d r6 = (a2m.d) r6
            r0.u = r4
            r0.f276504x = r3
            g2m.e r6 = r6.f945a
            m2m.m r6 = (m2m.m) r6
            java.io.Serializable r6 = r6.i(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            com.trustdockekyc.core.backend.domain.model.d r6 = (com.trustdockekyc.core.backend.domain.model.d) r6
            r5.f276510g = r6
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1m.x.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u1m.w
            if (r0 == 0) goto L13
            r0 = r5
            u1m.w r0 = (u1m.w) r0
            int r1 = r0.f276506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276506x = r1
            goto L18
        L13:
            u1m.w r0 = new u1m.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276506x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u1m.x r0 = r0.u
            yhm.o.b(r5)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            u1m.e0 r5 = r4.i
            kotlin.Lazy r5 = r5.f276462g
            java.lang.Object r5 = r5.getValue()
            a2m.b r5 = (a2m.b) r5
            r0.u = r4
            r0.f276506x = r3
            g2m.e r5 = r5.f943a
            m2m.m r5 = (m2m.m) r5
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            x2m.f r5 = (x2m.f) r5
            r0.f276511h = r5
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1m.x.c(gim.c):java.lang.Object");
    }
}
