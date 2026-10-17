package d9k;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f112410a;

    public g(dl3.f contactsMapper, h badgeMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        this.f112410a = contactsMapper;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final AvatarModel.Default a(PeerToPeerRecipient recipient) {
        dl3.e bVar;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (((Boolean) jo0.g.A.getValue()).booleanValue()) {
            bVar = new dl3.c(recipient.f102270a);
        } else {
            String strC = t8k.a.c(recipient);
            AvatarModel.BadgeModel badgeModel = (strC == null || d0.W(strC)) ? null : Intrinsics.f(t8k.a.d(recipient), Boolean.TRUE) ? new AvatarModel.BadgeModel(new RawImageBadge(h5k.a.d()), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : new AvatarModel.BadgeModel(new RawImageBadge(h5k.a.e()), com.revolut.core.ui_kit.models.avatar.b.BOTTOM);
            bVar = badgeModel != null ? new dl3.b(badgeModel) : null;
        }
        return dl3.f.b(this.f112410a, recipient.f102270a, bVar, 4);
    }
}
