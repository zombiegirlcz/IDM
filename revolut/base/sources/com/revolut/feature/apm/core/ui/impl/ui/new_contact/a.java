package com.revolut.feature.apm.core.ui.impl.ui.new_contact;

import c12.f;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kge.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import oki.h;
import pqc.k;
import q22.c;
import rd0.e;
import s22.b;
import vkm.j2;
import yji.l;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final ApmNewContactNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f62352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f62353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pn3.a f62354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f62355t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[EDGE_INSN: B:75:0x00d5->B:41:0x00d5 BREAK  A[LOOP:0: B:34:0x00ba->B:77:?]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData r21, kge.d r22, c12.f r23, s22.b r24, pn3.a r25, phm.a r26, zzl.b r27, cli.n r28) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.new_contact.a.<init>(com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData, kge.d, c12.f, s22.b, pn3.a, phm.a, zzl.b, cli.n):void");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, e.b(((pn3.b) this.f62354s).b()), null, null, new k(this, null, 29), 3);
    }

    public final void I2() {
        Object next;
        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = this.o;
        IllegalStateException illegalStateException = new IllegalStateException("No Contact in " + apmNewContactNavigation$InputData.f62246a + " NewContact");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
        ApmNewContactNavigation$Tab tab2 = ((q22.a) ((j2) this.u.f22677a).getValue()).f241483a;
        Iterator it8 = apmNewContactNavigation$InputData.f62247b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((ApmNewContactNavigation$Tab) next) instanceof ApmNewContactNavigation$Tab.PHONE) {
                    break;
                }
            }
        }
        ApmNewContactNavigation$Tab apmNewContactNavigation$Tab = (ApmNewContactNavigation$Tab) next;
        n02.b contactKind = apmNewContactNavigation$InputData.f62246a;
        boolean z = apmNewContactNavigation$Tab != null;
        b bVar = this.f62353r;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(contactKind, "contactKind");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        l.a1(this, X1(new y0("CONTACT_NOT_FOUND_DIALOG_ID", ((tab2 instanceof ApmNewContactNavigation$Tab.TAX) && z) ? new l0(new TextLocalisedClause(R$string.apm_new_contact_dialog_not_found_tax_title, v.k(((ApmNewContactNavigation$Tab.TAX) tab2).f62254b, c8g.a.p(contactKind).e()), null, 12), null, null, new TextLocalisedClause(R$string.apm_new_contact_dialog_not_found_tax_action, null, null, 14), null, null, false, null, 1014) : new l0(bVar.a(contactKind), null, null, null, null, null, false, null, 1022), false, 4)), null, null, new a9h.a(tab2, apmNewContactNavigation$Tab, this, continuation, 25), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
