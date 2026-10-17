package com.onfido.api.client.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.v1;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0012\b\u0001\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB3\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014¨\u0006)"}, d2 = {"Lcom/onfido/api/client/data/DocumentProperty;", "", "seen1", "", "useCases", "", "", "backRequired", "", "versions", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;ZLjava/util/List;)V", "getBackRequired$annotations", "()V", "getBackRequired", "()Z", "getUseCases$annotations", "getUseCases", "()Ljava/util/List;", "getVersions$annotations", "getVersions", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentProperty {

    @NotNull
    private static final KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean backRequired;

    @NotNull
    private final List<String> useCases;

    @NotNull
    private final List<String> versions;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DocumentProperty$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocumentProperty;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentProperty$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        v1 v1Var = v1.f247718a;
        $childSerializers = new KSerializer[]{new e(a.c(v1Var)), null, new e(a.c(v1Var))};
    }

    public DocumentProperty() {
        this((List) null, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentProperty copy$default(DocumentProperty documentProperty, List list, boolean z, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = documentProperty.useCases;
        }
        if ((i & 2) != 0) {
            z = documentProperty.backRequired;
        }
        if ((i & 4) != 0) {
            list2 = documentProperty.versions;
        }
        return documentProperty.copy(list, z, list2);
    }

    public static /* synthetic */ void getBackRequired$annotations() {
    }

    public static /* synthetic */ void getUseCases$annotations() {
    }

    public static /* synthetic */ void getVersions$annotations() {
    }

    public static final void write$Self$onfido_api_client(DocumentProperty self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.d(serialDesc) || !Intrinsics.f(self.useCases, f0.f322471a)) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.useCases);
        }
        if (output.d(serialDesc) || self.backRequired) {
            output.encodeBooleanElement(serialDesc, 1, self.backRequired);
        }
        if (!output.d(serialDesc) && Intrinsics.f(self.versions, f0.f322471a)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.versions);
    }

    @NotNull
    public final List<String> component1() {
        return this.useCases;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBackRequired() {
        return this.backRequired;
    }

    @NotNull
    public final List<String> component3() {
        return this.versions;
    }

    @NotNull
    public final DocumentProperty copy(@NotNull List<String> useCases, boolean backRequired, @NotNull List<String> versions) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(versions, "versions");
        return new DocumentProperty(useCases, backRequired, versions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentProperty)) {
            return false;
        }
        DocumentProperty documentProperty = (DocumentProperty) other;
        return Intrinsics.f(this.useCases, documentProperty.useCases) && this.backRequired == documentProperty.backRequired && Intrinsics.f(this.versions, documentProperty.versions);
    }

    public final boolean getBackRequired() {
        return this.backRequired;
    }

    @NotNull
    public final List<String> getUseCases() {
        return this.useCases;
    }

    @NotNull
    public final List<String> getVersions() {
        return this.versions;
    }

    public int hashCode() {
        return this.versions.hashCode() + j6.a.c(this.useCases.hashCode() * 31, 31, this.backRequired);
    }

    @NotNull
    public String toString() {
        List<String> list = this.useCases;
        boolean z = this.backRequired;
        List<String> list2 = this.versions;
        StringBuilder sb6 = new StringBuilder("DocumentProperty(useCases=");
        sb6.append(list);
        sb6.append(", backRequired=");
        sb6.append(z);
        sb6.append(", versions=");
        return t61.a.q(")", list2, sb6);
    }

    @d
    public DocumentProperty(int i, List list, boolean z, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.useCases = (i & 1) == 0 ? f0.f322471a : list;
        if ((i & 2) == 0) {
            this.backRequired = false;
        } else {
            this.backRequired = z;
        }
        if ((i & 4) == 0) {
            this.versions = f0.f322471a;
        } else {
            this.versions = list2;
        }
    }

    public DocumentProperty(@NotNull List<String> useCases, boolean z, @NotNull List<String> versions) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(versions, "versions");
        this.useCases = useCases;
        this.backRequired = z;
        this.versions = versions;
    }

    public DocumentProperty(List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? f0.f322471a : list2);
    }
}
