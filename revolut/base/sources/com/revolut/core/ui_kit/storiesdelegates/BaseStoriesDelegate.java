package com.revolut.core.ui_kit.storiesdelegates;

import an0.e;
import android.content.Context;
import android.os.Parcelable;
import android.widget.TextView;
import bx0.b;
import bx0.c;
import bx0.d;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lkoi/j;", "T", "Lbx0/d;", "VH", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseStoriesDelegate<T extends j, VH extends d> extends BaseRecyclerViewDelegate<T, VH> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f58175c;
    public Function1 d;
    public Function1 e;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStoriesDelegate(int i, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f58175c = new e(3);
        this.d = new e(4);
        this.e = new e(5);
        this.f = new e(6);
    }

    public static void p(TextView view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(kli.a.s(i, context));
    }

    public final void q(bx0.e buttonsOrientation, CollapsingActionButton primaryButton, CollapsingActionButton secondaryButton, TwinHorizontalButton twinHorizontalButton, boolean z, boolean z3, LargeActionButton.ButtonStyle primaryButtonStyle, Image image, Clause clause, Parcelable parcelable, LargeActionButton.ButtonStyle secondaryButtonStyle, Image image2, Clause clause2, Parcelable parcelable2, BaseStoriesModel data) {
        Intrinsics.checkNotNullParameter(buttonsOrientation, "buttonsOrientation");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(twinHorizontalButton, "twinHorizontalButton");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = c.f19399a[buttonsOrientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            primaryButton.setVisibility(8);
            secondaryButton.setVisibility(8);
            twinHorizontalButton.setVisibility(0);
            if (clause != null) {
                twinHorizontalButton.setPrimaryButtonVisible(true);
                twinHorizontalButton.setPrimaryButtonStyle(primaryButtonStyle);
                twinHorizontalButton.setPrimaryButtonIcon(image);
                twinHorizontalButton.setPrimaryButtonText(clause);
            } else {
                twinHorizontalButton.setPrimaryButtonVisible(false);
            }
            if (clause2 != null) {
                twinHorizontalButton.setSecondaryButtonVisible(true);
                twinHorizontalButton.setSecondaryButtonStyle(secondaryButtonStyle);
                twinHorizontalButton.setSecondaryButtonIcon(image2);
                twinHorizontalButton.setSecondaryButtonText(clause2);
            } else {
                twinHorizontalButton.setSecondaryButtonVisible(false);
            }
            twinHorizontalButton.setPrimaryButtonAnalyticsContext(parcelable);
            twinHorizontalButton.setSecondaryButtonAnalyticsContext(parcelable2);
            ((LargeActionButton) twinHorizontalButton.findViewById(R$id.primaryActionButton)).setOnClickListener(new b(this, data, 4));
            ((LargeActionButton) twinHorizontalButton.findViewById(R$id.secondaryActionButton)).setOnClickListener(new b(this, data, 5));
            return;
        }
        twinHorizontalButton.setVisibility(8);
        if (clause != null) {
            primaryButton.setVisibility(0);
            if (z3) {
                primaryButton.setFabImage(image);
                primaryButton.setFabStyle(FormsActionButton.a.b.f58990a);
            } else {
                primaryButton.setLargeButtonStyle(primaryButtonStyle);
                primaryButton.setLargeButtonIcon(image);
                primaryButton.setLargeButtonText(clause);
            }
            primaryButton.setCollapsible(z);
            primaryButton.setCollapsed(z3, false);
        } else {
            primaryButton.setVisibility(8);
        }
        primaryButton.setLargeButtonAnalyticsContext(parcelable);
        ((FormsActionButton) primaryButton.findViewById(R$id.formsActionButton)).setOnClickListener(new b(this, data, 0));
        ((LargeActionButton) primaryButton.findViewById(R$id.largeActionButton)).setOnClickListener(new b(this, data, 1));
        if (clause2 != null) {
            secondaryButton.setVisibility(0);
            secondaryButton.setLargeButtonStyle(secondaryButtonStyle);
            secondaryButton.setLargeButtonIcon(image2);
            secondaryButton.setLargeButtonText(clause2);
        } else {
            secondaryButton.setVisibility(8);
        }
        secondaryButton.setLargeButtonAnalyticsContext(parcelable2);
        ((FormsActionButton) secondaryButton.findViewById(R$id.formsActionButton)).setOnClickListener(new b(this, data, 2));
        ((LargeActionButton) secondaryButton.findViewById(R$id.largeActionButton)).setOnClickListener(new b(this, data, 3));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(d holder, j data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        s(holder, data, payloads);
        holder.F(this.f58177h, this.f58176g);
    }

    public abstract void s(d dVar, j jVar, List list);

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(d holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = this.f58177h;
        int i2 = this.f58176g;
        if (holder.f19401h == i && holder.f19400g == i2) {
            return;
        }
        holder.f19401h = i;
        holder.f19400g = i2;
        holder.F(i, i2);
    }
}
