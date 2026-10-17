package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f293919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f293920c;

    public /* synthetic */ b(o oVar, String str, int i) {
        this.f293918a = i;
        this.f293919b = oVar;
        this.f293920c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f293918a;
        String str = this.f293920c;
        o oVar = this.f293919b;
        switch (i) {
            case 0:
                x61.c cVar = (x61.c) obj2;
                Intrinsics.h(cVar);
                String iban = cVar.f303010a;
                x61.b bVar = x61.c.Companion;
                Intrinsics.checkNotNullParameter(iban, "iban");
                x61.c model = new x61.c(iban, true);
                Intrinsics.checkNotNullParameter(model, "model");
                oVar.f293933c.G(new p21.a(iban, true), o.b(str), z.d(o0.b(p21.a.class)));
                return Unit.f186387a;
            default:
                ro3.e pocketDto = (ro3.e) obj2;
                Intrinsics.checkNotNullParameter(pocketDto, "pocketDto");
                return ((go3.d) oVar.d).c(pocketDto, str);
        }
    }
}
