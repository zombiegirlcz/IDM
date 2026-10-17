package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreenContract$InputData;
import java.util.Set;
import ql7.d2;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqFormChooserScreenContract$InputData f252117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252119c;

    public h(l lVar, t tVar, FaqFormChooserScreenContract$InputData faqFormChooserScreenContract$InputData) {
        this.f252117a = faqFormChooserScreenContract$InputData;
        int i = 17;
        this.f252118b = e4m.b.b(new d2(this, 1, i));
        this.f252119c = e4m.b.b(new d2(this, 0, i));
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
