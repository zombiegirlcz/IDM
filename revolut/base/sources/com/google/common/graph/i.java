package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class i implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49263c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f49261a = i;
        this.f49263c = obj2;
        this.f49262b = obj3;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49261a) {
            case 0:
                return ImmutableNetwork.lambda$adjacentNodeFn$2((Network) this.f49263c, this.f49262b, obj2);
            default:
                return ImmutableValueGraph.lambda$connectionsOf$0((ValueGraph) this.f49263c, this.f49262b, obj2);
        }
    }
}
