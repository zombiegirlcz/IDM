package aa0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f2750a;

    public y(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f2750a = regexMatcher;
    }

    public static boolean a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(str.length());
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                int i3 = i2 + 1;
                int numericValue = Character.getNumericValue(str.charAt(i));
                if (i2 % 2 == 0) {
                    int i5 = numericValue * 2;
                    Integer numValueOf = Integer.valueOf(i5);
                    if (i5 >= 9) {
                        numValueOf = null;
                    }
                    numericValue = numValueOf != null ? numValueOf.intValue() : i5 - 9;
                }
                arrayList.add(Integer.valueOf(numericValue));
                i++;
                i2 = i3;
            }
            if (zhm.d0.T0(arrayList) % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public final e b(String str) {
        zzl.b bVar = this.f2750a;
        if (!(str == null ? false : ((zzl.c) bVar).a("\\D{12,12}\\d{4,4}", str))) {
            if (!(str == null ? false : ((zzl.c) bVar).a("\\d{16,16}", str)) || !a(str)) {
                return (!(str != null ? ((zzl.c) bVar).a("\\d{16,16}", str) : false) || a(str)) ? e.NOT_A_PAN : e.INVALID_PAN;
            }
        }
        return e.VALID;
    }
}
