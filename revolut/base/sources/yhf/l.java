package yhf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0003\r\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"Lyhf/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getStage", "stage", "b", "getStatus", "status", "", "c", "Ljava/lang/Long;", "getCompletedDate", "()Ljava/lang/Long;", "completedDate", "Lyhf/l$c;", "d", "Lyhf/l$c;", "getEstimatedCompletion", "()Lyhf/l$c;", "estimatedCompletion", "e", "getLocalisedNote", "localisedNote", "f", "getLocalisedTitle", "localisedTitle", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stage")
    private final String stage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final Long completedDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimatedCompletion")
    private final c estimatedCompletion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("localisedNote")
    private final String localisedNote;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("localisedTitle")
    private final String localisedTitle;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314029a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314029a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.PaymentTrackingStepDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("stage", true);
            pluginGeneratedSerialDescriptor.j("status", true);
            pluginGeneratedSerialDescriptor.j("completedDate", true);
            pluginGeneratedSerialDescriptor.j("estimatedCompletion", true);
            pluginGeneratedSerialDescriptor.j("localisedNote", true);
            pluginGeneratedSerialDescriptor.j("localisedTitle", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0.f247706a), nlm.a.c(c.a.f314032a), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            Long l2 = null;
            c cVar = null;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                        break;
                    case 2:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t0.f247706a, l2);
                        i |= 4;
                        break;
                    case 3:
                        cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, c.a.f314032a, cVar);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                        break;
                    case 5:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l(i, str, str2, l2, cVar, str3, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            l value = (l) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            l.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314029a;
        }
    }

    public l() {
        this.stage = null;
        this.status = null;
        this.completedDate = null;
        this.estimatedCompletion = null;
        this.localisedNote = null;
        this.localisedTitle = null;
    }

    public static final /* synthetic */ void g(l lVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.d(serialDescriptor) || lVar.stage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, lVar.stage);
        }
        if (compositeEncoder.d(serialDescriptor) || lVar.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, lVar.status);
        }
        if (compositeEncoder.d(serialDescriptor) || lVar.completedDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, t0.f247706a, lVar.completedDate);
        }
        if (compositeEncoder.d(serialDescriptor) || lVar.estimatedCompletion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, c.a.f314032a, lVar.estimatedCompletion);
        }
        if (compositeEncoder.d(serialDescriptor) || lVar.localisedNote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, lVar.localisedNote);
        }
        if (!compositeEncoder.d(serialDescriptor) && lVar.localisedTitle == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, lVar.localisedTitle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCompletedDate() {
        return this.completedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getEstimatedCompletion() {
        return this.estimatedCompletion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLocalisedNote() {
        return this.localisedNote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.stage, lVar.stage) && Intrinsics.f(this.status, lVar.status) && Intrinsics.f(this.completedDate, lVar.completedDate) && Intrinsics.f(this.estimatedCompletion, lVar.estimatedCompletion) && Intrinsics.f(this.localisedNote, lVar.localisedNote) && Intrinsics.f(this.localisedTitle, lVar.localisedTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLocalisedTitle() {
        return this.localisedTitle;
    }

    public final int hashCode() {
        String str = this.stage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.completedDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        c cVar = this.estimatedCompletion;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.localisedNote;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localisedTitle;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lyhf/l$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "date", "b", "time", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        private final String date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("time")
        private final String time;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f314032a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f314032a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.PaymentTrackingStepDto.EstimatedCompletion", aVar, 2);
                pluginGeneratedSerialDescriptor.j("date", true);
                pluginGeneratedSerialDescriptor.j("time", true);
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
                return new c(i, str, str2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                c value = (c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: yhf.l$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f314032a;
            }
        }

        public c() {
            this.date = null;
            this.time = null;
        }

        public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.d(serialDescriptor) || cVar.date != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, cVar.date);
            }
            if (!compositeEncoder.d(serialDescriptor) && cVar.time == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, cVar.time);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.date, cVar.date) && Intrinsics.f(this.time, cVar.time);
        }

        public final int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.time;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public /* synthetic */ c(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.date = null;
            } else {
                this.date = str;
            }
            if ((i & 2) == 0) {
                this.time = null;
            } else {
                this.time = str2;
            }
        }
    }

    public /* synthetic */ l(int i, String str, String str2, Long l2, c cVar, String str3, String str4) {
        if ((i & 1) == 0) {
            this.stage = null;
        } else {
            this.stage = str;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.completedDate = null;
        } else {
            this.completedDate = l2;
        }
        if ((i & 8) == 0) {
            this.estimatedCompletion = null;
        } else {
            this.estimatedCompletion = cVar;
        }
        if ((i & 16) == 0) {
            this.localisedNote = null;
        } else {
            this.localisedNote = str3;
        }
        if ((i & 32) == 0) {
            this.localisedTitle = null;
        } else {
            this.localisedTitle = str4;
        }
    }
}
