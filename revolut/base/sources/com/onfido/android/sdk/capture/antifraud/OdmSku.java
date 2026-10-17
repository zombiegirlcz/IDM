package com.onfido.android.sdk.capture.antifraud;

import a41.g0;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/antifraud/OdmSku;", "Lcom/onfido/android/sdk/capture/antifraud/BuildExtractedSignal;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OdmSku extends BuildExtractedSignal {

    @NotNull
    public static final OdmSku INSTANCE = new OdmSku();

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.antifraud.OdmSku$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            if (ContextUtilsKt.apilevelAtLeast(31)) {
                return g0.q();
            }
            return null;
        }
    }

    private OdmSku() {
        super(Signal.ODM_SKU, "odm_sku", AnonymousClass1.INSTANCE, null);
    }
}
