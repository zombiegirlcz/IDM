package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lga1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSvpp", "svpp", "b", "getBluetooth", "bluetooth", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("svpp")
    @NotNull
    private final String svpp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bluetooth")
    @NotNull
    private final String bluetooth;

    public a(String svpp, String bluetooth) {
        Intrinsics.checkNotNullParameter(svpp, "svpp");
        Intrinsics.checkNotNullParameter(bluetooth, "bluetooth");
        this.svpp = svpp;
        this.bluetooth = bluetooth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.svpp, aVar.svpp) && Intrinsics.f(this.bluetooth, aVar.bluetooth);
    }

    public final int hashCode() {
        return this.bluetooth.hashCode() + (this.svpp.hashCode() * 31);
    }
}
