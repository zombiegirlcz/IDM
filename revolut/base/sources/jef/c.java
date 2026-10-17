package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinalChecksScreenContract$InputData f173366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173368c;

    public c(e eVar, g gVar, FinalChecksScreenContract$InputData finalChecksScreenContract$InputData) {
        this.f173366a = finalChecksScreenContract$InputData;
        int i = 4;
        this.f173367b = e4m.b.b(new jdi.i(gVar, this, 1, i));
        this.f173368c = e4m.b.b(new jdi.i(gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
