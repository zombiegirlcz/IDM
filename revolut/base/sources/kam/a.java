package kam;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import uam.c;
import uam.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f182499h;
    public static final a i;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f182499h = new a(i2, 0);
        i = new a(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                switch (it8.hashCode()) {
                    case 3551:
                        if (it8.equals("on")) {
                            return c.e;
                        }
                        return null;
                    case 109935:
                        if (it8.equals("off")) {
                            return c.d;
                        }
                        return null;
                    case 3005871:
                        if (it8.equals("auto")) {
                            return c.f278687b;
                        }
                        return null;
                    case 110547964:
                        if (it8.equals("torch")) {
                            return c.f;
                        }
                        return null;
                    case 1081542389:
                        if (it8.equals("red-eye")) {
                            return c.f278688c;
                        }
                        return null;
                    default:
                        return null;
                }
            default:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                switch (it9.hashCode()) {
                    case -194628547:
                        if (it9.equals("continuous-video")) {
                            return e.d;
                        }
                        return null;
                    case 3005871:
                        if (it9.equals("auto")) {
                            return e.f278690b;
                        }
                        return null;
                    case 3108534:
                        if (it9.equals("edof")) {
                            return e.e;
                        }
                        return null;
                    case 97445748:
                        if (it9.equals("fixed")) {
                            return e.f;
                        }
                        return null;
                    case 103652300:
                        if (it9.equals("macro")) {
                            return e.f278693h;
                        }
                        return null;
                    case 173173288:
                        if (it9.equals("infinity")) {
                            return e.f278692g;
                        }
                        return null;
                    case 910005312:
                        if (it9.equals("continuous-picture")) {
                            return e.f278691c;
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }
}
