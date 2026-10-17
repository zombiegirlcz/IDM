package yw9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = ProfileController.S;
        w wVar = (w) gVar;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        wVar.J2(textData.f52598b.toString());
        return Unit.f186387a;
    }
}
