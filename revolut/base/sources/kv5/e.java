package kv5;

import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kkf.z7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h30.q f189958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f189959c;

    public /* synthetic */ e(h30.q qVar, xi0.b bVar, int i) {
        this.f189957a = i;
        this.f189958b = qVar;
        this.f189959c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f189957a) {
            case 0:
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                List listU = d0.U(currencies);
                ArrayList arrayList = new ArrayList(w.t(listU, 10));
                Iterator it8 = listU.iterator();
                while (it8.hasNext()) {
                    v1.c.A(arrayList, (xi0.b) it8.next(), this.f189959c);
                }
                return rd0.e.b(((ppk.f) this.f189958b.d).c(arrayList, n9l.b.SEC_3));
            default:
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                h30.q qVar = this.f189958b;
                return boh.f.e(new z7(nim.a.v(((o) qVar.e).a(), new ksk.h(25)), positions, 13), new e(qVar, this.f189959c, 0));
        }
    }
}
