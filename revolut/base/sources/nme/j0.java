package nme;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f217304b;

    public /* synthetic */ j0(Data data, int i) {
        this.f217303a = i;
        this.f217304b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f217303a) {
            case 0:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, this.f217304b, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435391);
            case 1:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, this.f217304b, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435451);
            case 2:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, this.f217304b, 134217727);
            case 3:
                Data data2 = this.f217304b;
                Intrinsics.h(data2);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, data2, null, null, null, false, null, null, null, 267386879);
            case 4:
                Data data3 = this.f217304b;
                Intrinsics.h(data3);
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, data3, null, null, false, null, null, null, 266338303);
            case 5:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, this.f217304b, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435327);
            case 6:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, this.f217304b, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268434431);
            case 7:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, this.f217304b, null, false, null, null, null, null, false, null, null, null, 268304383);
            case 8:
                Data data4 = this.f217304b;
                Intrinsics.h(data4);
                return nn3.c.a((nn3.c) obj2, data4, null, null, null, null, false, false, null, 0, null, 131070);
            case 9:
                return nnd.c.a((nnd.c) obj2, null, this.f217304b, 1);
            case 10:
                return nnd.c.a((nnd.c) obj2, this.f217304b, null, 2);
            case 11:
                Data data5 = this.f217304b;
                Intrinsics.h(data5);
                return nnf.d.a((nnf.d) obj2, data5, null, 2);
            case 12:
                Data data6 = this.f217304b;
                Intrinsics.h(data6);
                return nnf.d.a((nnf.d) obj2, null, data6, 1);
            case 13:
                return nnj.k.a((nnj.k) obj2, null, null, null, null, null, this.f217304b, 31);
            case 14:
                return nnj.k.a((nnj.k) obj2, null, null, null, null, this.f217304b, null, 47);
            case 15:
                Data data7 = this.f217304b;
                nnj.k kVar = (nnj.k) obj2;
                try {
                    Object content = data7.getContent();
                    data = new Data(content != null ? Boolean.valueOf(((dej.i) content).d) : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data7.getLoading());
                }
                return nnj.k.a(kVar, null, null, null, data, null, null, 55);
            case 16:
                return nnj.k.a((nnj.k) obj2, this.f217304b, null, null, null, null, null, 62);
            case 17:
                ((nob.g) obj2).getClass();
                Data contentData = this.f217304b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new nob.g(contentData);
            case 18:
                Data data8 = this.f217304b;
                Intrinsics.h(data8);
                return noe.b.a((noe.b) obj2, null, null, data8, null, 11);
            case 19:
                Data data9 = this.f217304b;
                Intrinsics.h(data9);
                return noe.b.a((noe.b) obj2, null, null, null, data9, 7);
            case 20:
                Data data10 = this.f217304b;
                Intrinsics.h(data10);
                return noe.b.a((noe.b) obj2, data10, null, null, null, 14);
            case 21:
                Data data11 = this.f217304b;
                Intrinsics.h(data11);
                return noe.b.a((noe.b) obj2, null, data11, null, null, 13);
            case 22:
                ((nqd.a) obj2).getClass();
                Data incomeSortersData = this.f217304b;
                Intrinsics.checkNotNullParameter(incomeSortersData, "incomeSortersData");
                return new nqd.a(incomeSortersData);
            case 23:
                return nqh.d.a((nqh.d) obj2, null, null, this.f217304b, 3);
            case 24:
                ((ns9.e) obj2).getClass();
                Data transactions = this.f217304b;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new ns9.e(transactions);
            case 25:
                vrc.k purpose = ((nsc.f) obj2).f218779b;
                Data trustedEntities = this.f217304b;
                Intrinsics.checkNotNullParameter(trustedEntities, "trustedEntities");
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                return new nsc.f(trustedEntities, purpose);
            case 26:
                return jsl.w.a((jsl.w) obj2, null, this.f217304b, null, null, false, null, null, ISO781611.SMT_TAG);
            case 27:
                return jsl.w.a((jsl.w) obj2, null, null, null, this.f217304b, false, null, null, LDSFile.EF_SOD_TAG);
            case 28:
                return jsl.w.a((jsl.w) obj2, this.f217304b, null, null, null, false, null, null, 126);
            default:
                return jsl.w.a((jsl.w) obj2, null, null, null, null, false, this.f217304b, null, 95);
        }
    }
}
