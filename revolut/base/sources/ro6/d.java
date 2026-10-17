package ro6;

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
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lro6/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "foldable", "b", "Ljava/lang/String;", "foldableTitle", "c", "d", "sectionTitle", "", "Lro6/e;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Companion", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new rm0.k(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("foldable")
    private final boolean foldable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("foldableTitle")
    private final String foldableTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectionTitle")
    private final String sectionTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<e> items;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f255900a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f255900a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.models.open_banking_brazil.entity.BrazilInboundInfoGroupEntity", aVar, 4);
            pluginGeneratedSerialDescriptor.j("foldable", false);
            pluginGeneratedSerialDescriptor.j("foldableTitle", false);
            pluginGeneratedSerialDescriptor.j("sectionTitle", false);
            pluginGeneratedSerialDescriptor.j("items", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = d.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{h.f247648a, nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[3].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.e;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String str = null;
            String str2 = null;
            List list = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, zDecodeBooleanElement, str, str2, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d value = (d) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            d.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ro6.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f255900a;
        }
    }

    public /* synthetic */ d(int i, boolean z, String str, String str2, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f255900a.getDescriptor(), i, 15);
            throw null;
        }
        this.foldable = z;
        this.foldableTitle = str;
        this.sectionTitle = str2;
        this.items = list;
    }

    public static final /* synthetic */ void e(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, dVar.foldable);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, dVar.foldableTitle);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, dVar.sectionTitle);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, (mlm.h) e[3].getValue(), dVar.items);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFoldable() {
        return this.foldable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFoldableTitle() {
        return this.foldableTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.foldable == dVar.foldable && Intrinsics.f(this.foldableTitle, dVar.foldableTitle) && Intrinsics.f(this.sectionTitle, dVar.sectionTitle) && Intrinsics.f(this.items, dVar.items);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.foldable) * 31;
        String str = this.foldableTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionTitle;
        return this.items.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public d(String str, String str2, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.foldable = z;
        this.foldableTitle = str;
        this.sectionTitle = str2;
        this.items = items;
    }
}
