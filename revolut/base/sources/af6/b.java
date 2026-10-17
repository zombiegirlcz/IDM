package af6;

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
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0007\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Laf6/b;", "", "", "toString", "()Ljava/lang/String;", "", "Laf6/a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "popularInstitutions", "otherInstitutions", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f3915c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("popularInstitutions")
    @NotNull
    private final List<af6.a> popularInstitutions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("otherInstitutions")
    @NotNull
    private final List<af6.a> otherInstitutions;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3918a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f3918a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.cross_border.entity.CrossBorderExternalInstitutionsEntity", aVar, 2);
            pluginGeneratedSerialDescriptor.j("popularInstitutions", false);
            pluginGeneratedSerialDescriptor.j("otherInstitutions", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b.f3915c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.f3915c;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            List list2 = null;
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
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(list, i, list2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: af6.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f3918a;
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f3915c = new Lazy[]{j.c(kVar, new a92.d(20)), j.c(kVar, new a92.d(21))};
    }

    public b(ArrayList popularInstitutions, ArrayList otherInstitutions) {
        Intrinsics.checkNotNullParameter(popularInstitutions, "popularInstitutions");
        Intrinsics.checkNotNullParameter(otherInstitutions, "otherInstitutions");
        this.popularInstitutions = popularInstitutions;
        this.otherInstitutions = otherInstitutions;
    }

    public static final /* synthetic */ void c(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Lazy[] lazyArr = f3915c;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), bVar.popularInstitutions);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), bVar.otherInstitutions);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getOtherInstitutions() {
        return this.otherInstitutions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPopularInstitutions() {
        return this.popularInstitutions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.popularInstitutions, bVar.popularInstitutions) && Intrinsics.f(this.otherInstitutions, bVar.otherInstitutions);
    }

    public final int hashCode() {
        return this.otherInstitutions.hashCode() + (this.popularInstitutions.hashCode() * 31);
    }

    public /* synthetic */ b(List list, int i, List list2) {
        if (3 != (i & 3)) {
            j1.f(a.f3918a.getDescriptor(), i, 3);
            throw null;
        }
        this.popularInstitutions = list;
        this.otherInstitutions = list2;
    }
}
