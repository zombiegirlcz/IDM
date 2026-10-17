package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardTroubleshooterScreenContract$InputData f252101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252103c;

    public c(l lVar, t tVar, CardTroubleshooterScreenContract$InputData cardTroubleshooterScreenContract$InputData) {
        this.f252101a = cardTroubleshooterScreenContract$InputData;
        this.f252102b = e4m.b.b(new ppd.j(lVar, tVar, this, 1, 22));
        this.f252103c = e4m.b.b(new ppd.j(lVar, tVar, this, 0, 22));
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
