package com.revolut.core.ui_kit.internal.views.timer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.l;
import e8.q;
import ev0.b;
import ev0.c;
import ev0.d;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\n\b\u0007\u0018\u0000 i2\u00020\u0001:\u0001jB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010 \u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001b\u0010#\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u001b\u0010&\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010*R\u001b\u00104\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0011\u001a\u0004\b3\u0010*R\u001b\u00107\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b6\u0010\u0013R\u001b\u0010:\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0011\u001a\u0004\b9\u0010\u0013R\u001b\u0010=\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0011\u001a\u0004\b<\u0010\u0013R\u001b\u0010@\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b?\u0010\u0013R*\u0010I\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010Q\u001a\u00020J2\u0006\u0010B\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Y\u001a\u00020R2\u0006\u0010B\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010`\u001a\u0004\u0018\u00010\n2\b\u0010B\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010h\u001a\u00020a2\u0006\u0010B\u001a\u00020a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/timer/CountDownTimerView;", "Lcom/revolut/core/ui_kit/internal/views/timer/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "millis", "", "setTime", "(J)V", "Landroid/widget/TextView;", "i", "Le8/q;", "getDividerDaysHours", "()Landroid/widget/TextView;", "dividerDaysHours", "j", "getDividerHoursMinutes", "dividerHoursMinutes", "k", "getDividerMinutesSecs", "dividerMinutesSecs", "l", "getLabelDays", "labelDays", "m", "getLabelHours", "labelHours", "n", "getLabelMinutes", "labelMinutes", "o", "getLabelSeconds", "labelSeconds", "Landroid/view/View;", "p", "getDaysBar", "()Landroid/view/View;", "daysBar", "q", "getHoursBar", "hoursBar", "r", "getMinutesBar", "minutesBar", "s", "getSecondsBar", "secondsBar", "t", "getDays", "days", "u", "getHours", "hours", "v", "getMinutes", "minutes", "w", "getSeconds", "seconds", "Lev0/c;", "value", "x", "Lev0/c;", "getMode", "()Lev0/c;", "setMode", "(Lev0/c;)V", "mode", "Lcom/revolut/core/ui_kit/internal/views/timer/TimerViewLabels;", "y", "Lcom/revolut/core/ui_kit/internal/views/timer/TimerViewLabels;", "getLabels", "()Lcom/revolut/core/ui_kit/internal/views/timer/TimerViewLabels;", "setLabels", "(Lcom/revolut/core/ui_kit/internal/views/timer/TimerViewLabels;)V", "labels", "Lev0/d;", "z", "Lev0/d;", "getTheme", "()Lev0/d;", "setTheme", "(Lev0/d;)V", "theme", "A", "Ljava/lang/Long;", "getTimeToShow", "()Ljava/lang/Long;", "setTimeToShow", "(Ljava/lang/Long;)V", "timeToShow", "", "B", "Ljava/lang/CharSequence;", "getDividerLabel", "()Ljava/lang/CharSequence;", "setDividerLabel", "(Ljava/lang/CharSequence;)V", "dividerLabel", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountDownTimerView extends a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public Long timeToShow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public CharSequence dividerLabel;
    public long C;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DecimalFormat f57663h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q dividerDaysHours;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q dividerHoursMinutes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q dividerMinutesSecs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q labelDays;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q labelHours;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q labelMinutes;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q labelSeconds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q daysBar;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q hoursBar;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q minutesBar;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q secondsBar;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q days;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q hours;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q minutes;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q seconds;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public c mode;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public TimerViewLabels labels;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public d theme;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTimerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getDays() {
        return (TextView) this.days.f();
    }

    private final View getDaysBar() {
        return this.daysBar.f();
    }

    private final TextView getDividerDaysHours() {
        return (TextView) this.dividerDaysHours.f();
    }

    private final TextView getDividerHoursMinutes() {
        return (TextView) this.dividerHoursMinutes.f();
    }

    private final TextView getDividerMinutesSecs() {
        return (TextView) this.dividerMinutesSecs.f();
    }

    private final TextView getHours() {
        return (TextView) this.hours.f();
    }

    private final View getHoursBar() {
        return this.hoursBar.f();
    }

    private final TextView getLabelDays() {
        return (TextView) this.labelDays.f();
    }

    private final TextView getLabelHours() {
        return (TextView) this.labelHours.f();
    }

    private final TextView getLabelMinutes() {
        return (TextView) this.labelMinutes.f();
    }

    private final TextView getLabelSeconds() {
        return (TextView) this.labelSeconds.f();
    }

    private final TextView getMinutes() {
        return (TextView) this.minutes.f();
    }

    private final View getMinutesBar() {
        return this.minutesBar.f();
    }

    private final TextView getSeconds() {
        return (TextView) this.seconds.f();
    }

    private final View getSecondsBar() {
        return this.secondsBar.f();
    }

    public final void g0(d theme) {
        int iS;
        int iS2;
        Intrinsics.checkNotNullParameter(theme, "theme");
        int[] iArr = b.f129678b;
        int i = iArr[theme.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorForeground, context);
        } else if (i == 2) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorBlack, context2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorWhite, context3);
        }
        getDividerDaysHours().setTextColor(iS);
        getDividerHoursMinutes().setTextColor(iS);
        getDividerMinutesSecs().setTextColor(iS);
        getLabelDays().setTextColor(iS);
        getLabelHours().setTextColor(iS);
        getLabelMinutes().setTextColor(iS);
        getLabelSeconds().setTextColor(iS);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GradientDrawable gradientDrawableH = l.h(context4, 4.0f, new Color.SolidInt(iS), 0, null);
        getDays().setBackground(gradientDrawableH);
        getDaysBar().setBackgroundColor(iS);
        getHours().setBackground(gradientDrawableH);
        getHoursBar().setBackgroundColor(iS);
        getMinutes().setBackground(gradientDrawableH);
        getMinutesBar().setBackgroundColor(iS);
        getSeconds().setBackground(gradientDrawableH);
        getSecondsBar().setBackgroundColor(iS);
        int i2 = iArr[theme.ordinal()];
        if (i2 == 1) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorBackground, context5);
        } else if (i2 == 2) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorWhite, context6);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorBlack, context7);
        }
        getDays().setTextColor(iS2);
        getHours().setTextColor(iS2);
        getMinutes().setTextColor(iS2);
        getSeconds().setTextColor(iS2);
    }

    @NotNull
    public final CharSequence getDividerLabel() {
        return this.dividerLabel;
    }

    @NotNull
    public final TimerViewLabels getLabels() {
        return this.labels;
    }

    @NotNull
    public final c getMode() {
        return this.mode;
    }

    @NotNull
    public final d getTheme() {
        return this.theme;
    }

    public final Long getTimeToShow() {
        return this.timeToShow;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView.h0():void");
    }

    @Override // com.revolut.core.ui_kit.internal.views.timer.a, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        setMode(c.values()[bundle.getInt("STATE_KEY_MODE")]);
        setTheme(d.values()[bundle.getInt("STATE_KEY_THEME")]);
        setTimeToShow(Long.valueOf(bundle.getLong("STATE_KEY_TIME")));
        this.C = bundle.getLong("STATE_KEY_DISPLAY_DAYS");
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // com.revolut.core.ui_kit.internal.views.timer.a, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putInt("STATE_KEY_MODE", this.mode.ordinal());
        bundle.putInt("STATE_KEY_THEME", this.theme.ordinal());
        Long l2 = this.timeToShow;
        bundle.putLong("STATE_KEY_TIME", l2 != null ? l2.longValue() : 0L);
        bundle.putLong("STATE_KEY_DISPLAY_DAYS", this.C);
        return bundle;
    }

    public final void setDividerLabel(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.dividerLabel = value;
        getDividerMinutesSecs().setText(value);
        getDividerHoursMinutes().setText(value);
        getDividerDaysHours().setText(value);
    }

    public final void setLabels(@NotNull TimerViewLabels value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labels = value;
        ty0.c.b(u.k(this).b0(), this.labels.f57676a, getLabelDays(), null, null, 12);
        ty0.c.b(u.k(this).b0(), this.labels.f57677b, getLabelHours(), null, null, 12);
        ty0.c.b(u.k(this).b0(), this.labels.f57678c, getLabelMinutes(), null, null, 12);
        ty0.c.b(u.k(this).b0(), this.labels.d, getLabelSeconds(), null, null, 12);
    }

    public final void setMode(@NotNull c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mode = value;
        h0();
    }

    public final void setTheme(@NotNull d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value == this.theme) {
            return;
        }
        this.theme = value;
        g0(value);
    }

    @Override // com.revolut.core.ui_kit.internal.views.timer.a
    public void setTime(long millis) {
        long j2 = millis / ((long) 1000);
        long j3 = 60;
        long j5 = j2 / j3;
        long j16 = j5 / j3;
        long j22 = 24;
        long j42 = j16 / j22;
        long j46 = j2 % j3;
        long j47 = j5 % j3;
        c cVar = this.mode;
        int[] iArr = b.f129677a;
        int i = iArr[cVar.ordinal()];
        if (i == 1 || i == 2) {
            j16 %= j22;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = iArr[this.mode.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j42 = 0;
        }
        this.C = j42;
        c cVar2 = this.mode;
        c cVar3 = c.UP_TO_DAYS;
        DecimalFormat decimalFormat = this.f57663h;
        if (cVar2 == cVar3 || (cVar2 == c.ONLY_DAYS && j42 > 0)) {
            getDays().setText(decimalFormat.format(this.C));
        }
        if (this.mode != c.ONLY_DAYS || this.C <= 0) {
            getHours().setText(decimalFormat.format(j16));
            getMinutes().setText(decimalFormat.format(j47));
            getSeconds().setText(decimalFormat.format(j46));
        }
        h0();
    }

    public final void setTimeToShow(Long l2) {
        this.timeToShow = l2;
        setTime(l2 != null ? l2.longValue() : 0L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57663h = new DecimalFormat("00");
        this.dividerDaysHours = kli.a.J(R$id.viewTimer_dividerDaysHours, this);
        this.dividerHoursMinutes = kli.a.J(R$id.viewTimer_dividerHoursMinutes, this);
        this.dividerMinutesSecs = kli.a.J(R$id.viewTimer_dividerMinutesSecs, this);
        this.labelDays = kli.a.J(R$id.viewTimer_labelDays, this);
        this.labelHours = kli.a.J(R$id.viewTimer_labelHours, this);
        this.labelMinutes = kli.a.J(R$id.viewTimer_labelMinutes, this);
        this.labelSeconds = kli.a.J(R$id.viewTimer_labelSeconds, this);
        this.daysBar = kli.a.J(R$id.viewTimer_daysBar, this);
        this.hoursBar = kli.a.J(R$id.viewTimer_hoursBar, this);
        this.minutesBar = kli.a.J(R$id.viewTimer_minutesBar, this);
        this.secondsBar = kli.a.J(R$id.viewTimer_secondsBar, this);
        this.days = kli.a.J(R$id.viewTimer_days, this);
        this.hours = kli.a.J(R$id.viewTimer_hours, this);
        this.minutes = kli.a.J(R$id.viewTimer_minutes, this);
        this.seconds = kli.a.J(R$id.viewTimer_seconds, this);
        this.mode = c.UP_TO_HOURS;
        this.labels = new TimerViewLabels(null, null, null, null);
        d dVar = d.SYSTEM;
        this.theme = dVar;
        this.dividerLabel = "";
        View.inflate(context, R$layout.internal_view_timer_layout, this);
        setDividerLabel(":");
        g0(dVar);
    }

    public /* synthetic */ CountDownTimerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
