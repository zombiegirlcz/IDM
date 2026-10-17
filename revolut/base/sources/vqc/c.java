package vqc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import defpackage.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import zp0.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model p0 = (InputTextDelegate.Model) obj2;
        InputText p17 = (InputText) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        EmployerDetailsScreen employerDetailsScreen = (EmployerDetailsScreen) this.receiver;
        KProperty[] kPropertyArr = EmployerDetailsScreen.Q;
        employerDetailsScreen.getClass();
        Object obj4 = p0.P;
        if ((obj4 instanceof h ? (h) obj4 : null) == null) {
            return null;
        }
        return new y(p17.getInnerEditText(), null, "[00].[000].[000]/[0000]-[00…]", new e1(p0, employerDetailsScreen, 9), p0.f52580a, null, false, 98);
    }
}
