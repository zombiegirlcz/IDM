package o44;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f221995b;

    public e(Data data, String inputPostcode) {
        Intrinsics.checkNotNullParameter(inputPostcode, "inputPostcode");
        this.f221994a = inputPostcode;
        this.f221995b = data;
    }

    public static e a(e eVar, String inputPostcode, Data data, int i) {
        if ((i & 1) != 0) {
            inputPostcode = eVar.f221994a;
        }
        if ((i & 2) != 0) {
            data = eVar.f221995b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(inputPostcode, "inputPostcode");
        return new e(data, inputPostcode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f221994a, eVar.f221994a) && Intrinsics.f(this.f221995b, eVar.f221995b);
    }

    public final int hashCode() {
        int iHashCode = this.f221994a.hashCode() * 31;
        Data data = this.f221995b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
