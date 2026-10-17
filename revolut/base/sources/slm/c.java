package slm;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.bouncycastle.crypto.hpke.HPKE;
import yhm.s;
import yhm.u;
import yhm.w;
import yhm.z;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends plm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264241a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f264242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f264243c;
    public final Object d;

    public c(t tVar, String str) {
        this.f264242b = tVar;
        this.f264243c = str;
        this.d = tVar.f264281b.f187949b;
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b4) {
        switch (this.f264241a) {
            case 1:
                s.Companion companion = yhm.s.INSTANCE;
                f(String.valueOf(b4 & UnsignedBytes.MAX_VALUE));
                break;
            default:
                super.encodeByte(b4);
                break;
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i) {
        switch (this.f264241a) {
            case 1:
                u.Companion companion = yhm.u.INSTANCE;
                f(Integer.toUnsignedString(i));
                break;
            default:
                super.encodeInt(i);
                break;
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j2) {
        switch (this.f264241a) {
            case 1:
                w.Companion companion = yhm.w.INSTANCE;
                f(Long.toUnsignedString(j2));
                break;
            default:
                super.encodeLong(j2);
                break;
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s2) {
        switch (this.f264241a) {
            case 1:
                z.Companion companion = yhm.z.INSTANCE;
                f(String.valueOf(s2 & HPKE.aead_EXPORT_ONLY));
                break;
            default:
                super.encodeShort(s2);
                break;
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        switch (this.f264241a) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                this.f264242b.m(new rlm.p(value, false, (SerialDescriptor) this.d), this.f264243c);
                break;
            default:
                super.encodeString(value);
                break;
        }
    }

    public void f(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        this.f264242b.m(new rlm.p(s2, false, null), this.f264243c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final tlm.e getSerializersModule() {
        switch (this.f264241a) {
            case 0:
                return this.f264242b.f264281b.f187949b;
            default:
                return (tlm.e) this.d;
        }
    }

    public c(t tVar, String str, SerialDescriptor serialDescriptor) {
        this.f264242b = tVar;
        this.f264243c = str;
        this.d = serialDescriptor;
    }
}
