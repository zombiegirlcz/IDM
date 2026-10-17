package xo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements cli.n {

    @NotNull
    public static final k0 Companion = new k0();

    public static RowDelegate.Model a(l0 l0Var, String str, TextLocalisedClause textLocalisedClause, Integer num, TextLocalisedClause textLocalisedClause2, RowDelegate.Model.b bVar, boolean z, Object obj2, int i) {
        RowDelegate.Model.MainImage.Image24 image24 = null;
        TextLocalisedClause textLocalisedClause3 = (i & 8) != 0 ? null : textLocalisedClause2;
        RowDelegate.Model.b bVar2 = (i & 16) != 0 ? RowDelegate.Model.b.c.f53268a : bVar;
        boolean z3 = (i & 32) != 0 ? true : z;
        Object obj3 = (i & 64) != 0 ? null : obj2;
        l0Var.getClass();
        if (num != null) {
            boolean z4 = false;
            image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(num.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6);
        }
        return new RowDelegate.Model(str, image24, textLocalisedClause, null, 0, textLocalisedClause3, null, null, 0, null, z3, null, false, bVar2, null, null, null, null, null, obj3, null, 0, 0, 0, 0, 532658136);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new s((r) iii.c.f(domainState.f307708a, new i0(0), new xlb.l(11), new j0(this, domainState, 0)), (List) iii.c.f(domainState.f307708a, new i0(1), new xlb.l(12), new wx6.k(domainState, this, 17)));
    }
}
