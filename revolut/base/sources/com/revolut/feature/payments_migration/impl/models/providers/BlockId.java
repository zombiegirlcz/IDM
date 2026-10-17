package com.revolut.feature.payments_migration.impl.models.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0088\u0001\u0005\u0092\u0001\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/BlockId;", "Landroid/os/Parcelable;", "Companion", "a", "b", "value", "", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final class BlockId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80208a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BlockId> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80209a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f80209a = aVar;
            j0 j0Var = new j0("com.revolut.feature.payments_migration.impl.models.providers.BlockId", aVar);
            j0Var.j("value", false);
            descriptor = j0Var;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            String value = decoder.decodeInline(descriptor).decodeString();
            Intrinsics.checkNotNullParameter(value, "value");
            return new BlockId(value);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            String str = ((BlockId) obj2).f80208a;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-payments_migration-impl-models-providers-BlockId$-value$0");
            Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
            if (encoderEncodeInline == null) {
                return;
            }
            encoderEncodeInline.encodeString(str);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.BlockId$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f80209a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new BlockId(v7.t(parcel, "parcel", "value"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlockId[i];
        }
    }

    public /* synthetic */ BlockId(String str) {
        this.f80208a = str;
    }

    public static final void a(String str, Parcel dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof BlockId) {
            return Intrinsics.f(this.f80208a, ((BlockId) obj2).f80208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f80208a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF80208a() {
        return this.f80208a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a(this.f80208a, dest);
    }
}
