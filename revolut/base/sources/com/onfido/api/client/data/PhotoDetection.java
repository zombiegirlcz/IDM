package com.onfido.api.client.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.n0;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0004*+,-BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006."}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection;", "", "seen1", "", "glareDetection", "Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "blurDetection", "barcodeDetection", "mrzExtraction", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;)V", "getBarcodeDetection$annotations", "()V", "getBarcodeDetection", "()Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "getBlurDetection$annotations", "getBlurDetection", "getGlareDetection$annotations", "getGlareDetection", "getMrzExtraction$annotations", "getMrzExtraction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "BarcodeProcessingResult", "Companion", "ProcessingResult", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class PhotoDetection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final ProcessingResult barcodeDetection;
    private final ProcessingResult blurDetection;
    private final ProcessingResult glareDetection;
    private final ProcessingResult mrzExtraction;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BE\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0004\u0010\u0012¨\u0006&"}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection$BarcodeProcessingResult;", "Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "seen1", "", "isValid", "", "retryCount", "extractedInfo", "Lcom/onfido/api/client/data/ExtractedInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/Integer;Lcom/onfido/api/client/data/ExtractedInfo;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/ExtractedInfo;Z)V", "getExtractedInfo$annotations", "()V", "getExtractedInfo", "()Lcom/onfido/api/client/data/ExtractedInfo;", "isValid$annotations", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class BarcodeProcessingResult extends ProcessingResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final ExtractedInfo extractedInfo;
        private final boolean isValid;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection$BarcodeProcessingResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/PhotoDetection$BarcodeProcessingResult;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return PhotoDetection$BarcodeProcessingResult$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @d
        public /* synthetic */ BarcodeProcessingResult(int i, boolean z, Integer num, ExtractedInfo extractedInfo, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, z, num, serializationConstructorMarker);
            if (13 != (i & 13)) {
                j1.f(PhotoDetection$BarcodeProcessingResult$$serializer.INSTANCE.getDescriptor(), i, 13);
                throw null;
            }
            this.extractedInfo = extractedInfo;
            this.isValid = z3;
        }

        public static /* synthetic */ BarcodeProcessingResult copy$default(BarcodeProcessingResult barcodeProcessingResult, ExtractedInfo extractedInfo, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                extractedInfo = barcodeProcessingResult.extractedInfo;
            }
            if ((i & 2) != 0) {
                z = barcodeProcessingResult.isValid;
            }
            return barcodeProcessingResult.copy(extractedInfo, z);
        }

        public static /* synthetic */ void getExtractedInfo$annotations() {
        }

        public static /* synthetic */ void isValid$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(BarcodeProcessingResult self, CompositeEncoder output, SerialDescriptor serialDesc) {
            ProcessingResult.write$Self(self, output, serialDesc);
            output.encodeNullableSerializableElement(serialDesc, 2, ExtractedInfo$$serializer.INSTANCE, self.extractedInfo);
            output.encodeBooleanElement(serialDesc, 3, self.isValid);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ExtractedInfo getExtractedInfo() {
            return this.extractedInfo;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        @NotNull
        public final BarcodeProcessingResult copy(ExtractedInfo extractedInfo, boolean isValid) {
            return new BarcodeProcessingResult(extractedInfo, isValid);
        }

        @Override // com.onfido.api.client.data.PhotoDetection.ProcessingResult
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodeProcessingResult)) {
                return false;
            }
            BarcodeProcessingResult barcodeProcessingResult = (BarcodeProcessingResult) other;
            return Intrinsics.f(this.extractedInfo, barcodeProcessingResult.extractedInfo) && this.isValid == barcodeProcessingResult.isValid;
        }

        public final ExtractedInfo getExtractedInfo() {
            return this.extractedInfo;
        }

        @Override // com.onfido.api.client.data.PhotoDetection.ProcessingResult
        public int hashCode() {
            ExtractedInfo extractedInfo = this.extractedInfo;
            return Boolean.hashCode(this.isValid) + ((extractedInfo == null ? 0 : extractedInfo.hashCode()) * 31);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        @NotNull
        public String toString() {
            return "BarcodeProcessingResult(extractedInfo=" + this.extractedInfo + ", isValid=" + this.isValid + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BarcodeProcessingResult(ExtractedInfo extractedInfo, boolean z) {
            super(z, (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            this.extractedInfo = extractedInfo;
            this.isValid = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/PhotoDetection;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PhotoDetection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018HÇ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\r\u0010\f¨\u0006\u001b\u0080å\b\u0004\u0080å\b\u0006"}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "", "seen1", "", "isValid", "", "retryCount", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/Integer;)V", "isValid$annotations", "()V", "getRetryCount$annotations", "Ljava/lang/Integer;", "equals", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static class ProcessingResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final boolean isValid;
        private final Integer retryCount;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return PhotoDetection$ProcessingResult$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @d
        public /* synthetic */ ProcessingResult(int i, boolean z, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                j1.f(PhotoDetection$ProcessingResult$$serializer.INSTANCE.getDescriptor(), i, 1);
                throw null;
            }
            this.isValid = z;
            if ((i & 2) == 0) {
                this.retryCount = null;
            } else {
                this.retryCount = num;
            }
        }

        private static /* synthetic */ void getRetryCount$annotations() {
        }

        private static /* synthetic */ void isValid$annotations() {
        }

        public static final /* synthetic */ void write$Self(ProcessingResult self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeBooleanElement(serialDesc, 0, self.isValid);
            if (!output.d(serialDesc) && self.retryCount == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, n0.f247680a, self.retryCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProcessingResult)) {
                return false;
            }
            ProcessingResult processingResult = (ProcessingResult) other;
            return this.isValid == processingResult.isValid && Intrinsics.f(this.retryCount, processingResult.retryCount);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValid) * 31;
            Integer num = this.retryCount;
            return iHashCode + (num != null ? num.intValue() : 0);
        }

        public ProcessingResult(boolean z, Integer num) {
            this.isValid = z;
            this.retryCount = num;
        }

        public /* synthetic */ ProcessingResult(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num);
        }
    }

    @d
    public /* synthetic */ PhotoDetection(int i, ProcessingResult processingResult, ProcessingResult processingResult2, ProcessingResult processingResult3, ProcessingResult processingResult4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            j1.f(PhotoDetection$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.glareDetection = processingResult;
        this.blurDetection = processingResult2;
        this.barcodeDetection = processingResult3;
        this.mrzExtraction = processingResult4;
    }

    public static /* synthetic */ PhotoDetection copy$default(PhotoDetection photoDetection, ProcessingResult processingResult, ProcessingResult processingResult2, ProcessingResult processingResult3, ProcessingResult processingResult4, int i, Object obj2) {
        if ((i & 1) != 0) {
            processingResult = photoDetection.glareDetection;
        }
        if ((i & 2) != 0) {
            processingResult2 = photoDetection.blurDetection;
        }
        if ((i & 4) != 0) {
            processingResult3 = photoDetection.barcodeDetection;
        }
        if ((i & 8) != 0) {
            processingResult4 = photoDetection.mrzExtraction;
        }
        return photoDetection.copy(processingResult, processingResult2, processingResult3, processingResult4);
    }

    public static /* synthetic */ void getBarcodeDetection$annotations() {
    }

    public static /* synthetic */ void getBlurDetection$annotations() {
    }

    public static /* synthetic */ void getGlareDetection$annotations() {
    }

    public static /* synthetic */ void getMrzExtraction$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(PhotoDetection self, CompositeEncoder output, SerialDescriptor serialDesc) {
        PhotoDetection$ProcessingResult$$serializer photoDetection$ProcessingResult$$serializer = PhotoDetection$ProcessingResult$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, photoDetection$ProcessingResult$$serializer, self.glareDetection);
        output.encodeNullableSerializableElement(serialDesc, 1, photoDetection$ProcessingResult$$serializer, self.blurDetection);
        output.encodeNullableSerializableElement(serialDesc, 2, photoDetection$ProcessingResult$$serializer, self.barcodeDetection);
        output.encodeNullableSerializableElement(serialDesc, 3, photoDetection$ProcessingResult$$serializer, self.mrzExtraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProcessingResult getGlareDetection() {
        return this.glareDetection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProcessingResult getBlurDetection() {
        return this.blurDetection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProcessingResult getBarcodeDetection() {
        return this.barcodeDetection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProcessingResult getMrzExtraction() {
        return this.mrzExtraction;
    }

    @NotNull
    public final PhotoDetection copy(ProcessingResult glareDetection, ProcessingResult blurDetection, ProcessingResult barcodeDetection, ProcessingResult mrzExtraction) {
        return new PhotoDetection(glareDetection, blurDetection, barcodeDetection, mrzExtraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoDetection)) {
            return false;
        }
        PhotoDetection photoDetection = (PhotoDetection) other;
        return Intrinsics.f(this.glareDetection, photoDetection.glareDetection) && Intrinsics.f(this.blurDetection, photoDetection.blurDetection) && Intrinsics.f(this.barcodeDetection, photoDetection.barcodeDetection) && Intrinsics.f(this.mrzExtraction, photoDetection.mrzExtraction);
    }

    public final ProcessingResult getBarcodeDetection() {
        return this.barcodeDetection;
    }

    public final ProcessingResult getBlurDetection() {
        return this.blurDetection;
    }

    public final ProcessingResult getGlareDetection() {
        return this.glareDetection;
    }

    public final ProcessingResult getMrzExtraction() {
        return this.mrzExtraction;
    }

    public int hashCode() {
        ProcessingResult processingResult = this.glareDetection;
        int iHashCode = (processingResult == null ? 0 : processingResult.hashCode()) * 31;
        ProcessingResult processingResult2 = this.blurDetection;
        int iHashCode2 = (iHashCode + (processingResult2 == null ? 0 : processingResult2.hashCode())) * 31;
        ProcessingResult processingResult3 = this.barcodeDetection;
        int iHashCode3 = (iHashCode2 + (processingResult3 == null ? 0 : processingResult3.hashCode())) * 31;
        ProcessingResult processingResult4 = this.mrzExtraction;
        return iHashCode3 + (processingResult4 != null ? processingResult4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotoDetection(glareDetection=" + this.glareDetection + ", blurDetection=" + this.blurDetection + ", barcodeDetection=" + this.barcodeDetection + ", mrzExtraction=" + this.mrzExtraction + ")";
    }

    public PhotoDetection(ProcessingResult processingResult, ProcessingResult processingResult2, ProcessingResult processingResult3, ProcessingResult processingResult4) {
        this.glareDetection = processingResult;
        this.blurDetection = processingResult2;
        this.barcodeDetection = processingResult3;
        this.mrzExtraction = processingResult4;
    }
}
