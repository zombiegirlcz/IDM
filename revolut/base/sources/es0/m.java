package es0;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import au0.i3;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.oj0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.lc;
import mx0.nc;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f128836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f128837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lc f128838c;
    public final nc d;
    public final ihm.f e;
    public final fp0.p f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        nVar.setId(R$id.tabsPeriod_start);
        this.f128836a = nVar;
        n nVar2 = new n(context);
        nVar2.setId(R$id.tabsPeriod_end);
        this.f128837b = nVar2;
        lc lcVar = new lc(null, new ResourceImage(R$drawable.uikit_icn_16_cross_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.common_action_dismiss, null, null, 14), LDSFile.EF_DG4_TAG), "close");
        this.f128838c = lcVar;
        nc ncVar = new nc(context, null, 6, 0);
        ncVar.setId(R$id.tabsPeriod_close);
        this.d = ncVar;
        this.e = v0.a.d("create(...)");
        setId(View.generateViewId());
        setOrientation(0);
        setGravity(16);
        int iK = kli.a.k(context, 36.0f);
        addView(nVar, new LinearLayout.LayoutParams(0, iK, 1.0f));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        yy0.f.e(or0.u.k(this).Q(), new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), appCompatImageView, null, null, 12);
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setImportantForAccessibility(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kli.a.k(context, 20.0f), kli.a.k(context, 20.0f));
        layoutParams.setMarginStart(kli.a.k(context, 12.0f));
        Unit unit = Unit.f186387a;
        addView(appCompatImageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, iK, 1.0f);
        layoutParams2.setMarginStart(kli.a.k(context, 12.0f));
        addView(nVar2, layoutParams2);
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorForeground, context), 4);
        int i = iK / 2;
        roundedBackgroundDrawable.f(i);
        ncVar.setBackground(roundedBackgroundDrawable);
        ncVar.setActionModel(lcVar);
        l lVar = q.Companion;
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorBackground);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorForeground);
        lVar.getClass();
        this.f = l.a(ncVar, solid, solid2, i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iK, iK);
        layoutParams3.setMarginStart(kli.a.k(context, 8.0f));
        addView(ncVar, layoutParams3);
    }

    public final void a(n nVar, CustomContentDescriptionClause customContentDescriptionClause, Parcelable parcelable, oj0 oj0Var) {
        ty0.c.b(or0.u.k(this).b0(), customContentDescriptionClause, nVar.f128840b, null, null, 12);
        fp0.p pVar = nVar.f128841c;
        TrackableItem.INSTANCE.getClass();
        CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(nVar, parcelable);
        py0.c cVar = new py0.c(customContentDescriptionClause);
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new i3(customTrackableComponentA, cVar, this, oj0Var, 1));
    }

    public final void b() {
        fp0.p pVar = this.f128836a.f128841c;
        fp0.p.b(pVar, false);
        View view = pVar.f137029a;
        or0.m.a(view);
        or0.u.o(view);
        fp0.p pVar2 = this.f128837b.f128841c;
        fp0.p.b(pVar2, false);
        View view2 = pVar2.f137029a;
        or0.m.a(view2);
        or0.u.o(view2);
        fp0.p pVar3 = this.f;
        fp0.p.b(pVar3, false);
        View view3 = pVar3.f137029a;
        or0.m.a(view3);
        or0.u.o(view3);
    }
}
