package a7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPromptScreenContract$InputData f1844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f1846c;
    public final e d;
    public final e e;

    public d(b bVar, c cVar, BaseScreen baseScreen, ConsentPromptScreenContract$InputData consentPromptScreenContract$InputData) {
        this.f1844a = consentPromptScreenContract$InputData;
        int i = 1;
        this.f1845b = e4m.b.b(new a1e.c(bVar, this, i, 1));
        this.f1846c = e4m.b.b(e4m.c.a(baseScreen));
        this.d = e4m.b.b(new a1e.c(bVar, this, 2, i));
        this.e = e4m.b.b(new a1e.c(bVar, this, 0, i));
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
