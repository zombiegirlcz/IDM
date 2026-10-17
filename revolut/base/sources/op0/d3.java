package op0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsWidgetDelegate f227226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewsWidgetDelegate.Model f227227c;

    public /* synthetic */ d3(NewsWidgetDelegate newsWidgetDelegate, NewsWidgetDelegate.Model model, int i) {
        this.f227225a = i;
        this.f227226b = newsWidgetDelegate;
        this.f227227c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227225a) {
            case 0:
                NewsDelegate.Model newsModel = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(newsModel, "newsModel");
                NewsWidgetDelegate.Model model = this.f227227c;
                this.f227226b.r(model, new com.revolut.core.ui_kit.delegates.widgets.n2(model.e, newsModel));
                break;
            case 1:
                NewsDelegate.Model newsModel2 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(newsModel2, "newsModel");
                NewsWidgetDelegate.Model model2 = this.f227227c;
                this.f227226b.r(model2, new com.revolut.core.ui_kit.delegates.widgets.k2(model2.e, newsModel2));
                break;
            case 2:
                NewsDelegate.Model newsModel3 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(newsModel3, "newsModel");
                NewsWidgetDelegate.Model model3 = this.f227227c;
                this.f227226b.r(model3, new com.revolut.core.ui_kit.delegates.widgets.o2(model3.e, newsModel3));
                break;
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                NewsWidgetDelegate.Model model4 = this.f227227c;
                this.f227226b.r(model4, new com.revolut.core.ui_kit.delegates.widgets.l2(model4.e, clickData));
                break;
            default:
                LargeActionButtonDelegate.Model footerModel = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(footerModel, "footerModel");
                NewsWidgetDelegate.Model model5 = this.f227227c;
                this.f227226b.r(model5, new com.revolut.core.ui_kit.delegates.widgets.m2(model5.e, footerModel));
                break;
        }
        return Unit.f186387a;
    }
}
