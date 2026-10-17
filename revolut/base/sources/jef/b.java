package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeforeAfterScreenContract$InputData f173363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173365c;

    public b(e eVar, g gVar, BeforeAfterScreenContract$InputData beforeAfterScreenContract$InputData) {
        this.f173363a = beforeAfterScreenContract$InputData;
        int i = 3;
        this.f173364b = e4m.b.b(new jdi.i(gVar, this, 1, i));
        this.f173365c = e4m.b.b(new jdi.i(gVar, this, 0, i));
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
