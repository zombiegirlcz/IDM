package f7l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f132652b;

    public /* synthetic */ e(k kVar, int i) {
        this.f132651a = i;
        this.f132652b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f132651a) {
            case 0:
                k kVar = this.f132652b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (e7l.f) kVar.d.get("CONFIG_TYPE_USER");
            case 1:
                k kVar2 = this.f132652b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                j7l.e eVar = (j7l.e) j6.a.k(j7l.e.class, kVar2.f132660b, "CONFIG_TYPE_USER");
                if (eVar != null) {
                    return i7l.b.d(eVar);
                }
                return null;
            case 2:
                k kVar3 = this.f132652b;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (e7l.f) kVar3.d.get("CACHED_CONFIG");
            case 3:
                k kVar4 = this.f132652b;
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                j7l.e eVar2 = (j7l.e) j6.a.k(j7l.e.class, kVar4.f132660b, "CACHED_CONFIG");
                if (eVar2 != null) {
                    return i7l.b.d(eVar2);
                }
                return null;
            case 4:
                k kVar5 = this.f132652b;
                long jD = jli.b.d();
                kVar5.f = Long.valueOf(jD);
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, kVar5.f132660b, "COMMON_CONFIG_LAST_MODIFIED_DATE", Long.valueOf(jD));
                return Unit.f186387a;
            default:
                k kVar6 = this.f132652b;
                g params = (g) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (c7l.d) kVar6.e.get(k.d(params));
        }
    }
}
