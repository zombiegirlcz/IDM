package com.revolut.data.database.models.recurringpayments;

import chc.c0;
import java.lang.annotation.Annotation;
import jo3.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.f;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;
import qlm.v1;
import wp5.y;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "DropsBelow", "Exceeds", "Companion", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public abstract class WalletAutomationEmbeddedEntity {

    @NotNull
    public static final String TYPE_EXCEEDS = "EXCEEDS";

    @NotNull
    public static final String TYPE_DROPS_BELOW = "DROPS_BELOW";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy $cachedSerializer$delegate = j.c(k.PUBLICATION, new c0(27));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Companion;", "", "<init>", "()V", "TYPE_DROPS_BELOW", "", "TYPE_EXCEEDS", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) WalletAutomationEmbeddedEntity.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001e¨\u00066"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "Ljo3/b;", "threshold", "topupAmount", "", "monitoredPocket", "topupFrom", "limitMax", "limitPeriod", "<init>", "(Ljo3/b;Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjo3/b;Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$retail_data_release", "(Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljo3/b;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(Ljo3/b;Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/b;", "getThreshold", "getTopupAmount", "Ljava/lang/String;", "getMonitoredPocket", "getTopupFrom", "getLimitMax", "getLimitPeriod", "Companion", "$serializer", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class DropsBelow extends WalletAutomationEmbeddedEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final b limitMax;
        private final String limitPeriod;

        @NotNull
        private final String monitoredPocket;

        @NotNull
        private final b threshold;

        @NotNull
        private final b topupAmount;

        @NotNull
        private final String topupFrom;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$DropsBelow;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return WalletAutomationEmbeddedEntity$DropsBelow$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DropsBelow(int i, b bVar, b bVar2, String str, String str2, b bVar3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (15 != (i & 15)) {
                j1.f(WalletAutomationEmbeddedEntity$DropsBelow$$serializer.INSTANCE.getDescriptor(), i, 15);
                throw null;
            }
            this.threshold = bVar;
            this.topupAmount = bVar2;
            this.monitoredPocket = str;
            this.topupFrom = str2;
            if ((i & 16) == 0) {
                this.limitMax = null;
            } else {
                this.limitMax = bVar3;
            }
            if ((i & 32) == 0) {
                this.limitPeriod = null;
            } else {
                this.limitPeriod = str3;
            }
        }

        public static /* synthetic */ DropsBelow copy$default(DropsBelow dropsBelow, b bVar, b bVar2, String str, String str2, b bVar3, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                bVar = dropsBelow.threshold;
            }
            if ((i & 2) != 0) {
                bVar2 = dropsBelow.topupAmount;
            }
            if ((i & 4) != 0) {
                str = dropsBelow.monitoredPocket;
            }
            if ((i & 8) != 0) {
                str2 = dropsBelow.topupFrom;
            }
            if ((i & 16) != 0) {
                bVar3 = dropsBelow.limitMax;
            }
            if ((i & 32) != 0) {
                str3 = dropsBelow.limitPeriod;
            }
            b bVar4 = bVar3;
            String str4 = str3;
            return dropsBelow.copy(bVar, bVar2, str, str2, bVar4, str4);
        }

        public static final /* synthetic */ void write$Self$retail_data_release(DropsBelow self, CompositeEncoder output, SerialDescriptor serialDesc) {
            WalletAutomationEmbeddedEntity.write$Self(self, output, serialDesc);
            b.a aVar = b.a.f176863a;
            output.encodeSerializableElement(serialDesc, 0, aVar, self.threshold);
            output.encodeSerializableElement(serialDesc, 1, aVar, self.topupAmount);
            output.encodeStringElement(serialDesc, 2, self.monitoredPocket);
            output.encodeStringElement(serialDesc, 3, self.topupFrom);
            if (output.d(serialDesc) || self.limitMax != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, aVar, self.limitMax);
            }
            if (!output.d(serialDesc) && self.limitPeriod == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 5, v1.f247718a, self.limitPeriod);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getThreshold() {
            return this.threshold;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final b getTopupAmount() {
            return this.topupAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTopupFrom() {
            return this.topupFrom;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final b getLimitMax() {
            return this.limitMax;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLimitPeriod() {
            return this.limitPeriod;
        }

        @NotNull
        public final DropsBelow copy(@NotNull b threshold, @NotNull b topupAmount, @NotNull String monitoredPocket, @NotNull String topupFrom, b limitMax, String limitPeriod) {
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(topupFrom, "topupFrom");
            return new DropsBelow(threshold, topupAmount, monitoredPocket, topupFrom, limitMax, limitPeriod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DropsBelow)) {
                return false;
            }
            DropsBelow dropsBelow = (DropsBelow) other;
            return Intrinsics.f(this.threshold, dropsBelow.threshold) && Intrinsics.f(this.topupAmount, dropsBelow.topupAmount) && Intrinsics.f(this.monitoredPocket, dropsBelow.monitoredPocket) && Intrinsics.f(this.topupFrom, dropsBelow.topupFrom) && Intrinsics.f(this.limitMax, dropsBelow.limitMax) && Intrinsics.f(this.limitPeriod, dropsBelow.limitPeriod);
        }

        public final b getLimitMax() {
            return this.limitMax;
        }

        public final String getLimitPeriod() {
            return this.limitPeriod;
        }

        @NotNull
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        public final b getThreshold() {
            return this.threshold;
        }

        @NotNull
        public final b getTopupAmount() {
            return this.topupAmount;
        }

        @NotNull
        public final String getTopupFrom() {
            return this.topupFrom;
        }

        public int hashCode() {
            int iC = a.c(a.c(y.e(this.topupAmount, this.threshold.hashCode() * 31, 31), 31, this.monitoredPocket), 31, this.topupFrom);
            b bVar = this.limitMax;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.limitPeriod;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropsBelow(@NotNull b threshold, @NotNull b topupAmount, @NotNull String monitoredPocket, @NotNull String topupFrom, b bVar, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(topupFrom, "topupFrom");
            this.threshold = threshold;
            this.topupAmount = topupAmount;
            this.monitoredPocket = monitoredPocket;
            this.topupFrom = topupFrom;
            this.limitMax = bVar;
            this.limitPeriod = str;
        }

        public /* synthetic */ DropsBelow(b bVar, b bVar2, String str, String str2, b bVar3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, bVar2, str, str2, (i & 16) != 0 ? null : bVar3, (i & 32) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u001c¨\u00063"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity;", "Ljo3/b;", "threshold", "", "monitoredPocket", "receiver", "limitMax", "limitPeriod", "<init>", "(Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$retail_data_release", "(Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljo3/b;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljo3/b;Ljava/lang/String;Ljava/lang/String;Ljo3/b;Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/b;", "getThreshold", "Ljava/lang/String;", "getMonitoredPocket", "getReceiver", "getLimitMax", "getLimitPeriod", "Companion", "$serializer", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Exceeds extends WalletAutomationEmbeddedEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final b limitMax;
        private final String limitPeriod;

        @NotNull
        private final String monitoredPocket;

        @NotNull
        private final String receiver;

        @NotNull
        private final b threshold;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/database/models/recurringpayments/WalletAutomationEmbeddedEntity$Exceeds;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return WalletAutomationEmbeddedEntity$Exceeds$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Exceeds(int i, b bVar, String str, String str2, b bVar2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                j1.f(WalletAutomationEmbeddedEntity$Exceeds$$serializer.INSTANCE.getDescriptor(), i, 7);
                throw null;
            }
            this.threshold = bVar;
            this.monitoredPocket = str;
            this.receiver = str2;
            if ((i & 8) == 0) {
                this.limitMax = null;
            } else {
                this.limitMax = bVar2;
            }
            if ((i & 16) == 0) {
                this.limitPeriod = null;
            } else {
                this.limitPeriod = str3;
            }
        }

        public static /* synthetic */ Exceeds copy$default(Exceeds exceeds, b bVar, String str, String str2, b bVar2, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                bVar = exceeds.threshold;
            }
            if ((i & 2) != 0) {
                str = exceeds.monitoredPocket;
            }
            if ((i & 4) != 0) {
                str2 = exceeds.receiver;
            }
            if ((i & 8) != 0) {
                bVar2 = exceeds.limitMax;
            }
            if ((i & 16) != 0) {
                str3 = exceeds.limitPeriod;
            }
            String str4 = str3;
            String str5 = str2;
            return exceeds.copy(bVar, str, str5, bVar2, str4);
        }

        public static final /* synthetic */ void write$Self$retail_data_release(Exceeds self, CompositeEncoder output, SerialDescriptor serialDesc) {
            WalletAutomationEmbeddedEntity.write$Self(self, output, serialDesc);
            b.a aVar = b.a.f176863a;
            output.encodeSerializableElement(serialDesc, 0, aVar, self.threshold);
            output.encodeStringElement(serialDesc, 1, self.monitoredPocket);
            output.encodeStringElement(serialDesc, 2, self.receiver);
            if (output.d(serialDesc) || self.limitMax != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, aVar, self.limitMax);
            }
            if (!output.d(serialDesc) && self.limitPeriod == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 4, v1.f247718a, self.limitPeriod);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final b getThreshold() {
            return this.threshold;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReceiver() {
            return this.receiver;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final b getLimitMax() {
            return this.limitMax;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLimitPeriod() {
            return this.limitPeriod;
        }

        @NotNull
        public final Exceeds copy(@NotNull b threshold, @NotNull String monitoredPocket, @NotNull String receiver, b limitMax, String limitPeriod) {
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return new Exceeds(threshold, monitoredPocket, receiver, limitMax, limitPeriod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Exceeds)) {
                return false;
            }
            Exceeds exceeds = (Exceeds) other;
            return Intrinsics.f(this.threshold, exceeds.threshold) && Intrinsics.f(this.monitoredPocket, exceeds.monitoredPocket) && Intrinsics.f(this.receiver, exceeds.receiver) && Intrinsics.f(this.limitMax, exceeds.limitMax) && Intrinsics.f(this.limitPeriod, exceeds.limitPeriod);
        }

        public final b getLimitMax() {
            return this.limitMax;
        }

        public final String getLimitPeriod() {
            return this.limitPeriod;
        }

        @NotNull
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        public final String getReceiver() {
            return this.receiver;
        }

        @NotNull
        public final b getThreshold() {
            return this.threshold;
        }

        public int hashCode() {
            int iC = a.c(a.c(this.threshold.hashCode() * 31, 31, this.monitoredPocket), 31, this.receiver);
            b bVar = this.limitMax;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.limitPeriod;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exceeds(@NotNull b threshold, @NotNull String monitoredPocket, @NotNull String receiver, b bVar, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            this.threshold = threshold;
            this.monitoredPocket = monitoredPocket;
            this.receiver = receiver;
            this.limitMax = bVar;
            this.limitPeriod = str;
        }

        public /* synthetic */ Exceeds(b bVar, String str, String str2, b bVar2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, str, str2, (i & 8) != 0 ? null : bVar2, (i & 16) != 0 ? null : str3);
        }
    }

    public /* synthetic */ WalletAutomationEmbeddedEntity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        p0 p0Var = o0.f186429a;
        return new f("com.revolut.data.database.models.recurringpayments.WalletAutomationEmbeddedEntity", p0Var.b(WalletAutomationEmbeddedEntity.class), new KClass[]{p0Var.b(DropsBelow.class), p0Var.b(Exceeds.class)}, new KSerializer[]{WalletAutomationEmbeddedEntity$DropsBelow$$serializer.INSTANCE, WalletAutomationEmbeddedEntity$Exceeds$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(WalletAutomationEmbeddedEntity self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }

    private WalletAutomationEmbeddedEntity() {
    }

    public /* synthetic */ WalletAutomationEmbeddedEntity(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
