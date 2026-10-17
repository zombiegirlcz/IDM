package com.revolut.feature.contacts_chooser.impl.ui;

import cji.d;
import cli.y;
import cn3.f;
import cn3.g;
import com.revolut.data.model.Data;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import efm.r;
import gn3.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kn3.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nc1.j;
import nk4.o;
import nn3.a0;
import nn3.e;
import nn3.l;
import oki.h;
import vkm.j2;
import wli.x;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements e {
    public final y A;
    public final ContactsChooserInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f66088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pn3.a f66089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nn3.b f66090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f66091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0 f66092t;
    public final j60.a u;
    public final bn3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f66093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f66094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f66095y;
    public final d z;

    public a(ContactsChooserInputData inputData, b contactsChooserInteractor, pn3.a contactPermissionsController, nn3.b contactRecipientUtils, c contactsChooserRepository, a0 newContactBottomDialogItemsProvider, j60.a bottomExpandableDialog, bn3.a contextHandler, x deeplinkHandler, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserInteractor, "contactsChooserInteractor");
        Intrinsics.checkNotNullParameter(contactPermissionsController, "contactPermissionsController");
        Intrinsics.checkNotNullParameter(contactRecipientUtils, "contactRecipientUtils");
        Intrinsics.checkNotNullParameter(contactsChooserRepository, "contactsChooserRepository");
        Intrinsics.checkNotNullParameter(newContactBottomDialogItemsProvider, "newContactBottomDialogItemsProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(contextHandler, "contextHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f66088p = contactsChooserInteractor;
        this.f66089q = contactPermissionsController;
        this.f66090r = contactRecipientUtils;
        this.f66091s = contactsChooserRepository;
        this.f66092t = newContactBottomDialogItemsProvider;
        this.u = bottomExpandableDialog;
        this.v = contextHandler;
        this.f66093w = deeplinkHandler;
        this.f66094x = hx7.e.a(this, new o(this, 6));
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f66095y = bVarE;
        this.z = ksj.b.b();
        Data data = new Data(null, null, true, 3, null);
        List list = inputData.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new cn3.e((zm3.a) it8.next()));
        }
        f0 f0Var = f0.f322471a;
        ContactsChooserInputData contactsChooserInputData = this.o;
        List list2 = contactsChooserInputData.f66064c;
        ContactsChooserMode contactsChooserMode = contactsChooserInputData.e;
        boolean zA = ((pn3.b) this.f66089q).a();
        nn3.d dVar = nn3.d.ALL_ENABLED;
        ContactsChooserInputData contactsChooserInputData2 = this.o;
        boolean z = contactsChooserInputData2.f66066h && contactsChooserInputData2.d.size() >= 2;
        ContactsChooserInputData contactsChooserInputData3 = this.o;
        this.A = mra.d.b(this, new nn3.c(data, arrayList, f0Var, list2, contactsChooserMode, dVar, null, zA, z, null, contactsChooserInputData3.i, contactsChooserInputData3.f66073r, contactsChooserInputData3.f66068l, 0, contactsChooserInputData3.f66072q, null, contactsChooserInputData3.f66075t), stateMapper, null, false, 12);
    }

    public static nn3.d I2(List list) {
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((g) it8.next()) instanceof cn3.e) {
                    return nn3.d.CONTACTS_ENABLED;
                }
            }
        }
        if (!z || !list2.isEmpty()) {
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (((g) it9.next()) instanceof f) {
                    return nn3.d.GROUPS_ENABLED;
                }
            }
        }
        return nn3.d.ALL_ENABLED;
    }

    @Override // yji.l
    public final void I1() {
        r rVarDebounce = this.z.c().debounce(300L, TimeUnit.MILLISECONDS);
        m70.a.c(t0.f186434a);
        r rVarStartWith = rVarDebounce.startWith("");
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarSwitchMap = te0.w.l(rVarStartWith, this.f66095y).switchMap(new njf.c(new nn3.w(this, 0), 14));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarDistinctUntilChanged = rVarSwitchMap.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new nn3.y(this, continuation, 0), 3);
        ContactsChooserBannerContent contactsChooserBannerContent = this.o.k;
        if (contactsChooserBannerContent != null) {
            l2(new nn3.x(this, contactsChooserBannerContent, continuation, 1), new yi5.b(26));
        }
        yji.l.a1(this, this.v.c3(), null, null, new nn3.y(this, continuation, 1), 3);
    }

    public final void J2(fn3.c item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.f136524b;
        String str = item.f136523a;
        boolean z = obj2 instanceof nn3.f;
        y yVar = this.A;
        if (z) {
            H2(yVar, new j((nn3.f) obj2, ((nn3.c) ((j2) yVar.f22677a).getValue()).f217440c, 23));
            return;
        }
        if (obj2 instanceof zm3.a) {
            cn3.e eVar = new cn3.e((zm3.a) obj2);
            ContactsChooserMode contactsChooserMode = this.o.e;
            if (contactsChooserMode instanceof ContactsChooserMode.MultiSelect) {
                H2(yVar, new j(this, eVar, 22));
                return;
            } else {
                if (!(contactsChooserMode instanceof ContactsChooserMode.SingleSelect)) {
                    throw new NoWhenBranchMatchedException();
                }
                H2(yVar, new j(this, eVar, 21));
                return;
            }
        }
        if (obj2 instanceof PaymentGroup) {
            H2(yVar, new j(this, new f((PaymentGroup) obj2), 21));
            return;
        }
        if (Intrinsics.f(str, "ID_ITEM_PERMISSION")) {
            ((pn3.b) this.f66089q).c(this, new nn3.w(this, 1));
        } else if (Intrinsics.f(str, "ID_INVITE_CELL")) {
            C1(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, null, 15));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f66094x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
