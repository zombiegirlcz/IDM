package com.revolut.core.ui_kit.internal.views.timer;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import efm.c0;
import efm.r;
import et6.m0;
import eul.d;
import ifm.c;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a extends ConstraintLayout {

    @NotNull
    public static final ev0.a Companion = new ev0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f57679b;
    public Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f57680g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupTimer(Long l2) {
        c cVar = this.f57679b;
        if (cVar != null) {
            cVar.dispose();
        }
        if (l2 != null) {
            long jLongValue = l2.longValue() - DateTimeUtils.currentTimeMillis();
            if (jLongValue > 0) {
                r<R> map = r.interval(0L, 1L, TimeUnit.SECONDS).take(((long) Math.ceil(jLongValue / 1000.0d)) + 1).map(new m0(6, new a82.r(jLongValue, 15)));
                c0 c0Var = hfm.c.f152030a;
                m70.a.p(c0Var);
                this.f57679b = map.observeOn(c0Var).doOnSubscribe(new m0(7, new e4k.m0(this, jLongValue, 3))).subscribe(new m0(8, new eif.c(1, this, a.class, "setTime", "setTime(J)V", 0, 20)), new m0(9, new d(10)), new a08.d(this, 14));
                return;
            }
            setTime(0L);
            Function0 function0 = this.f57680g;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupTimer$lambda$7(a aVar) {
        Function0 function0 = aVar.f57680g;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Long getExpirationTime() {
        return this.f;
    }

    public final Function0<Unit> getTimeExpiredListener() {
        return this.f57680g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Long l2 = this.f;
        if (l2 != null) {
            setupTimer(Long.valueOf(l2.longValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f57679b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        setExpirationTime(Long.valueOf(bundle.getLong("STATE_KEY_EXPIRATION_TIME")));
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        Long l2 = this.f;
        bundle.putLong("STATE_KEY_EXPIRATION_TIME", l2 != null ? l2.longValue() : 0L);
        return bundle;
    }

    public final void setExpirationTime(Long l2) {
        this.f = l2;
        setupTimer(l2);
    }

    public abstract void setTime(long j2);

    public final void setTimeExpiredListener(Function0<Unit> function0) {
        this.f57680g = function0;
    }
}
