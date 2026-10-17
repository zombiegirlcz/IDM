package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177600a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOwnerMainInfoScreenContract$InputData f177601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f177602c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177604h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f177605j;
    public final e4m.e k;

    public k(e eVar, ViewController viewController, CardOwnerMainInfoScreenContract$InputData cardOwnerMainInfoScreenContract$InputData) {
        this.f177602c = eVar;
        this.f177601b = cardOwnerMainInfoScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.e = e4m.b.b(new h(eVar, this, 1, i));
        this.f = e4m.b.b(new h(eVar, this, 0, i));
        this.f177603g = e4m.b.b(new h(eVar, this, 3, i));
        this.f177604h = e4m.b.b(new h(eVar, this, 2, i));
        this.i = e4m.b.b(new h(eVar, this, 5, i));
        this.f177605j = e4m.b.b(new h(eVar, this, 4, i));
        this.k = e4m.b.b(new h(eVar, this, 6, i));
    }

    public final gra.a b() {
        switch (this.f177600a) {
        }
        return (gra.a) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f177600a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f177600a) {
        }
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f177604h.get());
    }

    public k(e eVar, b bVar, ViewController viewController, CardOwnerMainInfoScreenContract$InputData cardOwnerMainInfoScreenContract$InputData) {
        this.f177602c = eVar;
        this.f177601b = cardOwnerMainInfoScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.e = e4m.b.b(new h(eVar, this, 1, i));
        this.f = e4m.b.b(new h(eVar, this, 0, i));
        this.f177603g = e4m.b.b(new h(eVar, this, 3, i));
        this.f177604h = e4m.b.b(new h(eVar, this, 2, i));
        this.i = e4m.b.b(new h(eVar, this, 5, i));
        this.f177605j = e4m.b.b(new h(eVar, this, 4, i));
        this.k = e4m.b.b(new h(eVar, this, 6, i));
    }
}
