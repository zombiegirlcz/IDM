package cui;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import cuj.k;
import cul.q0;
import ip0.eh0;
import java.util.ArrayList;
import java.util.Optional;
import k4l.e0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109025a;

    public /* synthetic */ s(int i) {
        this.f109025a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109025a) {
            case 0:
                l currentState = (l) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return t1.t(currentState.f109009c, zi0.c.P(u1.a(currentState.e), false, null, 3));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                bti.d dVar = (bti.d) pair.f186385a;
                Optional optional = (Optional) pair.f186386b;
                return optional.isPresent() ? ((bti.f) optional.get()).f18598c : dVar.k.f18603b;
            case 2:
                l it8 = (l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f;
            case 3:
                return l.a((l) obj2, null, null, null, null, null, null, null, true, null, 383);
            case 4:
                return l.a((l) obj2, null, null, null, null, null, null, null, false, null, 383);
            case 5:
                return l.a((l) obj2, null, null, null, null, null, null, null, false, null, 383);
            case 6:
                return l.a((l) obj2, null, null, null, null, null, null, null, false, null, 383);
            case 7:
                return l.a((l) obj2, null, null, null, null, null, null, null, false, null, 383);
            case 8:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(new eh0(String.valueOf(i)));
                }
                return arrayListP;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k.b.f109045a;
            case 10:
                cul.v it9 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f109176b;
            case 11:
                OrderQuoteResult it10 = (OrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f106859b;
            case 12:
                cul.v it11 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f109186r;
            case 13:
                cul.v it12 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f109176b;
            case 14:
                cul.v it13 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f109176b;
            case 15:
                cul.v it14 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(Boolean.valueOf(it14.f109188t), false, null, 3);
            case 16:
                cul.v it15 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zi0.c.P(it15.f109176b, false, null, 3);
            case 17:
                cul.v it16 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.e;
            case 18:
                cul.v it17 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.P(it17.f109176b, false, null, 3);
            case 19:
                InvestInputValue it18 = (InvestInputValue) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f106844a;
            case 20:
                cul.v it19 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zi0.c.P(it19.f109176b, false, null, 3);
            case 21:
                e0 it20 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(!pd.b.k(it20.f180961n != null ? Boolean.valueOf(r14.f180949c) : null));
            case 22:
                cul.v it21 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Pair(it21.f109175a, it21.f109176b);
            case 23:
                cul.v it22 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f109176b;
            case 24:
                cul.v it23 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return zi0.c.P(it23.f109176b, false, null, 3);
            case 25:
                cul.v it24 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f109180j;
            case 26:
                cul.v it25 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return it25.f109186r;
            case 27:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                r0 r0Var = (r0) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) rVar.f314203c;
                int i2 = q0.f109158a[r0Var.ordinal()];
                boolean z = false;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    boolean zA = sourcePocketWrapper.a();
                    boolean zF = Intrinsics.f(bVar, sourcePocketWrapper.f91795b.f104718b.f104721c);
                    if (sourcePocketWrapper.b() && !zA && !zF) {
                        z = true;
                    }
                } else if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 28:
                cul.v it26 = (cul.v) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.f109186r;
            default:
                SourcePocketWrapper sourcePocketWrapper2 = (SourcePocketWrapper) obj2;
                Intrinsics.checkNotNullParameter(sourcePocketWrapper2, "sourcePocketWrapper");
                if (sourcePocketWrapper2.b()) {
                    return sourcePocketWrapper2;
                }
                return null;
        }
    }
}
