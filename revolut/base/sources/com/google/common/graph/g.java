package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Graphs;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49258b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f49257a = i;
        this.f49258b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49257a) {
            case 0:
                return ((AbstractNetwork.AnonymousClass1.C03521) this.f49258b).lambda$iterator$0(obj2);
            case 1:
                return ((Graphs.TransposedGraph.AnonymousClass1) this.f49258b).lambda$iterator$0((EndpointPair) obj2);
            default:
                return AbstractValueGraph.lambda$edgeValueMap$0((ValueGraph) this.f49258b, (EndpointPair) obj2);
        }
    }
}
