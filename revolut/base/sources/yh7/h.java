package yh7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f313875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f313876b;

    public h(j jVar, String str) {
        this.f313875a = jVar;
        this.f313876b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return this.f313875a.f313880h.e(this.f313876b);
    }
}
