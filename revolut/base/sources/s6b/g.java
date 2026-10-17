package s6b;

import com.revolut.data.model.Data;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f260197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f260198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f260199c;
    public final boolean d;

    public g(Map inputFieldToText, Map inputFieldErrorMatches, Data createAccountInfoData, boolean z) {
        Intrinsics.checkNotNullParameter(inputFieldToText, "inputFieldToText");
        Intrinsics.checkNotNullParameter(inputFieldErrorMatches, "inputFieldErrorMatches");
        Intrinsics.checkNotNullParameter(createAccountInfoData, "createAccountInfoData");
        this.f260197a = inputFieldToText;
        this.f260198b = inputFieldErrorMatches;
        this.f260199c = createAccountInfoData;
        this.d = z;
    }

    public static g a(g gVar, HashMap map, HashMap map2, Data createAccountInfoData, boolean z, int i) {
        Map inputFieldToText = map;
        if ((i & 1) != 0) {
            inputFieldToText = gVar.f260197a;
        }
        Map inputFieldErrorMatches = map2;
        if ((i & 2) != 0) {
            inputFieldErrorMatches = gVar.f260198b;
        }
        if ((i & 4) != 0) {
            createAccountInfoData = gVar.f260199c;
        }
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(inputFieldToText, "inputFieldToText");
        Intrinsics.checkNotNullParameter(inputFieldErrorMatches, "inputFieldErrorMatches");
        Intrinsics.checkNotNullParameter(createAccountInfoData, "createAccountInfoData");
        return new g(inputFieldToText, inputFieldErrorMatches, createAccountInfoData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f260197a, gVar.f260197a) && Intrinsics.f(this.f260198b, gVar.f260198b) && Intrinsics.f(this.f260199c, gVar.f260199c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f260199c, p.a.e(this.f260197a.hashCode() * 31, 31, this.f260198b), 31);
    }
}
