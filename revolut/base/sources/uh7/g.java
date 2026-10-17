package uh7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f280112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f280113b;

    public g(j jVar, String str) {
        this.f280112a = jVar;
        this.f280113b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return this.f280112a.f280119h.e(this.f280113b);
    }
}
