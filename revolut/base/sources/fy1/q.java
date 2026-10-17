package fy1;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements lx1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f138872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.a f138873b;

    public q(z80.b phoneToolsProvider, lx1.a beneficiaryMapper) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(beneficiaryMapper, "beneficiaryMapper");
        this.f138872a = phoneToolsProvider;
        this.f138873b = beneficiaryMapper;
    }

    public static d3 e() {
        return new d3(new e3(R$drawable.uikit_icn_24_info, true), (e3) null, 6);
    }

    public static d3 f() {
        return new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), new e3(R$drawable.uikit_icn_24_arrow_down, true), 4);
    }

    public final Image a(ApmRecipient contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof ApmContact) {
            return c8g.a.o((ApmContact) contact).j();
        }
        if (!(contact instanceof ApmBeneficiary)) {
            throw new NoWhenBranchMatchedException();
        }
        f5j.a beneficiary = ((ApmBeneficiary) contact).getF62136c();
        b bVar = (b) this.f138873b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String str = beneficiary.f132338p;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        return bVar.f138840a.a(beneficiary) ? new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : str2.length() > 0 ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorPopoverBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878) : new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public final TextClause b(ApmRecipient contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (!(contact instanceof ApmContact)) {
            if (contact instanceof ApmBeneficiary) {
                return new TextClause(contact.x0(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        ApmContact apmContact = (ApmContact) contact;
        ApmDescriptor f62148b = apmContact.getF62148b();
        if (f62148b instanceof ApmDescriptor.Phone) {
            return new TextClause(z80.b.b(this.f138872a, ((ApmDescriptor.Phone) f62148b).f62110b, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (!(f62148b instanceof ApmDescriptor.BankAccount.IBAN)) {
            return new TextClause(apmContact.x0(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextClause(d0.H0(new Regex("(.{4})").replace(a0.D(((ApmDescriptor.BankAccount.IBAN) f62148b).f62106c, " ", "", false), "$1 ")).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final ContactImage c(ApmRecipient contact) {
        String e;
        Intrinsics.checkNotNullParameter(contact, "contact");
        String displayName = contact.getDisplayName();
        if (contact instanceof ApmContact) {
            e = ((ApmContact) contact).getE();
        } else {
            if (!(contact instanceof ApmBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            e = null;
        }
        return new ContactImage((String) null, (String) null, (String) null, (String) null, e, displayName, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4047);
    }

    public final TextClause d(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (!(contact.getF62148b() instanceof ApmDescriptor.Phone)) {
            throw new IllegalStateException("ApmContact doesn't have phone");
        }
        return new TextClause(z80.b.b(this.f138872a, contact.getF62148b().getF62112a(), null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final RowDelegate.Model g(ApmRecipient contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new RowDelegate.Model(contact.getF62134a().getF62112a(), new RowDelegate.Model.MainImage.Image40(c(contact), new RawCutoutImageBadge(a(contact)), null, false, null, false, 60), new TextClause(contact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, b(contact), null, null, 0, null, false, null, false, null, null, null, null, null, null, contact, null, 0, 0, 0, 0, 532676568);
    }

    public final ReferralContactDelegate.Model h(ApmRecipient contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new ReferralContactDelegate.Model(contact.getF62134a().getF62112a(), c(contact), new TextClause(contact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new RawCutoutImageBadge(a(contact)), null, false, null, contact, 393176);
    }

    public final QuickActionWidgetDelegate.Model i(String listId, ApmRecipient contact, int i) {
        d3 d3VarF;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(contact, "contact");
        ContactImage contactImageC = c(contact);
        TextClause textClause = new TextClause(contact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Image imageA = a(contact);
        BulletImage bulletImageA = i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorOnAccent), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null;
        boolean z = contact instanceof BizumContact;
        ApmContact.State.DELETED deleted = ApmContact.State.DELETED.f62100a;
        ApmContact.State.ACTIVE active = ApmContact.State.ACTIVE.f62099a;
        if (z) {
            ApmContact.State state = ((BizumContact) contact).f;
            if (Intrinsics.f(state, active)) {
                d3VarF = f();
            } else {
                if (!Intrinsics.f(state, deleted) && !Intrinsics.f(state, ApmContact.State.NOT_REGISTERED.f62101a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3VarF = e();
            }
        } else if (contact instanceof MultibancoContact) {
            ApmContact.SimpleState simpleState = ((MultibancoContact) contact).f;
            if (Intrinsics.f(simpleState, active)) {
                d3VarF = f();
            } else {
                if (!Intrinsics.f(simpleState, deleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3VarF = e();
            }
        } else {
            d3VarF = contact instanceof PayIdBeneficiary ? f() : e();
        }
        return new QuickActionWidgetDelegate.Model(listId, contactImageC, imageA, bulletImageA, textClause, d3VarF, null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
