package yh7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f313873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f313874b;

    public g(j jVar, String str, dsh.e eVar) {
        this.f313873a = jVar;
        this.f313874b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        j jVar = this.f313873a;
        return jVar.f313880h.d(this.f313874b, jVar.i, f0.f322471a);
    }
}
