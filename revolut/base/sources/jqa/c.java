package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$InputData;
import java.util.Set;
import jm4.z3;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardRecipientDetailsScreenContract$InputData f177534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f177535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f177536c;
    public final e4m.e d;
    public final e4m.e e;

    public c(e eVar, CardRecipientDetailsScreenContract$InputData cardRecipientDetailsScreenContract$InputData) {
        this.f177535b = eVar;
        this.f177534a = cardRecipientDetailsScreenContract$InputData;
        this.f177536c = e4m.b.b(new z3(eVar, this, 1, 27));
        this.d = e4m.b.b(new z3(eVar, this, 0, 27));
        this.e = e4m.b.b(new z3(eVar, this, 2, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
