package t24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import ft3.h1;
import g04.a;
import gim.i;
import iu3.g;
import iu3.h;
import iu3.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f267413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f267414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267413w = dVar;
        this.f267414x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f267413w, this.f267414x, continuation, 0);
            default:
                return new b(this.f267413w, this.f267414x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objConvertCoBorrowerApplication;
        Object coBorrowerConsentInitiatorConfiguration;
        g04.a aVar;
        iu3.i iVar;
        h hVar;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                d dVar = this.f267413w;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = dVar.f267418b;
                    String str = this.f267414x.f137835a;
                    this.v = 1;
                    objConvertCoBorrowerApplication = creditPluginsService.convertCoBorrowerApplication(str, this);
                    if (objConvertCoBorrowerApplication == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objConvertCoBorrowerApplication = obj2;
                }
                return dVar.f267417a.p((tt3.a) objConvertCoBorrowerApplication);
            default:
                Object jVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f267413w.f267418b;
                    String str2 = this.f267414x.f137835a;
                    this.v = 1;
                    coBorrowerConsentInitiatorConfiguration = creditPluginsService2.getCoBorrowerConsentInitiatorConfiguration(str2, this);
                    if (coBorrowerConsentInitiatorConfiguration != jVar) {
                    }
                    return jVar;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                coBorrowerConsentInitiatorConfiguration = obj2;
                g04.a aVar3 = (g04.a) coBorrowerConsentInitiatorConfiguration;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                a.b selectContactScreen = aVar3.getSelectContactScreen();
                if (selectContactScreen != null) {
                    String title = selectContactScreen.getTitle();
                    String description = selectContactScreen.getDescription();
                    String searchPlaceholder = selectContactScreen.getSearchPlaceholder();
                    String emptyResultTitle = selectContactScreen.getEmptyResultTitle();
                    String emptyResultSubtitle = selectContactScreen.getEmptyResultSubtitle();
                    String noResultsDisclaimer = selectContactScreen.getNoResultsDisclaimer();
                    String buttonTitle = selectContactScreen.getButtonTitle();
                    String availableContacts = selectContactScreen.getAvailableContacts();
                    h[] hVarArrValues = h.values();
                    int length = hVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            hVar = hVarArrValues[i3];
                            aVar = aVar3;
                            if (!a0.z(hVar.name(), availableContacts, true)) {
                                i3++;
                                aVar3 = aVar;
                            }
                        } else {
                            aVar = aVar3;
                            hVar = null;
                        }
                    }
                    if (hVar == null) {
                        hVar = h.REVOLUT;
                    }
                    h hVar2 = hVar;
                    Boolean inviteFlowEnabled = selectContactScreen.getInviteFlowEnabled();
                    iVar = new iu3.i(title, description, searchPlaceholder, emptyResultTitle, emptyResultSubtitle, noResultsDisclaimer, buttonTitle, hVar2, inviteFlowEnabled != null ? inviteFlowEnabled.booleanValue() : false);
                } else {
                    aVar = aVar3;
                    iVar = null;
                }
                a.C0809a requestConsentScreen = aVar.getRequestConsentScreen();
                String title2 = requestConsentScreen.getTitle();
                List<a.C0809a.c> sections = requestConsentScreen.getSections();
                ArrayList arrayList = new ArrayList(w.t(sections, 10));
                for (a.C0809a.c cVar : sections) {
                    String title3 = cVar.getTitle();
                    List<a.C0809a.c.C0812a> items = cVar.getItems();
                    ArrayList arrayList2 = new ArrayList(w.t(items, 10));
                    for (a.C0809a.c.C0812a c0812a : items) {
                        arrayList2.add(new iu3.e(c0812a.getTitle(), c0812a.getDescription()));
                    }
                    arrayList.add(new iu3.f(title3, arrayList2));
                }
                String buttonTitle2 = requestConsentScreen.getButtonTitle();
                a.C0809a.C0810a coApplicantApplicationInProgressErrorPopup = requestConsentScreen.getCoApplicantApplicationInProgressErrorPopup();
                String title4 = coApplicantApplicationInProgressErrorPopup.getTitle();
                String description2 = coApplicantApplicationInProgressErrorPopup.getDescription();
                iu3.b bVarA = g04.b.a(coApplicantApplicationInProgressErrorPopup.getPrimaryButton());
                a.C0809a.C0810a.C0811a secondaryButton = coApplicantApplicationInProgressErrorPopup.getSecondaryButton();
                iu3.c cVar2 = new iu3.c(title4, description2, bVarA, secondaryButton != null ? g04.b.a(secondaryButton) : null);
                a.C0809a.b coBorrowerDetails = requestConsentScreen.getCoBorrowerDetails();
                jVar = new j(iVar, new g(title2, arrayList, buttonTitle2, cVar2, coBorrowerDetails != null ? new iu3.d(coBorrowerDetails.getFullName(), coBorrowerDetails.getPhoneNumber(), coBorrowerDetails.getUserId()) : null));
                return jVar;
        }
    }
}
