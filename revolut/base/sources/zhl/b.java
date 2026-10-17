package zhl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vdl.d1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ryc.a f322435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nel.n f322436c;
    public final /* synthetic */ eel.c d;

    public /* synthetic */ b(ryc.a aVar, nel.n nVar, eel.c cVar, int i) {
        this.f322434a = i;
        this.f322435b = aVar;
        this.f322436c = nVar;
        this.d = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long it8 = (Long) obj2;
        switch (this.f322434a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                d1 d1Var = (d1) this.f322435b.f258289a;
                String str = this.f322436c.f214596b;
                eel.c cVar = this.d;
                Intrinsics.h(cVar);
                return d1Var.b(str, cVar, eel.m.EXTENDED, w4l.i.f294643c);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                d1 d1Var2 = (d1) this.f322435b.f258289a;
                String str2 = this.f322436c.f214596b;
                eel.c cVar2 = this.d;
                Intrinsics.h(cVar2);
                return d1Var2.b(str2, cVar2, eel.m.EXTENDED, w4l.i.f294643c);
        }
    }
}
