package com.revolut.feature.slot_manager.api.model.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderProgress;", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeader;", "", "toString", "()Ljava/lang/String;", "Companion", "Progress", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class SlotChecklistHeaderProgress implements SlotChecklistHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Progress f87311c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SlotChecklistHeaderProgress> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87316a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f87316a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PROGRESS", aVar, 3);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", true);
            pluginGeneratedSerialDescriptor.j("progress", false);
            Intrinsics.checkNotNullParameter("type", "discriminator");
            pluginGeneratedSerialDescriptor.l(new e());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), Progress.a.f87315a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Progress progress = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    progress = (Progress) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, Progress.a.f87315a, progress);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new SlotChecklistHeaderProgress(i, strDecodeStringElement, str, progress);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            SlotChecklistHeaderProgress value = (SlotChecklistHeaderProgress) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f87309a;
            String str2 = value.f87310b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, Progress.a.f87315a, value.f87311c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f87316a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklistHeaderProgress(parcel.readString(), parcel.readString(), Progress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklistHeaderProgress[i];
        }
    }

    public /* synthetic */ SlotChecklistHeaderProgress(int i, String str, String str2, Progress progress) {
        if (5 != (i & 5)) {
            j1.f(a.f87316a.getDescriptor(), i, 5);
            throw null;
        }
        this.f87309a = str;
        if ((i & 2) == 0) {
            this.f87310b = null;
        } else {
            this.f87310b = str2;
        }
        this.f87311c = progress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklistHeaderProgress)) {
            return false;
        }
        SlotChecklistHeaderProgress slotChecklistHeaderProgress = (SlotChecklistHeaderProgress) obj2;
        return Intrinsics.f(this.f87309a, slotChecklistHeaderProgress.f87309a) && Intrinsics.f(this.f87310b, slotChecklistHeaderProgress.f87310b) && Intrinsics.f(this.f87311c, slotChecklistHeaderProgress.f87311c);
    }

    public final int hashCode() {
        int iHashCode = this.f87309a.hashCode() * 31;
        String str = this.f87310b;
        return this.f87311c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87309a);
        dest.writeString(this.f87310b);
        this.f87311c.writeToParcel(dest, i);
    }

    public SlotChecklistHeaderProgress(String title, String str, Progress progress) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f87309a = title;
        this.f87310b = str;
        this.f87311c = progress;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderProgress$Progress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/slot_manager/api/model/checklist/f", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Progress implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f87312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f87313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f87314c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Progress> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new bkd.a(6))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87315a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87315a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress.Progress", aVar, 3);
                pluginGeneratedSerialDescriptor.j("current", false);
                pluginGeneratedSerialDescriptor.j("total", false);
                pluginGeneratedSerialDescriptor.j("variant", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Progress.d;
                n0 n0Var = n0.f247680a;
                return new KSerializer[]{n0Var, n0Var, lazyArr[2].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Progress.d;
                dVarBeginStructure.getClass();
                f fVar = null;
                boolean z = true;
                int i = 0;
                int iDecodeIntElement = 0;
                int iDecodeIntElement2 = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), fVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Progress(i, iDecodeIntElement, iDecodeIntElement2, fVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Progress value = (Progress) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Progress.d;
                int i = value.f87312a;
                f fVar = value.f87314c;
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f87313b);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != f.DEFAULT) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), fVar);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress$Progress$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87315a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Progress(parcel.readInt(), parcel.readInt(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Progress[i];
            }
        }

        public /* synthetic */ Progress(int i, int i2, int i3, f fVar) {
            if (3 != (i & 3)) {
                j1.f(a.f87315a.getDescriptor(), i, 3);
                throw null;
            }
            this.f87312a = i2;
            this.f87313b = i3;
            if ((i & 4) == 0) {
                this.f87314c = f.DEFAULT;
            } else {
                this.f87314c = fVar;
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
            if (!(obj2 instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj2;
            return this.f87312a == progress.f87312a && this.f87313b == progress.f87313b && this.f87314c == progress.f87314c;
        }

        public final int hashCode() {
            return this.f87314c.hashCode() + j6.a.b(this.f87313b, Integer.hashCode(this.f87312a) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f87312a);
            dest.writeInt(this.f87313b);
            dest.writeString(this.f87314c.name());
        }

        public Progress(int i, int i2, f variant) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f87312a = i;
            this.f87313b = i2;
            this.f87314c = variant;
        }
    }
}
