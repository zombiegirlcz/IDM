package com.revolut.sso.impl.ui.consent.common.select_identity;

import a0.d;
import aml.m;
import aw0.h;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import vil.g;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f106463a;

    public b(g consentScreenStateMapperHelper, e dateProvider) {
        Intrinsics.checkNotNullParameter(consentScreenStateMapperHelper, "consentScreenStateMapperHelper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f106463a = consentScreenStateMapperHelper;
    }

    public static SelectableDelegate.Model a(ConsentChallenge.Qr.Delegated.Selection.Identity identity, int i, boolean z) {
        String strN = d.n("ROW_DELEGATE_IDENTITY_ITEM_", i);
        String str = identity.f105922b;
        if (str == null) {
            str = null;
        }
        return new SelectableDelegate.Model(d.n("SELECTABLE_DELEGATE_IDENTITY_ITEM_", i), new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(new ContactImage(str, (String) null, (String) null, (String) null, (String) null, identity.f105923c, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_identity_name, u.c(identity.f105923c), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, identity, null, 0, 0, 0, 0, 532674552), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, null, false, 32744);
    }

    @Override // cli.n
    public final o c(j jVar) {
        ArrayList arrayList;
        boolean z;
        SelectIdentityScreenContract$DomainState domainState = (SelectIdentityScreenContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ConsentChallenge.Qr.Delegated delegated = domainState.f106455a;
        long j2 = delegated.f105913b;
        np0.b bVarA = ((m) this.f106463a).a(delegated, domainState.f106457c, j2);
        SelectIdentityScreenContract$DomainState.SelectionState selectionState = domainState.f106456b;
        boolean z3 = selectionState instanceof SelectIdentityScreenContract$DomainState.SelectionState.NotSelected;
        if (z3) {
            List list = ((SelectIdentityScreenContract$DomainState.SelectionState.NotSelected) selectionState).f106458a;
            arrayList = new ArrayList(w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                arrayList.add(a((ConsentChallenge.Qr.Delegated.Selection.Identity) obj2, i, false));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        } else {
            if (!(selectionState instanceof SelectIdentityScreenContract$DomainState.SelectionState.Selected)) {
                throw new NoWhenBranchMatchedException();
            }
            SelectIdentityScreenContract$DomainState.SelectionState.Selected selected = (SelectIdentityScreenContract$DomainState.SelectionState.Selected) selectionState;
            List list2 = selected.f106460b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            int i3 = 0;
            for (Object obj3 : list2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                ConsentChallenge.Qr.Delegated.Selection.Identity identity = (ConsentChallenge.Qr.Delegated.Selection.Identity) obj3;
                arrayList2.add(a(identity, i3, Intrinsics.f(identity.f105921a, selected.f106459a.f105921a)));
                i3 = i5;
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList = arrayList2;
        }
        boolean z4 = System.currentTimeMillis() > j2;
        if (z3) {
            z = false;
        } else {
            if (!(selectionState instanceof SelectIdentityScreenContract$DomainState.SelectionState.Selected)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        boolean z6 = !z4 && z;
        ArrayList arrayListJ = ue0.e.J(bVarA, arrayList);
        ConsentChallenge.Qr.Delegated.Details details = domainState.f106455a.i;
        ConsentChallenge.Qr.Delegated.Details.Action action = details != null ? details.f105917a : null;
        return new dml.j(arrayListJ, action != null ? new h(false, new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_BUTTON_CONTINUE", z6, null, null, 972), new n6(new TextLocalisedClause(R$string.revolut_sso_login_confirmation_details_action_title, u.c(action.f105918a), null, 12), LargeActionButton.ButtonStyle.f58726b, null, action.f105918a, false, null, action, 492), null, null, null, 121) : new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "TAG_BUTTON_CONTINUE", z6, null, null, 972), null, null, 55));
    }
}
