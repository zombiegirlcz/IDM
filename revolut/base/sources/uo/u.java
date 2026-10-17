package uo;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import no.e1;

/* JADX INFO: loaded from: classes17.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo0.a f281510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f281511b;

    public u(lo0.a resourceIdParser, d1 viewAdapterDetailsFinder) {
        Intrinsics.checkNotNullParameter(resourceIdParser, "resourceIdParser");
        Intrinsics.checkNotNullParameter(viewAdapterDetailsFinder, "viewAdapterDetailsFinder");
        this.f281510a = resourceIdParser;
        this.f281511b = viewAdapterDetailsFinder;
    }

    public static String a(gx0.c cVar) {
        Regex regex = e1.f217762a;
        String name = cVar.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strB0 = kotlin.text.d0.B0(CoreConstants.DOLLAR, name, name);
        return e1.a(kotlin.text.d0.g0(kotlin.text.d0.w0(CoreConstants.DOT, strB0, strB0), "Delegate"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.tracking.v3.WidgetDescription b(uo.c1 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "viewContainerData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            koi.h r0 = r5.f281468b
            int r1 = r5.f281469c
            koi.j r0 = r0.a(r1)
            boolean r1 = r0 instanceof gx0.c
            r2 = 0
            if (r1 == 0) goto L15
            gx0.c r0 = (gx0.c) r0
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 != 0) goto L36
            uo.d1 r0 = r4.f281511b
            androidx.recyclerview.widget.RecyclerView r5 = r5.f281467a
            uo.c1 r5 = r0.a(r5)
            if (r5 != 0) goto L24
        L22:
            r0 = r2
            goto L33
        L24:
            koi.h r0 = r5.f281468b
            int r5 = r5.f281469c
            koi.j r5 = r0.a(r5)
            boolean r0 = r5 instanceof gx0.c
            if (r0 == 0) goto L22
            gx0.c r5 = (gx0.c) r5
            r0 = r5
        L33:
            if (r0 != 0) goto L36
            return r2
        L36:
            py0.d r5 = r0.getF54970q()
            boolean r1 = r5 instanceof py0.c
            r2 = 1
            lo0.a r3 = r4.f281510a
            if (r1 == 0) goto L50
            py0.c r5 = (py0.c) r5
            com.revolut.core.ui_kit.models.Clause r5 = r5.f240642a
            java.lang.String r5 = r3.a(r5, r2)
            if (r5 != 0) goto L67
            java.lang.String r5 = a(r0)
            goto L67
        L50:
            boolean r1 = r5 instanceof py0.b
            if (r1 == 0) goto L63
            py0.b r5 = (py0.b) r5
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r5.f240641a
            java.lang.String r5 = r3.b(r5)
            if (r5 != 0) goto L67
            java.lang.String r5 = a(r0)
            goto L67
        L63:
            java.lang.String r5 = a(r0)
        L67:
            op0.q r0 = r0.getF55161n()
            int[] r1 = uo.t.f281509a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L8d
            r1 = 2
            if (r0 == r1) goto L8a
            r1 = 3
            if (r0 == r1) goto L87
            r1 = 4
            if (r0 != r1) goto L81
            grl.qe r0 = grl.qe.dynamic
            goto L8f
        L81:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L87:
            grl.qe r0 = grl.qe.large
            goto L8f
        L8a:
            grl.qe r0 = grl.qe.medium
            goto L8f
        L8d:
            grl.qe r0 = grl.qe.small
        L8f:
            com.revolut.tracking.v3.WidgetDescription$a r1 = com.revolut.tracking.v3.WidgetDescription.newBuilder()
            r1.c()
            com.google.protobuf.w0 r2 = r1.f49761b
            com.revolut.tracking.v3.WidgetDescription r2 = (com.revolut.tracking.v3.WidgetDescription) r2
            com.revolut.tracking.v3.WidgetDescription.e(r2, r5)
            r1.c()
            com.google.protobuf.w0 r5 = r1.f49761b
            com.revolut.tracking.v3.WidgetDescription r5 = (com.revolut.tracking.v3.WidgetDescription) r5
            com.revolut.tracking.v3.WidgetDescription.f(r5, r0)
            com.google.protobuf.w0 r5 = r1.a()
            com.revolut.tracking.v3.WidgetDescription r5 = (com.revolut.tracking.v3.WidgetDescription) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.u.b(uo.c1):com.revolut.tracking.v3.WidgetDescription");
    }
}
