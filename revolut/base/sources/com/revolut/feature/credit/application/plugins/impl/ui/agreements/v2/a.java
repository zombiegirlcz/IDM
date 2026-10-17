package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2;

import a54.d;
import a54.f;
import c84.t;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import e84.e;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lw3.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yki.i;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements a54.a {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditAgreementsV2FlowContract$InputData f67016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f67017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sp3.a f67018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f67019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f67020t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditAgreementsV2FlowContract$InputData inputData, b interactor, sp3.a creditDataMonitoringFacade, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67016p = inputData;
        this.f67017q = interactor;
        this.f67018r = creditDataMonitoringFacade;
        this.f67019s = d8l.d.a(this, new a09.b(this, 13));
        this.f67020t = mra.d.b(this, new CreditAgreementsV2FlowContract$State(0), new a54.b(0), null, false, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P2(a aVar) {
        Object next;
        Object[] objArr;
        Iterator it8 = ((CreditAgreementsV2FlowContract$State) ((j2) aVar.f67020t.f22677a).getValue()).f67011a.iterator();
        while (true) {
            objArr = 0;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (!((du3.b) next).f117558h) {
                    break;
                }
            }
        }
        du3.b bVar = (du3.b) next;
        if (bVar == null) {
            aVar.l2(new f(aVar, objArr == true ? 1 : 0, 0), new yi5.b(26));
            return;
        }
        i iVar = aVar.f67019s;
        String str = bVar.f117554a;
        su3.a aVar2 = new su3.a(bVar.d, bVar.e, bVar.f117556c, bVar.f117555b, 20);
        DocumentViewerScreenConfig documentViewerScreenConfig = new DocumentViewerScreenConfig(true, true, null, aVar.f67016p.f67010b, new TextLocalisedClause(R$string.agreements_document_viewer_button, u.c(bVar.f), null, 12), ju3.d.BOX, 4);
        String str2 = bVar.f117557g;
        h.t2(aVar, iVar, new CreditAgreementsV2FlowContract$Step.DocumentViewer(str, str2 != null ? new TextLocalisedClause(R$string.agreements_document_viewer_button, u.c(str2), null, 12) : null, aVar2, documentViewerScreenConfig, bVar.i), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 2), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f67020t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67019s;
    }
}
