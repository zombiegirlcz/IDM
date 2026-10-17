package com.revolut.feature.credit.impl.notifications.data;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pp3.a aVar;
        e response = (e) obj2;
        Intrinsics.checkNotNullParameter(response, "response");
        od0.h hVar = od0.i.Companion;
        b25.a dto = response.getDto();
        if (dto != null) {
            Intrinsics.checkNotNullParameter(dto, "<this>");
            aVar = new pp3.a(dto.getPush(), dto.getEmail(), dto.getSms(), dto.getPhone(), dto.getWhatsapp(), dto.getIvr());
        } else {
            aVar = null;
        }
        hVar.getClass();
        return od0.h.a(aVar);
    }
}
