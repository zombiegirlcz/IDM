package com.revolut.feature.slot_manager.api.model.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;
import rlm.r;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt;", "Lcom/revolut/feature/slot_manager/api/model/prompt/SlotPrompt;", "", "toString", "()Ljava/lang/String;", "Companion", "Content", "Style", "BackgroundMedia", "Action", "LayoutType", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class SlotDefaultPrompt implements SlotPrompt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotPrompt.Meta f87319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Content f87320b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SlotDefaultPrompt> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Action implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87322b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87323a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87323a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.Action", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("link", false);
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
                return new Action(i, strDecodeStringElement, strDecodeStringElement2);
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
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87321a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f87322b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$Action$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87323a;
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
            if (3 != (i & 3)) {
                j1.f(a.f87323a.getDescriptor(), i, 3);
                throw null;
            }
            this.f87321a = str;
            this.f87322b = str2;
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
            return Intrinsics.f(this.f87321a, action.f87321a) && Intrinsics.f(this.f87322b, action.f87322b);
        }

        public final int hashCode() {
            return this.f87322b.hashCode() + (this.f87321a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87321a);
            dest.writeString(this.f87322b);
        }

        public Action(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f87321a = title;
            this.f87322b = deeplink;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$BackgroundMedia;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class BackgroundMedia implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87325b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<BackgroundMedia> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87326a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87326a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.BackgroundMedia", aVar, 2);
                pluginGeneratedSerialDescriptor.j("dark", false);
                pluginGeneratedSerialDescriptor.j("light", false);
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
                return new BackgroundMedia(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                BackgroundMedia value = (BackgroundMedia) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87324a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f87325b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$BackgroundMedia$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87326a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackgroundMedia(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackgroundMedia[i];
            }
        }

        public /* synthetic */ BackgroundMedia(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f87326a.getDescriptor(), i, 3);
                throw null;
            }
            this.f87324a = str;
            this.f87325b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackgroundMedia)) {
                return false;
            }
            BackgroundMedia backgroundMedia = (BackgroundMedia) obj2;
            return Intrinsics.f(this.f87324a, backgroundMedia.f87324a) && Intrinsics.f(this.f87325b, backgroundMedia.f87325b);
        }

        public final int hashCode() {
            return this.f87325b.hashCode() + (this.f87324a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87324a);
            dest.writeString(this.f87325b);
        }

        public BackgroundMedia(String darkUrl, String lightUrl) {
            Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
            Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
            this.f87324a = darkUrl;
            this.f87325b = lightUrl;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Content implements Parcelable {
        public static final Lazy[] i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Style f87329c;
        public final LayoutType d;
        public final String e;
        public final BackgroundMedia f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f87330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f87331h;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87332a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87332a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.Content", aVar, 8);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("closeable", false);
                pluginGeneratedSerialDescriptor.j("style", true);
                pluginGeneratedSerialDescriptor.j("layoutType", true);
                pluginGeneratedSerialDescriptor.j("description", false);
                pluginGeneratedSerialDescriptor.j("backgroundMedia", false);
                pluginGeneratedSerialDescriptor.j("actions", false);
                pluginGeneratedSerialDescriptor.j("footnote", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Content.i;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, h.f247648a, nlm.a.c(Style.a.f87335a), nlm.a.c((KSerializer) lazyArr[3].getValue()), v1Var, BackgroundMedia.a.f87326a, lazyArr[6].getValue(), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Content.i;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                Style style = null;
                LayoutType layoutType = null;
                String strDecodeStringElement2 = null;
                BackgroundMedia backgroundMedia = null;
                List list = null;
                String str = null;
                int i = 0;
                boolean zDecodeBooleanElement = false;
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
                            zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            style = (Style) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Style.a.f87335a, style);
                            i |= 4;
                            break;
                        case 3:
                            layoutType = (LayoutType) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), layoutType);
                            i |= 8;
                            break;
                        case 4:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                            break;
                        case 5:
                            backgroundMedia = (BackgroundMedia) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, BackgroundMedia.a.f87326a, backgroundMedia);
                            i |= 32;
                            break;
                        case 6:
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list);
                            i |= 64;
                            break;
                        case 7:
                            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str);
                            i |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Content(i, strDecodeStringElement, zDecodeBooleanElement, style, layoutType, strDecodeStringElement2, backgroundMedia, list, str);
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
                Lazy[] lazyArr = Content.i;
                String str = value.f87327a;
                String str2 = value.f87331h;
                LayoutType layoutType = value.d;
                Style style = value.f87329c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f87328b);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || style != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, Style.a.f87335a, style);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || layoutType != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), layoutType);
                }
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, BackgroundMedia.a.f87326a, value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f87330g);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str2);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$Content$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87332a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int iA = 0;
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                Style styleCreateFromParcel = parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel);
                LayoutType layoutTypeCreateFromParcel = parcel.readInt() != 0 ? LayoutType.CREATOR.createFromParcel(parcel) : null;
                String string2 = parcel.readString();
                BackgroundMedia backgroundMediaCreateFromParcel = BackgroundMedia.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList, iA, i);
                }
                return new Content(string, z, styleCreateFromParcel, layoutTypeCreateFromParcel, string2, backgroundMediaCreateFromParcel, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            i = new Lazy[]{null, null, null, j.c(kVar, new dce.b(29)), null, null, j.c(kVar, new dkd.a(0)), null};
        }

        public /* synthetic */ Content(int i2, String str, boolean z, Style style, LayoutType layoutType, String str2, BackgroundMedia backgroundMedia, List list, String str3) {
            if (115 != (i2 & ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG)) {
                j1.f(a.f87332a.getDescriptor(), i2, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                throw null;
            }
            this.f87327a = str;
            this.f87328b = z;
            if ((i2 & 4) == 0) {
                this.f87329c = null;
            } else {
                this.f87329c = style;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = layoutType;
            }
            this.e = str2;
            this.f = backgroundMedia;
            this.f87330g = list;
            if ((i2 & 128) == 0) {
                this.f87331h = null;
            } else {
                this.f87331h = str3;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LayoutType getD() {
            return this.d;
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
            return Intrinsics.f(this.f87327a, content.f87327a) && this.f87328b == content.f87328b && Intrinsics.f(this.f87329c, content.f87329c) && this.d == content.d && Intrinsics.f(this.e, content.e) && Intrinsics.f(this.f, content.f) && Intrinsics.f(this.f87330g, content.f87330g) && Intrinsics.f(this.f87331h, content.f87331h);
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f87327a.hashCode() * 31, 31, this.f87328b);
            Style style = this.f87329c;
            int iHashCode = (iC + (style == null ? 0 : style.hashCode())) * 31;
            LayoutType layoutType = this.d;
            int iD = p.a.d((this.f.hashCode() + p.a.c((iHashCode + (layoutType == null ? 0 : layoutType.hashCode())) * 31, 31, this.e)) * 31, 31, this.f87330g);
            String str = this.f87331h;
            return iD + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i2) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87327a);
            dest.writeInt(this.f87328b ? 1 : 0);
            Style style = this.f87329c;
            if (style == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                style.writeToParcel(dest, i2);
            }
            LayoutType layoutType = this.d;
            if (layoutType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                layoutType.writeToParcel(dest, i2);
            }
            dest.writeString(this.e);
            this.f.writeToParcel(dest, i2);
            Iterator itV = p.a.v(this.f87330g, dest);
            while (itV.hasNext()) {
                ((Action) itV.next()).writeToParcel(dest, i2);
            }
            dest.writeString(this.f87331h);
        }

        public Content(String title, boolean z, Style style, LayoutType layoutType, String description, BackgroundMedia backgroundMedia, ArrayList actions, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(backgroundMedia, "backgroundMedia");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f87327a = title;
            this.f87328b = z;
            this.f87329c = style;
            this.d = layoutType;
            this.e = description;
            this.f = backgroundMedia;
            this.f87330g = actions;
            this.f87331h = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$LayoutType;", "Landroid/os/Parcelable;", "", "Companion", "a", "THREE_D", "IN_APP", "STORY", "HERO", "MODAL_STORY", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final class LayoutType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;

        @NotNull
        private static final Lazy $cachedSerializer$delegate;

        @NotNull
        public static final Parcelable.Creator<LayoutType> CREATOR;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final LayoutType HERO;
        public static final LayoutType IN_APP;
        public static final LayoutType MODAL_STORY;
        public static final LayoutType STORY;
        public static final LayoutType THREE_D;

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$LayoutType$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) LayoutType.$cachedSerializer$delegate.getValue();
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return LayoutType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LayoutType[i];
            }
        }

        static {
            LayoutType layoutType = new LayoutType("THREE_D", 0);
            THREE_D = layoutType;
            LayoutType layoutType2 = new LayoutType("IN_APP", 1);
            IN_APP = layoutType2;
            LayoutType layoutType3 = new LayoutType("STORY", 2);
            STORY = layoutType3;
            LayoutType layoutType4 = new LayoutType("HERO", 3);
            HERO = layoutType4;
            LayoutType layoutType5 = new LayoutType("MODAL_STORY", 4);
            MODAL_STORY = layoutType5;
            LayoutType[] layoutTypeArr = {layoutType, layoutType2, layoutType3, layoutType4, layoutType5};
            $VALUES = layoutTypeArr;
            $ENTRIES = s.n(layoutTypeArr);
            INSTANCE = new Companion();
            CREATOR = new b();
            $cachedSerializer$delegate = j.c(k.PUBLICATION, new dkd.a(1));
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$Style;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Theme", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Style implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Theme f87334a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Style> CREATOR = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f87333b = {j.c(k.PUBLICATION, new dkd.a(2))};

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt$Style$Theme;", "Landroid/os/Parcelable;", "", "DARK", "LIGHT", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Theme implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Theme[] $VALUES;

            @NotNull
            public static final Parcelable.Creator<Theme> CREATOR;

            @r(names = {"DARK", "dark"})
            public static final Theme DARK;

            @r(names = {"LIGHT", "light"})
            public static final Theme LIGHT;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return Theme.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Theme[i];
                }
            }

            static {
                Theme theme = new Theme("DARK", 0);
                DARK = theme;
                Theme theme2 = new Theme("LIGHT", 1);
                LIGHT = theme2;
                Theme[] themeArr = {theme, theme2};
                $VALUES = themeArr;
                $ENTRIES = s.n(themeArr);
                CREATOR = new a();
            }

            public static Theme valueOf(String str) {
                return (Theme) Enum.valueOf(Theme.class, str);
            }

            public static Theme[] values() {
                return (Theme[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87335a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87335a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt.Style", aVar, 1);
                pluginGeneratedSerialDescriptor.j("theme", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c((KSerializer) Style.f87333b[0].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Style.f87333b;
                dVarBeginStructure.getClass();
                Theme theme = null;
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
                        theme = (Theme) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), theme);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Style(i, theme);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Style value = (Style) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Style.f87333b;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f87334a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f87334a);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$Style$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87335a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Style(parcel.readInt() == 0 ? null : Theme.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Style[i];
            }
        }

        public /* synthetic */ Style(int i, Theme theme) {
            if ((i & 1) == 0) {
                this.f87334a = null;
            } else {
                this.f87334a = theme;
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
            return (obj2 instanceof Style) && this.f87334a == ((Style) obj2).f87334a;
        }

        public final int hashCode() {
            Theme theme = this.f87334a;
            if (theme == null) {
                return 0;
            }
            return theme.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Theme theme = this.f87334a;
            if (theme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                theme.writeToParcel(dest, i);
            }
        }

        public Style(Theme theme) {
            this.f87334a = theme;
        }

        public Style() {
            this(null);
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87336a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f87336a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PROMPT", aVar, 2);
            pluginGeneratedSerialDescriptor.j("metaInformation", false);
            pluginGeneratedSerialDescriptor.j("content", false);
            Intrinsics.checkNotNullParameter("contentType", "discriminator");
            pluginGeneratedSerialDescriptor.l(new b());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{SlotPrompt.Meta.a.f87342a, Content.a.f87332a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            SlotPrompt.Meta meta = null;
            boolean z = true;
            int i = 0;
            Content content = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    meta = (SlotPrompt.Meta) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SlotPrompt.Meta.a.f87342a, meta);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    content = (Content) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, Content.a.f87332a, content);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new SlotDefaultPrompt(i, meta, content);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            SlotDefaultPrompt value = (SlotDefaultPrompt) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, SlotPrompt.Meta.a.f87342a, value.f87319a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, Content.a.f87332a, value.f87320b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f87336a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotDefaultPrompt(SlotPrompt.Meta.CREATOR.createFromParcel(parcel), Content.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotDefaultPrompt[i];
        }
    }

    public /* synthetic */ SlotDefaultPrompt(int i, SlotPrompt.Meta meta, Content content) {
        if (3 != (i & 3)) {
            j1.f(a.f87336a.getDescriptor(), i, 3);
            throw null;
        }
        this.f87319a = meta;
        this.f87320b = content;
    }

    @Override // com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt
    /* JADX INFO: renamed from: H, reason: from getter */
    public final SlotPrompt.Meta getF87319a() {
        return this.f87319a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Content getF87320b() {
        return this.f87320b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotDefaultPrompt)) {
            return false;
        }
        SlotDefaultPrompt slotDefaultPrompt = (SlotDefaultPrompt) obj2;
        return Intrinsics.f(this.f87319a, slotDefaultPrompt.f87319a) && Intrinsics.f(this.f87320b, slotDefaultPrompt.f87320b);
    }

    public final int hashCode() {
        return this.f87320b.hashCode() + (this.f87319a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87319a.writeToParcel(dest, i);
        this.f87320b.writeToParcel(dest, i);
    }

    public SlotDefaultPrompt(SlotPrompt.Meta meta, Content content) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f87319a = meta;
        this.f87320b = content;
    }
}
