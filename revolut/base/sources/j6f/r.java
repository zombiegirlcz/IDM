package j6f;

import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m6f.a f171756b;

    public /* synthetic */ r(m6f.a aVar, int i) {
        this.f171755a = i;
        this.f171756b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        m6f.d dVarA;
        m6f.q qVarA;
        Data allocationItemsData;
        m6f.d dVarA2;
        m6f.q qVarA2;
        switch (this.f171755a) {
            case 0:
                m6f.a aVar = this.f171756b;
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data2 = update.f171739a;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        m6f.d dVar = (m6f.d) content;
                        m6f.q qVar = dVar.f203055a;
                        m6f.p pVar = aVar.f203053a;
                        if (pVar instanceof m6f.o) {
                            qVarA = m6f.q.a(qVar, m6f.o.a(qVar.f203079a, !r0.f203078c), null, null, null, 14);
                        } else if (pVar instanceof m6f.k) {
                            qVarA = m6f.q.a(qVar, null, m6f.k.a(qVar.f203080b, !r0.f203068c), null, null, 13);
                        } else if (pVar instanceof m6f.m) {
                            qVarA = m6f.q.a(qVar, null, null, m6f.m.a(qVar.f203081c, !r0.f203074c), null, 11);
                        } else {
                            if (!(pVar instanceof m6f.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qVarA = m6f.q.a(qVar, null, null, null, m6f.l.a(qVar.d, !r0.f203071c), 7);
                        }
                        dVarA = m6f.d.a(dVar, qVarA);
                    } else {
                        dVarA = null;
                    }
                    data = new Data(dVarA, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return a.a(update, data, null, null, false, 14);
            default:
                m6f.a aVar2 = this.f171756b;
                p8f.e update2 = (p8f.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data3 = update2.f234150a;
                try {
                    Object content2 = data3.getContent();
                    if (content2 != null) {
                        m6f.d dVar2 = (m6f.d) content2;
                        m6f.q qVar2 = dVar2.f203055a;
                        m6f.p pVar2 = aVar2.f203053a;
                        if (pVar2 instanceof m6f.o) {
                            qVarA2 = m6f.q.a(qVar2, m6f.o.a(qVar2.f203079a, !r0.f203078c), null, null, null, 14);
                        } else if (pVar2 instanceof m6f.k) {
                            qVarA2 = m6f.q.a(qVar2, null, m6f.k.a(qVar2.f203080b, !r0.f203068c), null, null, 13);
                        } else if (pVar2 instanceof m6f.m) {
                            qVarA2 = m6f.q.a(qVar2, null, null, m6f.m.a(qVar2.f203081c, !r0.f203074c), null, 11);
                        } else {
                            if (!(pVar2 instanceof m6f.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qVarA2 = m6f.q.a(qVar2, null, null, null, m6f.l.a(qVar2.d, !r0.f203071c), 7);
                        }
                        dVarA2 = m6f.d.a(dVar2, qVarA2);
                    } else {
                        dVarA2 = null;
                    }
                    allocationItemsData = new Data(dVarA2, data3.getError(), data3.getLoading());
                } catch (Throwable th11) {
                    allocationItemsData = new Data(null, th11, data3.getLoading());
                }
                Intrinsics.checkNotNullParameter(allocationItemsData, "allocationItemsData");
                return new p8f.e(allocationItemsData);
        }
    }
}
