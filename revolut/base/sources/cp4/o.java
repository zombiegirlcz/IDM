package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f107837a = new o();

    private o() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends on4.f>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Facility$storageCacheType$1
        };
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "credit_card_facilities";
    }
}
