package com.revolut.kompot.common;

import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT", "Lcom/revolut/kompot/common/StackDestination;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InternalDestination<INPUT extends IOData$Input> implements StackDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOData$Input f98300a;

    public InternalDestination(IOData$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f98300a = inputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public IOData$Input getF98300a() {
        return this.f98300a;
    }
}
