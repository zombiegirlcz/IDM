package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.s2;
import mx0.t7;
import mx0.u7;
import mx0.v7;
import mx0.w7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/views/InputTravelAirportSearchItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "originClause", "", "setOrigin", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "destinationClause", "setDestination", "Lmx0/u7;", "iconGravity", "setDestinationIconGravity", "(Lmx0/u7;)V", "Lmx0/v7;", "model", "setModel", "(Lmx0/v7;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelAirportSearchItemView extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputDualTextView f58664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f58665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f58666c;
    public final ihm.b d;
    public v7 e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelAirportSearchItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDestination(Clause destinationClause) {
        InputText.setText$default(this.f58664a.getTextInput2(), destinationClause, false, 2, null);
        String string = destinationClause != null ? destinationClause.toString() : null;
        if (string == null) {
            string = "";
        }
        this.d.onNext(string);
    }

    private final void setDestinationIconGravity(u7 iconGravity) {
        int i = w7.f210075a[iconGravity.ordinal()];
        ResourceImage resourceImage = null;
        ResourceImage resourceImage2 = this.f58665b;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            resourceImage2 = null;
            resourceImage = resourceImage2;
        }
        InputDualTextView inputDualTextView = this.f58664a;
        inputDualTextView.getTextInput2().setSecondaryIconImage(resourceImage);
        inputDualTextView.getTextInput2().setPrefixIconImage(resourceImage2);
    }

    private final void setOrigin(Clause originClause) {
        InputText.setText$default(this.f58664a.getTextInput1(), originClause, false, 2, null);
        String string = originClause != null ? originClause.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f58666c.onNext(string);
    }

    public final void setModel(@NotNull v7 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Clause clause = model.f210052a;
        u7 u7Var = model.f210054c;
        Clause clause2 = model.f210053b;
        v7 v7Var = this.e;
        boolean zF = Intrinsics.f(clause, v7Var != null ? v7Var.f210052a : null);
        v7 v7Var2 = this.e;
        boolean zF2 = Intrinsics.f(clause2, v7Var2 != null ? v7Var2.f210053b : null);
        v7 v7Var3 = this.e;
        boolean z = u7Var != (v7Var3 != null ? v7Var3.f210054c : null);
        if (!zF) {
            setOrigin(model.f210052a);
        }
        if (!zF2) {
            setDestination(clause2);
        }
        if (z) {
            setDestinationIconGravity(u7Var);
        }
        this.e = model;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelAirportSearchItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTravelAirportSearchItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_travel_airport_item_search, this);
        InputDualTextView inputDualTextView = (InputDualTextView) findViewById(R$id.inputTravelAirportSearchItem_search);
        this.f58664a = inputDualTextView;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_airplane_departure, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_airplane_arrival, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.f58665b = resourceImage2;
        ihm.b bVarE = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f58666c = bVarE;
        ihm.b bVarE2 = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.d = bVarE2;
        inputDualTextView.setMergedHelperText(null, false);
        inputDualTextView.getTextInput1().setPrefixIconImage(resourceImage);
        InputText textInput1 = inputDualTextView.getTextInput1();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.uikit_travel_flight_search_origin_label, null, null, 14);
        rx0.j jVar = rx0.j.OnFocus;
        textInput1.setPlaceholder(textLocalisedClause, jVar);
        inputDualTextView.getTextInput1().setFocusable(false);
        inputDualTextView.getTextInput1().setSingleLine(true);
        inputDualTextView.getTextInput2().setPrefixIconImage(resourceImage2);
        inputDualTextView.getTextInput2().setPlaceholder(new TextLocalisedClause(R$string.uikit_travel_flight_search_destination_label, null, null, 14), jVar);
        inputDualTextView.getTextInput2().setFocusable(false);
        inputDualTextView.getTextInput2().setSingleLine(true);
        inputDualTextView.getTextInput1().s().subscribe(new s2(new t7(this, 0), 16));
        inputDualTextView.getTextInput2().s().subscribe(new s2(new t7(this, 1), 17));
        efm.r.combineLatest(bVarE, bVarE2, new s2(new mv5.h(8), 18)).distinctUntilChanged().subscribe(new s2(new t7(this, 2), 19));
    }

    public /* synthetic */ InputTravelAirportSearchItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
