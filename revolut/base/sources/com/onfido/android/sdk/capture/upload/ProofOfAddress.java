package com.onfido.android.sdk.capture.upload;

import j6.a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/upload/ProofOfAddress;", "Ljava/io/Serializable;", "type", "", "front", "Lcom/onfido/android/sdk/capture/upload/ProofOfAddress$ProofOfAddressDocumentSide;", "back", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ProofOfAddress$ProofOfAddressDocumentSide;Lcom/onfido/android/sdk/capture/upload/ProofOfAddress$ProofOfAddressDocumentSide;)V", "getBack", "()Lcom/onfido/android/sdk/capture/upload/ProofOfAddress$ProofOfAddressDocumentSide;", "getFront", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "ProofOfAddressDocumentSide", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ProofOfAddress implements Serializable {
    private static final long serialVersionUID = 1;
    private final ProofOfAddressDocumentSide back;

    @NotNull
    private final ProofOfAddressDocumentSide front;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/upload/ProofOfAddress$ProofOfAddressDocumentSide;", "Ljava/io/Serializable;", "id", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProofOfAddressDocumentSide implements Serializable {
        private static final long serialVersionUID = 1;

        @NotNull
        private final String id;
        private final String type;

        public ProofOfAddressDocumentSide(@NotNull String id10, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
            this.type = str;
        }

        public static /* synthetic */ ProofOfAddressDocumentSide copy$default(ProofOfAddressDocumentSide proofOfAddressDocumentSide, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = proofOfAddressDocumentSide.id;
            }
            if ((i & 2) != 0) {
                str2 = proofOfAddressDocumentSide.type;
            }
            return proofOfAddressDocumentSide.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final ProofOfAddressDocumentSide copy(@NotNull String id10, String type) {
            Intrinsics.checkNotNullParameter(id10, "id");
            return new ProofOfAddressDocumentSide(id10, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProofOfAddressDocumentSide)) {
                return false;
            }
            ProofOfAddressDocumentSide proofOfAddressDocumentSide = (ProofOfAddressDocumentSide) other;
            return Intrinsics.f(this.id, proofOfAddressDocumentSide.id) && Intrinsics.f(this.type, proofOfAddressDocumentSide.type);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.type;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.s("ProofOfAddressDocumentSide(id=", this.id, ", type=", this.type, ")");
        }
    }

    public ProofOfAddress(@NotNull String type, @NotNull ProofOfAddressDocumentSide front, ProofOfAddressDocumentSide proofOfAddressDocumentSide) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(front, "front");
        this.type = type;
        this.front = front;
        this.back = proofOfAddressDocumentSide;
    }

    public static /* synthetic */ ProofOfAddress copy$default(ProofOfAddress proofOfAddress, String str, ProofOfAddressDocumentSide proofOfAddressDocumentSide, ProofOfAddressDocumentSide proofOfAddressDocumentSide2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = proofOfAddress.type;
        }
        if ((i & 2) != 0) {
            proofOfAddressDocumentSide = proofOfAddress.front;
        }
        if ((i & 4) != 0) {
            proofOfAddressDocumentSide2 = proofOfAddress.back;
        }
        return proofOfAddress.copy(str, proofOfAddressDocumentSide, proofOfAddressDocumentSide2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProofOfAddressDocumentSide getFront() {
        return this.front;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProofOfAddressDocumentSide getBack() {
        return this.back;
    }

    @NotNull
    public final ProofOfAddress copy(@NotNull String type, @NotNull ProofOfAddressDocumentSide front, ProofOfAddressDocumentSide back) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(front, "front");
        return new ProofOfAddress(type, front, back);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProofOfAddress)) {
            return false;
        }
        ProofOfAddress proofOfAddress = (ProofOfAddress) other;
        return Intrinsics.f(this.type, proofOfAddress.type) && Intrinsics.f(this.front, proofOfAddress.front) && Intrinsics.f(this.back, proofOfAddress.back);
    }

    public final ProofOfAddressDocumentSide getBack() {
        return this.back;
    }

    @NotNull
    public final ProofOfAddressDocumentSide getFront() {
        return this.front;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.front.hashCode() + (this.type.hashCode() * 31)) * 31;
        ProofOfAddressDocumentSide proofOfAddressDocumentSide = this.back;
        return iHashCode + (proofOfAddressDocumentSide == null ? 0 : proofOfAddressDocumentSide.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProofOfAddress(type=" + this.type + ", front=" + this.front + ", back=" + this.back + ")";
    }
}
