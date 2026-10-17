package b4k;

import a83.c0;
import b0a.h;
import b4b.z;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentVendorsBeneCreationDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jli.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import o97.l;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import r10.t;
import rd0.e;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements z87.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12418b;

    public d(t remittanceVendorsSearchDelegate, b mapper) {
        Intrinsics.checkNotNullParameter(remittanceVendorsSearchDelegate, "remittanceVendorsSearchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f12417a = remittanceVendorsSearchDelegate;
        this.f12418b = r.TRANSFER_VENDORS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        efm.r rVarE;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        List listJ = g.j(searchQuery);
        ArrayList arrayList = new ArrayList(w.t(listJ, 10));
        Iterator it8 = listJ.iterator();
        while (true) {
            int i = 0;
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            int length = str.length() - 1;
            boolean z = false;
            while (i <= length) {
                boolean zIsLetterOrDigit = Character.isLetterOrDigit(str.charAt(!z ? i : length));
                if (z) {
                    if (zIsLetterOrDigit) {
                        break;
                    }
                    length--;
                } else if (zIsLetterOrDigit) {
                    z = true;
                } else {
                    i++;
                }
            }
            arrayList.add(str.subSequence(i, length + 1).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            rVarE = efm.r.just(zi0.c.P(f0.f322471a, false, null, 3));
            Intrinsics.checkNotNullExpressionValue(rVarE, "just(...)");
        } else {
            t tVar = this.f12417a;
            efm.r rVarSwitchMap = e.c(((cw9.d) tVar.f250858b).g(), kotlin.coroutines.g.f186406a).switchMap(new h(12, new z(tVar, 10)));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            efm.r rVarDistinctUntilChanged = nim.a.w(rVarSwitchMap, new c0(tVar, arrayList2, 7)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            rVarE = ue0.e.E(rVarDistinctUntilChanged, zi0.c.P(f0.f322471a, false, null, 3));
        }
        return nim.a.w(rVarE, new z(this, 11));
    }

    @Override // z87.f
    public final r h() {
        return this.f12418b;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        a item = obj2 instanceof a ? (a) obj2 : null;
        if (item != null) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new l(u0.f(new PaymentVendorsBeneCreationDestination(item.f12416a)));
        }
        r6.b.D("RemittanceVendorsSearchSourceImpl: unexpected payload");
        return o97.e.f223096a;
    }
}
