package qh4;

import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qc0.e1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolleeScreen f246470b;

    public /* synthetic */ o(RolleeScreen rolleeScreen, int i) {
        this.f246469a = i;
        this.f246470b = rolleeScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f246469a;
        Continuation continuation = null;
        RolleeScreen rolleeScreen = this.f246470b;
        int i2 = 26;
        switch (i) {
            case 0:
                String screen = (String) obj2;
                KProperty[] kPropertyArr = RolleeScreen.T;
                Intrinsics.checkNotNullParameter(screen, "screen");
                rolleeScreen.g3("onInit", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : screen, null, null);
                w01.k.d(rolleeScreen.f3());
                ScreenContentRecyclerView recyclerView = rolleeScreen.d3().f10723c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                w01.k.a(recyclerView);
                break;
            case 1:
                String payload = (String) obj2;
                KProperty[] kPropertyArr2 = RolleeScreen.T;
                Intrinsics.checkNotNullParameter(payload, "payload");
                b0 b0VarR2 = rolleeScreen.R2();
                qce.a onParsed = new qce.a(12, payload, rolleeScreen);
                b0VarR2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(onParsed, "onParsed");
                b0VarR2.l2(new qd8.e(b0VarR2, payload, onParsed, (Continuation) null, 5), new yi5.b(i2));
                break;
            case 2:
                String payload2 = (String) obj2;
                KProperty[] kPropertyArr3 = RolleeScreen.T;
                Intrinsics.checkNotNullParameter(payload2, "payload");
                rolleeScreen.g3("onFetchLoading", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : payload2, null, null);
                b0 b0VarR22 = rolleeScreen.R2();
                b0VarR22.getClass();
                Intrinsics.checkNotNullParameter(payload2, "payload");
                b0VarR22.l2(new e1(b0VarR22, payload2, continuation, 10), new yi5.b(i2));
                break;
            default:
                String payload3 = (String) obj2;
                KProperty[] kPropertyArr4 = RolleeScreen.T;
                Intrinsics.checkNotNullParameter(payload3, "payload");
                rolleeScreen.g3("onFetchError", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : payload3, null, null);
                b0 b0VarR23 = rolleeScreen.R2();
                qg7.v onParsed2 = new qg7.v(2);
                b0VarR23.getClass();
                Intrinsics.checkNotNullParameter(payload3, "payload");
                Intrinsics.checkNotNullParameter(onParsed2, "onParsed");
                b0VarR23.l2(new qd8.e(b0VarR23, payload3, onParsed2, (Continuation) null, 6), new yi5.b(i2));
                break;
        }
        return Unit.f186387a;
    }
}
