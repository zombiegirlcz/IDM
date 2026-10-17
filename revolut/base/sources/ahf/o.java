package ahf;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f5091b;

    public /* synthetic */ o(z zVar, int i) {
        this.f5090a = i;
        this.f5091b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Data data3;
        String f60522c;
        switch (this.f5090a) {
            case 0:
                z zVar = this.f5091b;
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                Data data4 = (Data) yVar.f288491a;
                Data data5 = (Data) yVar.f288492b;
                String str = (String) yVar.f288493c;
                Data data6 = (Data) yVar.d;
                od0.i iVar = (od0.i) yVar.e;
                Data data7 = (Data) yVar.f;
                try {
                    Object content = data4.getContent();
                    data = new Data(content != null ? zVar.N2((b9e.c) content, str) : null, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                Data data8 = data;
                try {
                    Object content2 = data5.getContent();
                    data2 = new Data(content2 != null ? zVar.L2(str, (List) content2) : null, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                try {
                    Object content3 = data6.getContent();
                    data3 = new Data(content3 != null ? zVar.M2((chf.g) content3, str) : null, data6.getError(), data6.getLoading());
                    break;
                } catch (Throwable th12) {
                    data3 = new Data(null, th12, data6.getLoading());
                }
                Data data9 = data3;
                lgf.a aVar = (lgf.a) iVar.f224257a;
                return new vf0.k(data8, data2, data9, (aVar == null || (!kotlin.text.d0.W(str) && ((f60522c = aVar.f195110a.getF60522c()) == null || !kotlin.text.d0.J(f60522c, str, true)))) ? null : aVar, data7);
            default:
                z zVar2 = this.f5091b;
                zVar2.H2(zVar2.N, new a31.g((String) obj2, 25));
                return Unit.f186387a;
        }
    }
}
