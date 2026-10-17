package jxd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditTopUpOrderScreenContract$InputData f179148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f179149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f179150c;
    public final e4m.e d;

    public e(f fVar, a aVar, EditTopUpOrderScreenContract$InputData editTopUpOrderScreenContract$InputData) {
        this.f179149b = aVar;
        this.f179148a = editTopUpOrderScreenContract$InputData;
        this.f179150c = e4m.b.b(new il8.d(fVar, aVar, this, 1, 10));
        this.d = e4m.b.b(new il8.d(fVar, aVar, this, 0, 10));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
