package h71;

import com.revolut.domain.models.topup.methods.TopUpMethodBanner$Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpMethodBanner$Type f149833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149835c;
    public final List d;

    public a(TopUpMethodBanner$Type type, String title, String description, List supportedCurrencyCodes) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        this.f149833a = type;
        this.f149834b = title;
        this.f149835c = description;
        this.d = supportedCurrencyCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f149833a == aVar.f149833a && Intrinsics.f(this.f149834b, aVar.f149834b) && Intrinsics.f(this.f149835c, aVar.f149835c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f149833a.hashCode() * 31, 31, this.f149834b), 31, this.f149835c);
    }
}
