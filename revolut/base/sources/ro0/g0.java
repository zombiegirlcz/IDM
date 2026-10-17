package ro0;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 {
    private g0() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final boolean a(Context context) {
        j70.d dVarA;
        Intrinsics.checkNotNullParameter(context, "context");
        if (((Boolean) jo0.m.d.getValue()).booleanValue()) {
            return false;
        }
        j70.a aVarA = wr0.a.a(context);
        if (aVarA == null || (dVarA = ((j70.c) aVarA).a()) == null) {
            dVarA = j70.d.UNDEFINED;
        }
        return Build.VERSION.SDK_INT >= 33 && dVarA.compareTo(j70.d.HIGH) >= 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(android.content.Context r2, ro0.e0 r3) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = ro0.f0.f255748a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 0
            r1 = 1
            switch(r3) {
                case 1: goto L53;
                case 2: goto L46;
                case 3: goto L44;
                case 4: goto L37;
                case 5: goto L2a;
                case 6: goto L1d;
                default: goto L17;
            }
        L17:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L1d:
            java.lang.Object r3 = jo0.g.D
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L6b
        L2a:
            java.lang.Object r3 = jo0.g.i
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L6b
        L37:
            java.lang.Object r3 = jo0.g.f176827h
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L6b
        L44:
            r3 = r1
            goto L6b
        L46:
            java.lang.Object r3 = jo0.g.H
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L6b
        L53:
            java.lang.Object r3 = jo0.g.f176826g
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6a
            int r3 = com.revolut.core.ui_kit.R$attr.internal_readyForProgressiveBlurNavigation
            boolean r3 = kli.a.r(r3, r2)
            if (r3 == 0) goto L6a
            goto L44
        L6a:
            r3 = r0
        L6b:
            if (r3 == 0) goto L74
            boolean r2 = a(r2)
            if (r2 == 0) goto L74
            return r1
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ro0.g0.b(android.content.Context, ro0.e0):boolean");
    }
}
