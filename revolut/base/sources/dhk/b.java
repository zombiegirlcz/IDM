package dhk;

import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import wfk.a;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f114824b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f114823a = i;
        this.f114824b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f114823a;
        Function1 function1 = this.f114824b;
        switch (i) {
            case 0:
                function1.invoke(a.AbstractC1639a.C1640a.f297154a);
                break;
            default:
                WallpaperAssetSwitcher.Companion companion = WallpaperAssetSwitcher.INSTANCE;
                if (function1 != null) {
                    m.Companion companion2 = m.INSTANCE;
                    function1.invoke(new m(o.a(new Exception("Image load failed"))));
                }
                break;
        }
        return Unit.f186387a;
    }
}
