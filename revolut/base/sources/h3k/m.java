package h3k;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lh3k/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "code", "b", "d", "name", "c", "defaultCurrency", "localCurrency", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCurrency")
    @NotNull
    private final String defaultCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("localCurrency")
    @NotNull
    private final String localCurrency;

    public m(String code, String name, String defaultCurrency, String localCurrency) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        this.code = code;
        this.name = name;
        this.defaultCurrency = defaultCurrency;
        this.localCurrency = localCurrency;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLocalCurrency() {
        return this.localCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.code, mVar.code) && Intrinsics.f(this.name, mVar.name) && Intrinsics.f(this.defaultCurrency, mVar.defaultCurrency) && Intrinsics.f(this.localCurrency, mVar.localCurrency);
    }

    public final int hashCode() {
        return this.localCurrency.hashCode() + p.a.c(p.a.c(this.code.hashCode() * 31, 31, this.name), 31, this.defaultCurrency);
    }
}
