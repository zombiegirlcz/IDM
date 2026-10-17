package yy9;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements ry9.c {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f317924b = new Regex("\\b(?=(?:\\s?[A-Za-z0-9]){15,34}\\b)[A-Za-z]{2}[0-9]{2}(?:[ ]?[A-Za-z0-9]{4})*(?:[ ]?[A-Za-z0-9]{1,4})\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f317925c = new Regex("\\b([0-9]{2}-[0-9]{2}-[0-9]{2})\\b");
    public static final Regex d = new Regex("\\b([0-9]{8})\\b");
    public static final Regex e = new Regex("(?i)(?:account(?:\\s+number)?|acct?|a/c):?\\s+([0-9]{8})\\b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw9.d f317926a;

    public v(cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f317926a = paymentsProductFeatureChecker;
    }

    public static List b(String clipboardContent) {
        SendFromClipboardType.BankTransferFields bankTransferFields;
        Intrinsics.checkNotNullParameter(clipboardContent, "clipboardContent");
        SendFromClipboardType.BankTransferFields bankTransferFields2 = (SendFromClipboardType.BankTransferFields) nkm.y.r(nkm.y.z(Regex.c(f317924b, clipboardContent), new s(1)));
        if (bankTransferFields2 != null) {
            return zhm.u.c(bankTransferFields2);
        }
        String str = (String) nkm.y.r(nkm.y.x(Regex.c(f317925c, clipboardContent), new yv8.j(29)));
        if (str == null) {
            String str2 = (String) nkm.y.r(nkm.y.x(Regex.c(e, clipboardContent), new s(2)));
            if (str2 == null) {
                bankTransferFields = null;
            } else {
                Map mapC = q0.c(new Pair(AccountFieldType.ACCOUNT_NUMBER, str2));
                wi0.b.Companion.getClass();
                bankTransferFields = new SendFromClipboardType.BankTransferFields(mapC, wi0.b.p0, null, null);
            }
        } else {
            String str3 = (String) nkm.y.r(nkm.y.x(Regex.c(d, clipboardContent), new s(0)));
            aim.f builder = new aim.f();
            builder.put(AccountFieldType.SORT_CODE, str);
            if (str3 != null) {
                builder.put(AccountFieldType.ACCOUNT_NUMBER, str3);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            aim.f fVarB = builder.b();
            wi0.b.Companion.getClass();
            bankTransferFields = new SendFromClipboardType.BankTransferFields(fVarB, wi0.b.p0, null, null);
        }
        if (bankTransferFields != null) {
            return zhm.u.c(bankTransferFields);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yy9.u
            if (r0 == 0) goto L13
            r0 = r6
            yy9.u r0 = (yy9.u) r0
            int r1 = r0.f317923x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317923x = r1
            goto L18
        L13:
            yy9.u r0 = new yy9.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317923x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f317923x = r3
            cw9.d r6 = r4.f317926a
            cqh.m r6 = r6.b()
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L4f
            goto L66
        L4f:
            java.util.List r5 = b(r5)
            if (r5 == 0) goto L66
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r6 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.payments.send_from_clipboard.api.R$string.payments_from_clipboard_bank_transfer
            r3 = 14
            r1.<init>(r2, r0, r0, r3)
            int r0 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_bank
            r6.<init>(r0, r1, r5)
            return r6
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.v.a(java.lang.String, gim.c):java.lang.Object");
    }
}
