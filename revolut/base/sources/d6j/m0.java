package d6j;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111568a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f111569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f111570c;

    public /* synthetic */ m0(Data data, xi0.b bVar) {
        this.f111570c = data;
        this.f111569b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        List listU;
        switch (this.f111568a) {
            case 0:
                return o.f((o) obj2, null, false, null, null, null, null, null, null, 0, null, null, null, this.f111570c, zi0.c.P(new fsl.d(this.f111569b), false, null, 3), null, null, null, null, null, null, false, null, 33505279);
            default:
                Data data2 = this.f111570c;
                zyd.g gVar = (zyd.g) obj2;
                xi0.b bVar = gVar.f326439c;
                xi0.b bVar2 = this.f111569b;
                xi0.b bVar3 = bVar == null ? bVar2 : bVar;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        ArrayList arrayList = new ArrayList();
                        for (io3.d dVar : (List) content) {
                            xi0.b bVarL = z92.f.l(dVar);
                            zyd.m.Companion.getClass();
                            if (!zyd.m.u.contains(dVar.e) || !cp5.d.A(z92.f.l(dVar))) {
                                bVarL = null;
                            }
                            if (bVarL != null) {
                                arrayList.add(bVarL);
                            }
                        }
                        listU = zhm.d0.U(arrayList);
                    } else {
                        listU = null;
                    }
                    data = new Data(listU, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return zyd.g.a(gVar, data, false, bVar3, bVar2, 2);
        }
    }

    public /* synthetic */ m0(xi0.b bVar, Data data) {
        this.f111569b = bVar;
        this.f111570c = data;
    }
}
