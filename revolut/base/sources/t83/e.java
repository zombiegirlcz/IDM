package t83;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchToNewCreditCardPromptScreenContract$InputData f268824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f268825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268826c;

    public e(c cVar, b bVar, SwitchToNewCreditCardPromptScreenContract$InputData switchToNewCreditCardPromptScreenContract$InputData) {
        this.f268824a = switchToNewCreditCardPromptScreenContract$InputData;
        int i = 17;
        this.f268825b = e4m.b.b(new l(cVar, this, 1, i));
        this.f268826c = e4m.b.b(new l(cVar, this, 0, i));
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
