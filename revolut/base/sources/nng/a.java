package nng;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressSuggestionControllerDescriptor$InputData f217631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f217632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f217633c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(p pVar, AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData) {
        this.f217632b = pVar;
        this.f217631a = addressSuggestionControllerDescriptor$InputData;
        int i = 10;
        this.d = e4m.b.b(new nk7.k(pVar, this, 1, i));
        this.e = e4m.b.b(new nk7.k(pVar, this, 0, i));
        this.f = e4m.b.b(new nk7.k(pVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
