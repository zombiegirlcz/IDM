package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReceiptScreenContract$InputData f193996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f193997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193998c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193999g;

    public t(l lVar, BaseScreen baseScreen, ReceiptScreenContract$InputData receiptScreenContract$InputData) {
        this.f193996a = receiptScreenContract$InputData;
        this.f193997b = baseScreen;
        int i = 12;
        this.f193998c = e4m.b.b(new l9f.z(lVar, this, 1, i));
        this.d = e4m.b.b(new l9f.z(lVar, this, 2, i));
        this.e = e4m.b.b(new l9f.z(lVar, this, 4, i));
        this.f = e4m.b.b(new l9f.z(lVar, this, 3, i));
        this.f193999g = e4m.b.b(new l9f.z(lVar, this, 0, i));
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
