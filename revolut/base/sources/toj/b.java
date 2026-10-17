package toj;

import af.d;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import kotlin.jvm.internal.Intrinsics;
import ufm.c;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static UserAvatarImage a(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return new UserAvatarImage(new UserNamePlaceholder.Default(mo3.a.k(user), 0), null, null, 6);
    }

    public final c b(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        c cVar = new c(new d(user, this), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
