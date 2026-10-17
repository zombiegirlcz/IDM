package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import du7.u0;
import gu7.s4;
import gu7.t4;
import gu7.u4;
import gu7.v4;
import gu7.w4;
import gu7.x4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f138110a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f138111b = u0.Companion.serializer().getDescriptor();

    private d() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        v4 v4Var;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        u0 u0Var = (u0) decoder.b(u0.Companion.serializer());
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        try {
            String str = u0Var.f117860a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            v4[] v4VarArrValues = v4.values();
            int length = v4VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    v4Var = null;
                    break;
                }
                v4Var = v4VarArrValues[i2];
                if (a0.z(v4Var.name(), str, true)) {
                    break;
                }
                i2++;
            }
            i = v4Var == null ? -1 : c.f138109a[v4Var.ordinal()];
        } catch (Throwable unused) {
        }
        if (i == 1) {
            String str2 = u0Var.f117861b;
            if (str2 != null) {
                return new t4(str2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (i == 2) {
            String str3 = u0Var.f117862c;
            if (str3 != null) {
                return new x4(str3);
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (i == 3) {
            String str4 = u0Var.d;
            if (str4 != null) {
                return new u4(str4);
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (i == 4) {
            List list = u0Var.e;
            if (list == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SchemeInsurancePortal schemeInsurancePortal = u0Var.f;
            if (schemeInsurancePortal != null) {
                return new s4(list, schemeInsurancePortal);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return w4.a.f146856a;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f138111b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u0 u0Var;
        w4 value = (w4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerSerializer = u0.Companion.serializer();
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value instanceof t4) {
            u0Var = new u0("DIAL", ((t4) value).f146836a, (String) null, (String) null, (List) null, (SchemeInsurancePortal) null, 60);
        } else if (value instanceof u4) {
            u0Var = new u0("EMAIL", (String) null, (String) null, ((u4) value).f146843a, (List) null, (SchemeInsurancePortal) null, 54);
        } else if (value instanceof x4) {
            u0Var = new u0("WEBPAGE", (String) null, ((x4) value).f146867a, (String) null, (List) null, (SchemeInsurancePortal) null, 58);
        } else if (value instanceof w4.a) {
            u0Var = new u0("UNKNOWN", (String) null, (String) null, (String) null, (List) null, (SchemeInsurancePortal) null, 62);
        } else {
            if (!(value instanceof s4)) {
                throw new NoWhenBranchMatchedException();
            }
            s4 s4Var = (s4) value;
            u0Var = new u0("CLAIMS_VIA_CARD", (String) null, (String) null, (String) null, s4Var.f146831a, s4Var.f146832b, 14);
        }
        encoder.encodeSerializableValue(kSerializerSerializer, u0Var);
    }
}
