package tx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarBottomSheet f275172b;

    public /* synthetic */ k1(NavBarBottomSheet navBarBottomSheet, int i) {
        this.f275171a = i;
        this.f275172b = navBarBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f275171a;
        NavBarBottomSheet navBarBottomSheet = this.f275172b;
        switch (i) {
            case 0:
                ihm.f fVar = navBarBottomSheet.L;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 1:
                float fFloatValue = ((Float) obj2).floatValue();
                NavBarBottomSheet.Companion companion = NavBarBottomSheet.INSTANCE;
                float f = 1 - fFloatValue;
                navBarBottomSheet.N(f);
                navBarBottomSheet.L(f);
                return Unit.f186387a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                NavBarBottomSheet.Companion companion2 = NavBarBottomSheet.INSTANCE;
                if (zBooleanValue) {
                    navBarBottomSheet.O(4);
                    navBarBottomSheet.N(BitmapDescriptorFactory.HUE_RED);
                    navBarBottomSheet.L(BitmapDescriptorFactory.HUE_RED);
                } else {
                    navBarBottomSheet.O(0);
                    navBarBottomSheet.N(1.0f);
                    navBarBottomSheet.L(1.0f);
                }
                return Unit.f186387a;
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                NavBarBottomSheet.Companion companion3 = NavBarBottomSheet.INSTANCE;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                navBarBottomSheet.F.onNext(clickData);
                return Unit.f186387a;
            case 4:
                return NavBarBottomSheet.A(navBarBottomSheet);
            case 5:
                return NavBarBottomSheet.y(navBarBottomSheet);
            case 6:
                return NavBarBottomSheet.x(navBarBottomSheet, ((Float) obj2).floatValue());
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                NavBarBottomSheet.Companion companion4 = NavBarBottomSheet.INSTANCE;
                if (zBooleanValue2) {
                    navBarBottomSheet.O(4);
                    navBarBottomSheet.N(BitmapDescriptorFactory.HUE_RED);
                    navBarBottomSheet.L(BitmapDescriptorFactory.HUE_RED);
                } else {
                    navBarBottomSheet.O(0);
                    navBarBottomSheet.N(1.0f);
                    navBarBottomSheet.L(1.0f);
                }
                return Unit.f186387a;
        }
    }
}
