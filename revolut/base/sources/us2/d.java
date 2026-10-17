package us2;

import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InviteContactsScreenContract$InputData f282387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f282388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282389c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f282391h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f282392j;
    public final e4m.e k;

    public d(j jVar, h hVar, ViewController viewController, InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData) {
        this.f282388b = jVar;
        this.f282387a = inviteContactsScreenContract$InputData;
        this.f282389c = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.d = e4m.b.b(new k0(jVar, this, 1, i));
        this.e = e4m.b.b(new k0(jVar, this, 0, i));
        this.f = e4m.b.b(new k0(jVar, this, 2, i));
        this.f282390g = e4m.b.b(new k0(jVar, this, 4, i));
        this.f282391h = e4m.b.b(new k0(jVar, this, 5, i));
        this.i = e4m.b.b(new k0(jVar, this, 6, i));
        this.f282392j = e4m.b.b(new k0(jVar, this, 7, i));
        this.k = e4m.b.b(new k0(jVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.e, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}
