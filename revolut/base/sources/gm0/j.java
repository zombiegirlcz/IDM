package gm0;

import e8.r;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j implements dm0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i70.a f144740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cpi.g f144741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f144742c;
    public final p d;
    public final r e;
    public static final /* synthetic */ KProperty[] f = {o0.f186429a.j(new h0(j.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0))};

    @NotNull
    public static final i Companion = new i();

    public j(i70.a vendorIdProvider, cpi.g idGenerator, o deviceIdStorage, p xorDeviceIdEncoder) {
        Intrinsics.checkNotNullParameter(vendorIdProvider, "vendorIdProvider");
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(deviceIdStorage, "deviceIdStorage");
        Intrinsics.checkNotNullParameter(xorDeviceIdEncoder, "xorDeviceIdEncoder");
        this.f144740a = vendorIdProvider;
        this.f144741b = idGenerator;
        this.f144742c = deviceIdStorage;
        this.d = xorDeviceIdEncoder;
        this.e = new r((Function0) new androidx.lifecycle.b(this, 20));
    }

    @Override // dm0.d
    public final c a() {
        return c.GLOBAL;
    }

    @Override // dm0.d
    public final dm0.b b() {
        KProperty[] kPropertyArr = f;
        KProperty kProperty = kPropertyArr[0];
        r rVar = this.e;
        UUID value = UUID.fromString((String) rVar.b(kProperty));
        Intrinsics.checkNotNullExpressionValue(value, "fromString(...)");
        Intrinsics.checkNotNullParameter(value, "value");
        String strA = this.f144740a.a();
        ue8.c.s(strA);
        Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-core-security-deviceId-DeviceAgentId$-deviceAgentId$0");
        tim.c.INSTANCE.getClass();
        int iC = tim.c.f271589b.c();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strA.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 68);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
        byteBufferWrap.putLong(((long) 1) * ((long) iC));
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        ByteBuffer byteBufferPut = byteBufferAllocate.put(bArrArray);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        ByteBuffer byteBufferPutInt = p.a(byteBufferPut, 4).putInt(iC);
        Intrinsics.checkNotNullExpressionValue(byteBufferPutInt, "putInt(...)");
        ByteBuffer byteBufferA = p.a(p.b(p.a(byteBufferPutInt, 4), iC, value), 12);
        p.a(byteBufferA, 4);
        byte[] bytes2 = strA.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        Intrinsics.checkNotNullExpressionValue(byteBufferA.put(bytes2), "put(...)");
        tl0.a aVar = this.d.f144752a;
        byte[] bArrArray2 = byteBufferA.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray2, "array(...)");
        return new dm0.b(new String(aVar.b(bArrArray2), charset), 1, (String) rVar.b(kPropertyArr[0]), null);
    }

    @Override // dm0.d
    public final boolean clear() {
        r.d(this.e, new g8i.h(this, 15), 1);
        return true;
    }
}
