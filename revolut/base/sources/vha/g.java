package vha;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f289365a;

    public g(i iVar) {
        this.f289365a = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        bia.b it8 = (bia.b) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return this.f289365a.f289374c.a(it8);
    }
}
