package com.revolut.feature.business.referrals.ui.screens.invite_contacts;

import android.content.Intent;
import android.net.Uri;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$ModalStep;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import cpi.g;
import h60.d;
import hx7.e;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import rs2.b;
import ua2.r;
import vkm.j2;
import vkm.v1;
import vu.c;
import vu.f;
import yhm.m;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zs2.k;
import zs2.l;
import zs2.o;
import zs2.p;
import zs2.q;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements l {

    @NotNull
    public static final o Companion = new o();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f64347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f64348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zs2.b f64349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.a f64350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c70.a f64351t;
    public final g u;
    public final InviteContactsScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f64352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f64353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vu.g f64354y;
    public final y z;

    public a(y80.a permissionProvider, b contactsRepository, g1 shotDialogDisplayer, zs2.b promptFactory, f01.a uiKitResources, c70.a clipboard, g storeIntentProvider, InviteContactsScreenContract$InputData inputData, d lottieAnimationControllerExtension, c configurationProvider, vu.g resourceProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(promptFactory, "promptFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = permissionProvider;
        this.f64347p = contactsRepository;
        this.f64348q = shotDialogDisplayer;
        this.f64349r = promptFactory;
        this.f64350s = uiKitResources;
        this.f64351t = clipboard;
        this.u = storeIntentProvider;
        this.v = inputData;
        this.f64352w = lottieAnimationControllerExtension;
        this.f64353x = configurationProvider;
        this.f64354y = resourceProvider;
        boolean zL2 = L2();
        f0 f0Var = f0.f322471a;
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.z = mra.d.b(this, new k(data, "", f0Var, zL2), stateMapper, null, false, 12);
        this.A = e.a(this, new zo2.h(this, 10));
    }

    public final void I2() {
        y yVar = this.z;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = ((k) j2Var.getValue()).f324793b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            DeviceContact deviceContact = (DeviceContact) obj2;
            if (((k) j2Var2.getValue()).d.length() == 0 || d0.J(deviceContact.d, ((k) j2Var2.getValue()).d, true) || d0.J(deviceContact.f65992c, ((k) j2Var2.getValue()).d, false)) {
                arrayList.add(obj2);
            }
        }
        H2(yVar, new r(21, arrayList));
    }

    public final String J2() {
        String str = this.v.f64344b;
        if (str != null) {
            return str;
        }
        return this.f64350s.b(new TextLocalisedClause(((n5j.b) this.f64354y).b(f.business_referrals_invite_contacts_text), u.c(K2()), null, 12)).toString();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    public final String K2() {
        String strDecode;
        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = this.v;
        try {
            strDecode = URLDecoder.decode(inviteContactsScreenContract$InputData.f64343a, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            strDecode = null;
        }
        return strDecode == null ? inviteContactsScreenContract$InputData.f64343a : strDecode;
    }

    public final boolean L2() {
        y80.a aVar = this.o;
        return aVar.c("android.permission.READ_CONTACTS") && aVar.c("android.permission.WRITE_CONTACTS");
    }

    public final void M2() {
        if (((k) ((j2) this.z.f22677a).getValue()).f324792a) {
            b bVar = this.f64347p;
            bVar.getClass();
            yji.l.b1(this, new v1(new rhl.b(bVar, (Continuation) null, 7)), new q(this, null, 0), new q(this, null, 1), 2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void N2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case 421457194:
                if (listId.equals("NO_PERMISSION_LIST_ID")) {
                    h.v2(this.A, InviteContactsScreenContract$ModalStep.RequestPermission.f64346a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                    return;
                }
                break;
            case 876618222:
                if (listId.equals("WHATS_APP_LIST_ID")) {
                    O2("com.whatsapp");
                    return;
                }
                break;
            case 878286241:
                if (listId.equals("COPY_LINK_LIST_ID")) {
                    this.f64351t.a(null, K2(), false);
                    if (c70.a.g()) {
                        return;
                    }
                    ((k1) this.f64348q).d(((zs2.c) this.f64349r).a());
                    return;
                }
                break;
            case 992890226:
                if (listId.equals("MORE_LIST_ID")) {
                    O2(null);
                    return;
                }
                break;
            case 1899915024:
                if (listId.equals("MESSENGER_LIST_ID")) {
                    O2("com.facebook.orca");
                    return;
                }
                break;
            case 1918729248:
                if (listId.equals("ERROR_STATE_ID")) {
                    M2();
                    return;
                }
                break;
        }
        if (obj2 instanceof DeviceContact) {
            DeviceContact deviceContact = (DeviceContact) obj2;
            il3.a aVar = deviceContact.f65991b;
            String str = deviceContact.f65992c;
            int i = p.f324800a[aVar.ordinal()];
            if (i == 1) {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                intent.putExtra("android.intent.extra.TEXT", J2());
                C1(new ExternalDestination.ByIntent(intent, 102));
                return;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent2.putExtra("sms_body", J2());
            C1(new ExternalDestination.ByIntent(intent2, 101));
        }
    }

    public final void O2(String str) {
        Object objA;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", J2());
        intent.setType("text/plain");
        if (str != null) {
            intent.setPackage(str);
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = C1(new ExternalDestination.ByIntent(intent, null));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (m.a(objA) == null || str == null) {
            return;
        }
        C1(new ExternalDestination.ByIntent(this.u.t(str), null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.z, new zs2.n(this, 0));
        M2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
