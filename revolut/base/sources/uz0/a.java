package uz0;

import i8.b0;
import i8.u;
import i8.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rz0.b;
import ux7.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f284568a;

    public a(Function0 okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f284568a = okHttpClient;
    }

    @Override // i8.v
    public final u a(b0 multiFactory) {
        Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
        return new b(this.f284568a);
    }

    public a() {
        this(new g(15));
    }
}
