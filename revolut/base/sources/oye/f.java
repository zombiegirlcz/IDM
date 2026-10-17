package oye;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f231030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lye.c f231031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f231032c;

    public f(gte.a featureToggleInteractor, lye.c resIdParser) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(resIdParser, "resIdParser");
        this.f231030a = featureToggleInteractor;
        this.f231031b = resIdParser;
        this.f231032c = j.b(new os2.a(this, 10));
    }

    public static boolean a(long j2, List list, boolean z) {
        Object obj2;
        Object next;
        dj0.d dVar;
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        if (list == null) {
            return z;
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ue6.a) next).d != null) {
                break;
            }
        }
        ue6.a aVar = (ue6.a) next;
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (((ue6.a) next2).d == null) {
                obj2 = next2;
                break;
            }
        }
        ue6.a aVar2 = (ue6.a) obj2;
        long j3 = 0;
        long j5 = (aVar == null || (dVar4 = aVar.d) == null) ? 0L : dVar4.f115082a;
        long j16 = Long.MAX_VALUE;
        long j22 = (aVar == null || (dVar3 = aVar.f279305c) == null) ? Long.MAX_VALUE : dVar3.f115082a;
        if (aVar2 != null && (dVar2 = aVar2.f279304b) != null) {
            j3 = dVar2.f115082a;
        }
        if (aVar2 != null && (dVar = aVar2.f279305c) != null) {
            j16 = dVar.f115082a;
        }
        return ((j2 > j3 ? 1 : (j2 == j3 ? 0 : -1)) > 0) && ((j2 > j16 ? 1 : (j2 == j16 ? 0 : -1)) <= 0) && (((j2 + j5) > j22 ? 1 : ((j2 + j5) == j22 ? 0 : -1)) <= 0) && z;
    }
}
