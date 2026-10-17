package pa8;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.b2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f234448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.d f234449b;

    public o(z80.b phoneToolsProvider, o7.d jisaDateOfBirthValidator) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        this.f234448a = phoneToolsProvider;
        this.f234449b = jisaDateOfBirthValidator;
    }

    public static CellDetailsActionListDelegate.Model a(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str, boolean z) {
        return new CellDetailsActionListDelegate.Model(str, textLocalisedClause, null, z ? new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, u.c(new b2(clause, null)), z, null, 196);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(t1.u(domainState.f234437a, domainState.f234438b, domainState.f234439c), new p5a.m(this, 22), new p4a.g(22), new p40.n(this, 4));
    }
}
