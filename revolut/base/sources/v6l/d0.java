package v6l;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f286448b;

    public /* synthetic */ d0(b1 b1Var, int i) {
        this.f286447a = i;
        this.f286448b = b1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp, still in use, count: 3, list:
          (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) from 0x0165: MOVE (r16v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) = (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp)
          (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) from 0x0158: MOVE (r16v2 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) = (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp)
          (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) from 0x014b: MOVE (r16v4 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp) = (r7v0 com.revolut.feature.cards.models.revolutcard.RevolutCardOtp)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.d0.invoke(java.lang.Object):java.lang.Object");
    }
}
