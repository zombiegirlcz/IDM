package com.revolut.feature.checklist_challenges.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ie0.j;
import java.lang.annotation.Annotation;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import qlm.d1;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "Landroid/os/Parcelable;", "Companion", "Active", "Completed", "OptIn", "Purchased", "Unknown", "a", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Active;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Completed;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$OptIn;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Purchased;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Unknown;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface ChecklistChallengeState extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f65807a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Active;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Active implements ChecklistChallengeState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65797a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65798a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65798a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ACTIVE", aVar, 1);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.checklist_challenges.api.models.c());
                descriptor = pluginGeneratedSerialDescriptor;
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
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Active(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Active value = (Active) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f65797a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState$Active$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65798a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public /* synthetic */ Active(int i, String str) {
            if (1 == (i & 1)) {
                this.f65797a = str;
            } else {
                j1.f(a.f65798a.getDescriptor(), i, 1);
                throw null;
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
            return (obj2 instanceof Active) && Intrinsics.f(this.f65797a, ((Active) obj2).f65797a);
        }

        public final int hashCode() {
            return this.f65797a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65797a);
        }

        public Active(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f65797a = id10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Completed;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Completed implements ChecklistChallengeState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Instant f65800b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65801a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65801a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("COMPLETED", aVar, 2);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("claimEndDate", true);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.checklist_challenges.api.models.c());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, nlm.a.c(j.f160602a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                Instant instant = null;
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
                        instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, j.f160602a, instant);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Completed(i, strDecodeStringElement, instant);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Completed value = (Completed) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                String str = value.f65799a;
                Instant instant = value.f65800b;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, j.f160602a, instant);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState$Completed$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65801a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed(parcel.readString(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public /* synthetic */ Completed(int i, String str, Instant instant) {
            if (1 != (i & 1)) {
                j1.f(a.f65801a.getDescriptor(), i, 1);
                throw null;
            }
            this.f65799a = str;
            if ((i & 2) == 0) {
                this.f65800b = null;
            } else {
                this.f65800b = instant;
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
            if (!(obj2 instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj2;
            return Intrinsics.f(this.f65799a, completed.f65799a) && Intrinsics.f(this.f65800b, completed.f65800b);
        }

        public final int hashCode() {
            int iHashCode = this.f65799a.hashCode() * 31;
            Instant instant = this.f65800b;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65799a);
            dest.writeSerializable(this.f65800b);
        }

        public Completed(String id10, Instant instant) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f65799a = id10;
            this.f65800b = instant;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Purchased;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Purchased implements ChecklistChallengeState {

        @NotNull
        public static final Purchased INSTANCE = new Purchased();

        @NotNull
        public static final Parcelable.Creator<Purchased> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f65805a = yhm.j.c(k.PUBLICATION, new mfl.b(10));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Purchased.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Purchased[i];
            }
        }

        private Purchased() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f65805a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$Unknown;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Unknown implements ChecklistChallengeState {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f65806a = yhm.j.c(k.PUBLICATION, new mfl.b(11));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f65806a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f65807a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState", p0Var.b(ChecklistChallengeState.class), new KClass[]{p0Var.b(Active.class), p0Var.b(Completed.class), p0Var.b(OptIn.class), p0Var.b(Purchased.class), p0Var.b(Unknown.class)}, new KSerializer[]{Active.a.f65798a, Completed.a.f65801a, OptIn.a.f65804a, new d1("PURCHASED", Purchased.INSTANCE, new Annotation[]{new c()}), new d1("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState.Unknown", Unknown.INSTANCE, new Annotation[]{new c()})}, new Annotation[]{new c()});
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState$OptIn;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeState;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class OptIn implements ChecklistChallengeState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65803a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f65802b = {yhm.j.c(k.PUBLICATION, new mfl.b(9))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65804a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65804a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OPT_IN", aVar, 1);
                pluginGeneratedSerialDescriptor.j("completeCriteria", true);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.checklist_challenges.api.models.c());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c((KSerializer) OptIn.f65802b[0].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = OptIn.f65802b;
                dVarBeginStructure.getClass();
                List list = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new OptIn(i, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                OptIn value = (OptIn) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = OptIn.f65802b;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f65803a, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f65803a);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState$OptIn$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65804a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(OptIn.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OptIn(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        public OptIn(int i, List list) {
            if ((i & 1) == 0) {
                this.f65803a = zhm.f0.f322471a;
            } else {
                this.f65803a = list;
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
            return (obj2 instanceof OptIn) && Intrinsics.f(this.f65803a, ((OptIn) obj2).f65803a);
        }

        public final int hashCode() {
            List list = this.f65803a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List list = this.f65803a;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }

        public OptIn(List list) {
            this.f65803a = list;
        }

        public OptIn() {
            this(zhm.f0.f322471a);
        }
    }
}
