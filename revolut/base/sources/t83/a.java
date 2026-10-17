package t83;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptScreenContract$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AskLocationSecurityPromptScreenContract$InputData f268812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f268813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268814c;

    public a(c cVar, b bVar, AskLocationSecurityPromptScreenContract$InputData askLocationSecurityPromptScreenContract$InputData) {
        this.f268812a = askLocationSecurityPromptScreenContract$InputData;
        int i = 16;
        this.f268813b = e4m.b.b(new l(cVar, this, 1, i));
        this.f268814c = e4m.b.b(new l(cVar, this, 0, i));
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
