package qwd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();
    public static final List f = zhm.v.k(10, 25, 50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f249882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f249883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zwd.b f249884c;
    public final gte.a d;
    public final wwd.d e;

    public x(w80.b amountFormatter, qd0.b languageProvider, zwd.b amountErrorMapperProvider, gte.a featureToggleInteractor, wwd.d tiersRateItemMapper, uwd.j sourcePocketTitleMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(amountErrorMapperProvider, "amountErrorMapperProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(sourcePocketTitleMapper, "sourcePocketTitleMapper");
        this.f249882a = amountFormatter;
        this.f249883b = languageProvider;
        this.f249884c = amountErrorMapperProvider;
        this.d = featureToggleInteractor;
        this.e = tiersRateItemMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v0 qwd.n, still in use, count: 3, list:
          (r9v0 qwd.n) from 0x0082: MOVE (r29v0 qwd.n) = (r9v0 qwd.n)
          (r9v0 qwd.n) from 0x00a5: MOVE (r29v2 qwd.n) = (r9v0 qwd.n)
          (r9v0 qwd.n) from 0x005b: MOVE (r29v4 qwd.n) = (r9v0 qwd.n)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r55) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qwd.x.c(cli.j):cli.o");
    }
}
