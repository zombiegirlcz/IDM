package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as3.b f154935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final as3.a f154936c;
    public final as3.c d;

    public q0(String postRequestPath, as3.b filter, as3.a metadata, as3.c payload) {
        Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f154934a = postRequestPath;
        this.f154935b = filter;
        this.f154936c = metadata;
        this.d = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f154934a, q0Var.f154934a) && Intrinsics.f(this.f154935b, q0Var.f154935b) && Intrinsics.f(this.f154936c, q0Var.f154936c) && Intrinsics.f(this.d, q0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f154936c.hashCode() + ((this.f154935b.hashCode() + (this.f154934a.hashCode() * 31)) * 31)) * 31);
    }
}
