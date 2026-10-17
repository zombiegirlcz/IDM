package f2i;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.DirectDepositAccountScreen;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogController;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import f3i.b;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import rlm.g;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131794a;

    public /* synthetic */ b(int i) {
        this.f131794a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f131794a) {
            case 0:
                int i = RecurringOrderSettingsActivity.A0;
                return new InputTextDelegate(null);
            case 1:
                int i2 = RecurringOrderSettingsActivity.A0;
                return new DatePickerDelegate();
            case 2:
                int i3 = RecurringOrderSettingsActivity.A0;
                return new SingleChoiceDelegate();
            case 3:
                int i5 = RecurringOrderSettingsActivity.A0;
                return new LargeActionButtonDelegate();
            case 4:
                KProperty[] kPropertyArr = DeliveryMethodsController.T;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr2 = DeliveryMethodsController.T;
                return new PermissionDelegate();
            case 6:
                b.a aVar = f3i.b.Companion;
                return zhm.v.k(5, 10, 15, 20);
            case 7:
                return j1.b("com.revolut.retail.feature.beneficiary.models.BeneficiarySuggestion.Type", f5j.h.values());
            case 8:
                return EmvTemplate.Config().setContactLess(true).setReadAllAids(true).setReadAt(false);
            case 9:
                ExtendedSubaccountType.Companion companion = ExtendedSubaccountType.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType", p0Var.b(ExtendedSubaccountType.class), new KClass[]{p0Var.b(ExtendedSubaccountType.Collateral.class), p0Var.b(ExtendedSubaccountType.Group.class), p0Var.b(ExtendedSubaccountType.Joint.class), p0Var.b(ExtendedSubaccountType.Junior.class), p0Var.b(ExtendedSubaccountType.Personal.class), p0Var.b(ExtendedSubaccountType.PlanCashback.class), p0Var.b(ExtendedSubaccountType.Pro.class), p0Var.b(ExtendedSubaccountType.ProTax.class), p0Var.b(ExtendedSubaccountType.RevPoints.class), p0Var.b(ExtendedSubaccountType.Teen.class)}, new KSerializer[]{new d1("collateral", ExtendedSubaccountType.Collateral.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("group", ExtendedSubaccountType.Group.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("joint", ExtendedSubaccountType.Joint.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("junior", ExtendedSubaccountType.Junior.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("personal", ExtendedSubaccountType.Personal.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("planCashback", ExtendedSubaccountType.PlanCashback.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("pro", ExtendedSubaccountType.Pro.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("proTax", ExtendedSubaccountType.ProTax.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("revPoints", ExtendedSubaccountType.RevPoints.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }}), new d1("teen", ExtendedSubaccountType.Teen.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }})}, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 10:
                return new d1("collateral", ExtendedSubaccountType.Collateral.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 11:
                return new d1("group", ExtendedSubaccountType.Group.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 12:
                return new d1("joint", ExtendedSubaccountType.Joint.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 13:
                return new d1("junior", ExtendedSubaccountType.Junior.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 14:
                return new d1("personal", ExtendedSubaccountType.Personal.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 15:
                return new d1("planCashback", ExtendedSubaccountType.PlanCashback.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 16:
                return new d1("pro", ExtendedSubaccountType.Pro.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 17:
                return new d1("proTax", ExtendedSubaccountType.ProTax.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 18:
                return new d1("revPoints", ExtendedSubaccountType.RevPoints.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 19:
                return new d1("teen", ExtendedSubaccountType.Teen.INSTANCE, new Annotation[]{new rlm.g() { // from class: com.revolut.feature.subaccount.accounts.models.a
                    {
                        Intrinsics.checkNotNullParameter("subaccountType", "discriminator");
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return g.class;
                    }

                    @Override // rlm.g
                    public final /* synthetic */ String discriminator() {
                        return "subaccountType";
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj2) {
                        return (obj2 instanceof g) && "subaccountType".equals(((g) obj2).discriminator());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return -1273655389;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=subaccountType)";
                    }
                }});
            case 20:
                KProperty[] kPropertyArr3 = DirectDepositAccountScreen.S;
                return new PlainTextWarningDelegate();
            case 21:
                KProperty[] kPropertyArr4 = DirectDepositAccountScreen.S;
                return new ListSubheaderDelegate();
            case 22:
                KProperty[] kPropertyArr5 = DirectDepositAccountScreen.S;
                return new CellDetailsAccountDelegate();
            case 23:
                int i6 = jli.h.f175850a;
                return Unit.f186387a;
            case 24:
                return new RowDelegate(null, null, 7);
            case 25:
                KProperty[] kPropertyArr6 = HiddenAccountsListScreen.W;
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                defaultItemAnimator.setSupportsChangeAnimations(false);
                return defaultItemAnimator;
            case 26:
                return j1.b("com.revolut.feature.junior.pending_graduation.api.model.MigrateAssetsPermission.State", eb8.j.values());
            case 27:
                int i21 = SubscriptionDetailsDialogController.f89272a0;
                return new RowDelegate(null, null, 7);
            case 28:
                int i22 = SubscriptionDetailsDialogController.f89272a0;
                return new AccountCellItemDelegate();
            default:
                int i32 = SubscriptionDetailsDialogController.f89272a0;
                return new LargeActionButtonDelegate();
        }
    }
}
