package uh7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f280109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f280110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph7.c f280111c;

    public f(j jVar, String str, dsh.e eVar, ph7.c cVar) {
        this.f280109a = jVar;
        this.f280110b = str;
        this.f280111c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return this.f280109a.f280119h.d(this.f280110b, this.f280111c, f0.f322471a);
    }
}
