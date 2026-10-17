package poe;

import beb.n;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = RationalesScreen.c0;
        j jVar = (j) hVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        jVar.x2(new n(model, 5));
        return Unit.f186387a;
    }
}
