package ru9;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes5.dex */
public final class r {
    public static p a(com.revolut.feature.payments.messaging.data.api.model.b bVar) {
        int i = q.f257497c[bVar.ordinal()];
        if (i == 1) {
            return new p(new com.revolut.core.ui_kit.delegates.chat.e(R$attr.uikit_colorPlanChatPremiumLight, R$attr.uikit_colorPlanChatPremiumDark), R$attr.uikit_colorForeground);
        }
        if (i == 2) {
            return new p(new com.revolut.core.ui_kit.delegates.chat.e(R$attr.uikit_colorPlanChatMetalLight, R$attr.uikit_colorPlanChatMetalDark), R$attr.uikit_colorForeground);
        }
        if (i != 3) {
            return null;
        }
        return new p(new com.revolut.core.ui_kit.delegates.chat.e(R$attr.uikit_colorPlanChatUltraLight, R$attr.uikit_colorPlanChatUltraDark), R$attr.uikit_colorForeground);
    }
}
