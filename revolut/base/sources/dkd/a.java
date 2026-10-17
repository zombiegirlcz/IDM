package dkd;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreen;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import mlm.f;
import qlm.d1;
import qlm.e;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import rlm.r;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115503a;

    public /* synthetic */ a(int i) {
        this.f115503a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f115503a) {
            case 0:
                SlotDefaultPrompt.Content.Companion companion = SlotDefaultPrompt.Content.INSTANCE;
                return new e(SlotDefaultPrompt.Action.a.f87323a);
            case 1:
                return j1.a("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.LayoutType", SlotDefaultPrompt.LayoutType.values(), new String[]{"3d", "inApp", "story", "hero", "modalStory"}, new Annotation[][]{null, null, null, null, null});
            case 2:
                SlotDefaultPrompt.Style.Companion companion2 = SlotDefaultPrompt.Style.INSTANCE;
                final String[] strArr = {"DARK", "dark"};
                Annotation[] annotationArr = {new r(strArr) { // from class: com.revolut.feature.slot_manager.api.model.prompt.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String[] f87344a;

                    {
                        Intrinsics.checkNotNullParameter(strArr, "names");
                        this.f87344a = strArr;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return r.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof r) && Arrays.equals(names(), ((r) obj2).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.f87344a) ^ 397397176;
                    }

                    @Override // rlm.r
                    public final /* synthetic */ String[] names() {
                        return this.f87344a;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return p.a.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.f87344a), ")");
                    }
                }};
                final String[] strArr2 = {"LIGHT", "light"};
                return j1.a("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.Style.Theme", SlotDefaultPrompt.Style.Theme.values(), new String[]{null, null}, new Annotation[][]{annotationArr, new Annotation[]{new r(strArr2) { // from class: com.revolut.feature.slot_manager.api.model.prompt.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String[] f87344a;

                    {
                        Intrinsics.checkNotNullParameter(strArr2, "names");
                        this.f87344a = strArr2;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return r.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof r) && Arrays.equals(names(), ((r) obj2).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.f87344a) ^ 397397176;
                    }

                    @Override // rlm.r
                    public final /* synthetic */ String[] names() {
                        return this.f87344a;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return p.a.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.f87344a), ")");
                    }
                }}});
            case 3:
                SlotPrompt.Meta.Companion companion3 = SlotPrompt.Meta.INSTANCE;
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 4:
                SlotPrompt.Meta.Companion companion4 = SlotPrompt.Meta.INSTANCE;
                v1 v1Var2 = v1.f247718a;
                return new h0(v1Var2, v1Var2, 1);
            case 5:
                KProperty[] kPropertyArr = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr2 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr3 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                return new LargeActionButtonDelegate();
            case 8:
                RemoteLoginInvitation.Companion aVar = RemoteLoginInvitation.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new f("com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation", p0Var.b(RemoteLoginInvitation.class), new KClass[]{p0Var.b(RemoteLoginInvitation.Absent.class), p0Var.b(RemoteLoginInvitation.Accepted.class), p0Var.b(RemoteLoginInvitation.Pending.class)}, new KSerializer[]{new d1("RemoteLoginInvitationAbsent", RemoteLoginInvitation.Absent.INSTANCE, new Annotation[0]), RemoteLoginInvitation.Accepted.a.f77169a, RemoteLoginInvitation.Pending.a.f77171a}, new Annotation[0]);
            case 9:
                return new d1("RemoteLoginInvitationAbsent", RemoteLoginInvitation.Absent.INSTANCE, new Annotation[0]);
            case 10:
                RemoteLoginInvitation.Present.Companion aVar2 = RemoteLoginInvitation.Present.INSTANCE;
                p0 p0Var2 = o0.f186429a;
                return new f("com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation.Present", p0Var2.b(RemoteLoginInvitation.Present.class), new KClass[]{p0Var2.b(RemoteLoginInvitation.Accepted.class), p0Var2.b(RemoteLoginInvitation.Pending.class)}, new KSerializer[]{RemoteLoginInvitation.Accepted.a.f77169a, RemoteLoginInvitation.Pending.a.f77171a}, new Annotation[]{new com.revolut.feature.junior_remote_login.api.model.a()});
            case 11:
                return f0.f322471a;
            case 12:
                return f0.f322471a;
            case 13:
                return f0.f322471a;
            case 14:
                return f0.f322471a;
            case 15:
                return f0.f322471a;
            case 16:
                return f0.f322471a;
            case 17:
                return f0.f322471a;
            case 18:
                return f0.f322471a;
            case 19:
                return f0.f322471a;
            case 20:
                KProperty[] kPropertyArr4 = ContactDetailsScreen.X;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr5 = ContactDetailsScreen.X;
                return new CellDetailsDelegate();
            case 22:
                KProperty[] kPropertyArr6 = ContactDetailsScreen.X;
                return new CellDetailsChevronDelegate();
            case 23:
                KProperty[] kPropertyArr7 = ContactDetailsScreen.X;
                return new LargeActionButtonDelegate();
            case 24:
                KProperty[] kPropertyArr8 = PickYourRateScreen.V;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 25:
                KProperty[] kPropertyArr9 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new FullScreenStateDelegate();
            case 26:
                KProperty[] kPropertyArr10 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr11 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new CellDetailsDelegate();
            case 28:
                KProperty[] kPropertyArr12 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new TextDelegate();
            default:
                KProperty[] kPropertyArr13 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                return new InputChecklistDelegate();
        }
    }
}
