package vl3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import java.util.Set;
import us6.r2;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddContactInputData f290186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f290187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290188c;
    public final e4m.e d;
    public final r2 e;
    public final e4m.e f;

    public g(k kVar, AddContactInputData addContactInputData) {
        this.f290187b = kVar;
        this.f290186a = addContactInputData;
        int i = 23;
        this.f290188c = e4m.b.b(new r2(kVar, this, 2, i));
        this.d = e4m.b.b(new r2(kVar, this, 1, i));
        this.e = new r2(kVar, this, 3, i);
        this.f = e4m.b.b(new r2(kVar, this, 0, i));
    }

    public final jpc.e b() {
        k kVar = this.f290187b;
        z80.b bVarS = kVar.f290205g.s();
        s.j(bVarS);
        kge.d dVar = new kge.d(bVarS, (zzl.b) this.f290188c.get());
        n nVar = kVar.f290210n;
        cl3.a aVarD = nVar.d();
        s.j(aVarD);
        ogm.i iVar = new ogm.i(aVarD);
        wl3.c cVar = (wl3.c) nVar.f290240x.get();
        s.j(cVar);
        return new jpc.e(dVar, iVar, new kye.e(cVar));
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
