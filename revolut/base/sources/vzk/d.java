package vzk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        final RowDelegate.Model model = (RowDelegate.Model) obj2;
        Continuation continuation = (Continuation) obj3;
        final u uVar = (u) ((m) this.receiver);
        j60.a aVar = uVar.f293571s;
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode != -2129128900) {
            if (iHashCode != 1038384181) {
                if (iHashCode == 1239802196 && str.equals("TRADING_KYC_EDIT_NATIONALITY_ACTION_ID")) {
                    final int i = 0;
                    j60.a.v(aVar, false, new Function0() { // from class: vzk.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    Object obj4 = model.u;
                                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                    final wi0.b bVar = (wi0.b) obj4;
                                    final u uVar2 = uVar;
                                    uVar2.getClass();
                                    final int i2 = 1;
                                    uVar2.A2(new Function1() { // from class: vzk.q
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            Data data;
                                            NationalitiesInput nationalitiesInput;
                                            switch (i2) {
                                                case 0:
                                                    u uVar3 = uVar2;
                                                    wi0.b bVar2 = bVar;
                                                    g updateState = (g) obj5;
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    Data data2 = updateState.f293548b;
                                                    try {
                                                        Object content = data2.getContent();
                                                        if (content != null) {
                                                            List list = ((NationalitiesInput) content).f104193a;
                                                            ArrayList nationalities = new ArrayList();
                                                            for (Object obj6 : list) {
                                                                if (!Intrinsics.f(((NationalityInput) obj6).f104195a, bVar2)) {
                                                                    nationalities.add(obj6);
                                                                }
                                                            }
                                                            boolean zB2 = uVar3.B2(nationalities);
                                                            Intrinsics.checkNotNullParameter(nationalities, "nationalities");
                                                            nationalitiesInput = new NationalitiesInput(nationalities, zB2);
                                                        } else {
                                                            nationalitiesInput = null;
                                                        }
                                                        data = new Data(nationalitiesInput, data2.getError(), data2.getLoading());
                                                        break;
                                                    } catch (Throwable th10) {
                                                        data = new Data(null, th10, data2.getLoading());
                                                    }
                                                    return g.a(updateState, data, false, null, 13);
                                                default:
                                                    wi0.b newSelectedNationality = (wi0.b) obj5;
                                                    Intrinsics.checkNotNullParameter(newSelectedNationality, "newSelectedNationality");
                                                    u uVar4 = uVar2;
                                                    uVar4.x2(new vx9.v(uVar4, 2, bVar, new NationalityInput(newSelectedNationality, true, uVar4.y2(newSelectedNationality))));
                                                    return Unit.f186387a;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    Object obj5 = model.u;
                                    Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                    final wi0.b bVar2 = (wi0.b) obj5;
                                    final u uVar3 = uVar;
                                    uVar3.getClass();
                                    final int i3 = 0;
                                    uVar3.x2(new Function1() { // from class: vzk.q
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj52) {
                                            Data data;
                                            NationalitiesInput nationalitiesInput;
                                            switch (i3) {
                                                case 0:
                                                    u uVar32 = uVar3;
                                                    wi0.b bVar22 = bVar2;
                                                    g updateState = (g) obj52;
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    Data data2 = updateState.f293548b;
                                                    try {
                                                        Object content = data2.getContent();
                                                        if (content != null) {
                                                            List list = ((NationalitiesInput) content).f104193a;
                                                            ArrayList nationalities = new ArrayList();
                                                            for (Object obj6 : list) {
                                                                if (!Intrinsics.f(((NationalityInput) obj6).f104195a, bVar22)) {
                                                                    nationalities.add(obj6);
                                                                }
                                                            }
                                                            boolean zB2 = uVar32.B2(nationalities);
                                                            Intrinsics.checkNotNullParameter(nationalities, "nationalities");
                                                            nationalitiesInput = new NationalitiesInput(nationalities, zB2);
                                                        } else {
                                                            nationalitiesInput = null;
                                                        }
                                                        data = new Data(nationalitiesInput, data2.getError(), data2.getLoading());
                                                        break;
                                                    } catch (Throwable th10) {
                                                        data = new Data(null, th10, data2.getLoading());
                                                    }
                                                    return g.a(updateState, data, false, null, 13);
                                                default:
                                                    wi0.b newSelectedNationality = (wi0.b) obj52;
                                                    Intrinsics.checkNotNullParameter(newSelectedNationality, "newSelectedNationality");
                                                    u uVar4 = uVar3;
                                                    uVar4.x2(new vx9.v(uVar4, 2, bVar2, new NationalityInput(newSelectedNationality, true, uVar4.y2(newSelectedNationality))));
                                                    return Unit.f186387a;
                                            }
                                        }
                                    });
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    }, 1);
                }
            } else if (str.equals("TRADING_KYC_DELETE_NATIONALITY_ACTION_ID")) {
                final int i2 = 1;
                j60.a.v(aVar, false, new Function0() { // from class: vzk.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                Object obj4 = model.u;
                                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                final wi0.b bVar = (wi0.b) obj4;
                                final u uVar2 = uVar;
                                uVar2.getClass();
                                final int i22 = 1;
                                uVar2.A2(new Function1() { // from class: vzk.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj52) {
                                        Data data;
                                        NationalitiesInput nationalitiesInput;
                                        switch (i22) {
                                            case 0:
                                                u uVar32 = uVar2;
                                                wi0.b bVar22 = bVar;
                                                g updateState = (g) obj52;
                                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                Data data2 = updateState.f293548b;
                                                try {
                                                    Object content = data2.getContent();
                                                    if (content != null) {
                                                        List list = ((NationalitiesInput) content).f104193a;
                                                        ArrayList nationalities = new ArrayList();
                                                        for (Object obj6 : list) {
                                                            if (!Intrinsics.f(((NationalityInput) obj6).f104195a, bVar22)) {
                                                                nationalities.add(obj6);
                                                            }
                                                        }
                                                        boolean zB2 = uVar32.B2(nationalities);
                                                        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
                                                        nationalitiesInput = new NationalitiesInput(nationalities, zB2);
                                                    } else {
                                                        nationalitiesInput = null;
                                                    }
                                                    data = new Data(nationalitiesInput, data2.getError(), data2.getLoading());
                                                    break;
                                                } catch (Throwable th10) {
                                                    data = new Data(null, th10, data2.getLoading());
                                                }
                                                return g.a(updateState, data, false, null, 13);
                                            default:
                                                wi0.b newSelectedNationality = (wi0.b) obj52;
                                                Intrinsics.checkNotNullParameter(newSelectedNationality, "newSelectedNationality");
                                                u uVar4 = uVar2;
                                                uVar4.x2(new vx9.v(uVar4, 2, bVar, new NationalityInput(newSelectedNationality, true, uVar4.y2(newSelectedNationality))));
                                                return Unit.f186387a;
                                        }
                                    }
                                });
                                break;
                            default:
                                Object obj5 = model.u;
                                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                final wi0.b bVar2 = (wi0.b) obj5;
                                final u uVar3 = uVar;
                                uVar3.getClass();
                                final int i3 = 0;
                                uVar3.x2(new Function1() { // from class: vzk.q
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj52) {
                                        Data data;
                                        NationalitiesInput nationalitiesInput;
                                        switch (i3) {
                                            case 0:
                                                u uVar32 = uVar3;
                                                wi0.b bVar22 = bVar2;
                                                g updateState = (g) obj52;
                                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                Data data2 = updateState.f293548b;
                                                try {
                                                    Object content = data2.getContent();
                                                    if (content != null) {
                                                        List list = ((NationalitiesInput) content).f104193a;
                                                        ArrayList nationalities = new ArrayList();
                                                        for (Object obj6 : list) {
                                                            if (!Intrinsics.f(((NationalityInput) obj6).f104195a, bVar22)) {
                                                                nationalities.add(obj6);
                                                            }
                                                        }
                                                        boolean zB2 = uVar32.B2(nationalities);
                                                        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
                                                        nationalitiesInput = new NationalitiesInput(nationalities, zB2);
                                                    } else {
                                                        nationalitiesInput = null;
                                                    }
                                                    data = new Data(nationalitiesInput, data2.getError(), data2.getLoading());
                                                    break;
                                                } catch (Throwable th10) {
                                                    data = new Data(null, th10, data2.getLoading());
                                                }
                                                return g.a(updateState, data, false, null, 13);
                                            default:
                                                wi0.b newSelectedNationality = (wi0.b) obj52;
                                                Intrinsics.checkNotNullParameter(newSelectedNationality, "newSelectedNationality");
                                                u uVar4 = uVar3;
                                                uVar4.x2(new vx9.v(uVar4, 2, bVar2, new NationalityInput(newSelectedNationality, true, uVar4.y2(newSelectedNationality))));
                                                return Unit.f186387a;
                                        }
                                    }
                                });
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, 1);
            }
        } else if (str.equals("TRADING_KYC_NATIONALITY_ITEM_ID")) {
            Object obj4 = model.u;
            Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
            Object objB = pu7.a.B(uVar.k, "open_nationality_edit_action_dialog", new mcg.j(uVar, (wi0.b) obj4, null, 18), continuation);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
