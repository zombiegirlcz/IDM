package igk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(aii.o r5, igk.i r6, java.lang.String r7, kotlin.jvm.functions.Function0 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof igk.j
            if (r0 == 0) goto L13
            r0 = r9
            igk.j r0 = (igk.j) r0
            int r1 = r0.f161253y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161253y = r1
            goto L18
        L13:
            igk.j r0 = new igk.j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f161252x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161253y
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.functions.Function0 r5 = r0.f161251w
            r8 = r5
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            igk.i r5 = r0.v
            aii.o r6 = r0.u
            yhm.o.b(r9)
            goto L52
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            yhm.o.b(r9)
            r0.u = r5
            r0.v = r6
            r9 = r8
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r0.f161251w = r9
            r0.f161253y = r3
            ajk.b r6 = (ajk.b) r6
            java.lang.Object r9 = r6.b(r7, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r4 = r6
            r6 = r5
            r5 = r4
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7c
            grl.k9 r7 = grl.k9.Premium
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r9 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r9 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r7 = com.google.android.gms.internal.mlkit_vision_face.a.h(r7, r9, r7)
            a3l.b r9 = new a3l.b
            r0 = 5
            r9.<init>(r0, r8)
            ajk.b r5 = (ajk.b) r5
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r5 = r5.a(r7, r9)
            com.revolut.kompot.common.b r7 = new com.revolut.kompot.common.b
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r9 = 4
            r7.<init>(r5, r8, r9)
            knm.b.j(r6, r7)
            goto L7f
        L7c:
            r8.invoke()
        L7f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: igk.k.a(aii.o, igk.i, java.lang.String, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(yji.l lVar, i iVar, String str, Function0 function0, Continuation continuation) {
        Object objA = a(lVar.l1(), iVar, str, function0, continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
