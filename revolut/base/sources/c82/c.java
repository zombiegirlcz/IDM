package c82;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(a82.a aVar) {
        return new RowDelegate.Model(j6.a.q("ID_MORE_ITEM_", aVar.name()), new RowDelegate.Model.MainImage.Image40(aVar.getIcon(), null, null, false, null, false, 60), aVar.getTitle(), null, 0, aVar.a(), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532676568);
    }
}
