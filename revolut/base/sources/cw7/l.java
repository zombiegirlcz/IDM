package cw7;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import cul.r1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f109567a;

    public l(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f109567a = uiKitResources;
    }

    public static ResourceImage a(l lVar, String str, Integer num) {
        int iIntValue = R$drawable.uikit_icn_24_statement;
        int iA = lVar.f109567a.a(str);
        Integer numValueOf = Integer.valueOf(iA);
        if (iA == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        return new ResourceImage(iIntValue, (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f109561a, new j(this, 0), new r1(this, 14), new cf1.h(this, 15));
    }
}
