package com.revolut.sso.impl.ui.external_entry.external_entry;

import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowImpl;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nii.t0;
import tji.f;
import vc.s;
import yhm.j;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowImpl;", "Lcom/revolut/kompot/navigable/root/RootFlow;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$Step;", "Lcom/revolut/sso/impl/ui/external_entry/external_entry/ExternalEntryFlowContract$InputData;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalEntryFlowImpl extends RootFlow<ExternalEntryFlowContract$Step, ExternalEntryFlowContract$InputData> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106553a0 = {o0.f186429a.j(new h0(ExternalEntryFlowImpl.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowRootBinding;", 0))};
    public final String U;
    public final Lazy V;
    public final int W;
    public final h X;
    public final Lazy Y;
    public final Lazy Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalEntryFlowImpl(ExternalEntryFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = "Revolut SSO Entry Flow";
        final int i = 0;
        this.V = j.b(new Function0(this) { // from class: zml.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalEntryFlowImpl f323618b;

            {
                this.f323618b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExternalEntryFlowImpl externalEntryFlowImpl = this.f323618b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExternalEntryFlowImpl.f106553a0;
                        return new tji.f(new tji.d(externalEntryFlowImpl.m2(), new usc.a(externalEntryFlowImpl)), d0.F0(new t0(externalEntryFlowImpl.m2()), kii.g.a(externalEntryFlowImpl.m2())));
                    default:
                        KProperty[] kPropertyArr2 = ExternalEntryFlowImpl.f106553a0;
                        return (a) ((kjl.b) externalEntryFlowImpl.Y.getValue()).f.get();
                }
            }
        });
        this.W = R$layout.flow_root;
        this.X = s.t(this, zml.c.f);
        this.Y = j.b(new zk7.a(this, inputData, 6));
        final int i2 = 1;
        this.Z = j.b(new Function0(this) { // from class: zml.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalEntryFlowImpl f323618b;

            {
                this.f323618b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExternalEntryFlowImpl externalEntryFlowImpl = this.f323618b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExternalEntryFlowImpl.f106553a0;
                        return new tji.f(new tji.d(externalEntryFlowImpl.m2(), new usc.a(externalEntryFlowImpl)), d0.F0(new t0(externalEntryFlowImpl.m2()), kii.g.a(externalEntryFlowImpl.m2())));
                    default:
                        KProperty[] kPropertyArr2 = ExternalEntryFlowImpl.f106553a0;
                        return (a) ((kjl.b) externalEntryFlowImpl.Y.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (kjl.b) this.Y.getValue();
    }

    @Override // qji.c
    public final qji.b R1() {
        return (kjl.b) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (zml.a) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final Function1 U2() {
        return new zmb.c(14);
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final ControllerContainerFrameLayout h3() {
        ViewBinding value = this.X.getValue(this, f106553a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ControllerContainerFrameLayout containerModal = ((jii.c) value).f174502b;
        Intrinsics.checkNotNullExpressionValue(containerModal, "containerModal");
        return containerModal;
    }

    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final f i3() {
        return (f) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: p2, reason: from getter */
    public final String getV() {
        return this.U;
    }
}
