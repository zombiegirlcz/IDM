package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d61 implements aq0 {
    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
    }

    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType, Function0 function0, Function0 function02, Function1 function1) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
    }

    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        a(popupType, null, null);
    }
}
