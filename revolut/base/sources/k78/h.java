package k78;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior.accounts.api.navigation.JuniorSelectionInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorSelectionInputData f181888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f181889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f181890c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f181891g;

    public h(b bVar, BaseScreen baseScreen, JuniorSelectionInputData juniorSelectionInputData) {
        this.f181888a = juniorSelectionInputData;
        this.f181889b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f181890c = e4m.b.b(new jqa.h(bVar, this, 2, i));
        this.d = e4m.b.b(new jqa.h(bVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(bVar, this, 0, i));
        this.f = e4m.b.b(new jqa.h(bVar, this, 4, i));
        this.f181891g = e4m.b.b(new jqa.h(bVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
