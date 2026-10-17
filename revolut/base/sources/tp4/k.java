package tp4;

import com.revolut.core.error.data.model.ServerError;
import java.util.concurrent.CopyOnWriteArrayList;
import nii.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a f273274b;

    public /* synthetic */ k(com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar, int i) {
        this.f273273a = i;
        this.f273274b = aVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) throws Throwable {
        int i = this.f273273a;
        com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar = this.f273274b;
        Throwable th10 = (Throwable) obj2;
        switch (i) {
            case 0:
                ServerError serverErrorA = aVar.u.a(th10);
                if (serverErrorA != null && serverErrorA.f51362a == 9401) {
                    throw th10;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                aVar.f69065s.getClass();
                return vt4.b.a();
            case 1:
                aVar.f69065s.getClass();
                return vt4.b.a();
            default:
                ServerError serverErrorA2 = aVar.u.a(th10);
                if (serverErrorA2 != null && serverErrorA2.f51362a == 9401) {
                    throw th10;
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                aVar.f69065s.getClass();
                return vt4.b.a();
        }
    }
}
