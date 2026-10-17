package c4f;

import android.content.Context;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import fmc.z;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f21194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.c f21195c;
    public final e4m.e d = e4m.b.b(new c2h.a(this, 2));

    public b(ee0.c cVar, an0.c cVar2, Context context) {
        this.f21193a = context;
        this.f21194b = cVar2;
        this.f21195c = cVar;
    }

    public final z a() {
        return new z((TradingDatabase) this.d.get());
    }
}
