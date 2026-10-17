package foc;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f136920a;

    public static final class a {
        private a() {
        }
    }

    static {
        String str;
        pdh.c[] cVarArrValues = pdh.c.values();
        int iB = q0.b(cVarArrValues.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (pdh.c cVar : cVarArrValues) {
            switch (k.f136921a[cVar.ordinal()]) {
                case 1:
                    str = "1D";
                    break;
                case 2:
                    str = "1W";
                    break;
                case 3:
                    str = "1M";
                    break;
                case 4:
                    str = "6M";
                    break;
                case 5:
                    str = "1Y";
                    break;
                case 6:
                    str = "3Y";
                    break;
                case 7:
                    str = "5Y";
                    break;
                case 8:
                    str = "10Y";
                    break;
                case 9:
                    str = "YTD";
                    break;
                case 10:
                    str = "ALL";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(str, cVar);
        }
        f136920a = linkedHashMap;
    }
}
