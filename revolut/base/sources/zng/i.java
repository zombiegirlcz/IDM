package zng;

import bog.p;
import bog.r;
import bog.s;
import bog.t;
import bog.u;
import cli.n;
import cli.y;
import cli.z;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.shared.feature.user_declarations.api.models.NamePrefill;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;
import r10.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements z, dli.b {
    public final v o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f323825p;

    /* JADX WARN: Multi-variable type inference failed */
    public i(NameControllerDescriptor$InputData inputData, n stateMapper, v screenValidator) {
        boolean zF;
        bog.j jVar;
        u rVar;
        bog.b bVar;
        u sVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(screenValidator, "screenValidator");
        this.o = screenValidator;
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        wi0.b bVar2 = inputData.f105054a;
        boolean z = inputData.f105055b;
        NamePrefill namePrefill = inputData.f105057g;
        pbl.a aVar = inputData.f;
        boolean z3 = true;
        if (aVar != null) {
            zF = aVar == pbl.a.FIRST_AND_SURNAMES;
        } else {
            wi0.b.Companion.getClass();
            zF = Intrinsics.f(bVar2, wi0.b.f297750h0);
        }
        Object[] objArr = zF || com.bumptech.glide.d.u(bVar2);
        boolean z4 = inputData.f105056c;
        if (!(aVar != null ? aVar == pbl.a.FIRST_AND_MIDDLE_AND_LAST : com.bumptech.glide.d.l(bVar2))) {
            wi0.b.Companion.getClass();
            if (!Intrinsics.f(bVar2, wi0.b.l2)) {
                z3 = false;
            }
        }
        bog.b bVar3 = null;
        if (objArr == true) {
            String str = namePrefill != null ? namePrefill.f105036a : null;
            rVar = new t(new bog.d(str == null ? "" : str, new TextLocalisedClause(R$string.signup_main_form_name_placeholder, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_first_name_footer, null, null, 14), false, false, null), new bog.f(namePrefill != null ? namePrefill.f105039g : null, new TextLocalisedClause(R$string.signup_main_form_first_surname_placeholder, null, null, 14), null, false, false, null), new p(namePrefill != null ? namePrefill.f105040h : null, new TextLocalisedClause(R$string.signup_main_form_second_surname_placeholder, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_second_surname_helper, null, null, 14), false, false, null, null));
        } else {
            if (z4) {
                bog.n nVar = new bog.n(new TextLocalisedClause(R$string.signup_main_form_last_name_placeholder, null, null, 14), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_main_form_name_japanese_last_name_footer, null, null, 14), namePrefill != null ? namePrefill.f : null, false);
                bog.l lVar = new bog.l(new TextLocalisedClause(R$string.signup_main_form_first_name_placeholder, null, null, 14), new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_main_form_name_japanese_first_name_footer, null, null, 14), namePrefill != null ? namePrefill.e : null, false);
                bog.h hVar = new bog.h(namePrefill != null ? namePrefill.f105037b : null, new TextLocalisedClause(R$string.signup_main_form_last_name_placeholder, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_last_name_helper_japan, null, null, 14), false, false, null);
                String str2 = namePrefill != null ? namePrefill.f105036a : null;
                bog.d dVar = new bog.d(str2 == null ? "" : str2, new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.signup_main_form_name_first_name_plural_placeholder, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_first_name_helper_japan, null, null, 14), false, false, null);
                if (z) {
                    bVar = new bog.b(namePrefill != null ? namePrefill.d : null);
                } else {
                    bVar = null;
                }
                sVar = new s(nVar, lVar, hVar, dVar, bVar);
                this.f323825p = mra.d.b(this, new g(sVar, inputData.f105054a, inputData.f105056c, inputData.d, inputData.f, inputData.f105058h), stateMapper, null, false, 12);
            }
            String str3 = namePrefill != null ? namePrefill.f105036a : null;
            bog.d dVar2 = new bog.d(str3 == null ? "" : str3, new TextLocalisedClause(R$string.signup_main_form_first_name_placeholder, null, null, 14), new TextLocalisedClause(com.bumptech.glide.d.w(bVar2) ? com.revolut.shared.feature.user_declarations.api.R$string.signup_main_form_first_name_footer_ukraine : com.bumptech.glide.d.r(bVar2) ? R$string.signup_main_form_first_name_footer_israel : R$string.signup_main_form_first_name_footer, null, null, 14), false, false, null);
            if (z3) {
                jVar = new bog.j(namePrefill != null ? namePrefill.f105038c : null, new TextLocalisedClause(R$string.signup_main_form_middle_name_placeholder, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_middle_name_footer, null, null, 14), false, false, null, null);
            } else {
                jVar = null;
            }
            bog.h hVar2 = new bog.h(namePrefill != null ? namePrefill.f105037b : null, new TextLocalisedClause(R$string.signup_main_form_last_name_placeholder, null, null, 14), null, false, false, null);
            if (z) {
                bVar3 = new bog.b(namePrefill != null ? namePrefill.d : null);
            }
            rVar = new r(dVar2, jVar, hVar2, bVar3);
        }
        sVar = rVar;
        this.f323825p = mra.d.b(this, new g(sVar, inputData.f105054a, inputData.f105056c, inputData.d, inputData.f, inputData.f105058h), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323825p;
    }
}
