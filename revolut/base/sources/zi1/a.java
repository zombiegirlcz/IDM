package zi1;

import cj1.g;
import cj1.i;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f322488a;

    public a(i addressFieldSuggestionRepository) {
        Intrinsics.checkNotNullParameter(addressFieldSuggestionRepository, "addressFieldSuggestionRepository");
        this.f322488a = addressFieldSuggestionRepository;
    }

    public final vkm.d a(String query, wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(query, "query");
        i iVar = this.f322488a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(query, "query");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return iVar.d.b(new g(country.f297794a, query), loadingStrategy);
    }
}
