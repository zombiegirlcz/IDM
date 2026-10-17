package gch;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f142482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f142483n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f142484p;

    public k(l dialogMapper, j60.a expandableDialogControllerExtension, g input) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f142482m = dialogMapper;
        this.f142483n = expandableDialogControllerExtension;
        this.o = input;
        this.f142484p = new h(input.f142477a);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f142484p;
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        i action = (i) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        j60.a.v(this.f142483n, false, new fx5.a(this, action, 22), 1);
    }

    @Override // gch.c
    public final void e3() {
        Set availablePeriods = this.o.f142478b;
        c0 selectedPeriod = ((h) b3()).f142479a;
        l lVar = this.f142482m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        t tVar = new t(new TextLocalisedClause(R$string.wealth_robo_recurring_transfer_details_repeat, null, null, 14), null, null, 30);
        Set<c0> set = availablePeriods;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (c0 c0Var : set) {
            arrayList.add(new RowDelegate.Model(c0Var.name(), null, lVar.f142485a.a(c0Var), null, 0, null, null, null, 0, c0Var == selectedPeriod ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, false, null, c0Var == selectedPeriod, null, null, null, null, null, null, new a(c0Var), null, 0, 0, 0, 0, 532667386));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        this.f142483n.x(new y(arrayList, tVar, null, null, null, null, 1020));
    }
}
