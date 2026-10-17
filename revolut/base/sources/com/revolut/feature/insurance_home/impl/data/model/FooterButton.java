package com.revolut.feature.insurance_home.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Action", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class FooterButton implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Action f76175b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<FooterButton> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f76173c = {null, j.c(k.PUBLICATION, new lv4.b(7))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "PlanUpgrade", "Upgrade", "a", "Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action$PlanUpgrade;", "Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action$Upgrade;", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @rlm.g(discriminator = "type")
    @g
    public static abstract class Action implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f76176a = j.c(k.PUBLICATION, new lv4.b(8));

        /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.FooterButton$Action$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) Action.f76176a.getValue();
            }
        }

        private Action() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action$PlanUpgrade;", "Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class PlanUpgrade extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f76177b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<PlanUpgrade> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f76178a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f76178a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PLAN_UPGRADE", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("planId", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_home.impl.data.model.a());
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
                    return new PlanUpgrade(i, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    PlanUpgrade value = (PlanUpgrade) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76177b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.FooterButton$Action$PlanUpgrade$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f76178a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PlanUpgrade(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PlanUpgrade[i];
                }
            }

            public /* synthetic */ PlanUpgrade(int i, String str) {
                if (1 == (i & 1)) {
                    this.f76177b = str;
                } else {
                    j1.f(a.f76178a.getDescriptor(), i, 1);
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
                return (obj2 instanceof PlanUpgrade) && Intrinsics.f(this.f76177b, ((PlanUpgrade) obj2).f76177b);
            }

            public final int hashCode() {
                return this.f76177b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76177b);
            }

            public PlanUpgrade(String planId) {
                Intrinsics.checkNotNullParameter(planId, "planId");
                this.f76177b = planId;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action$Upgrade;", "Lcom/revolut/feature/insurance_home/impl/data/model/FooterButton$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Upgrade extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f76179b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f76180c;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Upgrade> CREATOR = new c();
            public static final Lazy[] d = {j.c(k.PUBLICATION, new lv4.b(9)), null};

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f76181a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f76181a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("planIds", false);
                    pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_home.impl.data.model.a());
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
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) Upgrade.d[0].getValue(), value.f76179b);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76180c);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.FooterButton$Action$Upgrade$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f76181a;
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
                    j1.f(a.f76181a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f76179b = list;
                this.f76180c = str;
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
                return Intrinsics.f(this.f76179b, upgrade.f76179b) && Intrinsics.f(this.f76180c, upgrade.f76180c);
            }

            public final int hashCode() {
                return this.f76180c.hashCode() + (this.f76179b.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeStringList(this.f76179b);
                dest.writeString(this.f76180c);
            }

            public Upgrade(String selectedPlanId, ArrayList planIds) {
                Intrinsics.checkNotNullParameter(planIds, "planIds");
                Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
                this.f76179b = planIds;
                this.f76180c = selectedPlanId;
            }
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76182a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f76182a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.FooterButton", aVar, 2);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("action", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, FooterButton.f76173c[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = FooterButton.f76173c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            Action action = null;
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
                    action = (Action) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), action);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new FooterButton(i, strDecodeStringElement, action);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            FooterButton value = (FooterButton) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = FooterButton.f76173c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76174a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f76175b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.FooterButton$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f76182a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FooterButton(parcel.readString(), (Action) parcel.readParcelable(FooterButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FooterButton[i];
        }
    }

    public /* synthetic */ FooterButton(int i, String str, Action action) {
        if (3 != (i & 3)) {
            j1.f(a.f76182a.getDescriptor(), i, 3);
            throw null;
        }
        this.f76174a = str;
        this.f76175b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FooterButton)) {
            return false;
        }
        FooterButton footerButton = (FooterButton) obj2;
        return Intrinsics.f(this.f76174a, footerButton.f76174a) && Intrinsics.f(this.f76175b, footerButton.f76175b);
    }

    public final int hashCode() {
        return this.f76175b.hashCode() + (this.f76174a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76174a);
        dest.writeParcelable(this.f76175b, i);
    }

    public FooterButton(String title, Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f76174a = title;
        this.f76175b = action;
    }
}
