package jyk;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements oxk.d {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f179482a;

    public i(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f179482a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "spousal-consent");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String strE = cVar.e(3);
        int iHashCode = strE.hashCode();
        if (iHashCode != -308949343) {
            if (iHashCode != 270298374) {
                if (iHashCode == 568196142 && strE.equals("declined")) {
                    ufm.c cVar2 = new ufm.c(new a68.f(this, 9), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                    Object objE = cVar2.e();
                    Intrinsics.checkNotNullExpressionValue(objE, "blockingGet(...)");
                    return new q06.h(new BridgeDestination((NaviCommand) objE), null);
                }
            } else if (strE.equals("chose-spouse")) {
                ufm.c cVar3 = new ufm.c(new a68.f(this, 8), 2);
                Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
                Object objE2 = cVar3.e();
                Intrinsics.checkNotNullExpressionValue(objE2, "blockingGet(...)");
                return new q06.h(new BridgeDestination((NaviCommand) objE2), null);
            }
        } else if (strE.equals("provide")) {
            ufm.c cVar4 = new ufm.c(new fg8.b(this, cVar, 1), 2);
            Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
            Object objE3 = cVar4.e();
            Intrinsics.checkNotNullExpressionValue(objE3, "blockingGet(...)");
            return new q06.h(new BridgeDestination((NaviCommand) objE3), null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r6 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            r6 = 3
            java.lang.String r0 = r5.e(r6)
            int r1 = r0.hashCode()
            r2 = -308949343(0xffffffffed95cea1, float:-5.795383E27)
            java.lang.String r3 = "fromCallable(...)"
            if (r1 == r2) goto L54
            r2 = 270298374(0x101c6d06, float:3.0849564E-29)
            if (r1 == r2) goto L3a
            r2 = 568196142(0x21ddfc2e, float:1.5042294E-18)
            if (r1 == r2) goto L20
            goto L5c
        L20:
            java.lang.String r1 = "declined"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L5c
        L29:
            a68.f r5 = new a68.f
            r6 = 9
            r5.<init>(r4, r6)
            ufm.c r6 = new ufm.c
            r0 = 2
            r6.<init>(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            goto L85
        L3a:
            java.lang.String r1 = "chose-spouse"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L5c
        L43:
            a68.f r5 = new a68.f
            r6 = 8
            r5.<init>(r4, r6)
            ufm.c r6 = new ufm.c
            r0 = 2
            r6.<init>(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            goto L85
        L54:
            java.lang.String r1 = "provide"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L75
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.e(r6)
            java.lang.String r6 = "unsupported path: "
            java.lang.String r5 = j6.a.q(r6, r5)
            r0.<init>(r5)
            ufm.c r6 = efm.d0.l(r0)
            java.lang.String r5 = "error(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            goto L85
        L75:
            fg8.b r6 = new fg8.b
            r0 = 1
            r6.<init>(r4, r5, r0)
            ufm.c r5 = new ufm.c
            r0 = 2
            r5.<init>(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r6 = r5
        L85:
            jud.d r5 = new jud.d
            r0 = 15
            r5.<init>(r4, r0)
            jy2.a r0 = new jy2.a
            r1 = 9
            r0.<init>(r5, r1)
            ufm.i r5 = new ufm.i
            r1 = 0
            r5.<init>(r6, r0, r1)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            ufm.b r6 = efm.d0.m(r6)
            java.lang.String r0 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            ufm.i r5 = ue0.e.C(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.i.f(jf0.c, boolean):efm.d0");
    }
}
