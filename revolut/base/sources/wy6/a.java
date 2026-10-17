package wy6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1666a Companion = new C1666a();

    /* JADX INFO: renamed from: wy6.a$a, reason: collision with other inner class name */
    public static final class C1666a {
        private C1666a() {
        }
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, ResourceImage resourceImage) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(resourceImage, null, null, false, null, false, 62), textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }
}
