package com.fourthline.orca.internal;

import com.fourthline.orca.internal.iz;
import com.fourthline.orca.internal.t5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 32\u00020\u0001:\u0002#\u0019B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBY\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0007\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u0019\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u0011\u00102\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/fourthline/orca/internal/c4;", "Lcom/fourthline/orca/internal/ny;", "Lcom/fourthline/orca/internal/iz;", "bavStrategy", "", "Lcom/fourthline/orca/internal/t5;", "paymentMethods", "<init>", "(Lcom/fourthline/orca/internal/iz;Ljava/util/List;)V", "", "seen0", "Lcom/fourthline/orca/internal/c7;", "initialStatus", "", "redirectUrl", "supportedPaymentMethods", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/iz;Ljava/util/List;Lcom/fourthline/orca/internal/c7;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/c4;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "url", "(Ljava/lang/String;)V", "Lcom/fourthline/orca/internal/z3;", "j", "()Lcom/fourthline/orca/internal/z3;", "Lcom/fourthline/orca/internal/iz;", "f", "()Lcom/fourthline/orca/internal/iz;", "b", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "c", "Lcom/fourthline/orca/internal/c7;", "g", "()Lcom/fourthline/orca/internal/c7;", "(Lcom/fourthline/orca/internal/c7;)V", "d", "Ljava/lang/String;", "e", "i", "h", "()Ljava/lang/String;", "redirectUrlWithDeepLink", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class c4 implements ny {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Lazy[] f27354g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iz bavStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List paymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c7 initialStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String redirectUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List supportedPaymentMethods;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27359b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27358a = aVar;
            f27359b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.BavFlowConfig", aVar, 5);
            pluginGeneratedSerialDescriptor.j("bavStrategy", true);
            pluginGeneratedSerialDescriptor.j("paymentMethods", false);
            pluginGeneratedSerialDescriptor.j("initialStatus", true);
            pluginGeneratedSerialDescriptor.j("redirectUrl", true);
            pluginGeneratedSerialDescriptor.j("supportedPaymentMethods", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c4.f27354g;
            dVarBeginStructure.getClass();
            int i = 0;
            iz izVar = null;
            List list = null;
            c7 c7Var = null;
            String str = null;
            List list2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    izVar = (iz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, iz.a.f29760a, izVar);
                    i |= 1;
                } else if (iD == 1) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                } else if (iD == 2) {
                    c7Var = (c7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), c7Var);
                    i |= 4;
                } else if (iD == 3) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list2);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c4(i, izVar, list, c7Var, str, list2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c4.f27354g;
            return new KSerializer[]{iz.a.f29760a, lazyArr[1].getValue(), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c(qlm.v1.f247718a), lazyArr[4].getValue()};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, c4 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c4.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c4$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27358a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f27354g = new Lazy[]{null, yhm.j.c(kVar, new pj1(8)), yhm.j.c(kVar, new pj1(9)), null, yhm.j.c(kVar, new pj1(10))};
    }

    public /* synthetic */ c4(int i, iz izVar, List list, c7 c7Var, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        ArrayList arrayList;
        if (2 != (i & 2)) {
            qlm.j1.f(a.f27358a.getDescriptor(), i, 2);
            throw null;
        }
        this.bavStrategy = (i & 1) == 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar;
        this.paymentMethods = list;
        if ((i & 4) == 0) {
            this.initialStatus = null;
        } else {
            this.initialStatus = c7Var;
        }
        if ((i & 8) == 0) {
            this.redirectUrl = null;
        } else {
            this.redirectUrl = str;
        }
        if ((i & 16) != 0) {
            this.supportedPaymentMethods = list2;
            return;
        }
        if (lh0.f30621a.d()) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((t5) obj2).getName() != v6.d) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((t5) obj3).getName() == v6.f34254b) {
                    arrayList.add(obj3);
                }
            }
        }
        this.supportedPaymentMethods = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(t5.a.f33201a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return qlm.j1.b("com.fourthline.orca.core.internal.backend.model.BavVerificationStatus", c7.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return new qlm.e(t5.a.f33201a);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final iz getBavStrategy() {
        return this.bavStrategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c7 getInitialStatus() {
        return this.initialStatus;
    }

    public final String h() {
        return this.redirectUrl + "&redirect=fourthline://orca/bav_status/success&redirectFailure=fourthline://orca/bav_status/failure";
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getSupportedPaymentMethods() {
        return this.supportedPaymentMethods;
    }

    @Override // com.fourthline.orca.internal.ny
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public z3 a() {
        return new z3(this);
    }

    public static final /* synthetic */ void a(c4 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        ArrayList arrayList;
        Lazy[] lazyArr = f27354g;
        if (output.d(serialDesc) || !Intrinsics.f(self.bavStrategy, new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, iz.a.f29760a, self.bavStrategy);
        }
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.paymentMethods);
        if (output.d(serialDesc) || self.initialStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.initialStatus);
        }
        if (output.d(serialDesc) || self.redirectUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, qlm.v1.f247718a, self.redirectUrl);
        }
        if (!output.d(serialDesc)) {
            List list = self.supportedPaymentMethods;
            if (lh0.f30621a.d()) {
                List list2 = self.paymentMethods;
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((t5) obj2).getName() != v6.d) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                List list3 = self.paymentMethods;
                arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (((t5) obj3).getName() == v6.f34254b) {
                        arrayList.add(obj3);
                    }
                }
            }
            if (Intrinsics.f(list, arrayList)) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.supportedPaymentMethods);
    }

    public c4(iz bavStrategy, List paymentMethods) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(bavStrategy, "bavStrategy");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.bavStrategy = bavStrategy;
        this.paymentMethods = paymentMethods;
        if (lh0.f30621a.d()) {
            arrayList = new ArrayList();
            for (Object obj2 : paymentMethods) {
                if (((t5) obj2).getName() != v6.d) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : paymentMethods) {
                if (((t5) obj3).getName() == v6.f34254b) {
                    arrayList.add(obj3);
                }
            }
        }
        this.supportedPaymentMethods = arrayList;
    }

    public final void a(c7 c7Var) {
        this.initialStatus = c7Var;
    }

    public final void a(String url2) {
        this.redirectUrl = url2;
    }

    public /* synthetic */ c4(iz izVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : izVar, list);
    }
}
