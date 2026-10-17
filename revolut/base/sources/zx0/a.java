package zx0;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import ip0.u90;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325978b;

    public /* synthetic */ a(ReactionsKeyboardView reactionsKeyboardView, int i) {
        this.f325977a = i;
        this.f325978b = reactionsKeyboardView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f325977a;
        ReactionsKeyboardView reactionsKeyboardView = this.f325978b;
        switch (i) {
            case 0:
                return ReactionsKeyboardView.t(reactionsKeyboardView, (Unit) obj2);
            case 1:
                return ReactionsKeyboardView.r(reactionsKeyboardView);
            case 2:
                return ReactionsKeyboardView.o(reactionsKeyboardView, (String) obj2);
            case 3:
                return ReactionsKeyboardView.p(reactionsKeyboardView, (String) obj2);
            case 4:
                return ReactionsKeyboardView.h(reactionsKeyboardView, (String) obj2);
            case 5:
                return ReactionsKeyboardView.a(reactionsKeyboardView, (Unit) obj2);
            case 6:
                return ReactionsKeyboardView.j(reactionsKeyboardView, (Unit) obj2);
            case 7:
                return ReactionsKeyboardView.n(reactionsKeyboardView);
            case 8:
                return ReactionsKeyboardView.k(reactionsKeyboardView, (String) obj2);
            case 9:
                return ReactionsKeyboardView.f(reactionsKeyboardView, (Pair) obj2);
            case 10:
                u90 it8 = (u90) obj2;
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                reactionsKeyboardView.getClass();
                return new i(it8.f166633a, it8.f166634b, it8.f166635c, it8.d, it8.e, it8.f, it8.f166636g);
            default:
                return ReactionsKeyboardView.b(reactionsKeyboardView, (List) obj2);
        }
    }
}
