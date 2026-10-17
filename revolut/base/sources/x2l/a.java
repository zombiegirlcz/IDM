package x2l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.compose.runtime.CancellationHandle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlow;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import dj0.d;
import java.util.List;
import java.util.Set;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mb5.l;
import mx0.dd;
import od0.f;
import sri.m;
import xb5.e;
import xg6.h;
import ya6.x;
import zc0.i2;
import zc0.m2;
import zc0.n2;
import zc0.o2;
import zc0.s1;
import zc0.w1;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements f, o, g, dd, wmm.a, CancellationHandle, p, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302601a;

    public /* synthetic */ a(int i) {
        this.f302601a = i;
        switch (i) {
            case 22:
                w1 w1Var = w1.f;
                break;
            case 23:
            default:
                xra.g gVar = xra.g.f;
                break;
            case 24:
                s1 s1Var = s1.f;
                break;
        }
    }

    @Override // wmm.a
    public Object a(xmm.c cVar) {
        return xmm.a.f307287a;
    }

    @Override // od0.f
    public void accept(Object obj2) {
        xi0.b bVarA = null;
        switch (this.f302601a) {
            case 0:
                cwl.f fVar = (cwl.f) ((b) obj2);
                d dVar = fVar.f109864b;
                cwl.g gVar = fVar.f109863a;
                if (!((jte.d) gVar.f109868g).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                    m mVarA = gVar.a();
                    if (mVarA != null) {
                        mVarA.c(new FeatureCommand(new ExchangeFeatureConfig.Buy(null, dVar.f115083b, null, null, null, null, false, null, 4093)));
                    }
                } else {
                    m mVarA2 = gVar.a();
                    if (mVarA2 != null) {
                        mVarA2.c(u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(dVar.f115083b), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null)));
                    }
                }
                break;
            case 1:
                cwl.f fVar2 = (cwl.f) ((b) obj2);
                cwl.g gVar2 = fVar2.f109863a;
                String str = fVar2.f109864b.f115083b.f306286a;
                m mVarA3 = gVar2.a();
                if (mVarA3 != null) {
                    TopUpConfig.Companion aVar = TopUpConfig.INSTANCE;
                    if (str != null) {
                        xi0.b.Companion.getClass();
                        bVarA = xi0.a.a(str);
                    }
                    mVarA3.c(u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(aVar, bVarA, null, null, null, 30))));
                }
                break;
            case 6:
                Unit unit = Unit.f186387a;
                break;
            case 28:
                Unit unit2 = Unit.f186387a;
                break;
            default:
                Unit unit3 = Unit.f186387a;
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f302601a) {
            case 2:
                e eVar = e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mb5.b) eVar.invoke(p0);
            case 3:
                xb5.f fVar = xb5.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l) fVar.invoke(p0);
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 19:
            default:
                m2 m2Var = m2.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) m2Var.invoke(p0);
            case 5:
                h hVar = h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) hVar.invoke(p0);
            case 10:
                xpk.f fVar2 = xpk.f.f;
                KProperty[] kPropertyArr = RateDetailsScreen.f103723e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) fVar2.invoke(p0);
            case 11:
                xpk.e eVar2 = xpk.e.f;
                KProperty[] kPropertyArr2 = RateDetailsScreen.f103723e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) eVar2.invoke(p0);
            case 12:
                xra.f fVar3 = xra.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CardOwner) fVar3.invoke(p0);
            case 13:
                xra.e eVar3 = xra.e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CardOwner) eVar3.invoke(p0);
            case 14:
                xra.g gVar = xra.g.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CardOwner) gVar.invoke(p0);
            case 15:
                xu2.a aVar = xu2.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar.invoke(p0);
            case 16:
                xu2.b bVar = xu2.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) bVar.invoke(p0);
            case 17:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.O(it8);
            case 18:
                x xVar = x.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) xVar.invoke(p0);
            case 20:
                z51.b bVar2 = z51.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) bVar2.invoke(p0);
            case 21:
                i2 i2Var = i2.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) i2Var.invoke(p0);
            case 22:
                w1 w1Var = w1.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.b) w1Var.invoke(p0);
        }
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        CancellationHandle.Companion.Empty$lambda$0();
    }

    @Override // mx0.dd
    public Animator d(View animatedView) {
        switch (this.f302601a) {
            case 7:
                KProperty[] kPropertyArr = AlipayPlusQrScannerFlow.Q;
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
                objectAnimatorOfFloat.setDuration(150L);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
                return objectAnimatorOfFloat;
            default:
                KProperty[] kPropertyArr2 = AlipayPlusQrScannerFlow.Q;
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
                objectAnimatorOfFloat2.setDuration(150L);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "apply(...)");
                return objectAnimatorOfFloat2;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f302601a) {
            case 23:
                o2 o2Var = o2.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) o2Var.invoke(p0)).booleanValue();
            case 24:
                s1 s1Var = s1.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) s1Var.invoke(p0)).booleanValue();
            default:
                n2 n2Var = n2.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) n2Var.invoke(p0)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        return Tasks.forResult(null);
    }

    public /* synthetic */ a(int i, Function1 function1) {
        this.f302601a = i;
    }

    public /* synthetic */ a(int i, boolean z) {
        this.f302601a = i;
    }
}
