package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqListScreenContract$InputData f252120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252122c;

    public i(l lVar, t tVar, FaqListScreenContract$InputData faqListScreenContract$InputData) {
        this.f252120a = faqListScreenContract$InputData;
        this.f252121b = e4m.b.b(new ppd.j(lVar, tVar, this, 1, 25));
        this.f252122c = e4m.b.b(new ppd.j(lVar, tVar, this, 0, 25));
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
