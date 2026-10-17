package c73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardSelectionNavigationData$InputData f21856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f21857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f21858c;

    public i(j jVar, CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData) {
        this.f21856a = cardSelectionNavigationData$InputData;
        int i = 16;
        this.f21857b = e4m.b.b(new bt7.e(jVar, this, 1, i));
        this.f21858c = e4m.b.b(new bt7.e(jVar, this, 0, i));
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
