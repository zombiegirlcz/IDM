package com.revolut.feature.contacts.impl.ui_kompot.add_contact;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import iz1.g;
import java.util.Set;
import jpc.e;
import kgm.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lm3.b;
import lm3.j;
import lm3.k;
import lm3.l;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import us6.r2;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {

    @NotNull
    public static final k Companion = new k();
    public final AddContactInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pm3.b f66019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f66020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f66021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final phm.a f66022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final um3.a f66023t;
    public final rm3.a u;
    public final y80.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s70.a f66024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f66025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f66026y;

    public a(n stateMapper, pm3.a inputResolveInteractor, AddContactInputData inputData, pm3.b inputResolvePhoneInteractor, i phoneInfoInteractor, e addContactInteractor, r2 pickerInteractorProvider, um3.a navigationMapper, rm3.a dialogMapper, y80.a permissionProvider, s70.a intentProvider) {
        Set setB;
        vm3.b bVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputResolveInteractor, "inputResolveInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputResolvePhoneInteractor, "inputResolvePhoneInteractor");
        Intrinsics.checkNotNullParameter(phoneInfoInteractor, "phoneInfoInteractor");
        Intrinsics.checkNotNullParameter(addContactInteractor, "addContactInteractor");
        Intrinsics.checkNotNullParameter(pickerInteractorProvider, "pickerInteractorProvider");
        Intrinsics.checkNotNullParameter(navigationMapper, "navigationMapper");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = inputData;
        this.f66019p = inputResolvePhoneInteractor;
        this.f66020q = phoneInfoInteractor;
        this.f66021r = addContactInteractor;
        this.f66022s = pickerInteractorProvider;
        this.f66023t = navigationMapper;
        this.u = dialogMapper;
        this.v = permissionProvider;
        this.f66024w = intentProvider;
        AddContactInputData.InputMode inputMode = inputData.f65972a;
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        AddContactInputData.Prefill f65975a = inputMode.getF65975a();
        AddContactInputData.Prefill.None none = AddContactInputData.Prefill.None.f65978a;
        String str = null;
        if (!Intrinsics.f(f65975a, none)) {
            if (f65975a instanceof AddContactInputData.Prefill.Email) {
                str = ((AddContactInputData.Prefill.Email) f65975a).f65977a;
            } else if (!(f65975a instanceof AddContactInputData.Prefill.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (inputMode instanceof AddContactInputData.InputMode.Full) {
            vm3.b[] elements = {vm3.b.PHONE, vm3.b.EMAIL};
            Intrinsics.checkNotNullParameter(elements, "elements");
            setB = d.y0(elements);
        } else {
            if (!(inputMode instanceof AddContactInputData.InputMode.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            setB = y0.b(vm3.b.PHONE);
        }
        Set set = setB;
        AddContactInputData.Prefill f65975a2 = inputMode.getF65975a();
        if (Intrinsics.f(f65975a2, none) || (f65975a2 instanceof AddContactInputData.Prefill.Phone)) {
            bVar = vm3.b.PHONE;
        } else {
            if (!(f65975a2 instanceof AddContactInputData.Prefill.Email)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = vm3.b.EMAIL;
        }
        this.f66025x = mra.d.b(this, new lm3.a(set, bVar, null, "", str == null ? "" : str, "", false), stateMapper, null, false, 12);
        this.f66026y = hx7.e.a(this, new c(this, 23));
    }

    public static final void I2(a aVar, zm3.a contact) {
        int i = l.f196874a[aVar.o.f65973b.ordinal()];
        if (i == 1) {
            aVar.C2(new el3.c(contact));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.f66023t.getClass();
            Intrinsics.checkNotNullParameter(contact, "contact");
            aVar.C1(new PeerToPeerChatDestination(contact, null, false));
        }
    }

    @Override // yji.l
    public final void I1() {
        l2(new lm3.n(this, null), new j(this, 1));
    }

    public final void J2() {
        this.u.getClass();
        yji.l.a1(this, X1(new nii.y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new g(2, 23, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f66026y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f66025x;
    }
}
