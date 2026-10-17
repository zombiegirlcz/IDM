package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalCardsManagementScreenContract$InputData f175953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f175954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f175955c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f175956g;

    public a0(a3 a3Var, z zVar, ViewController viewController, AdditionalCardsManagementScreenContract$InputData additionalCardsManagementScreenContract$InputData) {
        this.f175953a = additionalCardsManagementScreenContract$InputData;
        this.f175954b = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f175955c = e4m.b.b(new jdi.i(a3Var, this, 2, i));
        this.d = e4m.b.b(new jdi.i(a3Var, this, 1, i));
        this.e = e4m.b.b(new jdi.i(a3Var, this, 0, i));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 4, i));
        this.f175956g = e4m.b.b(new jdi.i(a3Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
