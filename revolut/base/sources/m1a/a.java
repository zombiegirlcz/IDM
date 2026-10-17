package m1a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f201295a;

    public a(dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f201295a = contactsMapper;
    }

    public final ContactImage a(zm3.l lVar, String str, String str2, String str3) {
        return lVar != null ? ((xl3.d) this.f201295a).h(lVar) : new ContactImage(str, (String) null, (String) null, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str3), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062);
    }
}
