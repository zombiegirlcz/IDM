package et6;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements gr6.i {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f129187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f129188c;
    public static final Set d;
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.n0 f129189a;

    static {
        lr6.d0 d0Var = lr6.d0.CARD;
        lr6.d0 d0Var2 = lr6.d0.REVOLUT_PAY;
        lr6.d0 d0Var3 = lr6.d0.APPLE_PAY;
        lr6.d0 d0Var4 = lr6.d0.GOOGLE_PAY;
        lr6.d0 d0Var5 = lr6.d0.OPEN_BANKING;
        lr6.d0 d0Var6 = lr6.d0.CLICK_TO_PAY;
        lr6.d0[] elements = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f129187b = kotlin.collections.d.y0(elements);
        lr6.d0[] elements2 = {d0Var, d0Var2, lr6.d0.BANK_TRANSFER, d0Var3, d0Var4, d0Var5, d0Var6};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f129188c = kotlin.collections.d.y0(elements2);
        d = zhm.y0.b(lr6.d0.CARD_PRESENT);
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.f306273h;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.f306272g;
        aVar.getClass();
        xi0.b[] elements3 = {bVar, bVar2, xi0.b.i};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        e = kotlin.collections.d.y0(elements3);
    }

    public a1(au6.n0 freelancerCurrencyRepository) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyRepository, "freelancerCurrencyRepository");
        this.f129189a = freelancerCurrencyRepository;
    }

    public final akg.n a() {
        return nim.a.v(b(), new w(15));
    }

    public final vkm.d b() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.n0 n0Var = this.f129189a;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n0Var.d.b(Unit.f186387a, loadingStrategy);
    }

    public final akg.n c(Set set) {
        return nim.a.v(b(), new a83.d0(18, set));
    }
}
