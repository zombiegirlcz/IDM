package s22;

import c12.f;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f259242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz9.a f259243b;

    public b(f extension, kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f259242a = extension;
        this.f259243b = chatNavigationProvider;
    }

    public final Clause a(n02.b bVar) {
        Clause clauseZ0 = this.f259242a.Z0();
        return clauseZ0 == null ? new TextLocalisedClause(R$string.apm_new_contact_dialog_not_found_title, u.c(c8g.a.p(bVar).e()), null, 12) : clauseZ0;
    }
}
