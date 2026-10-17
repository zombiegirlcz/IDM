package com.revolut.feature_workflow_reminder_impl.ui.flow;

import bhi.b;
import bhi.c;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature_workflow_reminder_impl.ui.flow.WorkflowReminderFlowContract$Step;
import cp5.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {

    @NotNull
    public static final C0595a Companion = new C0595a();
    public final yki.a o;

    /* JADX INFO: renamed from: com.revolut.feature_workflow_reminder_impl.ui.flow.a$a, reason: collision with other inner class name */
    public static final class C0595a {
        private C0595a() {
        }
    }

    public a() {
        c cVar = new c(this, 0);
        this.o = d.a(this, WorkflowReminderFlowContract$Step.ChooseReminder.f98187a, f0.f322471a, cVar);
    }

    public final void I2(TextLocalisedClause textLocalisedClause) {
        C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(textLocalisedClause, null))), null, null, 12)));
    }

    @Override // yki.j
    public final void M0() {
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
