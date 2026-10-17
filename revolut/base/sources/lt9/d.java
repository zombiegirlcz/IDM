package lt9;

import cn3.b;
import cn3.e;
import cn3.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Email;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$InputData;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$Step;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.create.PaymentsGroupsCreateFlowContract$State;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import dki.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zs9.q;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends g implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ln3.b f199843t;
    public final PaymentsGroupsCreateNavigationFlow$Step u;
    public final PaymentsGroupsCreateFlowContract$State v;

    public d(PaymentsGroupsCreateNavigationFlow$InputData inputData, ln3.b contactsChooserNavigationScreenProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
        this.f199843t = contactsChooserNavigationScreenProvider;
        this.u = inputData.f79293b;
        this.v = new PaymentsGroupsCreateFlowContract$State("", inputData.f79292a, inputData.f79294c);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentsGroupsCreateNavigationFlow$Step step = (PaymentsGroupsCreateNavigationFlow$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 1;
        if (!(step instanceof PaymentsGroupsCreateNavigationFlow$Step.AddMembers)) {
            if (!(step instanceof PaymentsGroupsCreateNavigationFlow$Step.Customize)) {
                throw new NoWhenBranchMatchedException();
            }
            GroupCustomizationScreen groupCustomizationScreen = new GroupCustomizationScreen(new GroupCustomizationScreenContract$InputData(((PaymentsGroupsCreateFlowContract$State) A2().f98429a).f79458a, ((PaymentsGroupsCreateFlowContract$State) A2().f98429a).f79459b, st9.b.DUMB));
            Function1 function1 = new Function1(this) { // from class: lt9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f199841b;

                {
                    this.f199841b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            cn3.b output = (cn3.b) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof cn3.c;
                            d dVar = this.f199841b;
                            if (z) {
                                List list = ((cn3.c) output).f25344a;
                                ArrayList selectedContacts = new ArrayList();
                                Iterator it8 = list.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        e eVar = (e) it8.next();
                                        if (eVar == null) {
                                            eVar = null;
                                        }
                                        zm3.a aVar = eVar != null ? eVar.f25347a : null;
                                        if (aVar != null) {
                                            selectedContacts.add(aVar);
                                        }
                                    } else {
                                        PaymentsGroupsCreateFlowContract$State paymentsGroupsCreateFlowContract$State = (PaymentsGroupsCreateFlowContract$State) dVar.A2().f98429a;
                                        String name = paymentsGroupsCreateFlowContract$State.f79458a;
                                        rq9.c finishMode = paymentsGroupsCreateFlowContract$State.f79460c;
                                        Intrinsics.checkNotNullParameter(name, "name");
                                        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
                                        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
                                        dVar.L2(new PaymentsGroupsCreateFlowContract$State(name, selectedContacts, finishMode));
                                        dVar.E2(PaymentsGroupsCreateNavigationFlow$Step.Customize.f79296a, false, null, false);
                                    }
                                }
                            } else {
                                if (!(output instanceof cn3.d) && !(output instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i2 = c.f199842a[((PaymentsGroupsCreateFlowContract$State) dVar.A2().f98429a).f79460c.ordinal()];
                                if (i2 == 1) {
                                    dVar.I2();
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar.G2(rq9.d.f256509a);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            q output2 = (q) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            d dVar2 = this.f199841b;
                            int i3 = c.f199842a[((PaymentsGroupsCreateFlowContract$State) dVar2.A2().f98429a).f79460c.ordinal()];
                            if (i3 == 1) {
                                dVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupDetails(output2.f324839a, false)))));
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2.G2(new rq9.e(output2.f324839a));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            groupCustomizationScreen.H = function1;
            return groupCustomizationScreen;
        }
        final int i2 = 0;
        ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) new TextLocalisedClause(R$string.payments_groups_actions_add_members, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_groups_members_search_hint, null, null, 14), v.k(ContactType.RevolutContact.Local.f66038a, new ContactType.RevolutContact.Remote(0), ContactType$DeviceContact$Phone.f66036a, ContactType$DeviceContact$Email.f66035a, ContactType.UsernameContact.f66040a), ((PaymentsGroupsCreateFlowContract$State) A2().f98429a).f79459b, (ContactsChooserMode) new ContactsChooserMode.MultiSelect(null), true, false, false, false, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) null, (Set) null, (ContactsPrimaryButtonClause) null, (h) null, 0, (Set) null, 1048512);
        this.f199843t.getClass();
        ContactsChooserScreen contactsChooserScreenA = ln3.b.a(contactsChooserInputData);
        Function1 block = new Function1(this) { // from class: lt9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f199841b;

            {
                this.f199841b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        cn3.b output = (cn3.b) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof cn3.c;
                        d dVar = this.f199841b;
                        if (z) {
                            List list = ((cn3.c) output).f25344a;
                            ArrayList selectedContacts = new ArrayList();
                            Iterator it8 = list.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    e eVar = (e) it8.next();
                                    if (eVar == null) {
                                        eVar = null;
                                    }
                                    zm3.a aVar = eVar != null ? eVar.f25347a : null;
                                    if (aVar != null) {
                                        selectedContacts.add(aVar);
                                    }
                                } else {
                                    PaymentsGroupsCreateFlowContract$State paymentsGroupsCreateFlowContract$State = (PaymentsGroupsCreateFlowContract$State) dVar.A2().f98429a;
                                    String name = paymentsGroupsCreateFlowContract$State.f79458a;
                                    rq9.c finishMode = paymentsGroupsCreateFlowContract$State.f79460c;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
                                    Intrinsics.checkNotNullParameter(finishMode, "finishMode");
                                    dVar.L2(new PaymentsGroupsCreateFlowContract$State(name, selectedContacts, finishMode));
                                    dVar.E2(PaymentsGroupsCreateNavigationFlow$Step.Customize.f79296a, false, null, false);
                                }
                            }
                        } else {
                            if (!(output instanceof cn3.d) && !(output instanceof b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i22 = c.f199842a[((PaymentsGroupsCreateFlowContract$State) dVar.A2().f98429a).f79460c.ordinal()];
                            if (i22 == 1) {
                                dVar.I2();
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar.G2(rq9.d.f256509a);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        q output2 = (q) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        d dVar2 = this.f199841b;
                        int i3 = c.f199842a[((PaymentsGroupsCreateFlowContract$State) dVar2.A2().f98429a).f79460c.ordinal()];
                        if (i3 == 1) {
                            dVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupDetails(output2.f324839a, false)))));
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar2.G2(new rq9.e(output2.f324839a));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        contactsChooserScreenA.H = block;
        return contactsChooserScreenA;
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
