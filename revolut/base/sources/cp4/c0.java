package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f107786a = new c0();

    private c0() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends fo4.a>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$MsiOffers$storageCacheType$1
        };
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "credit_card_msiOffers";
    }
}
