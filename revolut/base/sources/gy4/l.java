package gy4;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetControllerContract$InputData;
import ip0.a10;
import ip0.c10;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerBottomSheetControllerContract$InputData f147830a;

    public l(PickerBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f147830a = inputData;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PickerBottomSheetControllerContract$InputData pickerBottomSheetControllerContract$InputData = this.f147830a;
        lw0.a aVar = new lw0.a(pickerBottomSheetControllerContract$InputData.f69840a, null, null, null, false, 30);
        ArrayList<j> arrayList = pickerBottomSheetControllerContract$InputData.f69842c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (j jVar2 : arrayList) {
            arrayList2.add(new c10(jVar2.f147827a, jVar2));
        }
        a10 a10Var = new a10("ID_PICKER", arrayList2, arrayList.indexOf(domainState.f147821a));
        yp0.b.l(a10Var, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_PICKER_ACTION", LargeActionButton.ButtonStyle.f58725a, null, pickerBottomSheetControllerContract$InputData.f69841b, false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, i, i, 0, 0, 12);
        return new i(v.k(a10Var, model), aVar);
    }
}
