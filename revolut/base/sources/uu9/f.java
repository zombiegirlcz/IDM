package uu9;

import androidx.appcompat.view.ContextThemeWrapper;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import defpackage.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s7a.l0;
import ufm.i;
import up5.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f283184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f283185b;

    public f(ContextThemeWrapper context, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f283184a = context;
        this.f283185b = uiResources;
    }

    public final i a(String senderCode, String senderName) {
        Intrinsics.checkNotNullParameter(senderCode, "senderCode");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        ufm.b bVar = new ufm.b(new e1(this, new ContactImage((String) null, (String) null, senderCode, (String) null, (String) null, senderName, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059), 6), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        i iVar = new i(bVar, new d0(20, new l0(senderName, senderCode, 2)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
