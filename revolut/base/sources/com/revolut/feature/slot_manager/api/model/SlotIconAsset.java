package com.revolut.feature.slot_manager.api.model;

import aj0.o;
import akd.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.f;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/SlotIconAsset;", "Landroid/os/Parcelable;", "Companion", "Symbol", "akd/b", "a", "Lcom/revolut/feature/slot_manager/api/model/SlotIconAsset$Symbol;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface SlotIconAsset extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f87260a;

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.SlotIconAsset$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f87260a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.slot_manager.api.model.SlotIconAsset", p0Var.b(SlotIconAsset.class), new KClass[]{p0Var.b(Symbol.class)}, new KSerializer[]{Symbol.a.f87259a}, new Annotation[]{new a()});
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/SlotIconAsset$Symbol;", "Lcom/revolut/feature/slot_manager/api/model/SlotIconAsset;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Symbol implements SlotIconAsset {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f87258b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Symbol> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f87256c = {null, j.c(k.PUBLICATION, new o(18))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87259a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87259a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("symbol", aVar, 2);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("tint", true);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.slot_manager.api.model.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, Symbol.f87256c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Symbol.f87256c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                b bVar = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), bVar);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Symbol(i, strDecodeStringElement, bVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Symbol value = (Symbol) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Symbol.f87256c;
                String str = value.f87257a;
                b bVar = value.f87258b;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != b.ACCENT) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), bVar);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.SlotIconAsset$Symbol$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87259a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Symbol(parcel.readString(), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Symbol[i];
            }
        }

        public /* synthetic */ Symbol(int i, String str, b bVar) {
            if (1 != (i & 1)) {
                j1.f(a.f87259a.getDescriptor(), i, 1);
                throw null;
            }
            this.f87257a = str;
            if ((i & 2) == 0) {
                this.f87258b = b.ACCENT;
            } else {
                this.f87258b = bVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Symbol)) {
                return false;
            }
            Symbol symbol = (Symbol) obj2;
            return Intrinsics.f(this.f87257a, symbol.f87257a) && this.f87258b == symbol.f87258b;
        }

        public final int hashCode() {
            return this.f87258b.hashCode() + (this.f87257a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87257a);
            dest.writeString(this.f87258b.name());
        }

        public Symbol(String icon, b tint) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tint, "tint");
            this.f87257a = icon;
            this.f87258b = tint;
        }
    }
}
