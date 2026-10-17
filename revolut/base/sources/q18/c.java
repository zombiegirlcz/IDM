package q18;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f241403a;

    public c(b footerMapper) {
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f241403a = footerMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model, still in use, count: 3, list:
          (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) from 0x0122: MOVE (r26v0 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) = (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model)
          (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) from 0x0044: MOVE (r26v2 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) = (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model)
          (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) from 0x00cb: MOVE (r26v4 com.revolut.core.ui_kit.delegates.NewsDelegate$Model) = (r0v1 com.revolut.core.ui_kit.delegates.NewsDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.revolut.core.ui_kit.delegates.NewsDelegate.Model a(x08.f r29) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q18.c.a(x08.f):com.revolut.core.ui_kit.delegates.NewsDelegate$Model");
    }
}
