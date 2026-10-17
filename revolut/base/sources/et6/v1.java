package et6;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements gr6.k {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f129353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f129354c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f129355a;

    static {
        lr6.a0 a0Var = lr6.a0.APPLE_PAY;
        lr6.a0 a0Var2 = lr6.a0.CARD;
        lr6.a0 a0Var3 = lr6.a0.CLICK_TO_PAY;
        lr6.a0 a0Var4 = lr6.a0.GOOGLE_PAY;
        lr6.a0 a0Var5 = lr6.a0.OPEN_BANKING;
        lr6.a0 a0Var6 = lr6.a0.PAY_WITH_REVOLUT;
        lr6.a0[] elements = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f129353b = kotlin.collections.d.y0(elements);
        lr6.a0[] elements2 = {a0Var, lr6.a0.BANK_TRANSFER, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f129354c = kotlin.collections.d.y0(elements2);
    }

    public v1(gr6.a freelancerAccountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        this.f129355a = freelancerAccountDetailsInteractor;
    }

    public final u1 a(Function1 function1) {
        return new u1(mo3.a.g(((g) this.f129355a).d(w4l.h.f294642c), null, null, 3), function1, 0);
    }
}
