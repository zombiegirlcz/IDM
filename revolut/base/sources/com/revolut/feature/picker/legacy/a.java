package com.revolut.feature.picker.legacy;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.picker.R$string;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import iii.c;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import v7a.b;
import y7a.r;
import y7a.x;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerScreenContract$InputData f80378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f80379b;

    public a(PickerScreenContract$InputData inputData, b errorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        this.f80378a = inputData;
        this.f80379b = errorMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        List list;
        r domainState = (r) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.d;
        Data data = domainState.f311447a;
        if (d0.W(str)) {
            list = (List) data.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
        } else {
            list = (List) domainState.f311448b.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
        }
        List list2 = list;
        Throwable error = domainState.f311450g ? data.getError() : null;
        boolean z = true;
        int iIntValue = 0;
        boolean z3 = data.getLoading() && list2.isEmpty();
        boolean z4 = str.length() == 0 && error == null && data.getContent() == null && !z3;
        PickerScreenContract$InputData pickerScreenContract$InputData = this.f80378a;
        if (error != null) {
            List listC = u.c(new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", this.f80379b.a(error), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32708));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return new x(listC, false, null, false, str, pickerScreenContract$InputData.f80361g, 86);
        }
        if (z3 || z4) {
            ArrayList arrayListC = c.c(5);
            if (!pickerScreenContract$InputData.f80365m && !pickerScreenContract$InputData.f80367p) {
                z = false;
            }
            return new x(arrayListC, false, null, z, str, pickerScreenContract$InputData.f80361g, 86);
        }
        if (str.length() > 0 && list2.isEmpty()) {
            PickerScreenContract$InputData.NoResultsFoundConfig noResultsFoundConfig = pickerScreenContract$InputData.z;
            ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30));
            Clause clause = noResultsFoundConfig.f80375a;
            Integer num = noResultsFoundConfig.f80376b;
            List listC2 = u.c(new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", clause, num != null ? new TextLocalisedClause(num.intValue(), u.c(str), null, 12) : null, regular, zj.REGULAR, noResultsFoundConfig.f80377c, false, noResultsFoundConfig.d, null, false, 0, 0, 32576));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return new x(listC2, domainState.f, domainState.i, false, str, pickerScreenContract$InputData.f80361g, 80);
        }
        boolean z6 = pickerScreenContract$InputData.f80365m || pickerScreenContract$InputData.f80367p;
        boolean z11 = domainState.e;
        if (!z11) {
            Set set = domainState.f311449c;
            List list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                if (!set.contains(((qv0.i) obj2).getF53906a())) {
                    i = -1;
                }
                arrayList.add(Integer.valueOf(i));
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((Number) obj3).intValue() >= 0) {
                    arrayList2.add(obj3);
                }
            }
            Integer num2 = (Integer) zhm.d0.u0(arrayList2);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
        } else if (!z11) {
            throw new NoWhenBranchMatchedException();
        }
        return new x(list2, domainState.f, domainState.i, z6, iIntValue, str, !pickerScreenContract$InputData.u ? null : domainState.f311451h ? new TextNavBarMenuItem("PICKER_RESET_ITEM_ID", new TextLocalisedClause(R$string.common_action_reset, null, null, 14), null, null, 12) : new TextNavBarMenuItem("PICKER_SELECT_ALL_ITEM_ID", new TextLocalisedClause(R$string.common_action_select_all, null, null, 14), null, null, 12), pickerScreenContract$InputData.f80361g);
    }
}
