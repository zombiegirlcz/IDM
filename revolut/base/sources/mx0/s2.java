package mx0;

import android.view.View;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.FiltersView;
import com.revolut.core.ui_kit.views.FitsSystemWindowsConstraintLayout;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.InputTravelAirportSearchItemView;
import com.revolut.core.ui_kit.views.LoginActionFooterView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.RichVideoPlayerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.q4;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s2 implements kfm.g, kfm.p, kfm.o, OnApplyWindowInsetsListener, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f209988b;

    public /* synthetic */ s2(Object obj2, int i) {
        this.f209987a = i;
        this.f209988b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f209987a;
        Object obj3 = this.f209988b;
        switch (i) {
            case 0:
                CardPersonalisationView.Companion companion = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 1:
                CardPersonalisationView.Companion companion2 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 2:
                CardPersonalisationView.Companion companion3 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 3:
                CardPersonalisationView.Companion companion4 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 4:
                CardPersonalisationView.Companion companion5 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 5:
                CardPersonalisationView.Companion companion6 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 6:
                CardPersonalisationView.Companion companion7 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 7:
                CardPersonalisationView.Companion companion8 = CardPersonalisationView.INSTANCE;
                ((t2) obj3).invoke(obj2);
                break;
            case 8:
            case 9:
            case 10:
            case 14:
            case 18:
            default:
                int i2 = LoginActionFooterView.f58759g;
                ((mt9.c) obj3).invoke(obj2);
                break;
            case 11:
                int i3 = CircleActionButtonsBarView.f58476h;
                ((mt9.c) obj3).invoke(obj2);
                break;
            case 12:
                q4.a aVar = q4.Companion;
                ((mt9.c) obj3).invoke(obj2);
                break;
            case 13:
                int i5 = FiltersView.b.f58545h;
                ((mt9.c) obj3).invoke(obj2);
                break;
            case 15:
                FloatingBottomBarView.Companion bVar = FloatingBottomBarView.INSTANCE;
                ((m6) obj3).invoke(obj2);
                break;
            case 16:
                int i6 = InputTravelAirportSearchItemView.f;
                ((t7) obj3).invoke(obj2);
                break;
            case 17:
                int i21 = InputTravelAirportSearchItemView.f;
                ((t7) obj3).invoke(obj2);
                break;
            case 19:
                int i22 = InputTravelAirportSearchItemView.f;
                ((t7) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object it8) {
        int i = this.f209987a;
        Object obj2 = this.f209988b;
        switch (i) {
            case 10:
                ChatInputView chatInputView = (ChatInputView) obj2;
                int i2 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new a4(String.valueOf(chatInputView.getInput$ui_kit_components_release().getText()), chatInputView.getInput$ui_kit_components_release().getSelectionStart(), chatInputView.getInput$ui_kit_components_release().getSelectionEnd());
            case 21:
                int i3 = MapView.f58767w;
                Intrinsics.checkNotNullParameter(it8, "p0");
                return (Float) ((mul.k) obj2).invoke(it8);
            case 24:
                NewRevolutCardView.Companion companion = NewRevolutCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "p0");
                return (efm.h0) ((mt9.c) obj2).invoke(it8);
            case 25:
                int i5 = PhoneInputTextView.f58821g;
                Intrinsics.checkNotNullParameter(it8, "p0");
                return (CharSequence) ((mul.k) obj2).invoke(it8);
            default:
                int i6 = RichVideoPlayerView.f58848c;
                Intrinsics.checkNotNullParameter(it8, "p0");
                return (Unit) ((mul.k) obj2).invoke(it8);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        FitsSystemWindowsConstraintLayout fitsSystemWindowsConstraintLayout = (FitsSystemWindowsConstraintLayout) this.f209988b;
        int i = FitsSystemWindowsConstraintLayout.f58550g;
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!ObjectsCompat.equals(fitsSystemWindowsConstraintLayout.f, insets)) {
            fitsSystemWindowsConstraintLayout.f = insets;
        }
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f209987a;
        Object obj2 = this.f209988b;
        switch (i) {
            case 8:
                int i2 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((x3) obj2).invoke(p0)).booleanValue();
            case 9:
                int i3 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((x3) obj2).invoke(p0)).booleanValue();
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mul.k) obj2).invoke(p0)).booleanValue();
            case 26:
                ProfileCardView.Companion aVar = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hb) obj2).invoke(p0)).booleanValue();
            case 27:
                ProfileCardView.Companion aVar2 = ProfileCardView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((hb) obj2).invoke(p0)).booleanValue();
            default:
                int i5 = RichVideoPlayerView.f58848c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mul.k) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        mv5.h hVar = (mv5.h) this.f209988b;
        int i = InputTravelAirportSearchItemView.f;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Boolean) hVar.invoke(p0, p17);
    }
}
