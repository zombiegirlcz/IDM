package ip0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lt0.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class za implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167432a;

    public /* synthetic */ za(int i) {
        this.f167432a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 6;
        int i2 = 0;
        AttributeSet attributeSet = null;
        switch (this.f167432a) {
            case 0:
                qx0.c cVar = (qx0.c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                return cVar.f249975a;
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "it");
                throw null;
            case 2:
                ms0.k0 clickData = (ms0.k0) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                od0.h hVar = od0.i.Companion;
                LocalDate localDate = clickData.f208305a;
                hVar.getClass();
                return od0.h.a(localDate);
            case 3:
                YearMonth presentedYearMonth = (YearMonth) obj2;
                Intrinsics.checkNotNullParameter(presentedYearMonth, "presentedYearMonth");
                return presentedYearMonth.atDay(1);
            case 4:
                mx0.mc actionModel = (mx0.mc) obj2;
                Intrinsics.checkNotNullParameter(actionModel, "actionModel");
                return actionModel;
            case 5:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f186387a;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (IconDelegate.Model) pair.f186385a;
            case 7:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                throw null;
            case 8:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                throw null;
            case 9:
                lt0.q it11 = (lt0.q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11 instanceof q.a) {
                    return MultiTargetFanChartDelegate.a.C0413a.f52779a;
                }
                if (it11 instanceof lt0.r) {
                    return new com.revolut.core.ui_kit.delegates.h9(((lt0.r) it11).f199758a);
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                return Float.valueOf(1.0f - (kotlin.ranges.f.f(Math.abs(((Float) obj2).floatValue()), BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.100000024f));
            case 11:
                CharSequence it12 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.toString();
            case 12:
                x10 it13 = (x10) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f167081a;
            case 13:
                ProfileCardModel.CircleActionButtonModel it14 = (ProfileCardModel.CircleActionButtonModel) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new k30(it14);
            case 14:
                com.revolut.core.ui_kit.models.b0 it15 = (com.revolut.core.ui_kit.models.b0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new l30(it15);
            case 15:
                ty0.a it16 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new h30(it16);
            case 16:
                ActionsView.Item it17 = (ActionsView.Item) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new f30(it17);
            case 17:
                Float percentage = (Float) obj2;
                Intrinsics.checkNotNullParameter(percentage, "percentage");
                return Boolean.valueOf(percentage.floatValue() > 0.6f);
            case 18:
                jc0 it18 = (jc0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f164814b);
            case 19:
                jc0 it19 = (jc0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f164813a;
            case 20:
                View v = (View) obj2;
                SelectableDelegate.Companion companion = SelectableDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(v, "v");
                v.setClickable(false);
                return Unit.f186387a;
            case 21:
                Unit it20 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return null;
            case 22:
                Unit it21 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                throw null;
            case 23:
                Unit it22 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                throw null;
            case 24:
                wh0 it23 = (wh0) obj2;
                SwipeToActionDelegate.Companion companion2 = SwipeToActionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(it23, "it");
                Object obj3 = it23.f167030a;
                if (obj3 instanceof qv0.b) {
                    return (qv0.b) obj3;
                }
                return null;
            case 25:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
                uIKitTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceBody2);
                uIKitTextView.setId(R$id.vaultsProgress_rightTopText);
                uIKitTextView.setTextColor(io0.a.c(context, new Color.Solid(R$attr.uikit_colorForeground)));
                uIKitTextView.setMaxLines(1);
                return uIKitTextView;
            case 26:
                Context context2 = (Context) obj2;
                Intrinsics.checkNotNullParameter(context2, "context");
                TagView tagView = new TagView(context2, attributeSet, i, i2);
                tagView.setId(R$id.vaultsProgress_rightTopBadge);
                return tagView;
            case 27:
                Integer it24 = (Integer) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(it24.intValue() == 100);
            case 28:
                Integer it25 = (Integer) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Unit.f186387a;
            default:
                SuggestionsBarDelegate.Suggestion it26 = (SuggestionsBarDelegate.Suggestion) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                Object obj4 = it26.f53496h;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.WeekdayPickerDelegate.DayOfWeek");
                return (ep0) obj4;
        }
    }
}
