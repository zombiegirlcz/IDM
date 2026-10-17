package kw2;

import c8g.c;
import h93.f0;
import ha3.x;
import java.util.ArrayList;
import java.util.List;
import k7i.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f190208b;

    public /* synthetic */ a(i iVar, int i) {
        this.f190207a = i;
        this.f190208b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f190207a) {
            case 0:
                f0 it8 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return c.E(it8, ((x) ((f) this.f190208b.f182069b)).o(it8.f150110a));
            case 1:
                f0 it9 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return c.E(it9, ((x) ((f) this.f190208b.f182069b)).o(it9.f150110a));
            default:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList<f0> arrayList = new ArrayList();
                for (Object obj3 : cards) {
                    if (((f0) obj3).w()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (f0 f0Var : arrayList) {
                    arrayList2.add(c.E(f0Var, ((x) ((f) this.f190208b.f182069b)).o(f0Var.f150110a)));
                }
                return arrayList2;
        }
    }
}
