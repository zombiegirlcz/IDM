package yea;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 com.revolut.core.ui_kit.models.TextLocalisedClause, still in use, count: 2, list:
          (r14v5 com.revolut.core.ui_kit.models.TextLocalisedClause) from 0x01cf: MOVE (r22v0 com.revolut.core.ui_kit.models.TextLocalisedClause) = (r14v5 com.revolut.core.ui_kit.models.TextLocalisedClause)
          (r14v5 com.revolut.core.ui_kit.models.TextLocalisedClause) from 0x01ca: MOVE (r22v2 com.revolut.core.ui_kit.models.TextLocalisedClause) = (r14v5 com.revolut.core.ui_kit.models.TextLocalisedClause)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yea.l.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj2) {
        super(1, 0, ihm.f.class, obj2, "onNext", "onNext(Ljava/lang/Object;)V");
        this.f = 12;
    }
}
