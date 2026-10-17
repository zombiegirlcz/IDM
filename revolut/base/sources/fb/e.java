package fb;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import til.r;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f133418w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f133418w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f133418w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r1 != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 1
            fb.f r4 = r12.f133418w
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r13)
            goto L6a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            yhm.o.b(r13)
            goto L58
        L1e:
            yhm.o.b(r13)
            til.r r13 = r12.v
            til.q r1 = til.q.f271586a
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r1)
            if (r13 == 0) goto L6a
            rp0.g1 r13 = r4.f133422s
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a r5 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r1 = 2132010005(0x7f13e415, float:1.9658078E38)
            r6 = 14
            r8 = 0
            r7.<init>(r1, r8, r8, r6)
            r10 = 0
            r11 = 60
            java.lang.String r6 = "DIALOG_ID_FLOW_FINISHED_SUCCESSFUL"
            r9 = 0
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r1 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.Companion.f(r5, r6, r7, r8, r9, r10, r11)
            rp0.k1 r13 = (rp0.k1) r13
            r13.d(r1)
            ang.f r13 = r4.f133423t
            pfm.h r13 = r13.i()
            r12.u = r3
            java.lang.Object r13 = nim.a.a(r13, r12)
            if (r13 != r0) goto L58
            goto L69
        L58:
            bb.b r13 = r4.f133419p
            r12.u = r2
            x4l.c r13 = r13.e
            kotlin.Unit r1 = kotlin.Unit.f186387a
            java.lang.Object r13 = r13.d(r1, r3, r12)
            if (r13 != r0) goto L67
            r1 = r13
        L67:
            if (r1 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
