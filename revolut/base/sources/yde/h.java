package yde;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.g5;
import java.time.Clock;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f312683a;

    public h(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f312683a = clock;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f312681a;
        g5 g5Var = new g5("DATE_PICKER_LIST_ID", localDate, localDate, false, null, null, LocalDate.now(this.f312683a), null, null, null, 0, 0, 1048440);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new e(u.c(g5Var));
    }
}
