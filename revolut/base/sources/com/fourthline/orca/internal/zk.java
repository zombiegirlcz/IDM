package com.fourthline.orca.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zk {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[yk.values().length];
            try {
                iArr[yk.f35367a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yk.f35368b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(yk ykVar, us eidFlowConfig) {
        Intrinsics.checkNotNullParameter(ykVar, "<this>");
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        int i = a.$EnumSwitchMapping$0[ykVar.ordinal()];
        if (i == 1) {
            return eidFlowConfig.getDocumentFlowName();
        }
        if (i == 2) {
            return eidFlowConfig.getEIdFlowName();
        }
        throw new NoWhenBranchMatchedException();
    }
}
