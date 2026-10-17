package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49260b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f49259a = i;
        this.f49260b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49259a) {
            case 0:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$0(this.f49260b, obj2);
            case 1:
                return EndpointPair.ordered(this.f49260b, obj2);
            case 2:
                return DirectedGraphConnections.lambda$incidentEdgeIterator$2(this.f49260b, (DirectedGraphConnections.NodeConnection) obj2);
            default:
                return EndpointPair.unordered(this.f49260b, obj2);
        }
    }
}
