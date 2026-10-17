package u6b;

import com.revolut.data.model.Data;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f277527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f277528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f277529c;
    public final boolean d;

    public e(Map inputFieldToText, Map inputFieldErrorMatches, Data linkAccountInfoData, boolean z) {
        Intrinsics.checkNotNullParameter(inputFieldToText, "inputFieldToText");
        Intrinsics.checkNotNullParameter(inputFieldErrorMatches, "inputFieldErrorMatches");
        Intrinsics.checkNotNullParameter(linkAccountInfoData, "linkAccountInfoData");
        this.f277527a = inputFieldToText;
        this.f277528b = inputFieldErrorMatches;
        this.f277529c = linkAccountInfoData;
        this.d = z;
    }

    public static e a(e eVar, HashMap map, HashMap map2, Data linkAccountInfoData, boolean z, int i) {
        Map inputFieldToText = map;
        if ((i & 1) != 0) {
            inputFieldToText = eVar.f277527a;
        }
        Map inputFieldErrorMatches = map2;
        if ((i & 2) != 0) {
            inputFieldErrorMatches = eVar.f277528b;
        }
        if ((i & 4) != 0) {
            linkAccountInfoData = eVar.f277529c;
        }
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(inputFieldToText, "inputFieldToText");
        Intrinsics.checkNotNullParameter(inputFieldErrorMatches, "inputFieldErrorMatches");
        Intrinsics.checkNotNullParameter(linkAccountInfoData, "linkAccountInfoData");
        return new e(inputFieldToText, inputFieldErrorMatches, linkAccountInfoData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f277527a, eVar.f277527a) && Intrinsics.f(this.f277528b, eVar.f277528b) && Intrinsics.f(this.f277529c, eVar.f277529c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f277529c, p.a.e(this.f277527a.hashCode() * 31, 31, this.f277528b), 31);
    }
}
