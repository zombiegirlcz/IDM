package sp5;

import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.n;
import efm.w;
import java.security.PublicKey;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sdi.k;
import spb.l;
import ss4.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f264891b;

    public /* synthetic */ h(int i, Function1 function1) {
        this.f264890a = i;
        this.f264891b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        sl5.a aVar = (sl5.a) this.f264891b;
        KeyboardSuggestionsDelegate.Companion aVar2 = KeyboardSuggestionsDelegate.INSTANCE;
        aVar.invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f264890a) {
            case 0:
                g gVar = (g) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar.invoke(p0);
            case 1:
                k kVar = (k) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar.invoke(p0);
            case 2:
                sl5.a aVar = (sl5.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 3:
                soi.a aVar2 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) aVar2.invoke(p0);
            case 4:
                k kVar2 = (k) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar2.invoke(p0);
            case 5:
                k kVar3 = (k) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar3.invoke(p0);
            case 6:
                soi.a aVar3 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar3.invoke(p0);
            case 7:
                l lVar = (l) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar.invoke(p0);
            case 8:
                l lVar2 = (l) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar2.invoke(p0);
            case 9:
            case 10:
            default:
                sx4.b bVar = (sx4.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar.invoke(p0);
            case 11:
                soi.a aVar4 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar4.invoke(p0);
            case 12:
                soi.a aVar5 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar5.invoke(p0);
            case 13:
                soi.a aVar6 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar6.invoke(p0);
            case 14:
                soi.a aVar7 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar7.invoke(p0);
            case 15:
                soi.a aVar8 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar8.invoke(p0);
            case 16:
                soi.a aVar9 = (soi.a) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar9.invoke(p0);
            case 17:
                z zVar = (z) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) zVar.invoke(p0);
            case 18:
                k kVar4 = (k) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar4.invoke(p0);
            case 19:
                z zVar2 = (z) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) zVar2.invoke(p0);
            case 20:
                k kVar5 = (k) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar5.invoke(p0);
            case 21:
                s06.e eVar = (s06.e) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) eVar.invoke(p0);
            case 22:
                sv9.b bVar2 = (sv9.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar2.invoke(p0);
            case 23:
                sv9.b bVar3 = (sv9.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (iv9.a) bVar3.invoke(p0);
            case 24:
                sv9.b bVar4 = (sv9.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar4.invoke(p0);
            case 25:
                sv9.b bVar5 = (sv9.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (iv9.a) bVar5.invoke(p0);
            case 26:
                sv9.b bVar6 = (sv9.b) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PublicKey) bVar6.invoke(p0);
            case 27:
                s06.e eVar2 = (s06.e) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) eVar2.invoke(p0);
            case 28:
                sx2.g gVar2 = (sx2.g) this.f264891b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) gVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        soi.a aVar = (soi.a) this.f264891b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
