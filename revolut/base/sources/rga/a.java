package rga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends mga.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f254047c;
    public final String d;

    public a(c holder, String tag2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f254047c = holder;
        this.d = tag2;
    }

    @Override // yji.d
    public final void onCreate() {
        this.f254047c.a(this.d);
    }
}
