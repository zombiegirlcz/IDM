package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f107789a = new d0();

    private d0() {
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends fo4.c>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$MsiWidgetOffers$storageCacheType$1
        };
    }

    @Override // ne0.a
    public final /* bridge */ /* synthetic */ String getKey() {
        return "credit_card_msiWidgetOffers";
    }
}
