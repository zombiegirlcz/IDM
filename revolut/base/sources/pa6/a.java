package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountSuggestionScreenContract$InputData f234344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234346c;

    public a(m mVar, n nVar, AmountSuggestionScreenContract$InputData amountSuggestionScreenContract$InputData) {
        this.f234344a = amountSuggestionScreenContract$InputData;
        int i = 26;
        this.f234345b = e4m.b.b(new p8a.m(mVar, this, 1, i));
        this.f234346c = e4m.b.b(new p8a.m(mVar, this, 0, i));
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
