package xb1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderConnectingScreenContract$InputData f303925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f303926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f303927c;
    public final e4m.e d;
    public final e4m.e e;

    public g(p pVar, h hVar, CardReaderConnectingScreenContract$InputData cardReaderConnectingScreenContract$InputData) {
        this.f303925a = cardReaderConnectingScreenContract$InputData;
        this.f303926b = e4m.b.b(new wpg.g(pVar, hVar, this, 1, 7));
        int i = 7;
        this.f303927c = e4m.b.b(new wpg.g(pVar, hVar, this, 0, i));
        this.d = e4m.b.b(new wpg.g(pVar, hVar, this, 3, i));
        this.e = e4m.b.b(new wpg.g(pVar, hVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.singleton((yji.d) this.f303927c.get());
    }
}
