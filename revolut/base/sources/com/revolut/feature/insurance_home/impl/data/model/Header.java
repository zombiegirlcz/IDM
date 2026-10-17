package com.revolut.feature.insurance_home.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Header;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Subtitle", "Button", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class Header implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subtitle f76184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76185b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Header> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f76183c = {null, j.c(k.PUBLICATION, new lv4.b(10))};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Header$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Action", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Button implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76188c;
        public final Action d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new c();
        public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new lv4.b(11))};

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Header$Button$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Upgrade", "a", "Lcom/revolut/feature/insurance_home/impl/data/model/Header$Button$Action$Upgrade;", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @rlm.g(discriminator = "type")
        @g
        public static abstract class Action implements Parcelable {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f76189a = j.c(k.PUBLICATION, new lv4.b(12));

            /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Header$Button$Action$a, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
                @NotNull
                public final KSerializer serializer() {
                    return (KSerializer) Action.f76189a.getValue();
                }
            }

            private Action() {
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Header$Button$Action$Upgrade;", "Lcom/revolut/feature/insurance_home/impl/data/model/Header$Button$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @g
            public static final /* data */ class Upgrade extends Action {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f76190b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f76191c;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();

                @NotNull
                public static final Parcelable.Creator<Upgrade> CREATOR = new c();
                public static final Lazy[] d = {j.c(k.PUBLICATION, new lv4.b(13)), null};

                public static final /* synthetic */ class a implements f0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f76192a;

                    @NotNull
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        f76192a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("planIds", false);
                        pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                        pluginGeneratedSerialDescriptor.l(new b());
                        descriptor = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // qlm.f0
                    public final KSerializer[] childSerializers() {
                        return new KSerializer[]{Upgrade.d[0].getValue(), v1.f247718a};
                    }

                    @Override // mlm.b
                    public final Object deserialize(Decoder decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        SerialDescriptor serialDescriptor = descriptor;
                        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                        Lazy[] lazyArr = Upgrade.d;
                        dVarBeginStructure.getClass();
                        List list = null;
                        boolean z = true;
                        int i = 0;
                        String strDecodeStringElement = null;
                        while (z) {
                            int iD = dVarBeginStructure.d(serialDescriptor);
                            if (iD == -1) {
                                z = false;
                            } else if (iD == 0) {
                                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                                i |= 1;
                            } else {
                                if (iD != 1) {
                                    throw new UnknownFieldException(iD);
                                }
                                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                                i |= 2;
                            }
                        }
                        dVarBeginStructure.endStructure(serialDescriptor);
                        return new Upgrade(i, list, strDecodeStringElement);
                    }

                    @Override // mlm.h, mlm.b
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // mlm.h
                    public final void serialize(Encoder encoder, Object obj2) {
                        Upgrade value = (Upgrade) obj2;
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        SerialDescriptor serialDescriptor = descriptor;
                        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) Upgrade.d[0].getValue(), value.f76190b);
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76191c);
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                }

                /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Header$Button$Action$Upgrade$b, reason: from kotlin metadata */
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return a.f76192a;
                    }
                }

                public static final class c implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Upgrade(parcel.readString(), parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Upgrade[i];
                    }
                }

                public /* synthetic */ Upgrade(int i, List list, String str) {
                    if (3 != (i & 3)) {
                        j1.f(a.f76192a.getDescriptor(), i, 3);
                        throw null;
                    }
                    this.f76190b = list;
                    this.f76191c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Upgrade)) {
                        return false;
                    }
                    Upgrade upgrade = (Upgrade) obj2;
                    return Intrinsics.f(this.f76190b, upgrade.f76190b) && Intrinsics.f(this.f76191c, upgrade.f76191c);
                }

                public final int hashCode() {
                    return this.f76191c.hashCode() + (this.f76190b.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeStringList(this.f76190b);
                    dest.writeString(this.f76191c);
                }

                public Upgrade(String selectedPlanId, ArrayList planIds) {
                    Intrinsics.checkNotNullParameter(planIds, "planIds");
                    Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
                    this.f76190b = planIds;
                    this.f76191c = selectedPlanId;
                }
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76193a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76193a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.Header.Button", aVar, 4);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("accessibilityLabel", false);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("action", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Button.e;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[3].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Button.e;
                dVarBeginStructure.getClass();
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                Action action = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else if (iD == 2) {
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        action = (Action) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), action);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Button(i, str, str2, str3, action);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Button value = (Button) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Button.e;
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f76186a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f76187b);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f76188c);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), value.d);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Header$Button$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76193a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public /* synthetic */ Button(int i, String str, String str2, String str3, Action action) {
            if (15 != (i & 15)) {
                j1.f(a.f76193a.getDescriptor(), i, 15);
                throw null;
            }
            this.f76186a = str;
            this.f76187b = str2;
            this.f76188c = str3;
            this.d = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f76186a, button.f76186a) && Intrinsics.f(this.f76187b, button.f76187b) && Intrinsics.f(this.f76188c, button.f76188c) && Intrinsics.f(this.d, button.d);
        }

        public final int hashCode() {
            String str = this.f76186a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f76187b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f76188c;
            return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76186a);
            dest.writeString(this.f76187b);
            dest.writeString(this.f76188c);
            dest.writeParcelable(this.d, i);
        }

        public Button(String str, String str2, String str3, Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f76186a = str;
            this.f76187b = str2;
            this.f76188c = str3;
            this.d = action;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Header$Subtitle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Subtitle implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76195b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Subtitle> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76196a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76196a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.Header.Subtitle", aVar, 2);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("text", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                String str2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Subtitle(i, str, str2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Subtitle value = (Subtitle) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f76194a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f76195b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Header$Subtitle$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76196a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subtitle(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subtitle[i];
            }
        }

        public /* synthetic */ Subtitle(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f76196a.getDescriptor(), i, 3);
                throw null;
            }
            this.f76194a = str;
            this.f76195b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj2;
            return Intrinsics.f(this.f76194a, subtitle.f76194a) && Intrinsics.f(this.f76195b, subtitle.f76195b);
        }

        public final int hashCode() {
            String str = this.f76194a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f76195b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76194a);
            dest.writeString(this.f76195b);
        }

        public Subtitle(String str, String str2) {
            this.f76194a = str;
            this.f76195b = str2;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76197a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f76197a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.Header", aVar, 2);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("buttons", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(Subtitle.a.f76196a), nlm.a.c((KSerializer) Header.f76183c[1].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Header.f76183c;
            dVarBeginStructure.getClass();
            Subtitle subtitle = null;
            boolean z = true;
            int i = 0;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    subtitle = (Subtitle) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Subtitle.a.f76196a, subtitle);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Header(i, subtitle, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            Header value = (Header) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Header.f76183c;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, Subtitle.a.f76196a, value.f76184a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f76185b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Header$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f76197a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            Subtitle subtitleCreateFromParcel = parcel.readInt() == 0 ? null : Subtitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Button.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new Header(subtitleCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Header[i];
        }
    }

    public /* synthetic */ Header(int i, Subtitle subtitle, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f76197a.getDescriptor(), i, 3);
            throw null;
        }
        this.f76184a = subtitle;
        this.f76185b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Header)) {
            return false;
        }
        Header header = (Header) obj2;
        return Intrinsics.f(this.f76184a, header.f76184a) && Intrinsics.f(this.f76185b, header.f76185b);
    }

    public final int hashCode() {
        Subtitle subtitle = this.f76184a;
        int iHashCode = (subtitle == null ? 0 : subtitle.hashCode()) * 31;
        List list = this.f76185b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Subtitle subtitle = this.f76184a;
        if (subtitle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subtitle.writeToParcel(dest, i);
        }
        List list = this.f76185b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((Button) itQ.next()).writeToParcel(dest, i);
        }
    }

    public Header(Subtitle subtitle, ArrayList arrayList) {
        this.f76184a = subtitle;
        this.f76185b = arrayList;
    }
}
