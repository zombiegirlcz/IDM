package com.onfido.api.client.data;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u00060"}, d2 = {"Lcom/onfido/api/client/data/DocumentFeatures;", "", "seen1", "", "hasNFC", "", "hasCan", "hasPin", "canLength", "pinLength", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZII)V", "getCanLength$annotations", "()V", "getCanLength", "()I", "getHasCan$annotations", "getHasCan", "()Z", "getHasNFC$annotations", "getHasNFC", "getHasPin$annotations", "getHasPin", "getPinLength$annotations", "getPinLength", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int canLength;
    private final boolean hasCan;
    private final boolean hasNFC;
    private final boolean hasPin;
    private final int pinLength;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DocumentFeatures$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocumentFeatures;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentFeatures$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DocumentFeatures() {
        this(false, false, false, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DocumentFeatures copy$default(DocumentFeatures documentFeatures, boolean z, boolean z3, boolean z4, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            z = documentFeatures.hasNFC;
        }
        if ((i3 & 2) != 0) {
            z3 = documentFeatures.hasCan;
        }
        if ((i3 & 4) != 0) {
            z4 = documentFeatures.hasPin;
        }
        if ((i3 & 8) != 0) {
            i = documentFeatures.canLength;
        }
        if ((i3 & 16) != 0) {
            i2 = documentFeatures.pinLength;
        }
        int i5 = i2;
        boolean z6 = z4;
        return documentFeatures.copy(z, z3, z6, i, i5);
    }

    public static /* synthetic */ void getCanLength$annotations() {
    }

    public static /* synthetic */ void getHasCan$annotations() {
    }

    public static /* synthetic */ void getHasNFC$annotations() {
    }

    public static /* synthetic */ void getHasPin$annotations() {
    }

    public static /* synthetic */ void getPinLength$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(DocumentFeatures self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.hasNFC) {
            output.encodeBooleanElement(serialDesc, 0, self.hasNFC);
        }
        if (output.d(serialDesc) || self.hasCan) {
            output.encodeBooleanElement(serialDesc, 1, self.hasCan);
        }
        if (output.d(serialDesc) || self.hasPin) {
            output.encodeBooleanElement(serialDesc, 2, self.hasPin);
        }
        if (output.d(serialDesc) || self.canLength != 0) {
            output.encodeIntElement(serialDesc, 3, self.canLength);
        }
        if (!output.d(serialDesc) && self.pinLength == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.pinLength);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasNFC() {
        return this.hasNFC;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasCan() {
        return this.hasCan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasPin() {
        return this.hasPin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCanLength() {
        return this.canLength;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPinLength() {
        return this.pinLength;
    }

    @NotNull
    public final DocumentFeatures copy(boolean hasNFC, boolean hasCan, boolean hasPin, int canLength, int pinLength) {
        return new DocumentFeatures(hasNFC, hasCan, hasPin, canLength, pinLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentFeatures)) {
            return false;
        }
        DocumentFeatures documentFeatures = (DocumentFeatures) other;
        return this.hasNFC == documentFeatures.hasNFC && this.hasCan == documentFeatures.hasCan && this.hasPin == documentFeatures.hasPin && this.canLength == documentFeatures.canLength && this.pinLength == documentFeatures.pinLength;
    }

    public final int getCanLength() {
        return this.canLength;
    }

    public final boolean getHasCan() {
        return this.hasCan;
    }

    public final boolean getHasNFC() {
        return this.hasNFC;
    }

    public final boolean getHasPin() {
        return this.hasPin;
    }

    public final int getPinLength() {
        return this.pinLength;
    }

    public int hashCode() {
        return Integer.hashCode(this.pinLength) + a.b(this.canLength, a.c(a.c(Boolean.hashCode(this.hasNFC) * 31, 31, this.hasCan), 31, this.hasPin), 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.hasNFC;
        boolean z3 = this.hasCan;
        boolean z4 = this.hasPin;
        int i = this.canLength;
        int i2 = this.pinLength;
        StringBuilder sb6 = new StringBuilder("DocumentFeatures(hasNFC=");
        sb6.append(z);
        sb6.append(", hasCan=");
        sb6.append(z3);
        sb6.append(", hasPin=");
        sb6.append(z4);
        sb6.append(", canLength=");
        sb6.append(i);
        sb6.append(", pinLength=");
        return a.v(sb6, ")", i2);
    }

    @d
    public /* synthetic */ DocumentFeatures(int i, boolean z, boolean z3, boolean z4, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hasNFC = false;
        } else {
            this.hasNFC = z;
        }
        if ((i & 2) == 0) {
            this.hasCan = false;
        } else {
            this.hasCan = z3;
        }
        if ((i & 4) == 0) {
            this.hasPin = false;
        } else {
            this.hasPin = z4;
        }
        if ((i & 8) == 0) {
            this.canLength = 0;
        } else {
            this.canLength = i2;
        }
        if ((i & 16) == 0) {
            this.pinLength = 0;
        } else {
            this.pinLength = i3;
        }
    }

    public DocumentFeatures(boolean z, boolean z3, boolean z4, int i, int i2) {
        this.hasNFC = z;
        this.hasCan = z3;
        this.hasPin = z4;
        this.canLength = i;
        this.pinLength = i2;
    }

    public /* synthetic */ DocumentFeatures(boolean z, boolean z3, boolean z4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z3, (i3 & 4) != 0 ? false : z4, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
