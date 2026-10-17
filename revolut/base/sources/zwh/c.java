package zwh;

import android.content.Context;
import com.revolut.feature_cpg.impl.network.CardPaymentsGatewayService;
import e4m.e;
import h30.q;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f325955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xwh.a f325956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f325957c;
    public final jm0.a d;
    public final e e = e4m.b.b(new ztg.e(this, 1, 2));
    public final e f = e4m.b.b(new ztg.e(this, 6, 2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f325958g = e4m.b.b(new ztg.e(this, 5, 2));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f325959h = e4m.b.b(new ztg.e(this, 4, 2));
    public final e i = e4m.b.b(new ztg.e(this, 3, 2));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f325960j = e4m.b.b(new ztg.e(this, 7, 2));
    public final e k = e4m.b.b(new ztg.e(this, 8, 2));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f325961l = e4m.b.b(new ztg.e(this, 2, 2));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f325962m = e4m.b.b(new ztg.e(this, 0, 2));

    public c(nj0.a aVar, jm0.a aVar2, Context context, xwh.a aVar3) {
        this.f325955a = aVar;
        this.f325956b = aVar3;
        this.f325957c = context;
        this.d = aVar2;
    }

    public final q a() {
        return new q((CardPaymentsGatewayService) this.i.get(), (ywh.a) this.f325960j.get(), (ywh.b) this.k.get(), new fxh.b(this.d.c()));
    }

    public final wwh.a b() {
        return (wwh.a) this.f325962m.get();
    }
}
