package com.revolut.feature.contacts_chooser.impl.bridge;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import e58.d;
import e58.e;
import in0.g;
import in3.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$Step;", "Lcom/revolut/feature/contacts_chooser/impl/bridge/ContactsChooserFlowContract$InputData;", "Laii/q;", "Lin0/g;", "feature_contacts_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsChooserFlow extends BaseFlow<ContactsChooserFlowContract$Step, ContactsChooserFlowContract$InputData, q> implements g {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsChooserFlow(ContactsChooserFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new d(this, inputData, 25));
        this.Q = w.y0(new e(this, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        ContactsChooserFlowContract$Step step = (ContactsChooserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return ((ContactsChooserFlowContract$InputData) this.G).f66081a.o;
    }
}
