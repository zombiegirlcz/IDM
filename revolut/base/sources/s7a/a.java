package s7a;

import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.picker.legacy.PickerScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t7a.a f260598b;

    public /* synthetic */ a(t7a.a aVar, int i) {
        this.f260597a = i;
        this.f260598b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f260597a;
        t7a.a aVar = this.f260598b;
        switch (i) {
            case 0:
                PickerController.Companion companion = PickerController.INSTANCE;
                NavBarWithToolbar pickerNavBar = aVar.f268625c;
                pickerNavBar.E0();
                Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
                kli.c.d(pickerNavBar, 0L);
                break;
            default:
                KProperty[] kPropertyArr = PickerScreen.m0;
                NavBarWithToolbar pickerNavBar2 = aVar.f268625c;
                pickerNavBar2.E0();
                Intrinsics.checkNotNullExpressionValue(pickerNavBar2, "pickerNavBar");
                kli.c.d(pickerNavBar2, 0L);
                break;
        }
    }
}
