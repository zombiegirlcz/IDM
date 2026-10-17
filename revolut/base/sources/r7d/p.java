package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelpWithCardScreenContract$Input f252158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f252159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252160c;
    public final e4m.e d;

    public p(l lVar, m mVar, HelpWithCardScreenContract$Input helpWithCardScreenContract$Input) {
        this.f252159b = mVar;
        this.f252158a = helpWithCardScreenContract$Input;
        int i = 0;
        this.f252160c = e4m.b.b(new o(lVar, this, 1, i));
        this.d = e4m.b.b(new o(lVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        m mVar = this.f252159b;
        return ImmutableSet.of((yji.n) mVar.f252140g.get(), (yji.n) mVar.e.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
