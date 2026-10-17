package r0a;

import aw0.j8;
import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import java.util.List;
import kl.b0;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0a.d f250765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0a.a f250766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3j.o f250767c;

    public z(p0a.d navBarMapper, p0a.a messagesMapper, p0a.c emptyStateMapper, m3j.o beneficiarySuggestionsMapper) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(messagesMapper, "messagesMapper");
        Intrinsics.checkNotNullParameter(emptyStateMapper, "emptyStateMapper");
        Intrinsics.checkNotNullParameter(beneficiarySuggestionsMapper, "beneficiarySuggestionsMapper");
        this.f250765a = navBarMapper;
        this.f250766b = messagesMapper;
        this.f250767c = beneficiarySuggestionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j8 j8VarC;
        j8 j8Var;
        j8 j8Var2;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listI0 = d0.I0((List) iii.c.f(domainState.f250734a, new qz9.b(this, 28), new qz9.u(this, 5), new q87.z(this, domainState, 21)));
        ChatTransferRecipient chatTransferRecipient = domainState.f250735b;
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        boolean z = chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient;
        p0a.d dVar = this.f250765a;
        if (!z) {
            if (!(chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient)) {
                if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                    CryptoAddress cryptoAddress = ((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a;
                    Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
                    ko5.a aVarE = CryptoAddress.e(cryptoAddress, 0, 3);
                    TextClause textClause = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str = aVarE.f186224b;
                    j8Var2 = new j8(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, aVarE.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, new TextLocalisedClause(R$string.common_accessibility_label_avatar_image, null, null, 14), YearClass.CLASS_2015), (Image) bp5.c.f17561c.getValue(), 16);
                } else if (chatTransferRecipient instanceof ChatTransferRecipient.CharityRecipient) {
                    ba6.l charity = ((ChatTransferRecipient.CharityRecipient) chatTransferRecipient).f79719a;
                    Intrinsics.checkNotNullParameter(charity, "charity");
                    j8Var2 = new j8(new TextClause(charity.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(charity.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(charity.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, 24);
                } else if (chatTransferRecipient instanceof ChatTransferRecipient.ApmTransferRecipient) {
                    lx1.i iVar = dVar.f231491c;
                    ApmRecipient contact = ((ChatTransferRecipient.ApmTransferRecipient) chatTransferRecipient).f79715a;
                    fy1.q qVar = (fy1.q) iVar;
                    Intrinsics.checkNotNullParameter(contact, "contact");
                    j8Var = new j8(new TextClause(contact.getDisplayName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar.b(contact), qVar.c(contact), qVar.a(contact), 16);
                } else {
                    if (!(chatTransferRecipient instanceof ChatTransferRecipient.PaymentCounterpartyRecipient)) {
                        if (chatTransferRecipient instanceof ChatTransferRecipient.ContactRecipient) {
                            throw new IllegalStateException(h30.l.r("ContactRecipient is not supported, contactName=", hx7.q.v(((ChatTransferRecipient.ContactRecipient) chatTransferRecipient).f79720a)));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    j8VarC = ((do9.d) dVar.d).c(((ChatTransferRecipient.PaymentCounterpartyRecipient) chatTransferRecipient).f79724a);
                }
                return new p(listI0, j8Var2, domainState.f250736c, domainState.d, this.f250767c.a(domainState.f), domainState.f250737g);
            }
            aqa.c cVar = dVar.f231490b;
            CardOwner cardOwner = ((ChatTransferRecipient.CardRecipient) chatTransferRecipient).f79718a;
            mra.i iVar2 = (mra.i) cVar;
            Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
            String strA = cardOwner.d;
            if (strA == null || kotlin.text.d0.W(strA)) {
                strA = cardOwner.a();
            }
            TextClause textClause2 = new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClauseA = mra.i.a(cardOwner);
            mra.b bVar = (mra.b) iVar2.f208094a;
            j8Var = new j8(textClause2, textClauseA, bVar.a(cardOwner), bVar.b(cardOwner), 16);
            j8Var2 = j8Var;
            return new p(listI0, j8Var2, domainState.f250736c, domainState.d, this.f250767c.a(domainState.f), domainState.f250737g);
        }
        f5j.a beneficiary = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
        kgm.i iVar3 = dVar.f231489a;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        j8VarC = (f5j.c.c(beneficiary) ? (b0) iVar3.f184024c : (c0) iVar3.f184023b).c(beneficiary);
        j8Var2 = j8VarC;
        return new p(listI0, j8Var2, domainState.f250736c, domainState.d, this.f250767c.a(domainState.f), domainState.f250737g);
    }
}
