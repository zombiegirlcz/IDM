package e6d;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yvh.d f122973c;

    public /* synthetic */ b(String str, yvh.d dVar, int i) {
        this.f122971a = i;
        this.f122972b = str;
        this.f122973c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yvh.d dVar;
        Object next;
        yvh.d dVar2;
        Object next2;
        List it8 = (List) obj2;
        switch (this.f122971a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                Iterator it9 = it8.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    dVar = this.f122973c;
                    if (zHasNext) {
                        next = it9.next();
                        yvh.b bVar = (yvh.b) next;
                        if (!bVar.f317177b || bVar.f != yvh.f.SPARE_CHANGE || bVar.k != dVar) {
                        }
                    } else {
                        next = null;
                    }
                }
                yvh.b bVar2 = (yvh.b) next;
                if (bVar2 != null) {
                    return bVar2;
                }
                yvh.b.Companion.getClass();
                return yvh.b.a(yvh.b.f317175m, false, null, null, this.f122972b, dVar, 2559);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                Iterator it10 = it8.iterator();
                while (true) {
                    boolean zHasNext2 = it10.hasNext();
                    dVar2 = this.f122973c;
                    if (zHasNext2) {
                        next2 = it10.next();
                        yvh.b bVar3 = (yvh.b) next2;
                        if (!bVar3.f317177b || bVar3.f != yvh.f.SPARE_CHANGE || bVar3.k != dVar2) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                yvh.b bVar4 = (yvh.b) next2;
                if (bVar4 != null) {
                    return bVar4;
                }
                yvh.b.Companion.getClass();
                return yvh.b.a(yvh.b.f317175m, false, null, null, this.f122972b, dVar2, 2559);
        }
    }
}
