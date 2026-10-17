package yx0;

import ald.o;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCodeView f317525b;

    public /* synthetic */ d(PinCodeView pinCodeView, int i) {
        this.f317524a = i;
        this.f317525b = pinCodeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        o oVar;
        switch (this.f317524a) {
            case 0:
                return PinCodeView.g0(this.f317525b, (Unit) obj2);
            default:
                int iIntValue = ((Integer) obj2).intValue();
                PinCodeView pinCodeView = this.f317525b;
                pinCodeView.A.b0();
                iu0.d dVar = pinCodeView.f59597x;
                if (dVar == null) {
                    Intrinsics.r("dotsController");
                    throw null;
                }
                int i = dVar.f168429b;
                if (dVar.a().length() < i) {
                    dVar.f168428a.d();
                    dVar.d.append(iIntValue);
                    String strA = dVar.a();
                    o oVar2 = dVar.f;
                    if (oVar2 != null) {
                        oVar2.invoke(strA);
                    }
                    if (dVar.f168430c && strA.length() == i && (oVar = dVar.e) != null) {
                        oVar.invoke(strA);
                    }
                }
                pinCodeView.C0();
                return Unit.f186387a;
        }
    }
}
