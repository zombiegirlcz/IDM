package com.revolut.core.ui_kit.views.numpad;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.NumpadView;
import com.revolut.core.ui_kit.views.e;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dj0.d;
import dr0.l;
import ifm.b;
import ifm.c;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import v0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010\u0014R$\u0010.\u001a\u0004\u0018\u00010'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/revolut/core/ui_kit/views/numpad/PosNumpadView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "", "setChevronVisible", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setHint", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actionItems", "setActionButtons", "(Ljava/util/List;)V", "", "amount", "setAmount", "(J)V", "Lxi0/b;", "currency", "setCurrency", "(Lxi0/b;)V", "Ldj0/d;", "money", "setMoney", "(Ldj0/d;)V", "setStartAction", "Landroid/os/Parcelable;", "a", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lcom/revolut/core/ui_kit/views/NumpadView;", "b", "Lcom/revolut/core/ui_kit/views/NumpadView;", "getNumpadView$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/views/NumpadView;", "numpadView", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PosNumpadView extends FrameLayout implements TrackableItem, h {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final NumpadView numpadView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f59563c;
    public int d;
    public final f e;
    public b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f59564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f59565h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PosNumpadView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f59563c.setAmount(new MoneyClause(this.f59564g, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12));
        this.e.onNext(this.f59564g);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getNumpadView$ui_kit_components_release, reason: from getter */
    public final NumpadView getNumpadView() {
        return this.numpadView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f = new b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i5, int i6) {
        super.onLayout(z, i2, i3, i5, i6);
        int i21 = i5 - i2;
        int i22 = (i6 - this.d) - i3;
        this.f59563c.layout(0, 0, i21, i22);
        this.numpadView.layout(0, i22, i21, i6 - i3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        e eVar = this.f59563c;
        eVar.measure(i2, iMakeMeasureSpec);
        int measuredHeight = size2 - eVar.getMeasuredHeight();
        int iMin = Integer.min(this.f59565h, measuredHeight);
        this.d = iMin;
        this.numpadView.measure(i2, iMin);
        int i5 = this.d;
        if (i5 < measuredHeight) {
            eVar.measure(i2, View.MeasureSpec.makeMeasureSpec(size2 - i5, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }

    public final void setActionButtons(@NotNull List<ActionsView.Item> actionItems) {
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        this.f59563c.setActionButtons(actionItems);
    }

    public final void setAmount(long amount) {
        d dVar = this.f59564g;
        if (amount != dVar.f115082a) {
            this.f59564g = d.c(dVar, amount, null, 2);
            a();
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setChevronVisible(boolean visible) {
        this.f59563c.setChevronVisible(visible);
    }

    public final void setCurrency(@NotNull xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (Intrinsics.f(currency, this.f59564g.f115083b)) {
            return;
        }
        this.f59564g = d.c(this.f59564g, 0L, currency, 1);
        a();
    }

    public final void setHint(Clause clause) {
        this.f59563c.setHint(clause);
    }

    public final void setMoney(@NotNull d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        if (Intrinsics.f(money, this.f59564g)) {
            return;
        }
        this.f59564g = money;
        a();
    }

    public final void setStartAction(Clause clause) {
        this.numpadView.setStartAction(clause);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PosNumpadView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosNumpadView(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = a.d("create(...)");
        d.Companion.getClass();
        this.f59564g = d.e;
        float fZ = kli.a.z(kli.a.w(R$attr.uikit_box_corner_radius, context), context);
        this.f59565h = kli.a.k(context, 480.0f);
        AttributeSet attributeSet2 = null;
        int i3 = 6;
        int i5 = 0;
        NumpadView numpadView = new NumpadView(context, attributeSet2, i3, i5);
        addView(numpadView);
        this.numpadView = numpadView;
        e eVar = new e(context, attributeSet2, i3, i5);
        addView(eVar);
        this.f59563c = eVar;
        setBackground(l.h(context, fZ, new Color.Solid(R$attr.uikit_colorWidgetBackground), 0, null));
        numpadView.setStartAction(new ImageClause(R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorLightBlue), (Float) null, (Float) null, 28));
        numpadView.setEndAction(new ImageClause(R$drawable.uikit_icn_24_arrow_backspace, Integer.valueOf(R$attr.uikit_colorRed), (Float) null, (Float) null, 28));
        c cVarSubscribe = numpadView.f58812c.subscribe(new xt1.a(22, new xx0.a(this, 0)));
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(cVarSubscribe);
        }
        c cVarSubscribe2 = numpadView.f58810a.filter(new xt1.a(23, new xx0.a(this, 1))).subscribe(new xt1.a(24, new xx0.a(this, 2)));
        b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.a(cVarSubscribe2);
        }
        a();
    }

    public /* synthetic */ PosNumpadView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
