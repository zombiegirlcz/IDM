package yh0;

import ihm.j;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f313685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f313686c;

    public /* synthetic */ b(c cVar, String str, int i) {
        this.f313684a = i;
        this.f313685b = cVar;
        this.f313686c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f313684a) {
            case 0:
                c cVar = this.f313685b;
                ConcurrentHashMap concurrentHashMap = cVar.f313689c;
                String str = this.f313686c;
                concurrentHashMap.put(str, (yg0.e) obj2);
                cVar.d.onNext(new yg0.c(str));
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                j jVar = this.f313685b.d;
                Intrinsics.h(th10);
                jVar.onNext(new yg0.a(this.f313686c, th10));
                break;
        }
        return Unit.f186387a;
    }
}
