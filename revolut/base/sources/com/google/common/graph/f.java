package com.google.common.graph;

import com.google.common.base.Function;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f49256b;

    public /* synthetic */ f(Network network, int i) {
        this.f49255a = i;
        this.f49256b = network;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f49255a) {
            case 0:
                return this.f49256b.incidentNodes(obj2);
            case 1:
                return ImmutableNetwork.lambda$sourceNodeFn$0(this.f49256b, obj2);
            default:
                return ImmutableNetwork.lambda$targetNodeFn$1(this.f49256b, obj2);
        }
    }
}
