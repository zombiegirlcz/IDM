package n33;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e13.a f211854b;

    public /* synthetic */ x0(e13.a aVar, int i) {
        this.f211853a = i;
        this.f211854b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List cardDesigns = (List) obj2;
        switch (this.f211853a) {
            case 0:
                Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
                int i = z0.f211857a[this.f211854b.ordinal()];
                if (i == 1) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : cardDesigns) {
                        if (obj3 instanceof e93.d) {
                            arrayList.add(obj3);
                        }
                    }
                    return arrayList;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Local Global picker shouldn't be displayed for Indian Disposable cards");
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : cardDesigns) {
                    if (obj4 instanceof e93.e) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    if (!ce9.m.s((e93.e) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            default:
                Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
                int i2 = z0.f211857a[this.f211854b.ordinal()];
                if (i2 == 1) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : cardDesigns) {
                        if (obj6 instanceof e93.d) {
                            arrayList4.add(obj6);
                        }
                    }
                    return arrayList4;
                }
                if (i2 == 2) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : cardDesigns) {
                        if (obj7 instanceof e93.e) {
                            arrayList5.add(obj7);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : arrayList5) {
                        if (!ce9.m.s((e93.e) obj8)) {
                            arrayList6.add(obj8);
                        }
                    }
                    return arrayList6;
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj9 : cardDesigns) {
                    if (obj9 instanceof e93.e) {
                        arrayList7.add(obj9);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj10 : arrayList7) {
                    if (ce9.m.s((e93.e) obj10)) {
                        arrayList8.add(obj10);
                    }
                }
                return arrayList8;
        }
    }
}
