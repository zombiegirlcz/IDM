package x61;

import com.revolut.domain.models.openbanking.ObaClient$AuthorizationFlow;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f303017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObaClient$AuthorizationFlow f303018c;

    public f(String name, byte[] bArr, ObaClient$AuthorizationFlow authorisationFlow) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(authorisationFlow, "authorisationFlow");
        this.f303016a = name;
        this.f303017b = bArr;
        this.f303018c = authorisationFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!f.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.domain.models.openbanking.ObaClient");
        f fVar = (f) obj2;
        byte[] bArr = fVar.f303017b;
        if (!Intrinsics.f(this.f303016a, fVar.f303016a)) {
            return false;
        }
        byte[] bArr2 = this.f303017b;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f303016a.hashCode() * 31;
        byte[] bArr = this.f303017b;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
