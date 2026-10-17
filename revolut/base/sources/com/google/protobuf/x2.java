package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class x2 extends d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2 f49833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(v2 v2Var) {
        super(v2Var, 0);
        this.f49833c = v2Var;
    }

    @Override // com.google.protobuf.d3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w2(this.f49833c);
    }
}
