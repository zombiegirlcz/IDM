package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixIdentifiedType f312586b;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f312585a, lVar.f312585a) && Intrinsics.f(this.f312586b, lVar.f312586b);
    }

    public final int hashCode() {
        int iHashCode = this.f312585a.hashCode() * 31;
        PixIdentifiedType pixIdentifiedType = this.f312586b;
        return iHashCode + (pixIdentifiedType == null ? 0 : pixIdentifiedType.hashCode());
    }

    public l(String value, PixIdentifiedType pixIdentifiedType) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f312585a = value;
        this.f312586b = pixIdentifiedType;
    }

    public /* synthetic */ l(int i) {
        this("", null);
    }
}
