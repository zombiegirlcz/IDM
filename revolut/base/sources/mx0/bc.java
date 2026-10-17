package mx0;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.views.SwipeableCardsView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class bc implements kfm.g, OnApplyWindowInsetsListener, kfm.o, kfm.p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f209618b;

    public /* synthetic */ bc(Object obj2, int i) {
        this.f209617a = i;
        this.f209618b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f209617a;
        Object obj3 = this.f209618b;
        switch (i) {
            case 0:
                SwipeableCardsView.Companion aVar = SwipeableCardsView.INSTANCE;
                ((v9) obj3).invoke(obj2);
                break;
            case 3:
                ((v9) obj3).invoke(obj2);
                break;
            case 4:
                ((oc) obj3).invoke(obj2);
                break;
            case 10:
                ((a7) obj3).invoke(obj2);
                break;
            default:
                ((my5.e) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f209617a;
        Object obj2 = this.f209618b;
        switch (i) {
            case 2:
                int i2 = TagsView.e;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pc) ((oc) obj2).invoke(p0);
            case 3:
            case 4:
            case 10:
            case 16:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PluginPayload) ((ja3.d) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((mx7.a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((mx7.a) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((mll.h) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((oc) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((mt9.c) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((oc) obj2).invoke(p0);
                return Boolean.TRUE;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mxa.d) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mxa.d) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (my0.a) ((a7) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((oc) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((mt9.c) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((l1.e) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((oc) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((lsl.d) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((lsl.d) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((lsl.d) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((moe.c) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((lsl.d) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((mz3.f) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((mz3.f) obj2).invoke(p0);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        SwipeableCardsView swipeableCardsView = (SwipeableCardsView) this.f209618b;
        SwipeableCardsView.Companion aVar = SwipeableCardsView.INSTANCE;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        swipeableCardsView.setPadding(swipeableCardsView.getPaddingLeft(), insets2.top, swipeableCardsView.getPaddingRight(), insets2.bottom + swipeableCardsView.f58880h);
        Insets insetsOf = Insets.of(insets2.left, 0, insets2.right, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        return new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, insetsOf).build();
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        oc ocVar = (oc) this.f209618b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) ocVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        mz3.r rVar = (mz3.r) this.f209618b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (NaviCommand) rVar.invoke(p0, p17);
    }
}
