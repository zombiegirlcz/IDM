package vs9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.groups.api.R$string;
import ip0.zj;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {

    @NotNull
    public static final C1620a Companion = new C1620a();

    /* JADX INFO: renamed from: vs9.a$a, reason: collision with other inner class name */
    public static final class C1620a {
        private C1620a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_dialog_title_name, u.c(domainState.f291748a.f79286b), null, 12), new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_dialog_description, null, null, 14), u.c(new FullScreenStateDelegate.Model("ID_EMPTY_PLACEHOLDER", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D119", null, null, null, 30)), zj.REGULAR, null, false, null, null, true, 0, 0, 31718)));
    }
}
