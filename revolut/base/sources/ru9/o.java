package ru9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    public static cam.f a(int i, List chatItems) {
        DateTime f79568b;
        DateTime f79568b2;
        Intrinsics.checkNotNullParameter(chatItems, "chatItems");
        ChatItem chatItem = (ChatItem) chatItems.get(i);
        LocalDate localDate = chatItem.getF79568b().toLocalDate();
        dv9.n f79569c = chatItem.getF79569c();
        ChatItem chatItem2 = (ChatItem) zhm.d0.e0(i - 1, chatItems);
        LocalDate localDate2 = null;
        LocalDate localDate3 = (chatItem2 == null || (f79568b2 = chatItem2.getF79568b()) == null) ? null : f79568b2.toLocalDate();
        boolean zB = b(chatItem2, chatItem);
        ChatItem chatItem3 = (ChatItem) zhm.d0.e0(i + 1, chatItems);
        if (chatItem3 != null && (f79568b = chatItem3.getF79568b()) != null) {
            localDate2 = f79568b.toLocalDate();
        }
        boolean zB2 = b(chatItem3, chatItem);
        gw0.t tVar = (zB || zB2) ? !zB ? localDate.isEqual(localDate2) ? gw0.t.FIRST : gw0.t.SINGLE_TAIL : localDate.isEqual(localDate3) ? (zB2 && localDate2 != null && localDate.isEqual(localDate2)) ? gw0.t.MIDDLE : gw0.t.LAST : (zB2 && localDate2 != null && localDate.isEqual(localDate2)) ? gw0.t.FIRST : gw0.t.SINGLE_TAIL : gw0.t.SINGLE_TAIL;
        int i2 = n.f257492a[f79569c.ordinal()];
        if (i2 == 1) {
            return new gw0.j(tVar);
        }
        if (i2 == 2) {
            return new gw0.i(tVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean b(ChatItem chatItem, ChatItem chatItem2) {
        if ((chatItem instanceof GroupChatItem) && (chatItem2 instanceof GroupChatItem)) {
            return ((GroupChatItem) chatItem).a0().equals(((GroupChatItem) chatItem2).a0());
        }
        return (chatItem != null ? chatItem.getF79569c() : null) == chatItem2.getF79569c();
    }
}
