package jb8;

import jxa.l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f172606b;

    public /* synthetic */ a(int i, String str, Object obj2) {
        this.f172605a = i;
        this.f172606b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 kqa.a, still in use, count: 2, list:
          (r3v24 kqa.a) from 0x0416: MOVE (r19v5 kqa.a) = (r3v24 kqa.a)
          (r3v24 kqa.a) from 0x0394: MOVE (r19v9 kqa.a) = (r3v24 kqa.a)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb8.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(String str, int i) {
        this.f172605a = i;
        this.f172606b = str;
    }

    public /* synthetic */ a(String str, l lVar) {
        this.f172605a = 14;
        this.f172606b = str;
    }
}
