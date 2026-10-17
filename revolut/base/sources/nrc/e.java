package nrc;

import cli.g;
import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements z {
    public final prc.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f218608p;

    public e(n stateMapper, TermsViewerContract$InputData inputData, prc.c termsPrinter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsPrinter, "termsPrinter");
        this.o = termsPrinter;
        this.f218608p = mra.d.b(this, new a(inputData.f85331a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f218608p;
    }
}
