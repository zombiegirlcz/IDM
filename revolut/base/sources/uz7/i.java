package uz7;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zw7.g0;
import zw7.h0;
import zw7.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f284603b;

    public /* synthetic */ i(p pVar, int i) {
        this.f284602a = i;
        this.f284603b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284602a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Object content = data.getContent();
                Object obj3 = null;
                p pVar = this.f284603b;
                if (content != null) {
                    ArrayList arrayList = ((k0) content).f325807a;
                    pVar.getClass();
                    Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (((h0) next).f325787b == w.O(((r) pVar.e).C0())) {
                                obj3 = next;
                            }
                        }
                    }
                    obj3 = (h0) obj3;
                }
                return new Data(obj3, (data.getLoading() || obj3 != null) ? data.getError() : new IllegalStateException(v0.a.h(w.O(((r) pVar.e).C0()), "Cannot find user selected plan type. User has selected ", " ")), data.getLoading());
            default:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Object content2 = data2.getContent();
                Object obj4 = null;
                if (content2 != null) {
                    Pair pair = (Pair) content2;
                    List list = (List) pair.f186385a;
                    Object obj5 = pair.f186386b;
                    Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                    g0 g0Var = (g0) obj5;
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next2 = it9.next();
                            if (((h0) next2).f325787b == g0Var) {
                                obj4 = next2;
                            }
                        }
                    }
                    obj4 = (h0) obj4;
                }
                return new Data(obj4, (data2.getLoading() || obj4 != null) ? data2.getError() : new IllegalStateException(v0.a.h(w.O(((r) this.f284603b.e).C0()), "Cannot find user selected plan type. User has selected ", " ")), data2.getLoading());
        }
    }
}
