package jxj;

import e4m.b;
import e4m.e;
import jm4.o3;
import sg8.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f179240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk3.c f179241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f179242c;
    public final e d;

    public a(jk3.c cVar, c cVar2) {
        this.f179240a = cVar2;
        this.f179241b = cVar;
        int i = 10;
        this.f179242c = b.b(new o3(this, 1, i));
        this.d = b.b(new o3(this, 0, i));
    }

    public final com.revolut.retail.feature.api.userauth.navigation.a a() {
        return (com.revolut.retail.feature.api.userauth.navigation.a) this.d.get();
    }
}
