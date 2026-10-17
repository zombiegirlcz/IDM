package zab;

import android.net.Uri;
import android.widget.RelativeLayout;
import aw0.o9;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.retail.legacy.login.impl.R$string;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$Mapper$LostAllParcel;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f320609b;

    public /* synthetic */ j(t tVar, int i) {
        this.f320608a = i;
        this.f320609b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strI;
        switch (this.f320608a) {
            case 0:
                ChannelType it8 = (ChannelType) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                t tVar = this.f320609b;
                if (((CharSequence) tVar.k.v().get()).length() == 0) {
                    tVar.P(it8);
                }
                return Unit.f186387a;
            case 1:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.u;
                t tVar2 = this.f320609b;
                sri.m mVar = tVar2.f320624l;
                if (obj3 instanceof m) {
                    m mVar2 = (m) obj3;
                    mVar.c(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(a0.d.s("revolut://app/email-authenticate/", mVar2.f320616b, "?scope=", mVar2.f320615a)), 14), null, null, null, 0, null, null, null, null, false, 1022));
                } else {
                    ChannelType channelType = ChannelType.SMS;
                    if (obj3 == channelType) {
                        tVar2.P(channelType);
                        i iVar = (i) tVar2.L();
                        if (iVar != null) {
                            ((SignSmsStepFragment) iVar).V();
                        }
                        tVar2.O(new s(1, tVar2.f320623j, d.class, "onSmsVerificationResendPressed", "onSmsVerificationResendPressed(Ljava/lang/String;)V", 0, 0));
                    } else {
                        ChannelType channelType2 = ChannelType.EMAIL;
                        if (obj3 == channelType2) {
                            tVar2.P(channelType2);
                            i iVar2 = (i) tVar2.L();
                            if (iVar2 != null) {
                                ((SignSmsStepFragment) iVar2).V();
                            }
                            tVar2.O(new s(1, tVar2.f320623j, d.class, "onEmailVerificationResendPressed", "onEmailVerificationResendPressed(Ljava/lang/String;)V", 0, 1));
                        } else {
                            ChannelType channelType3 = ChannelType.CALL;
                            if (obj3 == channelType3) {
                                tVar2.P(channelType3);
                                i iVar3 = (i) tVar2.L();
                                if (iVar3 != null) {
                                    ((SignSmsStepFragment) iVar3).V();
                                }
                                tVar2.O(new s(1, tVar2.f320623j, d.class, "onCallVerificationSelected", "onCallVerificationSelected(Ljava/lang/String;)V", 0, 2));
                            } else if (Intrinsics.f(obj3, SignSmsScreenContract$Mapper$LostAllParcel.f82707a) || obj3 == ChannelType.CHAT) {
                                mVar.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true), false, (Integer) null, 0, 57)));
                            }
                        }
                    }
                }
                opi.d.c(tVar2.u);
                return Unit.f186387a;
            case 2:
                p61.b it10 = (p61.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return te0.w.z0(this.f320609b.k.E(), it10);
            case 3:
                String email = (String) obj2;
                Intrinsics.checkNotNullParameter(email, "email");
                i iVar4 = (i) this.f320609b.L();
                if (iVar4 != null) {
                    SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) iVar4;
                    Intrinsics.checkNotNullParameter(email, "email");
                    u2l.a aVar = (u2l.a) signSmsStepFragment.getActivity();
                    if (aVar != null) {
                        aVar.z0();
                    }
                    e0m.e.b(signSmsStepFragment.getActivity(), true);
                    if (kotlin.text.d0.W(email)) {
                        t70.g gVar = signSmsStepFragment.j0;
                        if (gVar == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        strI = gVar.i(R$string.email_verification_status_check_email_subtitle, new Object[0]);
                    } else {
                        t70.g gVar2 = signSmsStepFragment.j0;
                        if (gVar2 == null) {
                            Intrinsics.r("localization");
                            throw null;
                        }
                        strI = gVar2.i(R$string.email_verification_status_check_email_content, email);
                    }
                    t70.g gVar3 = signSmsStepFragment.j0;
                    if (gVar3 == null) {
                        Intrinsics.r("localization");
                        throw null;
                    }
                    String string = gVar3.getString(R$string.email_verification_status_check_email_title);
                    t70.g gVar4 = signSmsStepFragment.j0;
                    if (gVar4 == null) {
                        Intrinsics.r("localization");
                        throw null;
                    }
                    signSmsStepFragment.X(string, strI, gVar4.getString(R$string.email_verification_status_check_email_button));
                    signSmsStepFragment.H().setVisibility(0);
                    ((RelativeLayout) signSmsStepFragment.f82715s0.getValue(signSmsStepFragment, SignSmsStepFragment.A0[6])).setVisibility(0);
                    signSmsStepFragment.I().setVisibility(8);
                }
                return Unit.f186387a;
            default:
                yab.a token = (yab.a) obj2;
                Intrinsics.checkNotNullParameter(token, "token");
                ((opi.b) this.f320609b.u).Z(new rp0.y(zhm.v.k(new RowDelegate.Model("login", null, new TextClause("login", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new m("login", token.getSmsCode()), null, 0, 0, 0, 0, 532676602), new RowDelegate.Model("stepup", null, new TextClause("stepup", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new m("stepup", token.getSmsCode()), null, 0, 0, 0, 0, 532676602), new RowDelegate.Model("phone-change", null, new TextClause("phone-change", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new m("phone-change", token.getSmsCode()), null, 0, 0, 0, 0, 532676602), new RowDelegate.Model("password-reset", null, new TextClause("password-reset", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new m("password-reset", token.getSmsCode()), null, 0, 0, 0, 0, 532676602), new RowDelegate.Model("security-questions", null, new TextClause("security-questions", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new m("security-questions", token.getSmsCode()), null, 0, 0, 0, 0, 532676602)), new rp0.t(new TextClause("Select login method: ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), null, null, null, null, "SIGN_SMS_RESEND_DIALOG_DELEGATES_KEY", null, null, null, 3836));
                return Unit.f186387a;
        }
    }
}
