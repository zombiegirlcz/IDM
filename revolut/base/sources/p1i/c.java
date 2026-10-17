package p1i;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import rp0.z;
import s06.j;
import wm.b;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f231935b;

    public /* synthetic */ c(h hVar, int i) {
        this.f231934a = i;
        this.f231935b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f231934a) {
            case 0:
                LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return Intrinsics.f(model.f52613a, "LIST_ID_BUTTON_GOT_IT") ? this.f231935b.i.c0(new b.a()) : m.f235744a;
            case 1:
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((j) this.f231935b.k).c(it8.f275445a, false, lg0.a.IGNORE);
            case 2:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return this.f231935b.i.c0(new b.a());
            case 3:
                z clickData = (z) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f256227a, "ITEM_ID_SUBTITLE_LEARN_MORE")) {
                    return m.f235744a;
                }
                h hVar = this.f231935b;
                return hVar.f231941l.a(new FeatureCommand(u0.d(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("df1c63f2-24a6-45b0-8cf9-f31284c9c852", 14), (SharedFaqDestination.PassthroughData) null, false, 14)))).e(hVar.i.c0(new b.a()));
            default:
                e0m.e.b(((rpi.b) this.f231935b.f231940j).f256387h, false);
                return Unit.f186387a;
        }
    }
}
