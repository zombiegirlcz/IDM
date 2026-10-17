package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsTroubleshooterSelectionScreenContract$InputData f252104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252106c;

    public d(l lVar, t tVar, CardsTroubleshooterSelectionScreenContract$InputData cardsTroubleshooterSelectionScreenContract$InputData) {
        this.f252104a = cardsTroubleshooterSelectionScreenContract$InputData;
        this.f252105b = e4m.b.b(new ppd.j(lVar, tVar, this, 1, 23));
        this.f252106c = e4m.b.b(new ppd.j(lVar, tVar, this, 0, 23));
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
