package ru9;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public static ChatPaymentBubbleDelegate.Model a(m mVar, String listId, Clause clause, Clause clause2, Clause clause3, com.revolut.core.ui_kit.delegates.chat.d dVar, ChatBubbleDelegate.ButtonModel buttonModel, ChatBubbleDelegate.ButtonModel buttonModel2, ChatBubbleDelegate.c style, TimeClause timeClause, gw0.u uVar, kp0.t tVar, List list, ContactImage contactImage, cam.f position, xo0.b accessibilitySender, Object obj2, int i, int i2, int i3, int i5) {
        Clause clause4 = (i5 & 4) != 0 ? null : clause2;
        Clause clause5 = (i5 & 8) != 0 ? null : clause3;
        com.revolut.core.ui_kit.delegates.chat.d dVar2 = (i5 & 16) != 0 ? null : dVar;
        ChatBubbleDelegate.ButtonModel buttonModel3 = (i5 & 32) != 0 ? null : buttonModel;
        ChatBubbleDelegate.ButtonModel buttonModel4 = (i5 & 64) != 0 ? null : buttonModel2;
        kp0.t tVar2 = (i5 & 1024) != 0 ? null : tVar;
        List overlappedIcons = (i5 & 2048) != 0 ? zhm.f0.f322471a : list;
        ContactImage contactImage2 = (i5 & 4096) != 0 ? null : contactImage;
        int i6 = (i5 & 262144) != 0 ? R$attr.uikit_dp16 : i3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(overlappedIcons, "overlappedIcons");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        return new ChatPaymentBubbleDelegate.Model(listId, clause, clause4 == null ? clause5 : clause4, dVar2 != null ? new com.revolut.core.ui_kit.delegates.chat.j(dVar2) : null, buttonModel3, buttonModel4, style, timeClause, overlappedIcons, tVar2, uVar, accessibilitySender, null, contactImage2, position, obj2, i, i2, i6, 2240512);
    }
}
