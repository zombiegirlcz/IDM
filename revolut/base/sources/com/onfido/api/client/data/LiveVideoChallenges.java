package com.onfido.api.client.data;

import j6.a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.f;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001e\u001f !B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges;", "", "seen1", "", "data", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;)V", "getData$annotations", "()V", "getData", "()Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "LiveVideoChallenge", "LiveVideoChallengesData", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class LiveVideoChallenges {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final LiveVideoChallengesData data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoChallenges;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LiveVideoChallenges$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015HÇ\u0001R\u0012\u0010\b\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "query", "getQuery", "()Ljava/lang/Object;", "type", "", "getType", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "MovementQuery", "ReciteQuery", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$MovementQuery;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$ReciteQuery;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static abstract class LiveVideoChallenge {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Lazy $cachedSerializer$delegate = j.c(k.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.onfido.api.client.data.LiveVideoChallenges$LiveVideoChallenge$Companion$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass1 extends u implements Function0<KSerializer> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final KSerializer invoke() {
                    p0 p0Var = o0.f186429a;
                    return new f("com.onfido.api.client.data.LiveVideoChallenges.LiveVideoChallenge", p0Var.b(LiveVideoChallenge.class), new KClass[]{p0Var.b(MovementQuery.class), p0Var.b(ReciteQuery.class)}, new KSerializer[]{LiveVideoChallenges$LiveVideoChallenge$MovementQuery$$serializer.INSTANCE, LiveVideoChallenges$LiveVideoChallenge$ReciteQuery$$serializer.INSTANCE}, new Annotation[0]);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) LiveVideoChallenge.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$MovementQuery;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "seen1", "", "query", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuery$annotations", "()V", "getQuery", "()Ljava/lang/String;", "getType$annotations", "getType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class MovementQuery extends LiveVideoChallenge {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final String query;

            @NotNull
            private final String type;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$MovementQuery$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$MovementQuery;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return LiveVideoChallenges$LiveVideoChallenge$MovementQuery$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public MovementQuery(@NotNull String query) {
                this(query, null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(query, "query");
            }

            public static /* synthetic */ MovementQuery copy$default(MovementQuery movementQuery, String str, String str2, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = movementQuery.query;
                }
                if ((i & 2) != 0) {
                    str2 = movementQuery.type;
                }
                return movementQuery.copy(str, str2);
            }

            public static /* synthetic */ void getQuery$annotations() {
            }

            public static /* synthetic */ void getType$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(MovementQuery self, CompositeEncoder output, SerialDescriptor serialDesc) {
                LiveVideoChallenge.write$Self(self, output, serialDesc);
                output.encodeStringElement(serialDesc, 0, self.getQuery());
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getQuery() {
                return this.query;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @NotNull
            public final MovementQuery copy(@NotNull String query, @NotNull String type) {
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(type, "type");
                return new MovementQuery(query, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MovementQuery)) {
                    return false;
                }
                MovementQuery movementQuery = (MovementQuery) other;
                return Intrinsics.f(this.query, movementQuery.query) && Intrinsics.f(this.type, movementQuery.type);
            }

            @Override // com.onfido.api.client.data.LiveVideoChallenges.LiveVideoChallenge
            @NotNull
            public String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + (this.query.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.s("MovementQuery(query=", this.query, ", type=", this.type, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @d
            public /* synthetic */ MovementQuery(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    j1.f(LiveVideoChallenges$LiveVideoChallenge$MovementQuery$$serializer.INSTANCE.getDescriptor(), i, 1);
                    throw null;
                }
                this.query = str;
                this.type = "movement";
            }

            @Override // com.onfido.api.client.data.LiveVideoChallenges.LiveVideoChallenge
            @NotNull
            public String getQuery() {
                return this.query;
            }

            public /* synthetic */ MovementQuery(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? "movement" : str2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MovementQuery(@NotNull String query, @NotNull String type) {
                super(null);
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(type, "type");
                this.query = query;
                this.type = type;
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\nHÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$ReciteQuery;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "seen1", "", "query", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "type", "", "(Ljava/util/List;Ljava/lang/String;)V", "getQuery$annotations", "()V", "getQuery", "()Ljava/util/List;", "getType$annotations", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @g
        public static final /* data */ class ReciteQuery extends LiveVideoChallenge {

            @NotNull
            private final List<Integer> query;

            @NotNull
            private final String type;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final KSerializer[] $childSerializers = {new e(n0.f247680a)};

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$ReciteQuery$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge$ReciteQuery;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return LiveVideoChallenges$LiveVideoChallenge$ReciteQuery$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReciteQuery(@NotNull List<Integer> query) {
                this(query, null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(query, "query");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReciteQuery copy$default(ReciteQuery reciteQuery, List list, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    list = reciteQuery.query;
                }
                if ((i & 2) != 0) {
                    str = reciteQuery.type;
                }
                return reciteQuery.copy(list, str);
            }

            public static /* synthetic */ void getQuery$annotations() {
            }

            public static /* synthetic */ void getType$annotations() {
            }

            public static final /* synthetic */ void write$Self$onfido_api_client(ReciteQuery self, CompositeEncoder output, SerialDescriptor serialDesc) {
                LiveVideoChallenge.write$Self(self, output, serialDesc);
                output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.getQuery());
            }

            @NotNull
            public final List<Integer> component1() {
                return this.query;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @NotNull
            public final ReciteQuery copy(@NotNull List<Integer> query, @NotNull String type) {
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(type, "type");
                return new ReciteQuery(query, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReciteQuery)) {
                    return false;
                }
                ReciteQuery reciteQuery = (ReciteQuery) other;
                return Intrinsics.f(this.query, reciteQuery.query) && Intrinsics.f(this.type, reciteQuery.type);
            }

            @Override // com.onfido.api.client.data.LiveVideoChallenges.LiveVideoChallenge
            @NotNull
            public String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + (this.query.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ReciteQuery(query=" + this.query + ", type=" + this.type + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @d
            public /* synthetic */ ReciteQuery(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                super(i, serializationConstructorMarker);
                if (1 != (i & 1)) {
                    j1.f(LiveVideoChallenges$LiveVideoChallenge$ReciteQuery$$serializer.INSTANCE.getDescriptor(), i, 1);
                    throw null;
                }
                this.query = list;
                this.type = "recite";
            }

            @Override // com.onfido.api.client.data.LiveVideoChallenges.LiveVideoChallenge
            @NotNull
            public List<Integer> getQuery() {
                return this.query;
            }

            public /* synthetic */ ReciteQuery(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? "recite" : str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReciteQuery(@NotNull List<Integer> query, @NotNull String type) {
                super(null);
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(type, "type");
                this.query = query;
                this.type = type;
            }
        }

        public /* synthetic */ LiveVideoChallenge(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ void write$Self(LiveVideoChallenge self, CompositeEncoder output, SerialDescriptor serialDesc) {
        }

        @NotNull
        public abstract Object getQuery();

        @NotNull
        public abstract String getType();

        private LiveVideoChallenge() {
        }

        @d
        public /* synthetic */ LiveVideoChallenge(int i, SerializationConstructorMarker serializationConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB#\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;", "", "seen1", "", "id", "", "challenge", "", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getChallenge$annotations", "()V", "getChallenge", "()Ljava/util/List;", "getId$annotations", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class LiveVideoChallengesData {
        private final List<LiveVideoChallenge> challenge;
        private final String id;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final KSerializer[] $childSerializers = {null, new e(LiveVideoChallenge.INSTANCE.serializer())};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallengesData;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return LiveVideoChallenges$LiveVideoChallengesData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LiveVideoChallengesData() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveVideoChallengesData copy$default(LiveVideoChallengesData liveVideoChallengesData, String str, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = liveVideoChallengesData.id;
            }
            if ((i & 2) != 0) {
                list = liveVideoChallengesData.challenge;
            }
            return liveVideoChallengesData.copy(str, list);
        }

        public static /* synthetic */ void getChallenge$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self$onfido_api_client(LiveVideoChallengesData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            if (output.d(serialDesc) || self.id != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, v1.f247718a, self.id);
            }
            if (!output.d(serialDesc) && self.challenge == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.challenge);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<LiveVideoChallenge> component2() {
            return this.challenge;
        }

        @NotNull
        public final LiveVideoChallengesData copy(String id10, List<? extends LiveVideoChallenge> challenge) {
            return new LiveVideoChallengesData(id10, challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveVideoChallengesData)) {
                return false;
            }
            LiveVideoChallengesData liveVideoChallengesData = (LiveVideoChallengesData) other;
            return Intrinsics.f(this.id, liveVideoChallengesData.id) && Intrinsics.f(this.challenge, liveVideoChallengesData.challenge);
        }

        public final List<LiveVideoChallenge> getChallenge() {
            return this.challenge;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<LiveVideoChallenge> list = this.challenge;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LiveVideoChallengesData(id=" + this.id + ", challenge=" + this.challenge + ")";
        }

        @d
        public /* synthetic */ LiveVideoChallengesData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.challenge = null;
            } else {
                this.challenge = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LiveVideoChallengesData(String str, List<? extends LiveVideoChallenge> list) {
            this.id = str;
            this.challenge = list;
        }

        public /* synthetic */ LiveVideoChallengesData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveVideoChallenges() {
        this((LiveVideoChallengesData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ LiveVideoChallenges copy$default(LiveVideoChallenges liveVideoChallenges, LiveVideoChallengesData liveVideoChallengesData, int i, Object obj2) {
        if ((i & 1) != 0) {
            liveVideoChallengesData = liveVideoChallenges.data;
        }
        return liveVideoChallenges.copy(liveVideoChallengesData);
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(LiveVideoChallenges self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.d(serialDesc) && self.data == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, LiveVideoChallenges$LiveVideoChallengesData$$serializer.INSTANCE, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LiveVideoChallengesData getData() {
        return this.data;
    }

    @NotNull
    public final LiveVideoChallenges copy(LiveVideoChallengesData data) {
        return new LiveVideoChallenges(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiveVideoChallenges) && Intrinsics.f(this.data, ((LiveVideoChallenges) other).data);
    }

    public final LiveVideoChallengesData getData() {
        return this.data;
    }

    public int hashCode() {
        LiveVideoChallengesData liveVideoChallengesData = this.data;
        if (liveVideoChallengesData == null) {
            return 0;
        }
        return liveVideoChallengesData.hashCode();
    }

    @NotNull
    public String toString() {
        return "LiveVideoChallenges(data=" + this.data + ")";
    }

    @d
    public /* synthetic */ LiveVideoChallenges(int i, LiveVideoChallengesData liveVideoChallengesData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = liveVideoChallengesData;
        }
    }

    public LiveVideoChallenges(LiveVideoChallengesData liveVideoChallengesData) {
        this.data = liveVideoChallengesData;
    }

    public /* synthetic */ LiveVideoChallenges(LiveVideoChallengesData liveVideoChallengesData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveVideoChallengesData);
    }
}
