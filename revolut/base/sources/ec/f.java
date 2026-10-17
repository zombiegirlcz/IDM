package ec;

import android.content.Context;
import com.google.firebase.messaging.t;
import fc.g;
import fc.h;
import fc.i;
import zb.s;

/* JADX INFO: loaded from: classes.dex */
public final class f implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f124402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f124403c;
    public final bc.b d;

    public /* synthetic */ f(bc.b bVar, phm.a aVar, bc.b bVar2, int i) {
        this.f124401a = i;
        this.f124402b = bVar;
        this.f124403c = aVar;
        this.d = bVar2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f124401a) {
            case 0:
                return new gpk.c((Context) this.f124402b.get(), (gc.d) this.f124403c.get(), (fc.a) ((e) this.d).get());
            default:
                return new s(new ah.a(6), new af.f(6), (d) ((c) this.f124402b).get(), (g) ((h) this.f124403c).get(), (t) ((i) this.d).get());
        }
    }
}
