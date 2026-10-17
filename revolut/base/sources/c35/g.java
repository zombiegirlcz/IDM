package c35;

import com.revolut.data.model.Data;
import dx4.a1;
import fs3.i;
import grl.r2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x15.j;
import x15.l;
import xq3.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20895c;

    public /* synthetic */ g(c cVar, l lVar, int i) {
        this.f20893a = i;
        this.f20894b = cVar;
        this.f20895c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20893a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                c cVar = this.f20894b;
                return nim.a.v(w.a(cVar.f20882b, r2.ADD_NEW_PRODUCT), new g(cVar, this.f20895c, 1));
            default:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                j jVar = (j) this.f20895c;
                i iVarU = ebm.a.u(entryPoints, this.f20894b.d);
                fs3.b bVar = iVarU.f137586a;
                String str = iVarU.f137587b;
                String str2 = iVarU.f137588c;
                jo3.a aVarP = mo3.a.p(jVar.f302277a.e);
                cl4.a aVar = jVar.f302277a;
                String strO = mif.a.o(aVar.f24928a);
                boolean z = aVar.d;
                a1 a1Var = iVarU.d;
                return new mp3.d("secured_credit_card_account_item_id", bVar, str, str2, aVarP, strO, z, a1Var != null ? Integer.valueOf(a1Var.c()) : null, iVarU.e, cp5.d.L(iVarU.f));
        }
    }
}
