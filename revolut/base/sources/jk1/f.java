package jk1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Ljk1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQrType", "qrType", "b", "getQrCode", "qrCode", "Companion", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrType")
    @NotNull
    private final String qrType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrCode")
    @NotNull
    private final String qrCode;

    public static final class a {
        private a() {
        }
    }

    public f(String qrCode) {
        Intrinsics.checkNotNullParameter("ALIPAY_PLUS", "qrType");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.qrType = "ALIPAY_PLUS";
        this.qrCode = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.qrType, fVar.qrType) && Intrinsics.f(this.qrCode, fVar.qrCode);
    }

    public final int hashCode() {
        return this.qrCode.hashCode() + (this.qrType.hashCode() * 31);
    }
}
