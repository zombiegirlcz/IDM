package v0i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TakeProfitStopLossParams f284852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f284853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f284854c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f284855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f284856h;

    public a(b bVar, ViewController viewController, TakeProfitStopLossParams takeProfitStopLossParams) {
        this.f284853b = bVar;
        this.f284852a = takeProfitStopLossParams;
        this.f284854c = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.d = e4m.b.b(new r2(bVar, this, 2, i));
        this.e = e4m.b.b(new r2(bVar, this, 1, i));
        this.f = e4m.b.b(new r2(bVar, this, 0, i));
        this.f284855g = e4m.b.b(new r2(bVar, this, 3, i));
        this.f284856h = e4m.b.b(new r2(bVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
