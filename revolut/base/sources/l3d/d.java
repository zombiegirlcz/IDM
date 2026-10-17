package l3d;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3d.d f191891b;

    public /* synthetic */ d(jid.z zVar, z3d.d dVar, int i) {
        this.f191890a = i;
        this.f191891b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191890a) {
            case 0:
                Map detailsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(detailsMap, "detailsMap");
                return c.a(this.f191891b, detailsMap);
            case 1:
                Map detailsMap2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(detailsMap2, "detailsMap");
                return c.a(this.f191891b, detailsMap2);
            case 2:
                ogd.k it8 = (ogd.k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f191891b, it8);
            default:
                ogd.k it9 = (ogd.k) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(this.f191891b, it9);
        }
    }

    public /* synthetic */ d(z3d.d dVar, int i) {
        this.f191890a = i;
        this.f191891b = dVar;
    }
}
