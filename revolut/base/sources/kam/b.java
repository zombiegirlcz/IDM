package kam;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b(1, xam.a.class, "toAntiBandingMode", "toAntiBandingMode(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;", 1);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        switch (p0.hashCode()) {
            case 109935:
                if (p0.equals("off")) {
                    return uam.a.e;
                }
                return null;
            case 1628397:
                if (p0.equals("50hz")) {
                    return uam.a.f278685c;
                }
                return null;
            case 1658188:
                if (p0.equals("60hz")) {
                    return uam.a.d;
                }
                return null;
            case 3005871:
                if (p0.equals("auto")) {
                    return uam.a.f278684b;
                }
                return null;
            default:
                return null;
        }
    }
}
