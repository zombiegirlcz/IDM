package y8k;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferWithPreloadDestination;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PreloadScenario;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1733a Companion = new C1733a();

    /* JADX INFO: renamed from: y8k.a$a, reason: collision with other inner class name */
    public static final class C1733a {
        private C1733a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"{username}/pocket/{pocketId}", "splitbill/{code}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        String str = (String) linkedHashMap.get("username");
        String str2 = (String) linkedHashMap.get("pocketId");
        String str3 = (String) linkedHashMap.get("code");
        if (str != null && str2 != null) {
            return new PeerToPeerTransferWithPreloadDestination(new PreloadScenario.TransferToSubaccount(str, str2));
        }
        if (str3 != null) {
            return new PeerToPeerTransferWithPreloadDestination(new PreloadScenario.TransferToAnonymousSplitLink(str3));
        }
        return null;
    }
}
