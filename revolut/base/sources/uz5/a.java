package uz5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, d2 = {"Luz5/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "enabled", "", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "rates", "Companion", "feature_customer_present_tips_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f284591c = new a(false, v.k(5, 10, 15));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("rates")
    @NotNull
    private final List<Integer> rates;

    /* JADX INFO: renamed from: uz5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public a(boolean z, List rates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.enabled = z;
        this.rates = rates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.enabled == aVar.enabled && Intrinsics.f(this.rates, aVar.rates);
    }

    public final int hashCode() {
        return this.rates.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }
}
