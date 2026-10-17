package hwb;

import android.net.Uri;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.LinkedHashMap;
import java.util.Set;
import jwb.c;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svb.a f156121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jwb.a f156122b;

    public b(svb.a revRevPointsGiftcardsFeatureInteractor, jwb.a revPointsGiftcardsConfigInteractor) {
        Intrinsics.checkNotNullParameter(revRevPointsGiftcardsFeatureInteractor, "revRevPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsConfigInteractor, "revPointsGiftcardsConfigInteractor");
        this.f156121a = revRevPointsGiftcardsFeatureInteractor;
        this.f156122b = revPointsGiftcardsConfigInteractor;
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"rev-points/gift-cards", "rev-points/gift-cards/my-cards", "rev-points/gift-cards/{voucherGroupId}", "rev-points/gift-cards/my-cards/{userVoucherId}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements);
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((c) this.f156121a).a()) {
            LinkedHashMap linkedHashMap = deeplink.f195040b;
            if (linkedHashMap.containsKey("userVoucherId")) {
                String str = (String) linkedHashMap.get("userVoucherId");
                if (str != null) {
                    jwb.a aVar = this.f156122b;
                    cwb.c cVar = (cwb.c) aVar.f178946a;
                    j jVar = cVar.f109600b;
                    Set set = (Set) jVar.get("KEY_GIFTCARDS_CONFIG");
                    if (set == null) {
                        set = (Set) cVar.f109599a.v0(h0.f322473a, "KEY_GIFTCARDS_CONFIG", cwb.c.d);
                        jVar.f("KEY_GIFTCARDS_CONFIG", set);
                    }
                    Set setH1 = d0.h1(set);
                    setH1.add(str);
                    aVar.a(setH1);
                }
                return new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, str, null, null, 13), com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE));
            }
            boolean zF = Intrinsics.f(linkedHashMap.get("voucherGroupId"), "my-cards");
            RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards myCards = RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards.f83658a;
            if (zF) {
                return new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(myCards), null);
            }
            if (linkedHashMap.containsKey("voucherGroupId")) {
                return new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails((String) linkedHashMap.get("voucherGroupId"), null, null, null, 14), com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE));
            }
            String path = Uri.parse(deeplink.f195039a).getPath();
            String strK0 = path != null ? kotlin.text.d0.K0(path, '/') : null;
            if (Intrinsics.f(strK0, "rev-points/gift-cards/my-cards")) {
                return new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(myCards), null);
            }
            if (Intrinsics.f(strK0, "rev-points/gift-cards")) {
                RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome openGiftcardsHome = new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(0);
                String strA = g.a("listId", deeplink.f195041c);
                return new RevPointsGiftcardsDestination(openGiftcardsHome, strA != null ? com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA), null) : null);
            }
        }
        return null;
    }
}
