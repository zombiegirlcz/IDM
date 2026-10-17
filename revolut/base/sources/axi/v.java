package axi;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import svi.d0;
import svi.e0;
import svi.i0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10974a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f10975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f10976c;
    public final /* synthetic */ Data d;
    public final /* synthetic */ Data e;
    public final /* synthetic */ wi0.b f;

    public /* synthetic */ v(Data data, Data data2, Data data3, Data data4, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar, wi0.b bVar2) {
        this.f10975b = data;
        this.f10976c = data2;
        this.d = data3;
        this.e = data4;
        this.f = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e0 e0Var;
        bti.g gVar;
        switch (this.f10974a) {
            case 0:
                l lVar = (l) obj2;
                Data data = this.f10975b;
                Intrinsics.h(data);
                Data data2 = this.f10976c;
                i0 i0Var = (i0) data2.getContent();
                Object obj3 = null;
                if (i0Var != null && (e0Var = i0Var.f265922b.f265912g) != null) {
                    ArrayList arrayList = e0Var.f265900c;
                    Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (((d0) next).d) {
                                obj3 = next;
                            }
                        }
                    }
                    obj3 = (d0) obj3;
                    if (obj3 == null) {
                        obj3 = (d0) zhm.d0.o0(arrayList);
                    }
                }
                return l.a(lVar, 0, data2, this.d, data, obj3, false, null, null, this.f, this.e, null, 2499);
            default:
                cui.l lVar2 = (cui.l) obj2;
                Data data3 = this.f10976c;
                Intrinsics.h(data3);
                Data data4 = this.d;
                bti.d dVar = (bti.d) data4.getContent();
                Object obj4 = null;
                bti.h hVar = dVar != null ? dVar.k : null;
                if (hVar != null && (gVar = hVar.f18604c) != null) {
                    ArrayList arrayList2 = gVar.f18601c;
                    Iterator it9 = arrayList2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next2 = it9.next();
                            if (((bti.f) next2).d) {
                                obj4 = next2;
                            }
                        }
                    }
                    obj4 = (bti.f) obj4;
                    if (obj4 == null) {
                        obj4 = (bti.f) zhm.d0.o0(arrayList2);
                    }
                }
                return cui.l.a(lVar2, this.f10975b, data3, data4, this.e, obj4, null, null, false, this.f, BERTags.FLAGS);
        }
    }

    public /* synthetic */ v(Data data, com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, Data data2, Data data3, wi0.b bVar, Data data4) {
        this.f10975b = data;
        this.f10976c = data2;
        this.d = data3;
        this.f = bVar;
        this.e = data4;
    }
}
