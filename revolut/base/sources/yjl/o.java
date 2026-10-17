package yjl;

import com.revolut.sso.api.models.AppLinkEvidence;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.BioSignatureEvidence;
import com.revolut.sso.api.models.CardPINEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.DocumentEvidence;
import com.revolut.sso.api.models.EmailEvidence;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.FaceEvidence;
import com.revolut.sso.api.models.FaceOtpEvidence;
import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.api.models.OktaEvidence;
import com.revolut.sso.api.models.PasswordEvidence;
import com.revolut.sso.api.models.PinEvidence;
import com.revolut.sso.api.models.PushEvidence;
import com.revolut.sso.api.models.QrDelegatedEvidence;
import com.revolut.sso.api.models.RcsEvidence;
import com.revolut.sso.api.models.SignatureEvidence;
import com.revolut.sso.api.models.SilentAuthEvidence;
import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.api.models.SmsEvidence;
import com.revolut.sso.api.models.TelephoneEvidence;
import com.revolut.sso.api.models.TokenEvidence;
import com.revolut.sso.api.models.UaePassEvidence;
import com.revolut.sso.api.models.WebAuthnEvidence;
import com.revolut.sso.api.models.WhatsAppEvidence;
import jkl.a1;
import jkl.b1;
import jkl.c1;
import jkl.d1;
import jkl.e1;
import jkl.f1;
import jkl.g1;
import jkl.h1;
import jkl.i1;
import jkl.j1;
import jkl.k1;
import jkl.l1;
import jkl.m1;
import jkl.n1;
import jkl.o1;
import jkl.p1;
import jkl.q1;
import jkl.r1;
import jkl.s1;
import jkl.t1;
import jkl.u1;
import jkl.w1;
import jkl.x1;
import jkl.y1;
import jkl.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o {
    public static final y1 a(Evidence evidence) {
        Intrinsics.checkNotNullParameter(evidence, "<this>");
        if (evidence instanceof AppLinkEvidence) {
            throw new IllegalStateException("App link is not supported as evidence");
        }
        if (evidence instanceof BankIdEvidence) {
            return new z0(((BankIdEvidence) evidence).f105887a);
        }
        if (evidence instanceof BioSignatureEvidence) {
            return new a1(((BioSignatureEvidence) evidence).f105888a);
        }
        if (evidence instanceof CardPINEvidence) {
            CardPINEvidence cardPINEvidence = (CardPINEvidence) evidence;
            return new b1(new b1.a(cardPINEvidence.f105889a, cardPINEvidence.f105890b));
        }
        if (evidence instanceof DAPEvidence) {
            return new c1(((DAPEvidence) evidence).f105938a);
        }
        if (evidence instanceof DocumentEvidence) {
            return new d1(((DocumentEvidence) evidence).f105939a);
        }
        if (evidence instanceof EmailEvidence) {
            return new e1(((EmailEvidence) evidence).f105940a);
        }
        if (evidence instanceof FaceEvidence) {
            return new f1(((FaceEvidence) evidence).f105944a);
        }
        if (evidence instanceof FaceOtpEvidence) {
            return new g1(((FaceOtpEvidence) evidence).f105945a);
        }
        if (evidence instanceof GoogleEvidence) {
            return new h1(new h1.a(((GoogleEvidence) evidence).f105946a));
        }
        if (evidence instanceof OktaEvidence) {
            return new j1(((OktaEvidence) evidence).f105958a);
        }
        if (evidence instanceof PasswordEvidence) {
            return new k1(((PasswordEvidence) evidence).f105961a);
        }
        if (evidence instanceof PinEvidence) {
            return new l1(((PinEvidence) evidence).f105968a);
        }
        if (evidence instanceof PushEvidence) {
            return new m1(((PushEvidence) evidence).f105969a);
        }
        if (evidence instanceof QrDelegatedEvidence) {
            return new n1(((QrDelegatedEvidence) evidence).f105970a);
        }
        if (evidence instanceof RcsEvidence) {
            RcsEvidence rcsEvidence = (RcsEvidence) evidence;
            return new o1(rcsEvidence.f105971a, Boolean.valueOf(rcsEvidence.f105972b));
        }
        if (evidence instanceof SignatureEvidence) {
            return new p1(((SignatureEvidence) evidence).f105976a);
        }
        if (evidence instanceof SilentAuthEvidence) {
            return new q1(((SilentAuthEvidence) evidence).f105977a);
        }
        if (evidence instanceof SimBindingEvidence) {
            SimBindingEvidence simBindingEvidence = (SimBindingEvidence) evidence;
            return new i1(new i1.a(simBindingEvidence.f105978a, simBindingEvidence.f105979b));
        }
        if (evidence instanceof SmsEvidence) {
            SmsEvidence smsEvidence = (SmsEvidence) evidence;
            return new r1(smsEvidence.f105980a, Boolean.valueOf(smsEvidence.f105981b));
        }
        if (evidence instanceof TelephoneEvidence) {
            return new s1(((TelephoneEvidence) evidence).f105984a);
        }
        if (evidence instanceof TokenEvidence) {
            return new t1(((TokenEvidence) evidence).f105985a);
        }
        if (evidence instanceof UaePassEvidence) {
            return new u1(((UaePassEvidence) evidence).f105989a);
        }
        if (evidence instanceof WhatsAppEvidence) {
            WhatsAppEvidence whatsAppEvidence = (WhatsAppEvidence) evidence;
            return new x1(whatsAppEvidence.f106004a, Boolean.valueOf(whatsAppEvidence.f106005b));
        }
        if (!(evidence instanceof WebAuthnEvidence)) {
            throw new NoWhenBranchMatchedException();
        }
        WebAuthnEvidence webAuthnEvidence = (WebAuthnEvidence) evidence;
        return new w1(new w1.a(webAuthnEvidence.f106001a, webAuthnEvidence.f106002b, webAuthnEvidence.f106003c, webAuthnEvidence.d, webAuthnEvidence.e, webAuthnEvidence.f));
    }
}
