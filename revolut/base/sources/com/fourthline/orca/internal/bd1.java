package com.fourthline.orca.internal;

import com.fourthline.orca.internal.kd1;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bd1 extends dd1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(Map eventAttributes) {
        super(new kd1.f(null, 1, null), eventAttributes);
        Intrinsics.checkNotNullParameter(eventAttributes, "eventAttributes");
    }

    public /* synthetic */ bd1(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zhm.r0.g() : map);
    }
}
