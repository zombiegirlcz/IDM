package com.revolut.feature.payments.air.widget.impl.ui.chat;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.k3;
import com.revolut.core.ui_kit.delegates.m3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.air.widget.impl.R$string;
import dl3.f;
import gw0.i;
import gw0.l;
import gw0.t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m3j.j;
import po9.h;
import po9.q;
import po9.s;
import thf.g;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f79113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f79114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3j.n f79115c;
    public final aqa.a d;
    public final g e;
    public final w80.b f;

    public a(f contactsMapper, j beneficiaryAvatarMapper, m3j.n beneficiaryItemViewMapper, aqa.a cardOwnerAvatarMapper, aqa.c cardOwnersMapper, g transactionRowMapper, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnerAvatarMapper, "cardOwnerAvatarMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(transactionRowMapper, "transactionRowMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f79113a = contactsMapper;
        this.f79114b = beneficiaryAvatarMapper;
        this.f79115c = beneficiaryItemViewMapper;
        this.d = cardOwnerAvatarMapper;
        this.e = transactionRowMapper;
        this.f = amountFormatter;
    }

    public static ChatItemsDelegate.Model a(String str, m3 m3Var, s sVar) {
        return new ChatItemsDelegate.Model(m3Var, str, new i(t.SINGLE), null, l.NORMAL, null, sVar, 129000);
    }

    public static Clause b(String str, String str2) {
        if (str == null && str2 == null) {
            return new TextLocalisedClause(R$string.air_payments_add_recipient_title_name_required, null, null, 14);
        }
        String[] elements = {str, str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return new TextClause(d0.k0(listL, " ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static ChatItemsDelegate.Model d(String str) {
        return a(str, new k3(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), (ComplexImage.Regular) null, q.f237929a, 8), null);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        BaseChatBubbleDelegate.BaseModel baseModel;
        final po9.t domainState = (po9.t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h hVar = domainState.f237935b;
        if (hVar instanceof po9.g) {
            final int i = 0;
            final int i2 = 0;
            baseModel = (BaseChatBubbleDelegate.BaseModel) iii.c.f(((po9.g) hVar).f237915a, new po9.l(domainState, 0), new Function2(this) { // from class: po9.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Function1 function1 = (Function1) obj3;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            break;
                    }
                    return com.revolut.feature.payments.air.widget.impl.ui.chat.a.d(domainState.f237934a);
                }
            }, new Function3(this) { // from class: po9.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.payments.air.widget.impl.ui.chat.a f237923b;

                {
                    this.f237923b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0212  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 596
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: po9.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        } else {
            if (!(hVar instanceof po9.f)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i3 = 1;
            final int i5 = 1;
            baseModel = (BaseChatBubbleDelegate.BaseModel) iii.c.f(((po9.f) hVar).f237914a, new po9.l(this, domainState), new Function2(this) { // from class: po9.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Function1 function1 = (Function1) obj3;
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            break;
                    }
                    return com.revolut.feature.payments.air.widget.impl.ui.chat.a.d(domainState.f237934a);
                }
            }, new Function3(this) { // from class: po9.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.payments.air.widget.impl.ui.chat.a f237923b;

                {
                    this.f237923b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0212  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 596
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: po9.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
        }
        return new y50.c(baseModel);
    }
}
