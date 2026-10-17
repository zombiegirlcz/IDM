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
import p.a;
import qlm.e;
import qlm.h0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003$%&B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B/\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u000f\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\nHÆ\u0003J\u0013\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/onfido/api/client/data/ErrorData;", "", "message", "", "type", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "error", "Lcom/onfido/api/client/data/ErrorData$Error;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/ErrorData$Error;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/ErrorData$Error;)V", "getError$annotations", "()V", "getError", "()Lcom/onfido/api/client/data/ErrorData$Error;", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "Error", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class ErrorData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Error error;

    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/ErrorData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/ErrorData;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ErrorData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B[\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0001\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rBC\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\tHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÁ\u0001¢\u0006\u0002\b/R0\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u00062"}, d2 = {"Lcom/onfido/api/client/data/ErrorData$Error;", "", "seen1", "", "type", "", "message", "id", "fields", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFields$annotations", "()V", "getFields", "()Ljava/util/Map;", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMessage$annotations", "getMessage", "setMessage", "getType$annotations", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class Error {

        @NotNull
        private static final KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, List<String>> fields;

        @NotNull
        private String id;

        @NotNull
        private String message;

        @NotNull
        private String type;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/ErrorData$Error$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/ErrorData$Error;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ErrorData$Error$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            v1 v1Var = v1.f247718a;
            $childSerializers = new KSerializer[]{null, null, null, new h0(v1Var, new e(v1Var), 1)};
        }

        public Error() {
            this((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, Map map, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = error.type;
            }
            if ((i & 2) != 0) {
                str2 = error.message;
            }
            if ((i & 4) != 0) {
                str3 = error.id;
            }
            if ((i & 8) != 0) {
                map = error.fields;
            }
            return error.copy(str, str2, str3, map);
        }

        public static /* synthetic */ void getFields$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getMessage$annotations() {
        }

        public static /* synthetic */ void getType$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(Error self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            if (output.d(serialDesc) || !Intrinsics.f(self.type, "Unexpected")) {
                output.encodeStringElement(serialDesc, 0, self.type);
            }
            if (output.d(serialDesc) || !Intrinsics.f(self.message, "Unexpected")) {
                output.encodeStringElement(serialDesc, 1, self.message);
            }
            if (output.d(serialDesc) || !Intrinsics.f(self.id, "Unexpected")) {
                output.encodeStringElement(serialDesc, 2, self.id);
            }
            if (!output.d(serialDesc) && self.fields == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.fields);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Map<String, List<String>> component4() {
            return this.fields;
        }

        @NotNull
        public final Error copy(@NotNull String type, @NotNull String message, @NotNull String id10, Map<String, ? extends List<String>> fields) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(id10, "id");
            return new Error(type, message, id10, fields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.f(this.type, error.type) && Intrinsics.f(this.message, error.message) && Intrinsics.f(this.id, error.id) && Intrinsics.f(this.fields, error.fields);
        }

        public final Map<String, List<String>> getFields() {
            return this.fields;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iC = a.c(a.c(this.type.hashCode() * 31, 31, this.message), 31, this.id);
            Map<String, List<String>> map = this.fields;
            return iC + (map == null ? 0 : map.hashCode());
        }

        public final void setId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.type = str;
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.message;
            String str3 = this.id;
            Map<String, List<String>> map = this.fields;
            StringBuilder sbM = v0.a.m("Error(type=", str, ", message=", str2, ", id=");
            sbM.append(str3);
            sbM.append(", fields=");
            sbM.append(map);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String type) {
            this(type, (String) null, (String) null, (Map) null, 14, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String type, @NotNull String message) {
            this(type, message, (String) null, (Map) null, 12, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String type, @NotNull String message, @NotNull String id10) {
            this(type, message, id10, (Map) null, 8, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(id10, "id");
        }

        @d
        public /* synthetic */ Error(int i, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = "Unexpected";
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.message = "Unexpected";
            } else {
                this.message = str2;
            }
            if ((i & 4) == 0) {
                this.id = "Unexpected";
            } else {
                this.id = str3;
            }
            if ((i & 8) == 0) {
                this.fields = null;
            } else {
                this.fields = map;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error(@NotNull String type, @NotNull String message, @NotNull String id10, Map<String, ? extends List<String>> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.type = type;
            this.message = message;
            this.id = id10;
            this.fields = map;
        }

        public /* synthetic */ Error(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Unexpected" : str, (i & 2) != 0 ? "Unexpected" : str2, (i & 4) != 0 ? "Unexpected" : str3, (i & 8) != 0 ? null : map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorData() {
        this((Error) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, Error error, int i, Object obj2) {
        if ((i & 1) != 0) {
            error = errorData.error;
        }
        return errorData.copy(error);
    }

    public static /* synthetic */ void getError$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$onfido_api_client(com.onfido.api.client.data.ErrorData r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            boolean r0 = r9.d(r10)
            if (r0 == 0) goto L7
            goto L1b
        L7:
            com.onfido.api.client.data.ErrorData$Error r0 = r8.error
            com.onfido.api.client.data.ErrorData$Error r1 = new com.onfido.api.client.data.ErrorData$Error
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L23
        L1b:
            com.onfido.api.client.data.ErrorData$Error$$serializer r0 = com.onfido.api.client.data.ErrorData$Error$$serializer.INSTANCE
            com.onfido.api.client.data.ErrorData$Error r1 = r8.error
            r2 = 0
            r9.encodeSerializableElement(r10, r2, r0, r1)
        L23:
            boolean r0 = r9.d(r10)
            if (r0 == 0) goto L2a
            goto L38
        L2a:
            java.lang.String r0 = r8.message
            com.onfido.api.client.data.ErrorData$Error r1 = r8.error
            java.lang.String r1 = r1.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L3e
        L38:
            java.lang.String r8 = r8.message
            r0 = 1
            r9.encodeStringElement(r10, r0, r8)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.api.client.data.ErrorData.write$Self$onfido_api_client(com.onfido.api.client.data.ErrorData, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final ErrorData copy(@NotNull Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ErrorData(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorData) && Intrinsics.f(this.error, ((ErrorData) other).error);
    }

    @NotNull
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorData(error=" + this.error + ")";
    }

    @d
    public /* synthetic */ ErrorData(int i, Error error, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.error = new Error((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.error = error;
        }
        if ((i & 2) == 0) {
            this.message = this.error.getMessage();
        } else {
            this.message = str;
        }
    }

    public ErrorData(@NotNull Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.message = error.getMessage();
    }

    public /* synthetic */ ErrorData(Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            error = new Error((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
        }
        this(error);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorData(@NotNull String message, @NotNull String type, @NotNull String id10) {
        this(new Error(type, message, id10, (Map) null, 8, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id10, "id");
    }
}
