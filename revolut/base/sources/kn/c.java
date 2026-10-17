package kn;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f185960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym.b f185961c;

    public /* synthetic */ c(e eVar, ym.b bVar, int i) {
        this.f185959a = i;
        this.f185960b = eVar;
        this.f185961c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean bool = (Boolean) obj2;
        switch (this.f185959a) {
            case 0:
                if (bool.booleanValue()) {
                    HashSet hashSet = this.f185960b.f185963l;
                    ym.b bVar = this.f185961c;
                    hashSet.add(bVar.f314825c);
                    bVar.e.set(true);
                }
                break;
            default:
                if (bool.booleanValue()) {
                    HashSet hashSet2 = this.f185960b.f185963l;
                    ym.b bVar2 = this.f185961c;
                    hashSet2.remove(bVar2.f314825c);
                    bVar2.e.set(true);
                }
                break;
        }
        return Unit.f186387a;
    }
}
