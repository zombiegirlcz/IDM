package in3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import i9e.l;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn3.a f162628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContactsChooserInputData f162629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f162630c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f162631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f162632h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f162633j;

    public g(e eVar, ViewController viewController, ContactsChooserInputData contactsChooserInputData, bn3.a aVar) {
        this.f162630c = eVar;
        this.f162628a = aVar;
        this.f162629b = contactsChooserInputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.e = e4m.b.b(new l(eVar, this, 2, i));
        this.f = e4m.b.b(new l(eVar, this, 1, i));
        this.f162631g = e4m.b.b(new l(eVar, this, 0, i));
        this.f162632h = e4m.b.b(new l(eVar, this, 3, i));
        this.i = e4m.b.b(new l(eVar, this, 5, i));
        this.f162633j = e4m.b.b(new l(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f162632h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f162631g.get());
    }
}
