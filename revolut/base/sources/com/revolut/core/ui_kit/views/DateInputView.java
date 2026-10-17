package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewGroupKt;
import com.google.common.primitives.Ints;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.l7;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.f5;
import mx0.g5;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 K2\u00020\u0001:\u0002LMB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u00107R*\u0010B\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0014R\u0011\u0010F\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0011\u0010J\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bI\u0010E¨\u0006N"}, d2 = {"Lcom/revolut/core/ui_kit/views/DateInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/time/LocalDate;", "localDate", "", "setDate", "(Ljava/time/LocalDate;)V", "getDate", "()Ljava/time/LocalDate;", "", "error", "setError", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "helperText", "setHelperText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "activated", "setActivated", "enabled", "setEnabled", "Lcom/revolut/core/ui_kit/views/input/InputText;", "b", "Le8/q;", "getDayInputText", "()Lcom/revolut/core/ui_kit/views/input/InputText;", "dayInputText", "f", "getMonthInputText", "monthInputText", "g", "getYearInputText", "yearInputText", "", "h", "Lkotlin/Lazy;", "getInputs", "()Ljava/util/List;", "inputs", "Landroidx/appcompat/widget/AppCompatTextView;", "i", "getHelperTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "helperTextView", "Landroid/content/res/ColorStateList;", "q", "getErrorColorStateList", "()Landroid/content/res/ColorStateList;", "errorColorStateList", "r", "getFocusedColorStateList", "focusedColorStateList", "value", "t", "Z", "getEnableQuickClear", "()Z", "setEnableQuickClear", "enableQuickClear", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "getInnerDayEditText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "innerDayEditText", "getInnerMonthEditText", "innerMonthEditText", "getInnerYearEditText", "innerYearEditText", "Companion", "SavedState", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final LocalDate u = LocalDate.parse("1972-01-01");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q dayInputText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q monthInputText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q yearInputText;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f58499h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q helperTextView;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f58500j;
    public final ihm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f58501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Clause f58502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f58503n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pr0.d f58504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f58505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f58506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g5 f58507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean enableQuickClear;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/DateInputView$SavedState;", "Landroid/view/View$BaseSavedState;", "Companion", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f58509a;

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(source, "source");
                SavedState savedState = new SavedState(source);
                savedState.f58509a = source.readSparseArray(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, i);
            out.writeSparseArray(this.f58509a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.DateInputView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateInputView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static List f0(DateInputView dateInputView) {
        return zhm.v.k(dateInputView.getDayInputText(), dateInputView.getMonthInputText(), dateInputView.getYearInputText());
    }

    private final InputText getDayInputText() {
        return (InputText) this.dayInputText.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ColorStateList getErrorColorStateList() {
        return (ColorStateList) this.f58505q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ColorStateList getFocusedColorStateList() {
        return (ColorStateList) this.f58506r.getValue();
    }

    private final AppCompatTextView getHelperTextView() {
        return (AppCompatTextView) this.helperTextView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<InputText> getInputs() {
        return (List) this.f58499h.getValue();
    }

    private final InputText getMonthInputText() {
        return (InputText) this.monthInputText.f();
    }

    private final InputText getYearInputText() {
        return (InputText) this.yearInputText.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void g0() {
        boolean z;
        int i;
        String strValueOf = String.valueOf(getDayInputText().getText());
        String strValueOf2 = String.valueOf(getMonthInputText().getText());
        String strValueOf3 = String.valueOf(getYearInputText().getText());
        this.f58503n &= -257;
        int length = strValueOf3.length();
        boolean z3 = true;
        LocalDate localDateWithYear = u;
        if (length == 0) {
            z = true;
        } else {
            try {
                localDateWithYear = localDateWithYear.withYear(Integer.parseInt(strValueOf3));
                z = false;
            } catch (Exception unused) {
                if (strValueOf3.length() == 4) {
                    this.f58503n |= 256;
                }
                z = true;
            }
        }
        this.f58503n &= -17;
        if (strValueOf2.length() == 0) {
            z = true;
        } else {
            try {
                localDateWithYear = localDateWithYear.withMonth(Integer.parseInt(strValueOf2));
            } catch (Exception unused2) {
                if (strValueOf2.length() == 2) {
                    this.f58503n |= 16;
                }
                z = true;
            }
        }
        this.f58503n &= -2;
        if (strValueOf.length() != 0) {
            try {
                i = Integer.parseInt(strValueOf);
                try {
                    localDateWithYear = localDateWithYear.withDayOfMonth(i);
                    z3 = z;
                } catch (Exception unused3) {
                    if (strValueOf.length() == 2) {
                        this.f58503n |= 1;
                    }
                    if (strValueOf2.length() > 0 && i <= 31) {
                        this.f58503n |= 16;
                    }
                }
            } catch (Exception unused4) {
                i = Integer.MAX_VALUE;
            }
        }
        ihm.b bVar = this.k;
        if (z3) {
            od0.i.Companion.getClass();
            bVar.onNext(od0.i.f224256b);
        } else {
            od0.i.Companion.getClass();
            bVar.onNext(od0.h.a(localDateWithYear));
        }
    }

    public final LocalDate getDate() {
        od0.i iVar = (od0.i) this.k.f();
        if (iVar != null) {
            return (LocalDate) iVar.f224257a;
        }
        return null;
    }

    public final boolean getEnableQuickClear() {
        return this.enableQuickClear;
    }

    @NotNull
    public final MaskedTextInputEditText getInnerDayEditText() {
        return getDayInputText().getInnerEditText();
    }

    @NotNull
    public final MaskedTextInputEditText getInnerMonthEditText() {
        return getMonthInputText().getInnerEditText();
    }

    @NotNull
    public final MaskedTextInputEditText getInnerYearEditText() {
        return getYearInputText().getInnerEditText();
    }

    public final void h0(boolean z) {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        Pair pair = (Pair) this.f58501l.f();
        InputText inputText = pair != null ? (InputText) pair.f186385a : null;
        if (this.f58503n != 0 || inputText == null) {
            return;
        }
        if (inputText.equals(getDayInputText())) {
            if (z || ((text3 = getDayInputText().getText()) != null && text3.length() == 2)) {
                pr0.d dVar = this.f58504p;
                if (dVar == null) {
                    Intrinsics.r("dateFormatOrder");
                    throw null;
                }
                int i = f5.f209698a[dVar.ordinal()];
                if (i == 1) {
                    getMonthInputText().getInnerEditText().requestFocus();
                    return;
                } else if (i == 2) {
                    getYearInputText().getInnerEditText().requestFocus();
                    return;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        if (inputText.equals(getMonthInputText())) {
            if (z || ((text2 = getMonthInputText().getText()) != null && text2.length() == 2)) {
                pr0.d dVar2 = this.f58504p;
                if (dVar2 == null) {
                    Intrinsics.r("dateFormatOrder");
                    throw null;
                }
                int i2 = f5.f209698a[dVar2.ordinal()];
                if (i2 == 1) {
                    getYearInputText().getInnerEditText().requestFocus();
                    return;
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    getDayInputText().getInnerEditText().requestFocus();
                    return;
                }
            }
            return;
        }
        if (inputText.equals(getYearInputText())) {
            if (z || ((text = getYearInputText().getText()) != null && text.length() == 4)) {
                pr0.d dVar3 = this.f58504p;
                if (dVar3 == null) {
                    Intrinsics.r("dateFormatOrder");
                    throw null;
                }
                int i3 = f5.f209698a[dVar3.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return;
                }
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                getMonthInputText().getInnerEditText().requestFocus();
            }
        }
    }

    public final void i0(InputText inputText, InputText inputText2, InputText inputText3) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(R$attr.uikit_dp16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iW2 = kli.a.w(R$attr.uikit_dp8, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        TextDirectionHeuristic textDirectionHeuristic = jh.d.k(context3) ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        TimeClause timeClause = new TimeClause(System.currentTimeMillis(), TimeClause.Format.DateEditable.f57960b, null, null, 12);
        ty0.c cVarB0 = or0.u.k(this).b0();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        SpannableStringBuilder spannableStringBuilderA = ty0.c.a(cVarB0, timeClause, context4, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        if (textDirectionHeuristic.isRtl(spannableStringBuilderA, 0, spannableStringBuilderA.length())) {
            l0(inputText3, inputText2, inputText);
        } else {
            l0(inputText, inputText2, inputText3);
        }
        setPadding(iW, getPaddingTop(), iW, getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = inputText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, iW2, marginLayoutParams.bottomMargin);
        inputText.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = inputText2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(0, marginLayoutParams2.topMargin, iW2, marginLayoutParams2.bottomMargin);
        inputText2.setLayoutParams(marginLayoutParams2);
        ViewGroup.LayoutParams layoutParams3 = inputText3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(0, marginLayoutParams3.topMargin, 0, marginLayoutParams3.bottomMargin);
        inputText3.setLayoutParams(marginLayoutParams3);
        inputText.getInnerEditText().setImeOptions(5);
        final int i = 0;
        inputText.getInnerEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: mx0.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputView f209674b;

            {
                this.f209674b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                int i3 = i;
                DateInputView dateInputView = this.f209674b;
                switch (i3) {
                    case 0:
                        DateInputView.Companion companion = DateInputView.INSTANCE;
                        if (i2 == 5) {
                            dateInputView.h0(true);
                        }
                        break;
                    default:
                        DateInputView.Companion companion2 = DateInputView.INSTANCE;
                        if (i2 == 5) {
                            dateInputView.h0(true);
                        }
                        break;
                }
                return true;
            }
        });
        inputText2.getInnerEditText().setImeOptions(5);
        final int i2 = 1;
        inputText2.getInnerEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: mx0.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateInputView f209674b;

            {
                this.f209674b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i22, KeyEvent keyEvent) {
                int i3 = i2;
                DateInputView dateInputView = this.f209674b;
                switch (i3) {
                    case 0:
                        DateInputView.Companion companion = DateInputView.INSTANCE;
                        if (i22 == 5) {
                            dateInputView.h0(true);
                        }
                        break;
                    default:
                        DateInputView.Companion companion2 = DateInputView.INSTANCE;
                        if (i22 == 5) {
                            dateInputView.h0(true);
                        }
                        break;
                }
                return true;
            }
        });
        inputText3.getInnerEditText().setImeOptions(6);
    }

    public final void j0(boolean z) {
        InputText dayInputText;
        pr0.d dVar = this.f58504p;
        if (dVar == null) {
            Intrinsics.r("dateFormatOrder");
            throw null;
        }
        int i = f5.f209698a[dVar.ordinal()];
        if (i == 1) {
            dayInputText = getDayInputText();
        } else if (i == 2) {
            dayInputText = getMonthInputText();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dayInputText = getYearInputText();
        }
        dayInputText.C0(z);
    }

    public final void l0(InputText inputText, InputText inputText2, InputText inputText3) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(inputText.getId(), 1, 0, 1);
        constraintSet.connect(inputText.getId(), 2, inputText2.getId(), 1);
        constraintSet.connect(inputText2.getId(), 1, inputText.getId(), 2);
        constraintSet.connect(inputText2.getId(), 2, inputText3.getId(), 1);
        constraintSet.connect(inputText3.getId(), 1, inputText2.getId(), 2);
        constraintSet.connect(inputText3.getId(), 2, 0, 2);
        constraintSet.applyTo(this);
    }

    public final void m0() {
        if (this.o) {
            Iterator<T> it8 = getInputs().iterator();
            while (it8.hasNext()) {
                ((InputText) it8.next()).setError(true);
            }
        } else {
            getDayInputText().setError((this.f58503n & 1) == 1);
            getMonthInputText().setError((this.f58503n & 16) == 16);
            getYearInputText().setError((this.f58503n & 256) == 256);
        }
        n0();
        if (this.o || this.f58503n != 0) {
            getHelperTextView().setTextColor(getErrorColorStateList());
        } else {
            getHelperTextView().setTextColor(getFocusedColorStateList());
        }
    }

    public final void n0() {
        Float fValueOf = Float.valueOf(12.0f);
        boolean z = this.f58503n != 0;
        SpannableStringBuilder spannableStringBuilderAppend = null;
        Clause textLocalisedClause = z ? new TextLocalisedClause(R$string.uikit_date_input_error_invalid, null, null, 14) : this.f58502m;
        getHelperTextView().setVisibility(textLocalisedClause == null ? 8 : 0);
        AppCompatTextView helperTextView = getHelperTextView();
        if (textLocalisedClause != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.o || z) {
                ty0.c cVarB0 = or0.u.k(this).b0();
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_info_outline, Integer.valueOf(R$attr.uikit_colorRed), fValueOf, fValueOf, 16);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                spannableStringBuilder.append((CharSequence) ty0.c.a(cVarB0, imageClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                spannableStringBuilder.append((CharSequence) " ");
            }
            ty0.c cVarB02 = or0.u.k(this).b0();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) ty0.c.a(cVarB02, textLocalisedClause, context2, new mm7.h(1, this.f58500j, ihm.k.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 26), null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        }
        helperTextView.setText(spannableStringBuilderAppend);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f58509a;
        if (sparseArray != null) {
            Iterator it8 = ViewGroupKt.getChildren(this).iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).restoreHierarchyState(sparseArray);
            }
        }
        g0();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Iterator it8 = ViewGroupKt.getChildren(this).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).saveHierarchyState(sparseArray);
        }
        savedState.f58509a = sparseArray;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m0();
        }
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        super.setActivated(activated);
        Iterator<T> it8 = getInputs().iterator();
        while (it8.hasNext()) {
            ((InputText) it8.next()).setActivated(activated);
        }
    }

    public final void setDate(LocalDate localDate) {
        if (localDate == null) {
            Iterator<T> it8 = getInputs().iterator();
            while (it8.hasNext()) {
                ((InputText) it8.next()).getInnerEditText().setText("");
            }
        } else {
            String strB0 = d0.b0(String.valueOf(localDate.getDayOfMonth()), 2, '0');
            String strB02 = d0.b0(String.valueOf(localDate.getMonth().getValue()), 2, '0');
            String strValueOf = String.valueOf(localDate.getYear());
            getInnerDayEditText().setText(strB0);
            getInnerMonthEditText().setText(strB02);
            getInnerYearEditText().setText(strValueOf);
        }
    }

    public final void setEnableQuickClear(boolean z) {
        this.enableQuickClear = z;
        Iterator<T> it8 = getInputs().iterator();
        while (it8.hasNext()) {
            ((InputText) it8.next()).setEnableQuickClear(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<T> it8 = getInputs().iterator();
        while (it8.hasNext()) {
            ((InputText) it8.next()).setEnabled(enabled);
        }
    }

    public final void setError(boolean error) {
        this.o = error;
        m0();
    }

    public final void setHelperText(Clause helperText) {
        this.f58502m = helperText;
        n0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        pr0.d dVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dayInputText = kli.a.J(R$id.dateInput_day, this);
        this.monthInputText = kli.a.J(R$id.dateInput_month, this);
        this.yearInputText = kli.a.J(R$id.dateInput_year, this);
        this.f58499h = te0.w.y0(new maa.r(this, 28));
        this.helperTextView = kli.a.J(R$id.dateInput_helperText, this);
        this.f58500j = v0.a.d("create(...)");
        this.k = j6.a.h("create(...)");
        this.f58501l = j6.a.h("create(...)");
        this.f58505q = te0.w.y0(new lu0.a(context, 10));
        this.f58506r = te0.w.y0(new lu0.a(context, 11));
        this.f58507s = new g5(this);
        View.inflate(context, R$layout.internal_view_date_input, this);
        for (InputText inputText : getInputs()) {
            inputText.setInputType(2);
            inputText.setSingleLine(true);
            inputText.getInnerEditText().a(new l7(this, inputText, 1));
            inputText.r0(this.f58507s);
        }
        n0();
        getDayInputText().setInputFilters(zhm.u.c(new mp0.d(2)));
        getMonthInputText().setInputFilters(zhm.u.c(new mp0.d(2)));
        getYearInputText().setInputFilters(zhm.u.c(new mp0.d(4)));
        getDayInputText().setLabel(new TextLocalisedClause(R$string.uikit_date_input_label_day, null, null, 14));
        getMonthInputText().setLabel(new TextLocalisedClause(R$string.uikit_date_input_label_month, null, null, 14));
        getYearInputText().setLabel(new TextLocalisedClause(R$string.uikit_date_input_label_year, null, null, 14));
        Locale locale = jh.d.e(context);
        Intrinsics.checkNotNullParameter(locale, "locale");
        pr0.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strPatternForStyle = DateTimeFormat.patternForStyle("S-", locale);
        Intrinsics.h(strPatternForStyle);
        int iS = d0.S(strPatternForStyle, 'd', 0, 6);
        int iS2 = d0.S(strPatternForStyle, 'M', 0, 6);
        Integer numValueOf = iS2 <= -1 ? null : Integer.valueOf(iS2);
        int iIntValue = numValueOf != null ? numValueOf.intValue() : d0.S(strPatternForStyle, 'L', 0, 6);
        int iS3 = d0.S(strPatternForStyle, 'y', 0, 6);
        int iMin = Ints.min(iS, iIntValue, iS3);
        if (iMin == iS3) {
            dVar = pr0.d.YMD;
        } else if (iMin == iIntValue) {
            dVar = pr0.d.MDY;
        } else {
            dVar = pr0.d.DMY;
        }
        this.f58504p = dVar;
        if (dVar != null) {
            int i2 = f5.f209698a[dVar.ordinal()];
            if (i2 == 1) {
                i0(getDayInputText(), getMonthInputText(), getYearInputText());
                return;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i0(getYearInputText(), getMonthInputText(), getDayInputText());
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                i0(getMonthInputText(), getDayInputText(), getYearInputText());
                return;
            }
        }
        Intrinsics.r("dateFormatOrder");
        throw null;
    }

    public /* synthetic */ DateInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
