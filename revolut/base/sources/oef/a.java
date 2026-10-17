package oef;

import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import kotlin.jvm.internal.Intrinsics;
import lef.d;
import lef.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static RecogniserTransaction a(e dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        String description = dto.getDescription();
        d amount = dto.getAmount();
        long amount2 = amount.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = amount.getCurrency();
        aVar.getClass();
        return new RecogniserTransaction(id10, description, new dj0.d(amount2, xi0.a.a(currency)), oi0.d.Y(dto.getCreatedDate()), dto.getIconUrl(), dto.getIcon());
    }

    public static e b(RecogniserTransaction domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        String str = domain.f91800a;
        String str2 = domain.f91801b;
        dj0.d dVar = domain.f91802c;
        return new e(str, str2, new d(dVar.f115082a, dVar.f115083b.f306286a), oi0.d.R(domain.d), domain.e, domain.f);
    }
}
