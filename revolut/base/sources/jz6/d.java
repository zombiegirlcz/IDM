package jz6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = FreelancerBusinessDescriptionScreen.Q;
        o oVar = (o) iVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        String string = textData.f52598b.toString();
        oVar.H2(oVar.f179603r, new jb8.a(string, 16));
        oVar.n2(new n(oVar, string, null), new whi.b(6));
        return Unit.f186387a;
    }
}
