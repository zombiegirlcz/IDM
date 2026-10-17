package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lnx4/l;", "Lnx4/n;", "", "toString", "()Ljava/lang/String;", "Lnx4/c3;", "a", "Lnx4/c3;", "()Lnx4/c3;", "config", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    @NotNull
    private final c3 config;

    public l(c3 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c3 getConfig() {
        return this.config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.config, ((l) obj2).config);
    }

    public final int hashCode() {
        return this.config.hashCode();
    }

    @Override // nx4.n
    public final String j() {
        return p.a.p("ShowVariantSelectionPopupDto(title=", this.config.getTitle(), ")");
    }
}
