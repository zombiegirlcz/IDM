package gll;

import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin.EnterCardPINScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kyk.n;
import ljl.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144726a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnterCardPINScreen f144727b;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f144726a;
        EnterCardPINScreen enterCardPINScreen = this.f144727b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = EnterCardPINScreen.f106401b0;
                qji.b bVarQ2 = enterCardPINScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin.di.EnterCardPINScreenInjector");
                w wVar = new w();
                wVar.f196122a = e4m.b.b(new n(wVar, 1, 28));
                wVar.f196123b = e4m.b.b(new n(wVar, 0, 28));
                return wVar;
            default:
                KProperty[] kPropertyArr2 = EnterCardPINScreen.f106401b0;
                return (j) ((w) enterCardPINScreen.Y.getValue()).f196123b.get();
        }
    }
}
