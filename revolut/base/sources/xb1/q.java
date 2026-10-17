package xb1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderUpdatingScreenContract$InputData f303959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f303960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f303961c;
    public final e4m.e d;
    public final e4m.e e;

    public q(p pVar, h hVar, CardReaderUpdatingScreenContract$InputData cardReaderUpdatingScreenContract$InputData) {
        this.f303959a = cardReaderUpdatingScreenContract$InputData;
        this.f303960b = e4m.b.b(new wpg.g(pVar, hVar, this, 1, 9));
        int i = 9;
        this.f303961c = e4m.b.b(new wpg.g(pVar, hVar, this, 0, i));
        this.d = e4m.b.b(new wpg.g(pVar, hVar, this, 3, i));
        this.e = e4m.b.b(new wpg.g(pVar, hVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.singleton((yji.d) this.f303961c.get());
    }
}
