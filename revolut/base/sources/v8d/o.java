package v8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8d.a f286748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.l f286749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f286750c;

    public o(y8d.a imageProvider, p9d.l searchHintProvider, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(searchHintProvider, "searchHintProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f286748a = imageProvider;
        this.f286749b = searchHintProvider;
        this.f286750c = chatFeatureToggles;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k(((rf3.d) this.f286750c).b() == j30.b.FULLY_ENABLED ? new TextLocalisedClause(R$string.help_center_section_quick_help_articles, null, null, 14) : new TextLocalisedClause(R$string.help_center_section_quick_help_frequently_asked_questions, null, null, 14), ((p9d.m) this.f286749b).a(), (List) iii.c.f(domainState.f286735a, new v80.a(this), new v78.d(3), new w(this, 21)));
    }
}
