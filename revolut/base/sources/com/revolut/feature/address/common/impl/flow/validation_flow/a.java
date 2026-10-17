package com.revolut.feature.address.common.impl.flow.validation_flow;

import com.revolut.feature.address.common.impl.flow.validation_flow.AddressEnhancementAdvisor;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61027a;

    static {
        int[] iArr = new int[AddressEnhancementAdvisor.AddressEnhancement.values().length];
        try {
            iArr[AddressEnhancementAdvisor.AddressEnhancement.JP_ROOM_NUMBER_NEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressEnhancementAdvisor.AddressEnhancement.SG_FLOOR_NUMBER_NEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f61027a = iArr;
    }
}
