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
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20886c;

    public /* synthetic */ d(c cVar, l lVar, int i) {
        this.f20884a = i;
        this.f20885b = cVar;
        this.f20886c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20884a) {
            case 0:
                if (!((Boolean) obj2).booleanValue()) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                c cVar = this.f20885b;
                return nim.a.v(w.a(cVar.f20882b, r2.ADD_NEW_PRODUCT), new d(cVar, this.f20886c, 1));
            default:
                List entryPoints = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
                j jVar = (j) this.f20886c;
                i iVarU = ebm.a.u(entryPoints, this.f20885b.d);
                fs3.b bVar = iVarU.f137586a;
                String str = iVarU.f137587b;
                String str2 = iVarU.f137588c;
                jo3.a aVarP = mo3.a.p(jVar.f302277a.e);
                cl4.a aVar = jVar.f302277a;
                String strO = mif.a.o(aVar.f24928a);
                boolean z = aVar.d;
                a1 a1Var = iVarU.d;
                return new mp3.d("credit_builder_card_account_item_id", bVar, str, str2, aVarP, strO, z, a1Var != null ? Integer.valueOf(a1Var.c()) : null, iVarU.e, cp5.d.L(iVarU.f));
        }
    }
}
