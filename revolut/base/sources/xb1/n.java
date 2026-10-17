package xb1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderRootFlowContract$InputData f303949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f303950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f303951c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(p pVar, ViewController viewController, CardReaderRootFlowContract$InputData cardReaderRootFlowContract$InputData) {
        this.f303950b = pVar;
        this.f303949a = cardReaderRootFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new m(pVar, this, 1, 0));
        this.f = e4m.b.b(new m(pVar, this, 0, 0));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
