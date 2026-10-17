package db1;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.checkout.CheckoutScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutScreenContract$InputData f112653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f112654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f112655c;
    public final e4m.e d;

    public e(b bVar, c cVar, CheckoutScreenContract$InputData checkoutScreenContract$InputData) {
        this.f112653a = checkoutScreenContract$InputData;
        this.f112654b = e4m.b.b(new afj.d(bVar, cVar, this, 2, 23));
        int i = 23;
        this.f112655c = e4m.b.b(new afj.d(bVar, cVar, this, 1, i));
        this.d = e4m.b.b(new afj.d(bVar, cVar, this, 0, i));
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
