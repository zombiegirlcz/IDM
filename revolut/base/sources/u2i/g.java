package u2i;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.feature.crypto.tfr.validation.api.model.CryptoMeshAccessToken;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import tnb.g0;
import tof.a3;
import ud3.e0;
import uf7.f0;
import vkm.v1;
import zh9.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f276670w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f276671x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276670w = obj2;
        this.f276671x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.f276670w, (r0i.a) this.f276671x, continuation, 0);
            case 1:
                return new g((g0) this.f276670w, (String) this.f276671x, continuation, 1);
            case 2:
                return new g((com.revolut.feature.devicemanagement.impl.ui.flow.b) this.f276670w, (h86.f) this.f276671x, continuation, 2);
            case 3:
                return new g((u87.q) this.f276670w, (eel.c) this.f276671x, continuation, 3);
            case 4:
                return new g((String) this.f276670w, (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) this.f276671x, continuation, 4);
            case 5:
                return new g((com.revolut.feature.credit.overdraft.impl.ui.details.a) this.f276670w, (ux4.d) this.f276671x, continuation, 5);
            case 6:
                return new g((com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.f276670w, (r9a.g) this.f276671x, continuation, 6);
            case 7:
                return new g((ubj.h) this.f276670w, (List) this.f276671x, continuation, 7);
            case 8:
                return new g((ubj.h) this.f276670w, (CryptoMeshAccessToken) this.f276671x, continuation, 8);
            case 9:
                return new g((ucd.b) this.f276670w, (String) this.f276671x, continuation, 9);
            case 10:
                return new g((com.revolut.feature_retail_user_declarations.transaction_countries.flow.a) this.f276670w, (Set) this.f276671x, continuation, 10);
            case 11:
                return new g((e0) this.f276671x, continuation, 11);
            case 12:
                return new g((ue9.c) this.f276671x, continuation, 12);
            case 13:
                return new g((ueg.c) this.f276670w, (HotelsPropertyCashback) this.f276671x, continuation, 13);
            case 14:
                return new g((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) this.f276670w, (GmsLatLngBounds) this.f276671x, continuation, 14);
            case 15:
                return new g((uek.m) this.f276670w, (uek.g) this.f276671x, continuation, 15);
            case 16:
                return new g((v1) this.f276670w, (ukm.q) this.f276671x, continuation, 16);
            case 17:
                return new g((f0) this.f276670w, (uf7.w) this.f276671x, continuation, 17);
            case 18:
                return new g((f0) this.f276670w, (a3) this.f276671x, continuation, 18);
            case 19:
                g gVar = new g((uh2.g) this.f276671x, continuation, 19);
                gVar.f276670w = obj2;
                return gVar;
            case 20:
                return new g((Ref$BooleanRef) this.f276670w, (com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.f276671x, continuation, 20);
            case 21:
                g gVar2 = new g((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b) this.f276671x, continuation, 21);
                gVar2.f276670w = obj2;
                return gVar2;
            case 22:
                return new g((uk9.k) this.f276670w, (r0) this.f276671x, continuation, 22);
            case 23:
                return new g((uk9.k) this.f276670w, (bi9.f) this.f276671x, continuation, 23);
            case 24:
                return new g((ukk.p) this.f276670w, (String) this.f276671x, continuation, 24);
            case 25:
                return new g((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f276670w, (ColorThemeOption) this.f276671x, continuation, 25);
            case 26:
                return new g((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f276670w, (xjg.m) this.f276671x, continuation, 26);
            case 27:
                return new g((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f276670w, (GlobalThemeDeclaration) this.f276671x, continuation, 27);
            case 28:
                return new g((com.revolut.feature.payees.impl.ui.payees_overview.junior.a) this.f276670w, this.f276671x, continuation, 28);
            default:
                return new g((un8.b) this.f276670w, (String) this.f276671x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x067c, code lost:
    
        if (r3.f(r4, r5, r32) == r2) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0832, code lost:
    
        if (r2.g3(r4, r5, r0, r32) == r3) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0878, code lost:
    
        if (r5.b3(r0, r6, r7, r4) == r3) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2i.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276671x = obj2;
    }
}
