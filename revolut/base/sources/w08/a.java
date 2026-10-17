package w08;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentTicker f293665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f293667c;

    public a(InstrumentTicker instrumentTicker, Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f293665a = instrumentTicker;
        this.f293666b = title;
        this.f293667c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f293665a, aVar.f293665a) && Intrinsics.f(this.f293666b, aVar.f293666b) && Intrinsics.f(this.f293667c, aVar.f293667c);
    }

    public final int hashCode() {
        return this.f293667c.hashCode() + p.a.a(this.f293665a.hashCode() * 31, 31, this.f293666b);
    }
}
