package com.revolut.sso.impl.ui.identifier_input;

import bjl.p0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode;
import gnl.h;
import gnl.t;
import java.io.Serializable;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import tll.c;
import yhm.o;
import z80.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierInputScreenContract$InputData f106570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f106571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f106572c;
    public final c d;

    public a(IdentifierInputScreenContract$InputData inputData, b phoneToolsProvider, p0 revolutSsoDependenciesProvider, c identifierValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(identifierValidator, "identifierValidator");
        this.f106570a = inputData;
        this.f106571b = phoneToolsProvider;
        this.f106572c = revolutSsoDependenciesProvider;
        this.d = identifierValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r33) {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.identifier_input.a.a(jki.i):jki.m");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(gnl.h r52) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.identifier_input.a.b(gnl.h):java.util.List");
    }

    public final List c(h hVar) {
        boolean z;
        Pair pair;
        Identifier identifier = hVar.f145029a;
        PlainTextDelegate.Model model = null;
        Identifier.Phone phone = identifier instanceof Identifier.Phone ? (Identifier.Phone) identifier : null;
        if (phone == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wi0.b bVar = phone.f106152c;
        String str = phone.f106150a;
        IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData = this.f106570a;
        IdentifierInputScreenContract$Mode identifierInputScreenContract$Mode = identifierInputScreenContract$InputData.f106564b;
        if (identifierInputScreenContract$Mode instanceof IdentifierInputScreenContract$Mode.GetIdentifier) {
            z = false;
        } else if (identifierInputScreenContract$Mode instanceof IdentifierInputScreenContract$Mode.SignIn) {
            z = ((IdentifierInputScreenContract$Mode.SignIn) identifierInputScreenContract$Mode).f106568c.f105967a;
        } else {
            if (!(identifierInputScreenContract$Mode instanceof IdentifierInputScreenContract$Mode.SignUp)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        fj0.a aVar = fj0.b.Companion;
        String strJ = this.f106571b.j(bVar);
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        o.b(serializableB);
        ka kaVar = new ka("PHONE", str, new Pair(serializableB, bVar), null, null, new TextLocalisedClause(R$string.revolut_sso_login_input_phone_placeholder, null, null, 14), false, hVar.d, 7864);
        int i = R$attr.uikit_dp0;
        yp0.b.l(kaVar, 0, 0, i, i, null, false, 51);
        if (z) {
            IdentifierInputScreenContract$Mode identifierInputScreenContract$Mode2 = identifierInputScreenContract$InputData.f106564b;
            if ((identifierInputScreenContract$Mode2 instanceof IdentifierInputScreenContract$Mode.GetIdentifier) || (identifierInputScreenContract$Mode2 instanceof IdentifierInputScreenContract$Mode.SignIn)) {
                pair = new Pair("LOST_ACCESS", Integer.valueOf(R$string.revolut_sso_login_input_phone_action_title));
            } else {
                if (!(identifierInputScreenContract$Mode2 instanceof IdentifierInputScreenContract$Mode.SignUp)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair("ALREADY_HAVE_ACCOUNT", Integer.valueOf(R$string.revolut_sso_signup_secondary_action_title));
            }
            String str2 = (String) pair.f186385a;
            model = new PlainTextDelegate.Model(str2, (Clause) null, (Clause) new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, new Click(30, (Integer) null, (Object) null, str2, false), 10), (v5) null, (UrlImage) null, true, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65262);
        }
        i[] elements = {kaVar, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.L(elements);
    }
}
