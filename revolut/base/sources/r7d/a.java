package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AllCardsScreenContract$InputData f252085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252087c;

    public a(l lVar, t tVar, AllCardsScreenContract$InputData allCardsScreenContract$InputData) {
        this.f252085a = allCardsScreenContract$InputData;
        this.f252086b = e4m.b.b(new ppd.j(lVar, tVar, this, 1, 21));
        this.f252087c = e4m.b.b(new ppd.j(lVar, tVar, this, 0, 21));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
