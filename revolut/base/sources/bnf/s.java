package bnf;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class s {
    public static final CellDetailsDelegate.Model a(CellDetailsDelegate.Model model, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(model, "<this>");
        Intrinsics.checkNotNullParameter(label, "cellTitle");
        t0 t0Var = model.f51833b;
        Image image = t0Var.f10537b;
        int i = t0Var.f10538c;
        boolean z = t0Var.d;
        boolean z3 = t0Var.e;
        Intrinsics.checkNotNullParameter(label, "label");
        return CellDetailsDelegate.Model.e(model, null, new t0(label, image, i, z, z3), false, 67108861);
    }
}
