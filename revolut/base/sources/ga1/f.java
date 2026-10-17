package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lga1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProdCert", "prodCert", "b", "getKekCert", "kekCert", "Lga1/a;", "c", "Lga1/a;", "getFirmwareVersions", "()Lga1/a;", "firmwareVersions", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("prodCert")
    @NotNull
    private final String prodCert;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("kekCert")
    @NotNull
    private final String kekCert;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_firmware")
    @NotNull
    private final a firmwareVersions;

    public f(String prodCert, String kekCert, a firmwareVersions) {
        Intrinsics.checkNotNullParameter(prodCert, "prodCert");
        Intrinsics.checkNotNullParameter(kekCert, "kekCert");
        Intrinsics.checkNotNullParameter(firmwareVersions, "firmwareVersions");
        this.prodCert = prodCert;
        this.kekCert = kekCert;
        this.firmwareVersions = firmwareVersions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.prodCert, fVar.prodCert) && Intrinsics.f(this.kekCert, fVar.kekCert) && Intrinsics.f(this.firmwareVersions, fVar.firmwareVersions);
    }

    public final int hashCode() {
        return this.firmwareVersions.hashCode() + p.a.c(this.prodCert.hashCode() * 31, 31, this.kekCert);
    }
}
