package s6d;

import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.d2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BrandingSettingsScreen f260237w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(BrandingSettingsScreen brandingSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260237w = brandingSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f260237w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f260237w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f260237w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            default:
                f fVar4 = new f(this.f260237w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Boolean boolValueOf;
        int i = this.u;
        BrandingSettingsScreen brandingSettingsScreen = this.f260237w;
        switch (i) {
            case 0:
                d2 action = (d2) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = brandingSettingsScreen.R2();
                Intrinsics.h(action);
                com.revolut.feature.shared.branding.impl.ui.settings.a aVar2 = (com.revolut.feature.shared.branding.impl.ui.settings.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                k6d.h hVar = (k6d.h) ((j) ((j2) aVar2.f86085y.f22677a).getValue()).f260240a.getContent();
                CellDetailsAttachmentDelegate.Model model = action.f54009a;
                String str = model.f51809a;
                String str2 = model.f51809a;
                TextLocalisedClause textLocalisedClause = str.equals("LOGO_ID") ? new TextLocalisedClause(R$string.merchant_profile_branding_picker_logo_title, null, null, 14) : str.equals("BACKGROUND_ID") ? new TextLocalisedClause(R$string.merchant_profile_branding_picker_cover_title, null, null, 14) : null;
                if (str2.equals("LOGO_ID")) {
                    boolValueOf = Boolean.valueOf((hVar != null ? hVar.i : null) != null);
                } else if (str2.equals("BACKGROUND_ID")) {
                    boolValueOf = Boolean.valueOf((hVar != null ? hVar.f181689h : null) != null);
                } else {
                    boolValueOf = null;
                }
                if (textLocalisedClause != null && boolValueOf != null) {
                    e60.a aVar3 = aVar2.f86079q;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.merchant_profile_branding_picker_description, null, null, 14);
                    u00 u00Var = u00.BACK;
                    e60.o.Companion.getClass();
                    ((e60.s) aVar3).T(new e60.i(str2, textLocalisedClause, textLocalisedClause2, false, 0, 0, e60.b.f122837b, null, boolValueOf.booleanValue(), u00Var, null, 15544));
                }
                break;
            case 1:
                String str3 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = brandingSettingsScreen.R2();
                Intrinsics.h(str3);
                ((com.revolut.feature.shared.branding.impl.ui.settings.a) lVarE32).J2(null, str3);
                break;
            case 2:
                koi.j jVar = (koi.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE33 = brandingSettingsScreen.R2();
                String f52792a = jVar.getF55254b();
                qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                ((com.revolut.feature.shared.branding.impl.ui.settings.a) lVarE33).J2(pVar != null ? pVar.getF55256g() : null, f52792a);
                break;
            default:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.branding.impl.ui.settings.a) brandingSettingsScreen.R2()).J2(null, aVar6.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
