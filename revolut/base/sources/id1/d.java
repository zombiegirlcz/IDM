package id1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f160385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f160386c;

    public /* synthetic */ d(n nVar, Function1 function1, int i) {
        this.f160384a = i;
        this.f160385b = nVar;
        this.f160386c = function1;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f160384a) {
            case 0:
                n nVar = this.f160385b;
                Collection collection = (List) nVar.f160402a.get("PRODUCTS_KEY");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                w4l.f fVar = nVar.e;
                Unit unit = Unit.f186387a;
                ArrayList arrayListF1 = d0.f1(collection);
                this.f160386c.invoke(arrayListF1);
                fVar.k(unit, arrayListF1);
                break;
            default:
                n nVar2 = this.f160385b;
                Collection collection2 = (List) nVar2.f160402a.get("CATEGORIES_KEY");
                if (collection2 == null) {
                    collection2 = f0.f322471a;
                }
                w4l.f fVar2 = nVar2.d;
                Unit unit2 = Unit.f186387a;
                ArrayList arrayListF12 = d0.f1(collection2);
                this.f160386c.invoke(arrayListF12);
                fVar2.k(unit2, arrayListF12);
                break;
        }
    }
}
