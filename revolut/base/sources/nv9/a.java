package nv9;

import iv9.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kv9.h;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f219565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f219566c;

    public /* synthetic */ a(b bVar, String str, int i) {
        this.f219564a = i;
        this.f219565b = bVar;
        this.f219566c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h it8 = (h) obj2;
        switch (this.f219564a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                b bVar = this.f219565b;
                k kVar = bVar.f219569c;
                return bVar.f219567a.b(u.c(b.b(k.b(it8, this.f219566c))));
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                b bVar2 = this.f219565b;
                k kVar2 = bVar2.f219569c;
                return bVar2.f219567a.b(u.c(b.b(k.b(it8, this.f219566c))));
        }
    }
}
