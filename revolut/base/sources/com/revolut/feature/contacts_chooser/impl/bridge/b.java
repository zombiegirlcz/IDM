package com.revolut.feature.contacts_chooser.impl.bridge;

import cn3.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserConfiguration;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.bridge.ContactsChooserFlowContract$Step;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import eed.j;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends g implements en3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mn3.a f66084t;
    public final ContactsChooserFlowContract$Step.Chooser u;
    public final ContactsChooserFlowContract$State v;

    public b(ContactsChooserFlowContract$InputData inputData, mn3.a contactsChooserResultObserver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserResultObserver, "contactsChooserResultObserver");
        this.f66084t = contactsChooserResultObserver;
        this.u = new ContactsChooserFlowContract$Step.Chooser(inputData);
        this.v = ContactsChooserFlowContract$State.f66082a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ContactsChooserFlowContract$Step step = (ContactsChooserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof ContactsChooserFlowContract$Step.Chooser)) {
            throw new NoWhenBranchMatchedException();
        }
        ContactsChooserConfiguration contactsChooserConfiguration = ((ContactsChooserFlowContract$Step.Chooser) step).f66083a.f66081a;
        ContactsChooserScreen contactsChooserScreen = new ContactsChooserScreen(new ContactsChooserInputData(contactsChooserConfiguration.f66046b, contactsChooserConfiguration.f66047c, contactsChooserConfiguration.d, contactsChooserConfiguration.e, contactsChooserConfiguration.f, contactsChooserConfiguration.f66048g, contactsChooserConfiguration.f66049h, contactsChooserConfiguration.i, contactsChooserConfiguration.f66050j, contactsChooserConfiguration.k, contactsChooserConfiguration.f66051l, contactsChooserConfiguration.f66052m, contactsChooserConfiguration.f66053n, (Clause) null, (Set) null, (ContactsPrimaryButtonClause) null, (h) null, 0, (Set) null, 1040384));
        j block = new j(this, contactsChooserConfiguration, 24);
        Intrinsics.checkNotNullParameter(block, "block");
        contactsChooserScreen.H = block;
        return contactsChooserScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
