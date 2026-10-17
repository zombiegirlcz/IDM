package wob;

import com.revolut.core.ui_kit.models.MoneyClause;
import dj0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1653a Companion = new C1653a();

    /* JADX INFO: renamed from: wob.a$a, reason: collision with other inner class name */
    public static final class C1653a {
        private C1653a() {
        }
    }

    public static MoneyClause a(d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }
}
