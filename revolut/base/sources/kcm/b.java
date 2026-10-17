package kcm;

import com.google.common.base.Preconditions;
import com.google.protobuf.d2;
import com.google.protobuf.m2;
import ecm.n1;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements n1 {
    public static final ThreadLocal d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f182752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f182753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182754c = -1;

    public b(d2 d2Var) {
        this.f182753b = (d2) Preconditions.checkNotNull(d2Var, "defaultInstance cannot be null");
        this.f182752a = d2Var.getParserForType();
    }
}
