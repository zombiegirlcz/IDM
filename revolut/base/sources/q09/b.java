package q09;

import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import ip0.gj0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LessonScreen f241179b;

    public /* synthetic */ b(LessonScreen lessonScreen, int i) {
        this.f241178a = i;
        this.f241179b = lessonScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f241178a;
        LessonScreen lessonScreen = this.f241179b;
        switch (i) {
            case 0:
                gj0 error = (gj0) obj2;
                KProperty[] kPropertyArr = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(error, "error");
                return new w(lessonScreen.Z2().f110334b.getCurrentItem(), error);
            default:
                KProperty[] kPropertyArr2 = LessonScreen.c0;
                SwipeableCardsView swipeableCardsView = lessonScreen.Z2().f110334b;
                swipeableCardsView.setCurrentItem(swipeableCardsView.getCurrentItem() + 1);
                return Unit.f186387a;
        }
    }
}
