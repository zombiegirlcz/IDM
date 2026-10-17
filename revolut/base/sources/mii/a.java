package mii;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.a1;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import rp0.f1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static final ShotDialogDisplayer$Configuration a(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof f) {
            f fVar = (f) lVar;
            return ShotDialogDisplayer$Configuration.Companion.b(ShotDialogDisplayer$Configuration.INSTANCE, fVar.f205855a, fVar.f205856b, fVar.d, fVar.f205857c, fVar.f, fVar.e, null, 128);
        }
        if (lVar instanceof h) {
            h hVar = (h) lVar;
            return ShotDialogDisplayer$Configuration.Companion.d(ShotDialogDisplayer$Configuration.INSTANCE, hVar.f205861a, hVar.f205862b, hVar.f205863c, 40);
        }
        if (lVar instanceof j) {
            ShotDialogDisplayer$Configuration.Companion companion = ShotDialogDisplayer$Configuration.INSTANCE;
            j jVar = (j) lVar;
            String id10 = jVar.f205867a;
            TextLocalisedClause message = jVar.f205868b;
            f1 position = jVar.d;
            Clause clause = jVar.f205869c;
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(position, "position");
            return new ShotDialogDisplayer$Configuration(id10, message, new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite)), clause, a1.INDEFINITE, position, null, com.revolut.core.ui_kit_core.displayers.sound.b.a("sound_toast_loading"), null);
        }
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            return ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, kVar.f205870a, kVar.f205871b, kVar.d, kVar.f205872c, kVar.e, 32);
        }
        if (lVar instanceof e) {
            e eVar = (e) lVar;
            return ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, eVar.f205852a, eVar.f205853b, eVar.f205854c, 32);
        }
        if (lVar instanceof g) {
            g gVar = (g) lVar;
            return ShotDialogDisplayer$Configuration.Companion.c(ShotDialogDisplayer$Configuration.INSTANCE, gVar.f205858a, gVar.f205859b, gVar.f205860c, 32);
        }
        if (!(lVar instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar = (i) lVar;
        return ShotDialogDisplayer$Configuration.Companion.e(ShotDialogDisplayer$Configuration.INSTANCE, iVar.f205864a, iVar.f205865b, iVar.d, iVar.f205866c, iVar.e, 32);
    }

    public static final q b(e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        if (e1Var instanceof d1) {
            ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration = ((d1) e1Var).f256061a;
            Intrinsics.checkNotNullParameter(shotDialogDisplayer$Configuration, "<this>");
            return new p(new o(shotDialogDisplayer$Configuration.f55719g, shotDialogDisplayer$Configuration.f55716a));
        }
        if (e1Var instanceof c1) {
            c1 c1Var = (c1) e1Var;
            ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration2 = c1Var.f256056a;
            Intrinsics.checkNotNullParameter(shotDialogDisplayer$Configuration2, "<this>");
            return new n(new o(shotDialogDisplayer$Configuration2.f55719g, shotDialogDisplayer$Configuration2.f55716a), c1Var.f256057b);
        }
        if (!(e1Var instanceof b1)) {
            throw new NoWhenBranchMatchedException();
        }
        ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration3 = ((b1) e1Var).f256049a;
        Intrinsics.checkNotNullParameter(shotDialogDisplayer$Configuration3, "<this>");
        return new m(new o(shotDialogDisplayer$Configuration3.f55719g, shotDialogDisplayer$Configuration3.f55716a));
    }
}
