package ws5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f299660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f299661b;

    public f(h hVar, String str) {
        this.f299660a = hVar;
        this.f299661b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return h.i(this.f299660a, this.f299661b);
    }
}
