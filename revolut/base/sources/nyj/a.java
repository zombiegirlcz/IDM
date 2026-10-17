package nyj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreenContract$InputData;
import java.util.Set;
import nk7.k;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlossaryHomeScreenContract$InputData f220877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f220878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f220879c;

    public a(c cVar, GlossaryHomeScreenContract$InputData glossaryHomeScreenContract$InputData) {
        this.f220877a = glossaryHomeScreenContract$InputData;
        int i = 27;
        this.f220878b = e4m.b.b(new k(cVar, this, 1, i));
        this.f220879c = e4m.b.b(new k(cVar, this, 0, i));
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
