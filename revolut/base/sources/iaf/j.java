package iaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f160003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferBroker f160004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f160005c;

    public j(Map selectedAssets, TransferBroker broker, boolean z) {
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(broker, "broker");
        this.f160003a = selectedAssets;
        this.f160004b = broker;
        this.f160005c = z;
    }

    public static j a(j jVar, Map selectedAssets, boolean z, int i) {
        TransferBroker broker = jVar.f160004b;
        if ((i & 4) != 0) {
            z = jVar.f160005c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(broker, "broker");
        return new j(selectedAssets, broker, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f160003a.equals(jVar.f160003a) && Intrinsics.f(this.f160004b, jVar.f160004b) && this.f160005c == jVar.f160005c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160005c) + ((this.f160004b.hashCode() + (this.f160003a.hashCode() * 31)) * 31);
    }
}
