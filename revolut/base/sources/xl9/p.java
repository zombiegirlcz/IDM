package xl9;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gn;
import ip0.ij;
import ip0.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aim.e f306972b;

    public /* synthetic */ p(aim.e eVar, int i) {
        this.f306971a = i;
        this.f306972b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f306971a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f306972b.add(new ij("ID_FOOTER_LOADING"));
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter("ID_EARN_REVPOINTS_LOADING", "listId");
                int i = R$attr.uikit_dp0;
                gn gnVar = new gn();
                gnVar.f164447a = i;
                gnVar.f164448b = i;
                gnVar.f164449c = i;
                gnVar.d = i;
                gnVar.e = c.d.f249513a;
                gnVar.f = null;
                gnVar.f164450g = null;
                gnVar.f164451h = null;
                gnVar.i = null;
                yp0.b.l(gnVar, 0, 0, 0, 0, null, false, 63);
                this.f306972b.add(gnVar);
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB = u.b();
                v7.C("HEADER_REVOLUT_ACCOUNTS_LOADING", 0, 0, 30, eVarB);
                eVarB.addAll(iii.c.c(3));
                return Boolean.valueOf(this.f306972b.addAll(u.a(eVarB)));
        }
    }

    public /* synthetic */ p(aim.e eVar, xpl.n nVar) {
        this.f306971a = 2;
        this.f306972b = eVar;
    }
}
