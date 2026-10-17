package j0a;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.l;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f169991a;

    public b(dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f169991a = contactsMapper;
    }

    public final AvatarModel.Default a(zm3.a contact) {
        Image imageF;
        Intrinsics.checkNotNullParameter(contact, "contact");
        boolean z = contact instanceof l;
        dl3.f fVar = this.f169991a;
        if (z) {
            imageF = ((xl3.d) fVar).f(contact);
        } else {
            if (!(contact instanceof zm3.g) && !(contact instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            imageF = null;
        }
        return dl3.f.b(fVar, contact, imageF != null ? new dl3.b(new AvatarModel.BadgeModel(new RawImageBadge(imageF), com.revolut.core.ui_kit.models.avatar.b.BOTTOM)) : null, 4);
    }
}
