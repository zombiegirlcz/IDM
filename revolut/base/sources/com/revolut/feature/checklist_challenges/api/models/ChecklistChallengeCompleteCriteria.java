package com.revolut.feature.checklist_challenges.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.d1;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria;", "Landroid/os/Parcelable;", "Companion", "Checklist", "RevPoints", "Unknown", "a", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$Checklist;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$RevPoints;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$Unknown;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface ChecklistChallengeCompleteCriteria extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f65786a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$Checklist;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Checklist implements ChecklistChallengeCompleteCriteria {

        @NotNull
        public static final Checklist INSTANCE = new Checklist();

        @NotNull
        public static final Parcelable.Creator<Checklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f65779a = j.c(k.PUBLICATION, new mfl.b(4));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checklist.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checklist[i];
            }
        }

        private Checklist() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f65779a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$RevPoints;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria;", "", "toString", "()Ljava/lang/String;", "Companion", "Content", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class RevPoints implements ChecklistChallengeCompleteCriteria {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Content f65780a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$RevPoints$Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class Content implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65782b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Content> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f65783a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f65783a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria.RevPoints.Content", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("productId", false);
                    pluginGeneratedSerialDescriptor.j("amount", true);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    v1 v1Var = v1.f247718a;
                    return new KSerializer[]{v1Var, nlm.a.c(v1Var)};
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
                    String str = null;
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
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new Content(i, strDecodeStringElement, str);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    Content value = (Content) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    String str = value.f65781a;
                    String str2 = value.f65782b;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                    if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria$RevPoints$Content$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f65783a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Content(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Content[i];
                }
            }

            public /* synthetic */ Content(int i, String str, String str2) {
                if (1 != (i & 1)) {
                    j1.f(a.f65783a.getDescriptor(), i, 1);
                    throw null;
                }
                this.f65781a = str;
                if ((i & 2) == 0) {
                    this.f65782b = null;
                } else {
                    this.f65782b = str2;
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
                if (!(obj2 instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj2;
                return Intrinsics.f(this.f65781a, content.f65781a) && Intrinsics.f(this.f65782b, content.f65782b);
            }

            public final int hashCode() {
                int iHashCode = this.f65781a.hashCode() * 31;
                String str = this.f65782b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65781a);
                dest.writeString(this.f65782b);
            }

            public Content(String productId, String str) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                this.f65781a = productId;
                this.f65782b = str;
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65784a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65784a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("REV_POINTS", aVar, 1);
                pluginGeneratedSerialDescriptor.j("content", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.checklist_challenges.api.models.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{Content.a.f65783a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                Content content = null;
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
                        content = (Content) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, Content.a.f65783a, content);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new RevPoints(i, content);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                RevPoints value = (RevPoints) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, Content.a.f65783a, value.f65780a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria$RevPoints$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65784a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPoints(Content.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        public /* synthetic */ RevPoints(int i, Content content) {
            if (1 == (i & 1)) {
                this.f65780a = content;
            } else {
                j1.f(a.f65784a.getDescriptor(), i, 1);
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
            return (obj2 instanceof RevPoints) && Intrinsics.f(this.f65780a, ((RevPoints) obj2).f65780a);
        }

        public final int hashCode() {
            return this.f65780a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65780a.writeToParcel(dest, i);
        }

        public RevPoints(Content content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f65780a = content;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria$Unknown;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeCompleteCriteria;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Unknown implements ChecklistChallengeCompleteCriteria {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f65785a = j.c(k.PUBLICATION, new mfl.b(5));

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
            return (KSerializer) f65785a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f65786a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria", p0Var.b(ChecklistChallengeCompleteCriteria.class), new KClass[]{p0Var.b(Checklist.class), p0Var.b(RevPoints.class), p0Var.b(Unknown.class)}, new KSerializer[]{new d1("CHECKLIST", Checklist.INSTANCE, new Annotation[]{new a()}), RevPoints.a.f65784a, new d1("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria.Unknown", Unknown.INSTANCE, new Annotation[]{new a()})}, new Annotation[]{new a()});
        }
    }
}
