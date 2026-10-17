package com.revolut.feature.slot_manager.api.model.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.j;
import yhm.k;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Content", "Step", "Action", "Meta", "Terms", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class SlotChecklist implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Meta f87261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Content f87262b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SlotChecklist> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Action implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87264b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87265a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87265a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Action", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("deeplink", true);
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
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
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
                return new Action(i, strDecodeStringElement, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Action value = (Action) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                String str = value.f87263a;
                String str2 = value.f87264b;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Action$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87265a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public /* synthetic */ Action(int i, String str, String str2) {
            if (1 != (i & 1)) {
                j1.f(a.f87265a.getDescriptor(), i, 1);
                throw null;
            }
            this.f87263a = str;
            if ((i & 2) == 0) {
                this.f87264b = null;
            } else {
                this.f87264b = str2;
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
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f87263a, action.f87263a) && Intrinsics.f(this.f87264b, action.f87264b);
        }

        public final int hashCode() {
            int iHashCode = this.f87263a.hashCode() * 31;
            String str = this.f87264b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87263a);
            dest.writeString(this.f87264b);
        }

        public Action(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f87263a = title;
            this.f87264b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Content implements Parcelable {
        public static final Lazy[] f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotChecklistHeader f87266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f87267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f87268c;
        public final String d;
        public final Terms e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87269a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87269a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Content", aVar, 5);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("steps", false);
                pluginGeneratedSerialDescriptor.j("actions", false);
                pluginGeneratedSerialDescriptor.j("animationMedia", true);
                pluginGeneratedSerialDescriptor.j("terms", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Content.f;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), nlm.a.c(v1.f247718a), nlm.a.c(Terms.a.f87292a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Content.f;
                dVarBeginStructure.getClass();
                int i = 0;
                SlotChecklistHeader slotChecklistHeader = null;
                List list = null;
                List list2 = null;
                String str = null;
                Terms terms = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        slotChecklistHeader = (SlotChecklistHeader) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), slotChecklistHeader);
                        i |= 1;
                    } else if (iD == 1) {
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    } else if (iD == 2) {
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list2);
                        i |= 4;
                    } else if (iD == 3) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        terms = (Terms) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Terms.a.f87292a, terms);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Content(i, slotChecklistHeader, list, list2, str, terms);
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
                Lazy[] lazyArr = Content.f;
                h hVar = (h) lazyArr[0].getValue();
                SlotChecklistHeader slotChecklistHeader = value.f87266a;
                Terms terms = value.e;
                String str = value.d;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, slotChecklistHeader);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f87267b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f87268c);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || terms != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, Terms.a.f87292a, terms);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Content$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87269a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SlotChecklistHeader slotChecklistHeader = (SlotChecklistHeader) j6.a.f(parcel, "parcel", Content.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Content(slotChecklistHeader, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Terms.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            f = new Lazy[]{j.c(kVar, new bi2.g(27)), j.c(kVar, new bi2.g(28)), j.c(kVar, new bi2.g(29)), null, null};
        }

        public /* synthetic */ Content(int i, SlotChecklistHeader slotChecklistHeader, List list, List list2, String str, Terms terms) {
            if (7 != (i & 7)) {
                j1.f(a.f87269a.getDescriptor(), i, 7);
                throw null;
            }
            this.f87266a = slotChecklistHeader;
            this.f87267b = list;
            this.f87268c = list2;
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = terms;
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
            return Intrinsics.f(this.f87266a, content.f87266a) && Intrinsics.f(this.f87267b, content.f87267b) && Intrinsics.f(this.f87268c, content.f87268c) && Intrinsics.f(this.d, content.d) && Intrinsics.f(this.e, content.e);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.d(this.f87266a.hashCode() * 31, 31, this.f87267b), 31, this.f87268c);
            String str = this.d;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            Terms terms = this.e;
            return iHashCode + (terms != null ? terms.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87266a, i);
            Iterator itV = p.a.v(this.f87267b, dest);
            while (itV.hasNext()) {
                ((Step) itV.next()).writeToParcel(dest, i);
            }
            Iterator itV2 = p.a.v(this.f87268c, dest);
            while (itV2.hasNext()) {
                ((Action) itV2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.d);
            Terms terms = this.e;
            if (terms == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                terms.writeToParcel(dest, i);
            }
        }

        public Content(SlotChecklistHeader header, List steps, List actions, String str, Terms terms) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f87266a = header;
            this.f87267b = steps;
            this.f87268c = actions;
            this.d = str;
            this.e = terms;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Terms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "TextArgument", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Terms implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f87288b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f87286c = {null, j.c(k.PUBLICATION, new bkd.a(3))};

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Terms$TextArgument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class TextArgument implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87290b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<TextArgument> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f87291a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f87291a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Terms.TextArgument", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("text", false);
                    pluginGeneratedSerialDescriptor.j("url", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    v1 v1Var = v1.f247718a;
                    return new KSerializer[]{v1Var, v1Var};
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
                    String strDecodeStringElement2 = null;
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
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new TextArgument(i, strDecodeStringElement, strDecodeStringElement2);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    TextArgument value = (TextArgument) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87289a);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f87290b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Terms$TextArgument$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f87291a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TextArgument(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TextArgument[i];
                }
            }

            public /* synthetic */ TextArgument(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    j1.f(a.f87291a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f87289a = str;
                this.f87290b = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TextArgument)) {
                    return false;
                }
                TextArgument textArgument = (TextArgument) obj2;
                return Intrinsics.f(this.f87289a, textArgument.f87289a) && Intrinsics.f(this.f87290b, textArgument.f87290b);
            }

            public final int hashCode() {
                return this.f87290b.hashCode() + (this.f87289a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87289a);
                dest.writeString(this.f87290b);
            }

            public TextArgument(String text, String url2) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f87289a = text;
                this.f87290b = url2;
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87292a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87292a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Terms", aVar, 2);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("args", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, Terms.f87286c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Terms.f87286c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                List list = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Terms(i, strDecodeStringElement, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Terms value = (Terms) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Terms.f87286c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87287a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f87288b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Terms$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87292a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TextArgument.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Terms(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        public /* synthetic */ Terms(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f87292a.getDescriptor(), i, 3);
                throw null;
            }
            this.f87287a = str;
            this.f87288b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Terms)) {
                return false;
            }
            Terms terms = (Terms) obj2;
            return Intrinsics.f(this.f87287a, terms.f87287a) && Intrinsics.f(this.f87288b, terms.f87288b);
        }

        public final int hashCode() {
            return this.f87288b.hashCode() + (this.f87287a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87287a);
            Iterator itV = p.a.v(this.f87288b, dest);
            while (itV.hasNext()) {
                ((TextArgument) itV.next()).writeToParcel(dest, i);
            }
        }

        public Terms(String text, List args) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(args, "args");
            this.f87287a = text;
            this.f87288b = args;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87293a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f87293a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist", aVar, 2);
            pluginGeneratedSerialDescriptor.j("metaInformation", false);
            pluginGeneratedSerialDescriptor.j("content", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{Meta.a.f87273a, Content.a.f87269a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Meta meta = null;
            boolean z = true;
            int i = 0;
            Content content = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    meta = (Meta) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, Meta.a.f87273a, meta);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    content = (Content) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, Content.a.f87269a, content);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new SlotChecklist(i, meta, content);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            SlotChecklist value = (SlotChecklist) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, Meta.a.f87273a, value.f87261a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, Content.a.f87269a, value.f87262b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f87293a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklist(Meta.CREATOR.createFromParcel(parcel), Content.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklist[i];
        }
    }

    public /* synthetic */ SlotChecklist(int i, Meta meta, Content content) {
        if (3 != (i & 3)) {
            j1.f(a.f87293a.getDescriptor(), i, 3);
            throw null;
        }
        this.f87261a = meta;
        this.f87262b = content;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Meta getF87261a() {
        return this.f87261a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklist)) {
            return false;
        }
        SlotChecklist slotChecklist = (SlotChecklist) obj2;
        return Intrinsics.f(this.f87261a, slotChecklist.f87261a) && Intrinsics.f(this.f87262b, slotChecklist.f87262b);
    }

    public final int hashCode() {
        return this.f87262b.hashCode() + (this.f87261a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87261a.writeToParcel(dest, i);
        this.f87262b.writeToParcel(dest, i);
    }

    public SlotChecklist(Meta meta, Content content) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f87261a = meta;
        this.f87262b = content;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/slot_manager/api/model/checklist/b", "Value", "Asset", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Step implements Parcelable {
        public static final Lazy[] i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87276c;
        public final String d;
        public final b e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Value f87277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Asset f87278h;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Step> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step$Asset;", "Landroid/os/Parcelable;", "Companion", "Card", "a", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step$Asset$Card;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @rlm.g(discriminator = "type")
        @g
        public interface Asset extends Parcelable {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = Companion.f87281a;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step$Asset$Card;", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step$Asset;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @g
            public static final /* data */ class Card implements Asset {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f87279a;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();

                @NotNull
                public static final Parcelable.Creator<Card> CREATOR = new c();

                public static final /* synthetic */ class a implements f0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f87280a;

                    @NotNull
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        f87280a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CARD", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("url", false);
                        pluginGeneratedSerialDescriptor.l(new com.revolut.feature.slot_manager.api.model.checklist.a());
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
                        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
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
                        return new Card(i, strDecodeStringElement);
                    }

                    @Override // mlm.h, mlm.b
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // mlm.h
                    public final void serialize(Encoder encoder, Object obj2) {
                        Card value = (Card) obj2;
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        SerialDescriptor serialDescriptor = descriptor;
                        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87279a);
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                }

                /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Step$Asset$Card$b, reason: from kotlin metadata */
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return a.f87280a;
                    }
                }

                public static final class c implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Card(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Card[i];
                    }
                }

                public /* synthetic */ Card(int i, String str) {
                    if (1 == (i & 1)) {
                        this.f87279a = str;
                    } else {
                        j1.f(a.f87280a.getDescriptor(), i, 1);
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
                    return (obj2 instanceof Card) && Intrinsics.f(this.f87279a, ((Card) obj2).f87279a);
                }

                public final int hashCode() {
                    return this.f87279a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f87279a);
                }

                public Card(String url2) {
                    Intrinsics.checkNotNullParameter(url2, "url");
                    this.f87279a = url2;
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Step$Asset$a, reason: from kotlin metadata */
            public static final class Companion {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ Companion f87281a = new Companion();

                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    p0 p0Var = o0.f186429a;
                    return new mlm.f("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Step.Asset", p0Var.b(Asset.class), new KClass[]{p0Var.b(Card.class)}, new KSerializer[]{Card.a.f87280a}, new Annotation[]{new com.revolut.feature.slot_manager.api.model.checklist.a()});
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Step$Value;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Value implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87283b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Value> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f87284a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f87284a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Step.Value", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("iconName", false);
                    pluginGeneratedSerialDescriptor.j("attribute", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    v1 v1Var = v1.f247718a;
                    return new KSerializer[]{v1Var, v1Var};
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
                    String strDecodeStringElement2 = null;
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
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new Value(i, strDecodeStringElement, strDecodeStringElement2);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    Value value = (Value) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87282a);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f87283b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Step$Value$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f87284a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Value(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Value[i];
                }
            }

            public /* synthetic */ Value(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    j1.f(a.f87284a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f87282a = str;
                this.f87283b = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Value)) {
                    return false;
                }
                Value value = (Value) obj2;
                return Intrinsics.f(this.f87282a, value.f87282a) && Intrinsics.f(this.f87283b, value.f87283b);
            }

            public final int hashCode() {
                return this.f87283b.hashCode() + (this.f87282a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87282a);
                dest.writeString(this.f87283b);
            }

            public Value(String iconName, String attribute) {
                Intrinsics.checkNotNullParameter(iconName, "iconName");
                Intrinsics.checkNotNullParameter(attribute, "attribute");
                this.f87282a = iconName;
                this.f87283b = attribute;
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87285a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87285a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Step", aVar, 8);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("iconName", false);
                pluginGeneratedSerialDescriptor.j("deeplink", true);
                pluginGeneratedSerialDescriptor.j("variant", true);
                pluginGeneratedSerialDescriptor.j("groupIndex", true);
                pluginGeneratedSerialDescriptor.j("value", true);
                pluginGeneratedSerialDescriptor.j("asset", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Step.i;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), lazyArr[4].getValue(), n0.f247680a, nlm.a.c(Value.a.f87284a), nlm.a.c((KSerializer) lazyArr[7].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Step.i;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
                String str = null;
                b bVar = null;
                Value value = null;
                Asset asset = null;
                int i = 0;
                int iDecodeIntElement = 0;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                            i |= 8;
                            break;
                        case 4:
                            bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), bVar);
                            i |= 16;
                            break;
                        case 5:
                            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                            i |= 32;
                            break;
                        case 6:
                            value = (Value) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Value.a.f87284a, value);
                            i |= 64;
                            break;
                        case 7:
                            asset = (Asset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), asset);
                            i |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Step(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, bVar, iDecodeIntElement, value, asset);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Step value = (Step) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Step.i;
                String str = value.f87274a;
                Asset asset = value.f87278h;
                Value value2 = value.f87277g;
                int i = value.f;
                b bVar = value.e;
                String str2 = value.d;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f87275b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f87276c);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != b.ACTIVE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (h) lazyArr[4].getValue(), bVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || i != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, i);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, Value.a.f87284a, value2);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || asset != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (h) lazyArr[7].getValue(), asset);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Step$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87285a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Step(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel), (Asset) parcel.readParcelable(Step.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Step[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            i = new Lazy[]{null, null, null, null, j.c(kVar, new bkd.a(1)), null, null, j.c(kVar, new bkd.a(2))};
        }

        public /* synthetic */ Step(int i2, String str, String str2, String str3, String str4, b bVar, int i3, Value value, Asset asset) {
            if (7 != (i2 & 7)) {
                j1.f(a.f87285a.getDescriptor(), i2, 7);
                throw null;
            }
            this.f87274a = str;
            this.f87275b = str2;
            this.f87276c = str3;
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i2 & 16) == 0) {
                this.e = b.ACTIVE;
            } else {
                this.e = bVar;
            }
            if ((i2 & 32) == 0) {
                this.f = 0;
            } else {
                this.f = i3;
            }
            if ((i2 & 64) == 0) {
                this.f87277g = null;
            } else {
                this.f87277g = value;
            }
            if ((i2 & 128) == 0) {
                this.f87278h = null;
            } else {
                this.f87278h = asset;
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
            if (!(obj2 instanceof Step)) {
                return false;
            }
            Step step = (Step) obj2;
            return Intrinsics.f(this.f87274a, step.f87274a) && Intrinsics.f(this.f87275b, step.f87275b) && Intrinsics.f(this.f87276c, step.f87276c) && Intrinsics.f(this.d, step.d) && this.e == step.e && this.f == step.f && Intrinsics.f(this.f87277g, step.f87277g) && Intrinsics.f(this.f87278h, step.f87278h);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f87274a.hashCode() * 31, 31, this.f87275b), 31, this.f87276c);
            String str = this.d;
            int iB = j6.a.b(this.f, (this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
            Value value = this.f87277g;
            int iHashCode = (iB + (value == null ? 0 : value.hashCode())) * 31;
            Asset asset = this.f87278h;
            return iHashCode + (asset != null ? asset.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i2) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87274a);
            dest.writeString(this.f87275b);
            dest.writeString(this.f87276c);
            dest.writeString(this.d);
            dest.writeString(this.e.name());
            dest.writeInt(this.f);
            Value value = this.f87277g;
            if (value == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                value.writeToParcel(dest, i2);
            }
            dest.writeParcelable(this.f87278h, i2);
        }

        public Step(String title, String subtitle, String iconName, String str, b variant, int i2, Value value, Asset asset) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(iconName, "iconName");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f87274a = title;
            this.f87275b = subtitle;
            this.f87276c = iconName;
            this.d = str;
            this.e = variant;
            this.f = i2;
            this.f87277g = value;
            this.f87278h = asset;
        }

        public /* synthetic */ Step(String str, String str2, String str3, b bVar) {
            this(str, str2, str3, null, bVar, 0, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist$Meta;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Meta implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f87272c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Meta> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new bkd.a(0))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87273a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87273a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Meta", aVar, 3);
                pluginGeneratedSerialDescriptor.j("crossScreenId", true);
                pluginGeneratedSerialDescriptor.j("campaignId", false);
                pluginGeneratedSerialDescriptor.j("feedbackParams", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Meta.d;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Meta.d;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                Map map = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Meta(i, strDecodeStringElement, strDecodeStringElement2, map);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Meta value = (Meta) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Meta.d;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f87270a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87270a);
                }
                String str = value.f87271b;
                Map map = value.f87272c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map, r0.g())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), map);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist$Meta$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87273a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Meta(string, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Meta[i];
            }
        }

        public /* synthetic */ Meta(int i, String str, String str2, Map map) {
            if (2 != (i & 2)) {
                j1.f(a.f87273a.getDescriptor(), i, 2);
                throw null;
            }
            this.f87270a = (i & 1) == 0 ? "" : str;
            this.f87271b = str2;
            if ((i & 4) == 0) {
                this.f87272c = r0.g();
            } else {
                this.f87272c = map;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF87271b() {
            return this.f87271b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF87270a() {
            return this.f87270a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj2;
            return Intrinsics.f(this.f87270a, meta.f87270a) && Intrinsics.f(this.f87271b, meta.f87271b) && Intrinsics.f(this.f87272c, meta.f87272c);
        }

        public final int hashCode() {
            return this.f87272c.hashCode() + p.a.c(this.f87270a.hashCode() * 31, 31, this.f87271b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87270a);
            dest.writeString(this.f87271b);
            Iterator itZ = j6.a.z(this.f87272c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        public Meta(String crossScreenId, String campaignId, Map feedbackParams) {
            Intrinsics.checkNotNullParameter(crossScreenId, "crossScreenId");
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(feedbackParams, "feedbackParams");
            this.f87270a = crossScreenId;
            this.f87271b = campaignId;
            this.f87272c = feedbackParams;
        }

        public /* synthetic */ Meta() {
            this("", "", r0.g());
        }
    }
}
