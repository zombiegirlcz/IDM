package ara;

import android.nfc.NfcAdapter;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8597b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f8596a = i;
        this.f8597b = obj2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        switch (this.f8596a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                f63.b bVar = ((f63.d) ((w53.b) ((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) ((CardOwnerMainInfoScreen) this.f8597b).e3()).f81581r.f222639b)).f132401a;
                NfcAdapter nfcAdapter = bVar.f132398b;
                if (nfcAdapter != null) {
                    nfcAdapter.disableForegroundDispatch(bVar.f132397a);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "owner");
                kmi.g gVar = (kmi.g) this.f8597b;
                gVar.d = false;
                gVar.a();
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                f63.b bVar2 = ((f63.d) ((com.revolut.feature.topup_screen.impl.screens.card_details.b) ((CardDetailsScreen) this.f8597b).e3()).f91097x).f132401a;
                NfcAdapter nfcAdapter2 = bVar2.f132398b;
                if (nfcAdapter2 != null) {
                    nfcAdapter2.disableForegroundDispatch(bVar2.f132397a);
                }
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        switch (this.f8596a) {
            case 0:
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((f63.d) ((w53.b) ((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) ((CardOwnerMainInfoScreen) this.f8597b).e3()).f81581r.f222639b)).c();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(owner, "owner");
                kmi.g gVar = (kmi.g) this.f8597b;
                gVar.d = true;
                gVar.a();
                break;
            default:
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((f63.d) ((com.revolut.feature.topup_screen.impl.screens.card_details.b) ((CardDetailsScreen) this.f8597b).e3()).f91097x).c();
                break;
        }
    }
}
