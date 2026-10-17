package nn3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.impl.R$string;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import njj.n0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ContactsChooserScreen f217460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ContactsChooserScreen contactsChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217460w = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f217460w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f217460w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(this.f217460w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(this.f217460w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            default:
                q qVar5 = new q(this.f217460w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((fn3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String strM = null;
        Object[] objArr = 0;
        ContactsChooserScreen contactsChooserScreen = this.f217460w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = contactsChooserScreen.R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar2 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("ID_MENU_ITEM_NEW") && ((c) ((j2) aVar2.A.f22677a).getValue()).d.contains(ContactType.UsernameContact.f66040a)) {
                    j60.a aVar3 = aVar2.u;
                    aVar2.f66092t.getClass();
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    List listK = zhm.v.k(new RowDelegate.Model("SEARCH_FOR_REVTAG_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_search, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.contact_picker_add_new_menu_item_username_alternative, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("ADD_NEW_CONTACT_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_add_contact, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.contact_picker_add_new_menu_item_contact_alternative, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
                    aVar3.x(new rp0.y(listK, null, rp0.l.WINDOW, null, null, null, 1018));
                } else {
                    aVar2.C1(new BridgeDestination(new FeatureCommand(new ContactsFeatureConfig.AddContact.ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.FINISH, null))));
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE32 = contactsChooserScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar5 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof NaviCommand) {
                    aVar5.C1(new BridgeDestination((NaviCommand) obj3));
                } else {
                    if (obj3 != null) {
                        strM = o0.f186429a.b(obj3.getClass()).m();
                    }
                    hx7.e.h(new IllegalArgumentException(j6.a.q("Click was not handled. Parcel: ", strM)));
                }
                break;
            case 2:
                String searchQuery = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE33 = contactsChooserScreen.R2();
                Intrinsics.h(searchQuery);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar7 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE33;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                aVar7.z.d(searchQuery);
                break;
            case 3:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE34 = contactsChooserScreen.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar9 = (com.revolut.feature.contacts_chooser.impl.ui.a) eVarE34;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                aVar9.l2(new n0(aVar9, clickData2, objArr == true ? 1 : 0, 9), new yi5.b(26));
                break;
            default:
                fn3.c cVar = (fn3.c) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE35 = contactsChooserScreen.R2();
                Intrinsics.h(cVar);
                ((com.revolut.feature.contacts_chooser.impl.ui.a) eVarE35).J2(cVar);
                break;
        }
        return Unit.f186387a;
    }
}
