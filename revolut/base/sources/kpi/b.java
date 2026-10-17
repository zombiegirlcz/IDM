package kpi;

import fa1.k;
import java.util.List;
import jli.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kpi.c;
import kq.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f188250b;

    public /* synthetic */ b(sa1.c cVar, int[] iArr) {
        this.f188249a = 2;
        this.f188250b = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f188249a;
        int[] iArr = this.f188250b;
        switch (i) {
            case 0:
                a result = (a) obj2;
                c.a aVar = c.Companion;
                Intrinsics.checkNotNullParameter(result, "result");
                break;
            case 1:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                int size = entities.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (kotlin.collections.d.G(iArr, ((i) entities.get(size)).getId())) {
                            entities.remove(size);
                        }
                        if (i2 >= 0) {
                            size = i2;
                        }
                    }
                }
                break;
            default:
                byte[] bArr = (byte[]) obj2;
                String strC = sa1.c.c(iArr);
                Intrinsics.h(bArr);
                ea1.b.a(a0.d.s("GetInfosCommand response for tag ", strC, " = ", g.i(bArr)), k.ERROR);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(int[] iArr, int i) {
        this.f188249a = i;
        this.f188250b = iArr;
    }
}
