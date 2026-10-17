package com.bumptech.glide.load.data;

import java.util.Map;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26112a;

    public /* synthetic */ i(Object obj2) {
        this.f26112a = obj2;
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        return this.f26112a;
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }

    @Override // kfm.p
    public boolean test(Object obj2) {
        return mfm.f.a(obj2, this.f26112a);
    }

    public i(Map attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f26112a = attrs;
    }
}
