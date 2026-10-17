package ye;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.firebase.encoders.EncodingException;
import icm.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ve.d {
    public static final Charset f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.b f312731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.b f312732h;
    public static final xe.a i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f312733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f312734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f312735c;
    public final ve.c d;
    public final i e = new i(this);

    static {
        m mVarB = m.b();
        mVarB.f160342a = 1;
        f312731g = new ve.b("key", v0.a.r(v0.a.p(e.class, mVarB.a())));
        m mVarB2 = m.b();
        mVarB2.f160342a = 2;
        f312732h = new ve.b("value", v0.a.r(v0.a.p(e.class, mVarB2.a())));
        i = new xe.a(1);
    }

    public g(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ve.c cVar) {
        this.f312733a = byteArrayOutputStream;
        this.f312734b = map;
        this.f312735c = map2;
        this.d = cVar;
    }

    public static int f(ve.b bVar) {
        e eVar = (e) bVar.b(e.class);
        if (eVar != null) {
            return ((a) eVar).f312727a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(ve.b bVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        g((f(bVar) << 3) | 1);
        this.f312733a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, Object obj2) {
        d(bVar, obj2, true);
        return this;
    }

    public final void b(ve.b bVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        e eVar = (e) bVar.b(e.class);
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = f.f312730a;
        a aVar = (a) eVar;
        int i3 = aVar.f312727a;
        int i5 = iArr[aVar.f312728b.ordinal()];
        if (i5 == 1) {
            g(i3 << 3);
            g(i2);
        } else if (i5 == 2) {
            g(i3 << 3);
            g((i2 << 1) ^ (i2 >> 31));
        } else {
            if (i5 != 3) {
                return;
            }
            g((i3 << 3) | 5);
            this.f312733a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(ve.b bVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return;
        }
        e eVar = (e) bVar.b(e.class);
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = f.f312730a;
        a aVar = (a) eVar;
        int i2 = aVar.f312727a;
        int i3 = iArr[aVar.f312728b.ordinal()];
        if (i3 == 1) {
            g(i2 << 3);
            h(j2);
        } else if (i3 == 2) {
            g(i2 << 3);
            h((j2 >> 63) ^ (j2 << 1));
        } else {
            if (i3 != 3) {
                return;
            }
            g((i2 << 3) | 1);
            this.f312733a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j2).array());
        }
    }

    public final void d(ve.b bVar, Object obj2, boolean z) {
        if (obj2 == null) {
            return;
        }
        if (obj2 instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj2;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.f312733a.write(bytes);
            return;
        }
        if (obj2 instanceof Collection) {
            Iterator it8 = ((Collection) obj2).iterator();
            while (it8.hasNext()) {
                d(bVar, it8.next(), false);
            }
            return;
        }
        if (obj2 instanceof Map) {
            Iterator it9 = ((Map) obj2).entrySet().iterator();
            while (it9.hasNext()) {
                e(i, bVar, (Map.Entry) it9.next(), false);
            }
            return;
        }
        if (obj2 instanceof Double) {
            a(bVar, ((Double) obj2).doubleValue(), z);
            return;
        }
        if (obj2 instanceof Float) {
            float fFloatValue = ((Float) obj2).floatValue();
            if (z && fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            g((f(bVar) << 3) | 5);
            this.f312733a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj2 instanceof Number) {
            c(bVar, ((Number) obj2).longValue(), z);
            return;
        }
        if (obj2 instanceof Boolean) {
            b(bVar, ((Boolean) obj2).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            g(bArr.length);
            this.f312733a.write(bArr);
            return;
        }
        ve.c cVar = (ve.c) this.f312734b.get(obj2.getClass());
        if (cVar != null) {
            e(cVar, bVar, obj2, z);
            return;
        }
        ve.e eVar = (ve.e) this.f312735c.get(obj2.getClass());
        if (eVar != null) {
            i iVar = this.e;
            iVar.f312737a = false;
            iVar.f312739c = bVar;
            iVar.f312738b = z;
            eVar.encode(obj2, iVar);
            return;
        }
        if (obj2 instanceof c) {
            b(bVar, ((c) obj2).getNumber(), true);
        } else if (obj2 instanceof Enum) {
            b(bVar, ((Enum) obj2).ordinal(), true);
        } else {
            e(this.d, bVar, obj2, z);
        }
    }

    public final void e(ve.c cVar, ve.b bVar, Object obj2, boolean z) throws IOException {
        b bVar2 = new b();
        bVar2.f312729a = 0L;
        try {
            OutputStream outputStream = this.f312733a;
            this.f312733a = bVar2;
            try {
                cVar.encode(obj2, this);
                this.f312733a = outputStream;
                long j2 = bVar2.f312729a;
                bVar2.close();
                if (z && j2 == 0) {
                    return;
                }
                g((f(bVar) << 3) | 2);
                h(j2);
                cVar.encode(obj2, this);
            } catch (Throwable th10) {
                this.f312733a = outputStream;
                throw th10;
            }
        } catch (Throwable th11) {
            try {
                bVar2.close();
            } catch (Throwable th12) {
                th11.addSuppressed(th12);
            }
            throw th11;
        }
    }

    public final void g(int i2) throws IOException {
        while ((i2 & RangingPosition.RSSI_UNKNOWN) != 0) {
            this.f312733a.write((i2 & CertificateBody.profileType) | 128);
            i2 >>>= 7;
        }
        this.f312733a.write(i2 & CertificateBody.profileType);
    }

    public final void h(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f312733a.write((((int) j2) & CertificateBody.profileType) | 128);
            j2 >>>= 7;
        }
        this.f312733a.write(((int) j2) & CertificateBody.profileType);
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, double d) throws IOException {
        a(bVar, d, true);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, int i2) {
        b(bVar, i2, true);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, long j2) throws IOException {
        c(bVar, j2, true);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, boolean z) {
        b(bVar, z ? 1 : 0, true);
        return this;
    }
}
