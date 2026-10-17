package com.onfido.api.client.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BC\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J/\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/onfido/api/client/data/SupportedDocuments;", "", "seen1", "", "docs", "", "Lcom/onfido/api/client/data/SupportedDocument;", "issuers", "", "", "Lcom/onfido/api/client/data/DocumentIssuer;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/Map;)V", "getDocs$annotations", "()V", "getDocs", "()Ljava/util/List;", "getIssuers$annotations", "getIssuers", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SupportedDocuments {

    @NotNull
    private final List<SupportedDocument> docs;

    @NotNull
    private final Map<String, DocumentIssuer> issuers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {new e(SupportedDocument$$serializer.INSTANCE), new h0(v1.f247718a, DocumentIssuer$$serializer.INSTANCE, 1)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SupportedDocuments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SupportedDocuments;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SupportedDocuments$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ SupportedDocuments(int i, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(SupportedDocuments$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.docs = list;
        this.issuers = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedDocuments copy$default(SupportedDocuments supportedDocuments, List list, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = supportedDocuments.docs;
        }
        if ((i & 2) != 0) {
            map = supportedDocuments.issuers;
        }
        return supportedDocuments.copy(list, map);
    }

    public static /* synthetic */ void getDocs$annotations() {
    }

    public static /* synthetic */ void getIssuers$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(SupportedDocuments self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.docs);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.issuers);
    }

    @NotNull
    public final List<SupportedDocument> component1() {
        return this.docs;
    }

    @NotNull
    public final Map<String, DocumentIssuer> component2() {
        return this.issuers;
    }

    @NotNull
    public final SupportedDocuments copy(@NotNull List<SupportedDocument> docs, @NotNull Map<String, DocumentIssuer> issuers) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(issuers, "issuers");
        return new SupportedDocuments(docs, issuers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedDocuments)) {
            return false;
        }
        SupportedDocuments supportedDocuments = (SupportedDocuments) other;
        return Intrinsics.f(this.docs, supportedDocuments.docs) && Intrinsics.f(this.issuers, supportedDocuments.issuers);
    }

    @NotNull
    public final List<SupportedDocument> getDocs() {
        return this.docs;
    }

    @NotNull
    public final Map<String, DocumentIssuer> getIssuers() {
        return this.issuers;
    }

    public int hashCode() {
        return this.issuers.hashCode() + (this.docs.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SupportedDocuments(docs=" + this.docs + ", issuers=" + this.issuers + ")";
    }

    public SupportedDocuments(@NotNull List<SupportedDocument> docs, @NotNull Map<String, DocumentIssuer> issuers) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(issuers, "issuers");
        this.docs = docs;
        this.issuers = issuers;
    }
}
