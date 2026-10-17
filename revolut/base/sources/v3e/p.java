package v3e;

import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import com.revolut.feature.stories.StoriesActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoriesActivity f285910b;

    public /* synthetic */ p(StoriesActivity storiesActivity, int i) {
        this.f285909a = i;
        this.f285910b = storiesActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285909a) {
            case 0:
                BaseStoriesModel model = (BaseStoriesModel) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return this.f285910b.b1().f59735a.e.map(new v20.t(model, 29));
            default:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean zF = Intrinsics.f(it8, e.f285892a);
                StoriesActivity storiesActivity = this.f285910b;
                if (zF) {
                    final StoriesPagerView storiesPagerViewB1 = storiesActivity.b1();
                    final int i = 0;
                    pfm.h hVar = new pfm.h(new kfm.a() { // from class: hy0.b
                        @Override // kfm.a
                        public final void run() {
                            switch (i) {
                                case 0:
                                    StoriesPagerView.g(storiesPagerViewB1);
                                    break;
                                default:
                                    StoriesPagerView.i(storiesPagerViewB1);
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                if (!Intrinsics.f(it8, f.f285898a)) {
                    throw new NoWhenBranchMatchedException();
                }
                final StoriesPagerView storiesPagerViewB12 = storiesActivity.b1();
                final int i2 = 1;
                pfm.h hVar2 = new pfm.h(new kfm.a() { // from class: hy0.b
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                StoriesPagerView.g(storiesPagerViewB12);
                                break;
                            default:
                                StoriesPagerView.i(storiesPagerViewB12);
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
        }
    }
}
