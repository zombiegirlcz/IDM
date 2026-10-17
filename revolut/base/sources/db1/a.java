package db1;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountPickerScreenContract$InputData f112640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f112641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f112642c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f112643g;

    public a(b bVar, c cVar, BaseScreen baseScreen, AccountPickerScreenContract$InputData accountPickerScreenContract$InputData) {
        this.f112640a = accountPickerScreenContract$InputData;
        this.f112641b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 22;
        this.f112642c = e4m.b.b(new afj.d(bVar, cVar, this, 2, i));
        this.d = e4m.b.b(new afj.d(bVar, cVar, this, 1, i));
        this.e = e4m.b.b(new afj.d(bVar, cVar, this, 0, i));
        this.f = e4m.b.b(new afj.d(bVar, cVar, this, 4, i));
        this.f112643g = e4m.b.b(new afj.d(bVar, cVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.singleton((yji.d) this.e.get());
    }
}
