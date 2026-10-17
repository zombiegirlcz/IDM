package ok5;

import cl3.e;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import mk5.k;
import nyd.j;
import ukm.f;
import vkm.q;
import vkm.t1;
import vkm.z1;
import wl3.h;
import xx9.p;
import zm3.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData f225902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pn3.a f225903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cl3.a f225904n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f225905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tv5.b f225906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y8k.b f225907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f225908s;

    public d(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData, pn3.a contactsPermissionsController, cl3.a contactsInteractor, p recentsInteractor, whf.b transactionsContentProvider, tv5.b currencyDiscoveryInteractor, y8k.b peerToPeerFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(recentsInteractor, "recentsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        this.f225902l = inputData;
        this.f225903m = contactsPermissionsController;
        this.f225904n = contactsInteractor;
        this.o = recentsInteractor;
        this.f225905p = transactionsContentProvider;
        this.f225906q = currencyDiscoveryInteractor;
        this.f225907r = peerToPeerFeatureConfigProvider;
        this.f225908s = q.b(0, 2, f.DROP_OLDEST);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e3(ok5.d r12, zm3.l r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ok5.d.e3(ok5.d, zm3.l, gim.c):java.io.Serializable");
    }

    @Override // mk5.k
    public final vkm.d Z2(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        e eVar = new e(searchQuery);
        return rd0.e.b(nim.a.w(kli.a.h(nim.a.w(((h) this.f225904n).l(new cl3.c[]{cl3.c.ON_REVOLUT}, eVar), new ojk.a(6)), nim.a.w(p.b(this.o, searchQuery), new ojk.a(5))), new ojk.a(4)));
    }

    @Override // mk5.k
    public final vkm.d b3() {
        return rd0.e.b(((pn3.b) this.f225903m).b());
    }

    @Override // mk5.k
    public final t1 c3() {
        return q.g(this.f225908s);
    }

    @Override // mk5.k
    public final void d3(RowDelegate.Model model, com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a parent, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object obj2 = model.u;
        String str = model.f53228a;
        Continuation continuation = null;
        if (obj2 instanceof l) {
            V2(new j(this, (l) obj2, bVar, continuation, 18), new yi5.b(29));
            return;
        }
        if (Intrinsics.f(str, "REVOLUT_FRIENDS_PERMISSION_ITEM_ID")) {
            ((pn3.b) this.f225903m).c(parent, new b(1, 8, MutableSharedFlow.class, this.f225908s, "tryEmit", "tryEmit(Ljava/lang/Object;)Z"));
        } else if (Intrinsics.f(str, "REVOLUT_FRIENDS_ADD_NEW_CONTACT_ITEM_ID")) {
            A2(new BridgeDestination(new FeatureCommand(new ContactsFeatureConfig.AddContact.ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.CHAT, null))));
        }
    }
}
