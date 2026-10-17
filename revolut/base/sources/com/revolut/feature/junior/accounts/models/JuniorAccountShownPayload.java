package com.revolut.feature.junior.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorAccountShownPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorPayload;", "<init>", "()V", "GraduationPendingDialog", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountShownPayload$GraduationPendingDialog;", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAccountShownPayload implements JuniorPayload {
    private JuniorAccountShownPayload() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorAccountShownPayload$GraduationPendingDialog;", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountShownPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class GraduationPendingDialog extends JuniorAccountShownPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76712a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<GraduationPendingDialog> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76713a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76713a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("graduationPendingDialog", aVar, 1);
                pluginGeneratedSerialDescriptor.j("juniorId", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior.accounts.models.a());
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
                return new GraduationPendingDialog(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                GraduationPendingDialog value = (GraduationPendingDialog) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76712a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload$GraduationPendingDialog$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76713a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GraduationPendingDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GraduationPendingDialog[i];
            }
        }

        public GraduationPendingDialog(int i, String str) {
            if (1 == (i & 1)) {
                this.f76712a = str;
            } else {
                j1.f(a.f76713a.getDescriptor(), i, 1);
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
            return (obj2 instanceof GraduationPendingDialog) && Intrinsics.f(this.f76712a, ((GraduationPendingDialog) obj2).f76712a);
        }

        public final int hashCode() {
            return this.f76712a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76712a);
        }

        public GraduationPendingDialog(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f76712a = juniorId;
        }
    }
}
