package zkf;

import com.revolut.feature.pix.api.navigation.PixRefundNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixRefundNavigation$InputData;
import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends yji.n implements s0 {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f322962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f322963m;

    public k(h0 commonDataSource, m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f322962l = commonDataSource;
        this.f322963m = juniorDataSource;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "PIX_REFUND_ACTION_ID") && (obj2 instanceof i)) {
            i iVar = (i) obj2;
            A2(new PixRefundNavigation$Destination(new PixRefundNavigation$InputData(iVar.f322958a, iVar.f322959b, iVar.f322960c, iVar.d, iVar.e, iVar.f, iVar.f322961g)));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
