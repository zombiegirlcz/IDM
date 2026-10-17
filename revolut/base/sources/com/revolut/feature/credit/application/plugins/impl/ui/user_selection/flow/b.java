package com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow;

import aw0.o9;
import c84.t;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.application.plugins.impl.models.user_selection.SelectedUserNotEligibleException;
import d8l.d;
import e84.e;
import ebg.o;
import eh3.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements ej4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UserSelectionFlowContract$InputData f68496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gy3.a f68497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ln3.b f68498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f68499s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserSelectionFlowContract$InputData inputData, gy3.a interactor, ln3.b contactsChooserNavigationScreenProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68496p = inputData;
        this.f68497q = interactor;
        this.f68498r = contactsChooserNavigationScreenProvider;
        this.f68499s = d.a(this, new s(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        l2(new o(this, null, 9), new yi5.b(26));
    }

    @Override // c84.t, yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof SelectedUserNotEligibleException)) {
            return super.o1(throwable);
        }
        SelectedUserNotEligibleException selectedUserNotEligibleException = (SelectedUserNotEligibleException) throwable;
        X1(new y0(null, new z(new TextClause(selectedUserNotEligibleException.f66911a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(selectedUserNotEligibleException.f66912b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(selectedUserNotEligibleException.f66913c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68499s;
    }
}
