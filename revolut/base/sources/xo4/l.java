package xo4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lxo4/l;", "", "", "toString", "()Ljava/lang/String;", "Lxo4/j;", "a", "Lxo4/j;", "()Lxo4/j;", "balanceDisplay", "Lxo4/l$a;", "b", "Lxo4/l$a;", "()Lxo4/l$a;", "homeScreenDisplay", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("balanceDisplay")
    @NotNull
    private final j balanceDisplay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("homeScreenDisplay")
    private final a homeScreenDisplay;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lxo4/l$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "options", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("options")
        @NotNull
        private final List<String> options;

        public a(ArrayList options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.options = options;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getOptions() {
            return this.options;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.options, ((a) obj2).options);
        }

        public final int hashCode() {
            return this.options.hashCode();
        }
    }

    public l(j balanceDisplay, a aVar) {
        Intrinsics.checkNotNullParameter(balanceDisplay, "balanceDisplay");
        this.balanceDisplay = balanceDisplay;
        this.homeScreenDisplay = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getBalanceDisplay() {
        return this.balanceDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getHomeScreenDisplay() {
        return this.homeScreenDisplay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.balanceDisplay, lVar.balanceDisplay) && Intrinsics.f(this.homeScreenDisplay, lVar.homeScreenDisplay);
    }

    public final int hashCode() {
        int iHashCode = this.balanceDisplay.hashCode() * 31;
        a aVar = this.homeScreenDisplay;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
