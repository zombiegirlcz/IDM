package uo1;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    @NotNull
    public static final C1555a Companion = new C1555a();

    /* JADX INFO: renamed from: uo1.a$a, reason: collision with other inner class name */
    public static final class C1555a {
        private C1555a() {
        }
    }

    public static CellDetailsDelegate.Model a(Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
