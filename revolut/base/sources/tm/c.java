package tm;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f272140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mm.a f272141c;

    public /* synthetic */ c(g gVar, mm.a aVar, int i) {
        this.f272139a = i;
        this.f272140b = gVar;
        this.f272141c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f272139a) {
            case 0:
                Data data = new Data(obj2, null, false, 6, null);
                g gVar = this.f272140b;
                gVar.f.onNext(data);
                cn.e eVar = gVar.d;
                mm.a aVar = this.f272141c;
                Intrinsics.h(aVar);
                eVar.D(new cn.a(aVar, obj2));
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                Data data2 = new Data(null, th10, false, 5, null);
                g gVar2 = this.f272140b;
                gVar2.f.onNext(data2);
                um.c cVar = gVar2.f272148c;
                mm.a aVar2 = this.f272141c;
                Intrinsics.h(aVar2);
                Intrinsics.h(th10);
                cVar.D(new um.a(aVar2, th10));
                break;
        }
        return Unit.f186387a;
    }
}
