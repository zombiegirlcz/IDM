package com.revolut.feature_cards_kompot_flows_impl.flow;

import aii.q;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$InputData;", "Laii/q;", "Lno/m;", "feature_cards_kompot_flows_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDetailsFlow extends BaseFlow<CardDetailsFlowContract$Step, CardDetailsFlowDestination.InputData, q> implements m {
    public final AnalyticsProduct.Retail P;
    public final Object Q;
    public final Object R;
    public final boolean S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsFlow(CardDetailsFlowDestination.InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.Q = w.y0(new jnf.a(this, inputData, 13));
        this.R = w.y0(new jj2.a(this, 15));
        this.S = true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (kwh.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (kwh.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (jwh.a) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CardDetailsFlowContract$Step step = (CardDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
