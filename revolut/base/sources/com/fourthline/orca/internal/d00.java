package com.fourthline.orca.internal;

import com.fourthline.orca.internal.gg0;
import com.fourthline.orca.internal.hg0;
import com.fourthline.orca.internal.kn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0015#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\u0015\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/d00;", "", "Lcom/fourthline/orca/internal/kn;", "documentRecognitionData", "Lcom/fourthline/orca/internal/gg0;", "ocrData", "Lcom/fourthline/orca/internal/hg0;", "mrzData", "<init>", "(Lcom/fourthline/orca/internal/kn;Lcom/fourthline/orca/internal/gg0;Lcom/fourthline/orca/internal/hg0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/kn;Lcom/fourthline/orca/internal/gg0;Lcom/fourthline/orca/internal/hg0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/d00;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Lcom/fourthline/orca/internal/kn;Lcom/fourthline/orca/internal/gg0;Lcom/fourthline/orca/internal/hg0;)Lcom/fourthline/orca/internal/d00;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/kn;", "()Lcom/fourthline/orca/internal/kn;", "b", "Lcom/fourthline/orca/internal/gg0;", "c", "()Lcom/fourthline/orca/internal/gg0;", "Lcom/fourthline/orca/internal/hg0;", "()Lcom/fourthline/orca/internal/hg0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d00 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kn documentRecognitionData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gg0 ocrData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg0 mrzData;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.d00$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27613a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d00(int i, kn knVar, gg0 gg0Var, hg0 hg0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.documentRecognitionData = null;
        } else {
            this.documentRecognitionData = knVar;
        }
        if ((i & 2) == 0) {
            this.ocrData = null;
        } else {
            this.ocrData = gg0Var;
        }
        if ((i & 4) == 0) {
            this.mrzData = null;
        } else {
            this.mrzData = hg0Var;
        }
    }

    public final d00 a(kn documentRecognitionData, gg0 ocrData, hg0 mrzData) {
        return new d00(documentRecognitionData, ocrData, mrzData);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hg0 getMrzData() {
        return this.mrzData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final gg0 getOcrData() {
        return this.ocrData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d00)) {
            return false;
        }
        d00 d00Var = (d00) other;
        return Intrinsics.f(this.documentRecognitionData, d00Var.documentRecognitionData) && Intrinsics.f(this.ocrData, d00Var.ocrData) && Intrinsics.f(this.mrzData, d00Var.mrzData);
    }

    public int hashCode() {
        kn knVar = this.documentRecognitionData;
        int iHashCode = (knVar == null ? 0 : knVar.hashCode()) * 31;
        gg0 gg0Var = this.ocrData;
        int iHashCode2 = (iHashCode + (gg0Var == null ? 0 : gg0Var.hashCode())) * 31;
        hg0 hg0Var = this.mrzData;
        return iHashCode2 + (hg0Var != null ? hg0Var.hashCode() : 0);
    }

    public String toString() {
        return "GetDocumentAnalysisResultResponse(documentRecognitionData=" + this.documentRecognitionData + ", ocrData=" + this.ocrData + ", mrzData=" + this.mrzData + ")";
    }

    public d00(kn knVar, gg0 gg0Var, hg0 hg0Var) {
        this.documentRecognitionData = knVar;
        this.ocrData = gg0Var;
        this.mrzData = hg0Var;
    }

    public static /* synthetic */ d00 a(d00 d00Var, kn knVar, gg0 gg0Var, hg0 hg0Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            knVar = d00Var.documentRecognitionData;
        }
        if ((i & 2) != 0) {
            gg0Var = d00Var.ocrData;
        }
        if ((i & 4) != 0) {
            hg0Var = d00Var.mrzData;
        }
        return d00Var.a(knVar, gg0Var, hg0Var);
    }

    public static final /* synthetic */ void a(d00 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.documentRecognitionData != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kn.a.f30342a, self.documentRecognitionData);
        }
        if (output.d(serialDesc) || self.ocrData != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, gg0.a.f28882a, self.ocrData);
        }
        if (!output.d(serialDesc) && self.mrzData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, hg0.a.f29244a, self.mrzData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final kn getDocumentRecognitionData() {
        return this.documentRecognitionData;
    }
}
