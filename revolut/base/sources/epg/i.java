package epg;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.username.ui.UsernameScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
        o oVar = (o) this.receiver;
        KProperty[] kPropertyArr = UsernameScreen.f94688e0;
        u uVar = (u) oVar;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        uVar.x2(new e2j.i(textData.f52598b.toString(), 15));
        return Unit.f186387a;
    }
}
